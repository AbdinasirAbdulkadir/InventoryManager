import java.util.Scanner;

public class InventoryApp {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        String name;
        int quantity;
        double price;

        // Simple command-line interface loop
        while (true) {
            System.out.println("1. Add product");
            System.out.println("2. View products");
            // ... other options
            System.out.println("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter product name: ");
                    name = scanner.next();
                    System.out.println("Enter quantity: ");
                    quantity = scanner.nextInt();
                    System.out.println("Enter price: ");
                    price = scanner.nextDouble();
                    manager.addProduct(name, quantity, price);
                    break;
                case 2:
                    manager.viewProducts();
                    break;
                // ... other cases
            }
        }
    }
}
