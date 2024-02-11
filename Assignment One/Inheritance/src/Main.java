import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500));
        employees.add(new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32));
        employees.add(new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47));
        employees.add(new CommissionEmployee("Nicole", "Dior", "444-44-4444", 15, 50000));
        employees.add(new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700));
        employees.add(new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000));
        employees.add(new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 22, 40000));

        System.out.printf("%-15s %-15s %-20s %-20s %-15s %-15s %-20s %-20s %-15s%n",
                "First Name", "Last Name", "Social Security", "Weekly Salary",
                "Wage", "Hours Worked", "Commission Rate", "Gross Salary", "Base Salary");

        for (Employee employee: employees){
            if (employee instanceof SalariedEmployee) {
                SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
                System.out.print(String.format("%-15s %-15s %-20s $%-19s%n",
                        salariedEmployee.getFirstName(), salariedEmployee.getLastName(),
                        salariedEmployee.getSocialSecurity(), decimalFormat.format(salariedEmployee.getWeeklySalary())));
            } else if (employee instanceof HourlyEmployee) {
                HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
                System.out.print(String.format("%-15s %-15s %-40s $%-14s %-15s%n",
                        hourlyEmployee.getFirstName(), hourlyEmployee.getLastName(),
                        hourlyEmployee.getSocialSecurity(), decimalFormat.format(hourlyEmployee.getWage()), hourlyEmployee.getHoursWorked()));
            } else if (employee instanceof CommissionEmployee) {
                CommissionEmployee commissionEmployee = (CommissionEmployee) employee;
                System.out.print(String.format("%-15s %-15s %-75s %-20s $%-19s%n",
                        commissionEmployee.getFirstName(), commissionEmployee.getLastName(),
                        commissionEmployee.getSocialSecurity(), commissionEmployee.getCommissionRate() + "%", decimalFormat.format(commissionEmployee.getGrossSales())));
            } else if (employee instanceof  BaseEmployee) {
                BaseEmployee baseEmployee = (BaseEmployee) employee;
                System.out.print(String.format("%-15s %-15s %-115s $%-19s%n",
                        baseEmployee.getFirstName(), baseEmployee.getLastName(),
                        baseEmployee.getSocialSecurity(), decimalFormat.format(baseEmployee.getBaseSalary())));;
            }
        }
    }
}