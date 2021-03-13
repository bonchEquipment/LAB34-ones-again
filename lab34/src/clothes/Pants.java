package clothes;

public class Pants extends AbstractClothes {
    private String typeOfCloth = " штаны ";

    public Pants(Condition condition, Affiliation affiliation) {
        super(condition, affiliation);
    }

    @Override
    public String getTypeOfCloth() {
        return typeOfCloth;
    }
}
