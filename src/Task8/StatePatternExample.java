package Task8;

// Интерфейс состояния
interface State {
    void handle();
}

// Конкретное состояние 1
class ConcreteState1 implements State {
    @Override
    public void handle() {
        System.out.println("Обработка в состоянии 1");
    }
}

// Конкретное состояние 2
class ConcreteState2 implements State {
    @Override
    public void handle() {
        System.out.println("Обработка в состоянии 2");
    }
}

// Контекст
class Context {
    private State currentState;

    public Context() {
        // Инициализация начального состояния
        currentState = new ConcreteState1();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handle();
    }
}

// Пример использования
public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();

        // Переключение на первое состояние
        context.request();

        // Переключение на второе состояние
        context.setState(new ConcreteState2());
        context.request();



    }
}

