import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] customerTypes = {"Premium", "Gold", "Silver", "Normal"};
        System.out.println("On Service:\n" +
                "  - Premium get 20% discount.\n" +
                "  - Gold  get 15% discount.\n" +
                "  - Silver  get 10% discount.\n" +
                "  - Normal  get 0% discount.");
        System.out.println("\n" +
                "On Product:\n" +
                "  - Premium get 10% discount.\n" +
                "  - Gold  get 10% discount.\n" +
                "  - Silver  get 10% discount.\n" +
                "  - Normal  get 0% discount.");
        double serviceAmount;
        double productAmount;

        System.out.print("Enter service amount: ");
        serviceAmount = scanner.nextDouble();

        System.out.print("Enter product amount: ");
        productAmount = scanner.nextDouble();

        System.out.println("Customer Type\tService Amount\tProduct Amount\tTotal Bill");
        System.out.println("-----------------------------------------------------------------");

        for (String type : customerTypes) {
            Customer customer = new Customer();
            customer.setType(type);

            Sale sale = new Sale();
            sale.setCustomer(customer);
            sale.setServiceAmount(serviceAmount);
            sale.setProductAmount(productAmount);

            double totalBill = sale.getTotalBill();
            System.out.printf("%s\t\t\t$%.2f\t\t\t$%.2f\t\t\t$%.2f\n", type, serviceAmount, productAmount, totalBill);
        }

        scanner.close();
    }
}