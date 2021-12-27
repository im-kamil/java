public class cwk_42_ch9_constructors {
    class Employee {
        private int id;
        private String name;

        public Employee() { // constructor main method// automatically run as it is constructor and it
                            // doesnot have return type and void
            id = 0;
            name = "your_ Name";
        }

        public int getId() {
            return id;
        }

        public void setId(int i) {
            id = i;
        }

        public String getName() {
            return name;
        }

        public void setName(String n) {
            name = n;
        }
    }

    public static void main(String[] args) {
        myEmployee kamil = new myEmployee();
        // kamil.setName("codeWithKamil");
        // kamil.setId(350); // all time we cannot set setId getId so that we can use
        // here the constructor.....
        System.out.println(kamil.getId());
        System.out.println(kamil.getName());
    }
}
