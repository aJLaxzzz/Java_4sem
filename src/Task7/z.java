package Task7;

// Общий интерфейс для реального объекта и заместителя
interface RealSubject {
    void request();
}

// Реальный объект
class RealObject implements RealSubject {
    @Override
    public void request() {
        System.out.println("RealObject handles request");
    }
}

// Заместитель
class Proxy implements RealSubject {
    private RealObject realObject;

    @Override
    public void request() {
        if (realObject == null) {
            realObject = new RealObject();
        }
        System.out.println("Proxy handles request");
        realObject.request();
    }
}
