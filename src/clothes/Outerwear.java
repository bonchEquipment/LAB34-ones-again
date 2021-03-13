package clothes;

public class Outerwear extends AbstractClothes {
    private String typeOfCloth = " кофта ";

    public Outerwear(Condition condition, Affiliation affiliation) {
        super(condition, affiliation);
    }

    @Override
    public String getTypeOfCloth() {
        return typeOfCloth;
    }
}
