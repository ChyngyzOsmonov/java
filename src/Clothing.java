public class Clothing  extends AbstractGood {
    private String textileType;

    public Clothing(int height, int width, int weight, String weightSystem, String textileType) {
        super(height, width, weight, weightSystem);
        this.textileType = textileType;
    }

    public String getTextileType() {
        return textileType;
    }

    public void setTextileType(String textileType) {
        this.textileType = textileType;
    }
}
