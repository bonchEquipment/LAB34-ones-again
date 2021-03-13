package clothes;

public class Footwear extends AbstractClothes {
    private String typeOfCloth = " обувь ";

    public Footwear(Condition condition, Affiliation affiliation) {
        super(condition, affiliation);
    }

    @Override
    public String getTypeOfCloth() {
        return typeOfCloth;
    }
}
