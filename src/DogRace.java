public class DogRace {
    public static Dog race(Dog dog1, Dog dog2) {
        return dog1.speed > dog2.speed ? dog1 : dog2;
    }
}
