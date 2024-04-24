package Task1;

import java.util.function.Consumer;

public class TaskOne implements Consumer<String> {

    @Override
    public void accept(String inputString) {
        char[] charArray = inputString.toCharArray();

        for (int i = 2; i < charArray.length; i += 3) {
            charArray[i] = Character.toUpperCase(charArray[i]);
        }

        String result = new String(charArray);
        System.out.println(result);
    }

    public static void main(String[] args) {
        TaskOne taskOne = new TaskOne();
        String inputString = "abcdef";
        taskOne.accept(inputString);
    }
}
