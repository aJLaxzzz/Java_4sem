package Task10.src.main.java.com.example.Task10;

@Component("seniorProgrammer")
public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Senior programmer is coding.");
    }
}
