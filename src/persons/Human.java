package persons;

import Exceptions.WrongComparisonException;
import guns.Target;


public abstract class Human implements Target {

    private Location location = Location.TWIN_TOWERS;
    private final String name;
    private State state;

    public Human() {
        name = "Безликий человек";
        state = State.HEALTHY;
    }

    public Human(String name) {
        this.name = name;
        state = State.HEALTHY;
    }

    public Human(String name, State state, Location location) {
        this.location = location;
        this.name = name;
        this.state = state;
    }

    public void changeLocation(Location location) {
        this.location = location;
        System.out.println(name + " пошел в локацию " + location);
    }

    public abstract void say(String str);

    public State getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    @Override
    public void takeDamage() {
        if (this.state.ordinal() == 0) {
            state = State.INJURED;
            System.out.println(name + " был ранен ");
        } else if (this.state.ordinal() == 1) {
            state = State.DEAD;
            System.out.println(name + " был застрелен((");
        } else {
            System.out.println("в мертвого " + name + " ещё рас выстрелили");
        }
    }


    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass().getName().equals(this.getClass().getName())) {
            Human human1 = this;
            Human human2 = (Human) obj;
            return human1.state.equals(human2.state) &&
                    human1.name.equals(human2.name);
        } else {
            throw new WrongComparisonException();
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
