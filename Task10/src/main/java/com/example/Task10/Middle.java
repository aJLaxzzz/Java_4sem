package Task10.src.main.java.com.example.Task10;

@Component("middleProgrammer")
public class Middle implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Middle programmer is coding.");
    }
}