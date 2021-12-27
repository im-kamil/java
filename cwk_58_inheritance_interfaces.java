interface sampleInterface {
    void meth1();

    void meth2();
}

interface childSampleInterface extends sampleInterface { // we r using implements words but in class but in interface we
                                                         // can use extends words means inheritance interface

    void meth3();

    void meth4();
}

class mySampleClass implements childSampleInterface {
    public void meth1() {
        System.out.println("meth1");
    }
 
    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

public class cwk_58_inheritance_interfaces {
    public static void main(String[] args) {
        mySampleClass obj = new mySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
