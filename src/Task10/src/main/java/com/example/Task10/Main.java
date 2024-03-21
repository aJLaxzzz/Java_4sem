package Task10.src.main.java.com.example.Task10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Main {
    private final ApplicationContext context;

    public Main(ApplicationContext context) {
        this.context = context;
    }

    public void execute(String beanName) {
        Programmer programmer = (Programmer) context.getBean(beanName);
        programmer.doCoding();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main <beanName>");
            return;
        }

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        Main main = context.getBean(Main.class);
        main.execute(args[0]);
    }
}

