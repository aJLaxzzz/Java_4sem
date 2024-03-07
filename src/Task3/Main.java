package Task3;

public class Main {
    public static void main(String[] args) {
        MySet<String> concurrentSet = new MySet<>();
        try {
            concurrentSet.add("Element1");
            concurrentSet.add("Element2");
            System.out.println("Сет содержит элемент 1: " + concurrentSet.contains("Element1"));
            System.out.println("Сет содержит элемент 3: " + concurrentSet.contains("Element3"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyList<Integer> concurrentList = new MyList<>();
        concurrentList.add(1);
        concurrentList.add(2);
        System.out.println("list содержит элемент 1: " + concurrentList.contains(1));
        System.out.println("list содержит элемент 1: " + concurrentList.contains(3));
    }
}
