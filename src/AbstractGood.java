public abstract class AbstractGood {
    private int height;
    private int width;
    private int weight;
    private String weightSystem;

    public String getWeightSystem() {
        return weightSystem;
    }

    public void setWeightSystem(String weightSystem) {
        this.weightSystem = weightSystem;
    }

    ;

    public AbstractGood(int height, int width, int weight, String weightSystem) {
        this.height = height;
        this.width = width;
        this.weight = weight;
        this.weightSystem = weightSystem;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
