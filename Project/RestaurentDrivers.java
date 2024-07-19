package Project;

import java.util.*;

class CustomerBill {
    static int custIdCounter = 1;
    int custId;
    String custName;
    long contactNumber;
    ArrayList<String> food;
    double bill;

    public CustomerBill(String custName, long contactNumber, ArrayList<String> food, double bill) {
        this.custId = custIdCounter++;
        this.custName = custName;
        this.contactNumber = contactNumber;
        this.food = food;
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Customer ID: " + custId + "\nCustomer Name: " + custName + "\nContact Number: " + contactNumber + 
               "\nFood Items: " + food + "\nTotal Bill: " + bill + "\n";
    }
}

class Restaurant {
    List<CustomerBill> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // creation of bill
    void addBill() {
        System.out.println();
        System.out.println("ADD NEW BILL");
        System.out.print("Customer Name: ");
        sc.nextLine(); // consume the leftover newline
        String custName = sc.nextLine();
        System.out.print("Contact Number: ");
        long contactNumber = sc.nextLong();
        System.out.print("Enter number of food items: ");
        int qty = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        ArrayList<String> food = new ArrayList<>();
        for (int i = 1; i <= qty; i++) {
            System.out.println("Enter the " + i + " item and price (format: item price):");
            String item = sc.nextLine();
            food.add(item);
        }

        // bill generation logic
        double bill = 0;
        for (String string : food) {
            String[] arr = string.split(" ");
            bill += Double.parseDouble(arr[1]);
        }

        CustomerBill bill2 = new CustomerBill(custName, contactNumber, food, bill);
        list.add(bill2);
    }

    // display all the bills from the list
    void displayBills() {
        System.out.println("****Customer Details List ****");
        for (CustomerBill bill : list) {
            System.out.println(bill);
        }
    }

    // update a bill in the list
    void updateBill() {
        System.out.println("Enter the Customer ID to update: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        for (CustomerBill bill : list) {
            if (bill.custId == id) {
                System.out.println("Enter new Customer Name (or press enter to keep current): ");
                String newName = sc.nextLine();
                if (!newName.isEmpty()) {
                    bill.custName = newName;
                }
                System.out.println("Enter new Contact Number (or press enter to keep current): ");
                String newContact = sc.nextLine();
                if (!newContact.isEmpty()) {
                    bill.contactNumber = Long.parseLong(newContact);
                }
                System.out.print("Enter number of food items (or press 0 to keep current): ");
                int qty = sc.nextInt();
                sc.nextLine(); // consume the leftover newline
                if (qty > 0) {
                    ArrayList<String> newFood = new ArrayList<>();
                    for (int i = 1; i <= qty; i++) {
                        System.out.println("Enter the " + i + " item and price (format: item price):");
                        String item = sc.nextLine();
                        newFood.add(item);
                    }
                    bill.food = newFood;
                    double newBill = 0;
                    for (String string : newFood) {
                        String[] arr = string.split(" ");
                        newBill += Double.parseDouble(arr[1]);
                    }
                    bill.bill = newBill;
                }
                System.out.println("Bill updated successfully.");
                return;
            }
        }
        System.out.println("Customer ID not found.");
    }

    // remove a bill from the list
    void deleteBill() {
        System.out.println("Enter the Customer ID to delete: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        for (Iterator<CustomerBill> iterator = list.iterator(); iterator.hasNext(); ) {
            CustomerBill bill = iterator.next();
            if (bill.custId == id) {
                iterator.remove();
                System.out.println("Bill deleted successfully.");
                return;
            }
        }
        System.out.println("Customer ID not found.");
    }
}

public class RestaurentDrivers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();
        while (true) {
            System.out.println("**** Welcome ****");
            System.out.println("1. Add Bill");
            System.out.println("2. Update Bill");
            System.out.println("3. Display all bills");
            System.out.println("4. Delete a bill");
            System.out.println("5. Exit");

            System.out.println();
            System.out.print("Enter an option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    restaurant.addBill();
                    break;
                case 2:
                    restaurant.updateBill();
                    break;
                case 3:
                    restaurant.displayBills();
                    break;
                case 4:
                    restaurant.deleteBill();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong option entered");
            }
        }
    }
}
