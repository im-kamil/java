class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("my id is " + id);
        System.out.println("And my name is " + name);
    }

    public int getSalary() {
        return salary;
    }

    public int getSalary2() {
        return salary;
    }
}

public class cwk_38_ch8_custom {

    public static void main(String[] args) {
        Employee kamil = new Employee(); // instantianing a new employ object
        Employee parker = new Employee();
        // setting attributes for kamil
        kamil.id = 12;
        kamil.salary = 60000;
        kamil.name = "CodeWithKamil";
        // setting attributes for parker
        parker.id = 15;
        parker.salary = 50000;
        parker.name = "Peaky Blinder John";

        // printing the attributes
        // System.out.println(kamil.id);
        // System.out.println(kamil.name);
        kamil.printDetails();
        parker.printDetails();
        int salary = parker.getSalary();
        int salary2 = kamil.getSalary();
        System.out.println(salary);
        System.out.println(salary2);

    }
}
