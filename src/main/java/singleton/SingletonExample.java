package singleton;

public class SingletonExample {
    public void showSingletonExample() {
        System.out.println("1. Application started");
        final Settings settings1 = Settings.getInstance();
        final Settings settings2 = Settings.getInstance();
        assert(settings1 == settings2);
    }
}
