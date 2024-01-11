
import java.util.List;

public class Employee {

    private int employeeId;
    public String name;
    public String position;
    private double basicSalary;
    private double overTimeHours;
    private double bonus;
    private double deduction;
    private List<Payment> paymentHistory;

    public Employee(int employeeId, String name, String position, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
        this.overTimeHours = 0.0;
        this.bonus = 0.0;
        this.deduction = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getOverTimeHours() {
        return overTimeHours;
    }

    public double getDeduction() {
        return deduction;
    }

    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }

    public void setOverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    private double calculateOvertime() {
        double overtimeRate = 3;
        return overTimeHours * overtimeRate;
    }

    public double calculateTotalSalary() {
        double totalSalary = basicSalary + calculateOvertime() + bonus - deduction;
        return totalSalary;
    }

    public void recordPayment(Payment payment) {
        paymentHistory.add(payment);
    }

    public void displayPaymentHistory() {
        System.out.println("Payment History: ");
        for (Payment payment : paymentHistory) {
            System.out.println("Date: " + payment.getPaymentMethods());
        }
    }

}
