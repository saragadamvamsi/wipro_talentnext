package oops.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 75000.50, 2015, "NI123456A");

        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        emp.setAnnualSalary(80000.75);
        emp.setName("John D.");

        System.out.println("\nUpdated Employee Info:");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());
    }
}
