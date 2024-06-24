public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Andreev Andrey", "Manager", "andrey@mailbox.com", "897822322", 40000, 35);
        employees[2] = new Employee("Sidorov Sidr", "Developer", "sidorsidr@mailbox.com", "892332332", 50000, 25);
        employees[3] = new Employee("Kozlov Kozel", "Designer", "kozelkozlov@mailbox.com", "892342342", 35000, 28);
        employees[4] = new Employee("Smirnov miron", "Programmer", "smirnov@mailbox.com", "892352352", 45000, 40);

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println("-----------------------");
        }
    }
}
