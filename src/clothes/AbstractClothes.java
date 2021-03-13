package clothes;

public abstract class AbstractClothes {

    private Condition condition;
    private String typeOfCloth;
    private boolean isPutOnAPerson;

    private Affiliation affiliation;

    public AbstractClothes(Affiliation affiliation) {
        condition = Condition.INTACT;
        this.affiliation = affiliation;
    }

    public AbstractClothes(Condition condition, Affiliation affiliation) {
        this.condition = condition;
        this.affiliation = affiliation;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }

    public Condition getCondition() {
        return condition;
    }

    public String takeDamage() {
        if (this.condition.ordinal() == 0) {
            condition = Condition.DAMAGED;
            return getTypeOfCloth() + " были повреждены ";
        } else if (this.condition.ordinal() == 1) {
            condition = Condition.TORN;
            return (getTypeOfCloth() + " были изорваны в клочья");
        } else {
            return (" уже изодранные " + getTypeOfCloth() + " порвались ещё сильнее");
        }
    }

    public boolean isPutOnAPerson() {
        return isPutOnAPerson;
    }

    public void setPutOnAPerson(boolean putOnAPerson) {
        isPutOnAPerson = putOnAPerson;
    }

    public String getTypeOfCloth() {
        return " абстракная одежда ";
    }
}
