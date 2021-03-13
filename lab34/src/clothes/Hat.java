package clothes;

public class Hat extends AbstractClothes {

    private String typeOfCloth = " головной убор ";

    public Hat(Condition condition, Affiliation affiliation) {
        super(condition, affiliation);
    }

    @Override
    public String getTypeOfCloth() {
        return typeOfCloth;
    }
}
