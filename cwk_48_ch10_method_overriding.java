class A {
    public int a;

    public int Kamil() {
        return 5;
    }

    public void meth2() {
        System.out.println("I am method 2 of class A");
    }
}

class B extends A { // this 2 is different Class A nd B  // tHIS IS METHOD OVERRIDING
    @Override
    public void meth2() {    
        System.out.println("I am method 2 of class B");
    }

    public void meth3() {
        System.out.println("I am method 3 of class B");
    }

    public class cwk_48_ch10_method_overriding {
        public static void main(String[] args) {
            A a = new A();
            a.meth2();
            B b = new B();
            b.meth2();
        }
    }
}
