public class cwk_floydtriangle {
    public static void main(String[] args) {
        int n = 5;
        int number = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number+ " ");
                number++; // increase by 1 means number++ as per question number=number+1;
            }
            System.out.println();
        }
    }
}
