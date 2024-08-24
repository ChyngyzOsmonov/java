public class ShipmentService {
    private Compare compare;
    public ShipmentService() {
        this.compare = new Compare() {
            @Override
            public AbstractGood compareByWeight(AbstractGood ag1, AbstractGood ag2) {
                if (ag1.getWeightSystem().equals(ag2.getWeightSystem())) {
                    return ag1.getWeight() > ag2.getWeight() ? ag1 : ag2;
                } else {
                    return ag1.getWeightSystem().equals("Imperial")?
                            ((ag1.getWeight() * 0.45) > ag2.getWeight() ? ag1: ag2):
                            (ag1.getWeight() > (ag2.getWeight() * 0.45) ? ag1:ag2 );
                }
            }

            @Override
            public AbstractGood compareByHeight(AbstractGood ag1, AbstractGood ag2) {
                return ag1.getHeight() > ag2.getHeight() ? ag1:ag2;
            }

            @Override
            public AbstractGood compareByWidth(AbstractGood ag1, AbstractGood ag2) {
                return ag1.getWidth() > ag2.getWidth() ? ag1:ag2;
            }

            @Override
            public AbstractGood compareByAllParameters(AbstractGood ag1, AbstractGood ag2) {
                return null;
            }
        };
    }
    public void addToDelivery() {
        Clothing clothing1 = new Clothing(120, 200, 300, "Metric", "Cotton");
        Clothing clothing2 = new Clothing(150, 250, 3200, "Imperial", "Silk");
        Clothing clothing = compare.compareByWeight(clothing1, clothing2);

        SimpleCompare sc = (a, b) -> a.getHeight() > b.getHeight() ? a:b;
        sc.compareByHeight(clothing1, clothing2);
    }
}
