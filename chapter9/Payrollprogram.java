public class Payrollprogram {
    public static void main(String[] args) {
        long hoursWorked = 40;
        double payRate = 10.0; 
        double taxRate = 0.10;
        double payAmount = hoursWorked * payRate;
        double taxAmount = payAmount * taxRate;
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Amount: " + payAmount);
        System.out.println("Tax Amount: " + taxAmount);
    }
}