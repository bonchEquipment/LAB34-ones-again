package guns;

public class HandGun implements Gun {

    private final String model = "ОЦ-21С";

    public void shoot(Target target) {
        target.takeDamage();
    }

    public String getModel() {
        return model;
    }
}
