package guns;

public class Rifle implements Gun {

    private final String model = "M4A4";

    public String getModel() {
        return model;
    }

    public void shoot(Target target) {
        target.takeDamage();
    }


}
