public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0) {
            this.monthlySalary = newSalary;
        }
    }

    public void displayYearlySalary() {
        System.out.println("Yearly Salary for " + firstName + " " + lastName + ": " + (monthlySalary * 12));
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 5000);
        Employee emp2 = new Employee("Jane", "Doe", 6000);

        emp1.displayYearlySalary();
        emp2.displayYearlySalary();

        emp1.setSalary(emp1.monthlySalary * 1.1);
        emp2.setSalary(emp2.monthlySalary * 1.1);

        System.out.println("After 10% raise:");
        emp1.displayYearlySalary();
        emp2.displayYearlySalary();
    }
}