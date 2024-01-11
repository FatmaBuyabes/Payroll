
public class App {
    public static void main(String[] args) throws Exception {

        Employee fatma = new Employee(1, "fatma", "IT", 300);
        fatma.setBonus(100);
        fatma.setDeduction(10);
        fatma.setOverTimeHours(4);

        double totalSalary = fatma.calculateTotalSalary();

        System.out.println("The total salary for " + fatma.name + " :" + totalSalary);

        Employee asmaa = new Employee(1, "asmaa", "IT", 400);
        asmaa.setBonus(100);
        asmaa.setDeduction(10);
        asmaa.setOverTimeHours(4);

        double total = asmaa.calculateTotalSalary();

        System.out.println("The total salary for " + asmaa.name + " :" + total);

    }
}
