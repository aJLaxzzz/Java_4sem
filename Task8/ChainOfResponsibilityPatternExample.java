package Task8;

// Интерфейс обработчика
interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(String request);
}

// Базовый класс для обработчиков
abstract class AbstractHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (canHandle(request)) {
            processRequest(request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("Ни один обработчик не может обработать запрос.");
        }
    }

    // Метод, определяющий, может ли текущий обработчик обработать запрос
    protected abstract boolean canHandle(String request);

    // Метод для обработки запроса
    protected abstract void processRequest(String request);
}

// Конкретные обработчики
class ConcreteHandler1 extends AbstractHandler {
    @Override
    protected boolean canHandle(String request) {
        return request.contains("one");
    }

    @Override
    protected void processRequest(String request) {
        System.out.println("ConcreteHandler1 обрабатывает запрос: " + request);
    }
}

class ConcreteHandler2 extends AbstractHandler {
    @Override
    protected boolean canHandle(String request) {
        return request.contains("two");
    }

    @Override
    protected void processRequest(String request) {
        System.out.println("ConcreteHandler2 обрабатывает запрос: " + request);
    }
}

class ConcreteHandler3 extends AbstractHandler {
    @Override
    protected boolean canHandle(String request) {
        return request.contains("three");
    }

    @Override
    protected void processRequest(String request) {
        System.out.println("ConcreteHandler3 обрабатывает запрос: " + request);
    }
}

// Пример использования
public class ChainOfResponsibilityPatternExample {
    public static void main(String[] args) {
        // Создаем обработчики
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        // Строим цепочку обработчиков
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        // Передаем запросы по цепочке
        handler1.handleRequest("Request with one");
        handler1.handleRequest("Request with two");
        handler1.handleRequest("Request with three");
        handler1.handleRequest("Request with four");
    }
}

