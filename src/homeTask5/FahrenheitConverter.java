package homeTask5;

class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue * 9/5 + 32;
    }
}
