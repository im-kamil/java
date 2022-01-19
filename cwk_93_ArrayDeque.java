import java.util.ArrayDeque;

public class cwk_93_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> Ad1 = new ArrayDeque<>();
        Ad1.add(45);
        Ad1.add(60);
        Ad1.add(50);
        Ad1.add(40);
        Ad1.add(35);
        Ad1.addFirst(350);
        System.out.println(Ad1.getFirst());
        System.out.println(Ad1.getLast());
    }
}
