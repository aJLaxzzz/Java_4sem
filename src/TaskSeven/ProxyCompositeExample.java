package TaskSeven;

public class ProxyCompositeExample {
    public static void main(String[] args) {
        System.out.println("Заместитель");
        RealSubject proxy = new Proxy();
        proxy.request();
    //
        System.out.println();
        System.out.println("Компоновщик");
        Component leaf1 = new Leaf("Leaf 1");
        Component leaf2 = new Leaf("Leaf 2");

        Composite composite = new Composite();
        composite.addComponent(leaf1);
        composite.addComponent(leaf2);

        composite.operation();
    }
}
