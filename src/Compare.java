public interface Compare {
    <T> T compareByWeight(AbstractGood ag1, AbstractGood ag2);
    AbstractGood compareByHeight(AbstractGood ag1, AbstractGood ag2);
    AbstractGood compareByWidth(AbstractGood ag1, AbstractGood ag2);
    AbstractGood compareByAllParameters(AbstractGood ag1, AbstractGood ag2);
}
