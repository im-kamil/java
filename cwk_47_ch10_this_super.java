class EkClass {
    int a;

    public int getA() {
        return a;
    }

    EkClass(int a) {
        // a = v; // if we use this....then also same
        // v = v; // it confuse nd give output to 0 so we use this keyword
        this.a = a;
    }

    public int returnOne() {
        return 1;
    }
}

class DoClass extends EkClass {
    DoClass(int c) {
        super(c);
        System.out.println("Main ek Constructor hoon");
    }
}

public class cwk_47_ch10_this_super {
    public static void main(String[] args) {
        EkClass ek = new EkClass(350);
        DoClass d = new DoClass(50);
        System.out.println(ek.getA());
    }
}
