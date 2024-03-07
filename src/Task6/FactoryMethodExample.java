package Task6;

// Интерфейс продукта
interface Product1 {
    void create();
}

// Конкретный продукт
class ConcreteProduct implements Product1 {
    @Override
    public void create() {
        System.out.println("Concrete Product created");
    }
}

// Интерфейс фабрики
interface Creator {
    Product1 factoryMethod();
}

// Конкретная фабрика
class ConcreteCreator implements Creator {
    @Override
    public Product1 factoryMethod() {
        return new ConcreteProduct();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product1 product = creator.factoryMethod();
        product.create();
    }
}

