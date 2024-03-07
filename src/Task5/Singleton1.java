package Task5;

public class Singleton1 {
    private Singleton1() {
        // Приватный конструктор
    }

    private static class SingletonHolder {
        private static final Singleton1 INSTANCE = new Singleton1();
    }

    public static Singleton1 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1 == singleton2);
    }
}

