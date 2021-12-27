public class cwk_33_varargs {
    /*
     * static int sum(int a, int b){
     * return a+b;
     * }
     */
    static int sum(int arr[]) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("KAMIL_KAMMO");
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("The value of  4 and 5 is : " + sum(arr));

    }
}
