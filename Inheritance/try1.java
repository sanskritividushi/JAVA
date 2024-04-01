class Employee {
    private String name;
    private String address;
    private int age;
    private String gender;

    public Employee(String name, String address, int age, String gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class FullTimeEmployee extends Employee {
    private double salary;
    private String designation;

    public FullTimeEmployee(String name, String address, int age, String gender, double salary, String designation) {
        super(name, address, age, gender);
        this.salary = salary;
        this.designation = designation;
    }

    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
        System.out.println();
    }
}

class PartTimeEmployee extends Employee {
    private double workHours;
    private double ratePerHour;

    public PartTimeEmployee(String name, String address, int age, String gender, double workHours, double ratePerHour) {
        super(name, address, age, gender);
        this.workHours = workHours;
        this.ratePerHour = ratePerHour;
    }

    public double calculatePay() {
        return workHours * ratePerHour;
    }

    public void display() {
        super.display();
        System.out.println("Work Hours: " + workHours);
        System.out.println("Rate Per Hour: " + ratePerHour);
        System.out.println("Pay: " + calculatePay());
        System.out.println();
    }
}

public class try1 {
    public static void main(String[] args) {
        
        FullTimeEmployee ft1 = new FullTimeEmployee("abdv", "ajcc", 33, "F", 253462.47, "swe");
        ft1.display();

        FullTimeEmployee ft2 = new FullTimeEmployee("jnff", "cbfsc", 23, "F", 25665, "manager");
        ft2.display();

        PartTimeEmployee pt1 = new PartTimeEmployee("nvbxdv", "ndb", 40, "M", 34, 1000);
        pt1.calculatePay();
        pt1.display();

        PartTimeEmployee pt2 = new PartTimeEmployee("qwerty", "dwaths", 50, "M", 44, 100);
        pt2.calculatePay();
        pt2.display();

    }
}
