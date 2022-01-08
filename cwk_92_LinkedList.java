import java.util.LinkedList;

public class cwk_92_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> L1 = new LinkedList<>(); // generic syntax
        LinkedList<Integer> L2 = new LinkedList<>(); // DONOT GIVE INITIAL CAPACITY IN LINKEDLIST PARAMETR NOT PASS
        // adding an element
        L2.add(15);
        L2.add(18);
        L2.add(20);
        L1.add(6);      
        L1.add(5);
        L1.add(4);
        L1.add(0, 5);
        L1.add(0, 2);
        L1.addAll(L2); // by addAll we can now add L2 in arrayList of L1 now run and see
        L1.addLast(676); // addLast method in linkedlist
        L1.addFirst(350); // same addFirst
        System.out.println(L1.contains(20)); // for finding in container if not thn boolean returns to false
        System.out.println(L1.indexOf(5)); // index ansr 2 because we count it from 0
        System.out.println(L1.lastIndexOf(5)); // if we want to print last index of 5 so we use this.
        // L1.addAll(0, L2); // if i want to add from zero then 15,18,20 will be from
        // above after run lets c
        // L1.clear(); // then nothing will occur

        L1.set(6, 350); // here i can set 350 index to remove 16th index by set
        for (int i = 0; i < L1.size(); i++) {
            System.out.print(L1.get(i)); // ln remove because we want horizontal
            System.out.print(", ");
        }

    }
}
