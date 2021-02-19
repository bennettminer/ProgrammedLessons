public class PayrollTester{
    public static void main(String[] args) {
        Employee firstEmployee = new Employee();
        

        firstEmployee.setName("Michael");
        firstEmployee.setPosition("Cashier");
        firstEmployee.setWage(5.00);

        System.out.println(firstEmployee.getName());
        System.out.println(firstEmployee.getPosition());
        System.out.println(firstEmployee.getWage());
        System.out.println(firstEmployee.getId());
        System.out.println(firstEmployee.getPeriod());
        System.out.println(firstEmployee.getTotal());

        firstEmployee.addHours(5);
        System.out.println(firstEmployee.getPeriod());
        System.out.println(firstEmployee.getTotal());
    }
}