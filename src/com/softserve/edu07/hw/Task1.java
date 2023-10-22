import java.util.Arrays;
import java.util.Comparator;


interface Payment {
    double calculatePay();
}

abstract class Employee {
    String employeeId;

    Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    abstract String getName();

    public double calculatePay() {
        return 0;
    }
}

class SalariedEmployee extends Employee implements Payment {
    String socialSecurityNumber;
    double fixedMonthlyPayment;

    SalariedEmployee(String employeeId, String socialSecurityNumber, double fixedMonthlyPayment) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    @Override
    String getName() {
        return "Salaried Employee";
    }
}

class ContractEmployee extends Employee implements Payment {
    String federalTaxId;
    double hourlyRate;
    int hoursWorked;

    ContractEmployee(String employeeId, String federalTaxId, double hourlyRate, int hoursWorked) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    String getName() {
        return "Contract Employee";
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        // Створюємо масив співробітників
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("E001", "SSN001", 5000);
        employees[1] = new SalariedEmployee("E002", "SSN002", 6000);
        employees[2] = new ContractEmployee("E003", "FTI001", 15.0, 160);
        employees[3] = new ContractEmployee("E004", "FTI002", 20.0, 140);

        // Сортуємо співробітників
        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                double wage1 = emp1.calculatePay();
                double wage2 = emp2.calculatePay();
                return Double.compare(wage2, wage1);
            }
        });

        // Виводимо інформацію
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Employee Type: " + employee.getName());
            System.out.println("Average Monthly Wage: " + employee.calculatePay());
            System.out.println();
        }
    }
}

