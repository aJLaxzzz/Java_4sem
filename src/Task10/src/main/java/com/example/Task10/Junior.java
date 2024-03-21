package Task10.src.main.java.com.example.Task10;

@Component("juniorProgrammer")
public class Junior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Junior programmer is coding.");
    }
}
