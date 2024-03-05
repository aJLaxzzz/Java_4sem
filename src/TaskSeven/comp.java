package TaskSeven;

import java.util.ArrayList;
import java.util.List;

// Общий интерфейс для компонентов (листьев и контейнеров)
interface Component {
    void operation();
}

// Лист
class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void operation() {
        System.out.println("Leaf " + name + " does something");
    }
}

// Контейнер (может содержать как листья, так и другие контейнеры)
class Composite implements Component {
    private List<Component> components = new ArrayList<>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void operation() {
        System.out.println("Composite does something");
        for (Component component : components) {
            component.operation();
        }
    }
}
