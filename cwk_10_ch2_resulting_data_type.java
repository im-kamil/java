public class cwk_10_ch2_resulting_data_type {

    public static void main(String[] args) {
        /*
         * byte x = 5;
         * int y = 6;
         * short z = 8;
         * int a = y+z;
         * float b = 6.54f+x;
         * System.out.println(b);
         */
        int i = 56;
        // int b = i++; // first b is assigned i(56) then i is increment
        int j = 78;
        // int c = ++j; // first j is increment and c is assigned j(79)
        /*
         * System.out.println(i++);
         * System.out.println(i);
         * System.out.println(++i);
         * System.out.println(i);
         */
        // quick quiz
        int y = 7;
        System.out.println(++y * 8);
        char ch = 'b';
        System.out.println(++ch);
        char a = 'b';
        System.out.println(a++);
    }

}
