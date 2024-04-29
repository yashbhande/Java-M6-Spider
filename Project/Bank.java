import java.util.Scanner;

class Account 
{
    private String accountHolderName; // Account holder's name
    private String address; // Account holder's address
    private long addharNumber; // Aadhaar number (consider renaming to "aadhaarNumber")
    private String pahnNumber; // PAN number (consider renaming to "panNumber")
    private int upiPin; // UPI PIN
    private double balance; // Account balance
    private long phoneNumber; // Account holder's phone number

    // Parameterized constructor
    Account(String accountHolderName1, String address1, String pan1, int upi, double bal, long phone) 
    {
        this.accountHolderName = accountHolderName1; // Value passed to account holder's name
        this.address = address1; // Value passed to address
        this.pahnNumber = pan1; // Value passed to PAN number
        this.upiPin = upi; // Value passed to UPI PIN
        this.balance = bal; // Value passed to balance
        this.phoneNumber = phone; // Value passed to phone number
    }

    // Setter method for updating account holder's name
    public void setAccountHolderName(String updateName)
    {
        this.accountHolderName = updateName;
    }

    // Getter method for retrieving account holder's name
    public String getAccountHolderName() 
    {
        return accountHolderName;
    }

    // Setter method for updating address
    public void setAddress(String uadd) 
    {
        this.address = uadd;
    }

    // Getter method for retrieving address
    public String getAddress()
    {
        return address;
    }

    // Setter method for updating UPI PIN
    public void setUpi(int uupi) 
    {
        this.upiPin = uupi;
    }

    // Setter method for updating phone number
    public void setPhone(long uphone) 
    {
        this.phoneNumber = uphone;
    }

    // Getter method for retrieving phone number
    public long getPhone() 
    {
        return phoneNumber;
    }

    // Getter method for retrieving balance
    public double getBalance() 
    {
        return balance;
    }

    // Method for depositing amount into the account
    public void deposit(double amount) 
    {
        balance = balance + amount;
        System.out.println("Deposited. Updated balance: " + balance);
    }

    // Method for withdrawing amount from the account
    public void withdraw(double amount) 
    {
        if (balance >= amount) 
        {
            balance = balance - amount;
            System.out.println("Withdrawal done, Updated balance: " + balance);
        } 
        else 
        {
            System.out.println("Failed, insufficient balance");
        }
    }
}


/*********************************** Main Method Starts here ****************************************/
public class Bank 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Account obj1 = null; // Account object
        boolean exit = false;
        double bal = 0; 

        while (!exit) 
        {
            System.out.println("1. Create Account");
            System.out.println("2. Existing User");
            System.out.println("3. Exit");
            System.out.println("Choose option");
            int num = sc.nextInt(); // User input for option

            switch (num) 
            {
                case 1: 
                {
                    System.out.println("Enter Account Holder Name:");
                    String accountHolderName1 = sc.next(); // User input for account holder's name

                    System.out.println("Enter Customer Address:");
                    String address1 = sc.next(); // User input for address

                    System.out.println("Enter Pan Number:");
                    String pan1 = sc.next(); // User input for PAN number

                    System.out.println("Create Upi Pin:");
                    int upi = sc.nextInt(); // User input for UPI PIN

                    System.out.println("Enter Initial Balance:");
                    bal = sc.nextDouble();  // User input for initial balance

                    System.out.println("Enter Customer Phone Number:");
                    long phone = sc.nextLong(); // User input for phone number

                    System.out.println("Account Created Successfully");

                    obj1 = new Account(accountHolderName1, address1, pan1, upi, bal, phone); // Creating account object
                }
                break;

                case 2: 
                {
                    // Check if an account object exists
                    if (obj1 != null) 
                    {
                        // Display account holder's name
                        System.out.println();
                        System.out.println();
                        System.out.println("Account Holder: " + obj1.getAccountHolderName());
                        System.out.println();
                        System.out.println();
                        // Display menu options for existing user
                        System.out.println("1. Check Balance");
                        System.out.println("2. Deposit Amount");
                        System.out.println("3. Withdrawal Amount");
                        System.out.println("4. Update Account");
                        System.out.println("5. Logout");
                        System.out.println("Choose option");
                        int num1 = sc.nextInt(); // User input for option

                    switch (num1) 
                    {
                        case 1: 
                        {
                            // Display current balance
                            System.out.println();
                            System.out.println();
                            System.out.println("Balance is: " + obj1.getBalance());
                        }
                        break;

                        case 2: 
                        {
                            // Prompt user to enter deposit amount
                            System.out.println("Enter Deposit amount:");
                            double deposit = sc.nextDouble();
                            // Call deposit method
                            obj1.deposit(deposit);
                        }
                        break;

                        case 3: 
                        {
                            // Prompt user to enter PIN for security
                            System.out.print("Enter the PIN:");
                            int uupin= sc.nextInt();
                            // Prompt user to enter withdrawal amount
                            System.out.println("Enter Withdrawal amount:");
                            double withdrawal = sc.nextDouble();
                            // Call withdrawal method
                            obj1.withdraw(withdrawal);
                        }
                        break;

                        case 4: 
                        {
                            // Display sub-menu for updating account details
                            System.out.println("1. Account Holder Name");
                            System.out.println("2. Address");
                            System.out.println("3. UPI Pin");
                            System.out.println("4. Phone Number");
                            System.out.println("Choose option");
                            int num2 = sc.nextInt(); // User input for sub-option

                            switch (num2) 
                            {
                                case 1: 
                                {
                                    // Prompt user to enter new name
                                    System.out.println("Enter new name:");
                                    String accountHolderName1 = sc.next();
                                    // Call setter method to update name
                                    obj1.setAccountHolderName(accountHolderName1);
                                }
                                break;

                                case 2: 
                                {
                                    // Prompt user to enter new address
                                    System.out.println("Enter new address:");
                                    String uadd = sc.next();
                                    // Call setter method to update address
                                    obj1.setAddress(uadd);
                                }
                                break;

                                case 3: 
                                {
                                    // Prompt user to enter new UPI
                                    System.out.println("Enter new UPI:");
                                    int uupi = sc.nextInt();
                                    // Call setter method to update UPI
                                    obj1.setUpi(uupi);
                                }
                                break;

                                case 4: 
                                {
                                    // Prompt user to enter new phone number
                                    System.out.println("Enter new phone number:");
                                    long uphone = sc.nextLong();
                                    // Call setter method to update phone number
                                    obj1.setPhone(uphone);
                                }
                                break;

                                default:System.out.println("Error! Not a correct Option");
                            }
                        }
                        break; // Case 4 --> Update Finished

                        case 5: 
                        {
                            // Logout the user by setting account object to null
                            obj1 = null;
                            System.out.println("Logged out successfully.");
                            System.exit(0);
                        }
                        break;

                        default:System.out.println("Error, enter correct option");
                    }
                    } 
                    else 
                    {
                        // Inform user to create an account first
                        System.out.println("Create account first");
                    }

                }
                break;

                case 3: 
                {
                    exit = true;
                }
                break;

                default:System.out.println("Error, not a correct option");
            }
        }
    }
}      
