import java.util.*;
public class BankApp {
    static class Account {
        private String accountNumber;
        private String holderName;
        private String pin;
        private double balance;

        public Account(String accountNumber, String holderName, String pin) {
            this.accountNumber = accountNumber;
            this.holderName = holderName;
            this.pin = pin;
            this.balance = 0.0;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public String getHolderName() {
            return holderName;
        }

        public boolean verifyPin(String inputPin) {
            return pin.equals(inputPin);
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) balance += amount;
        }

        public boolean withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                return true;
            }
            return false;
        }

        public void displayDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Holder Name: " + holderName);
            System.out.println("Balance: ₹" + balance);
        }
    }

    static class Bank {
        private HashMap<String, Account> accounts = new HashMap<>();
        private Random rand = new Random();

        public Account createAccount(String holderName, String pin) {
            String accNum = String.valueOf(100000 + rand.nextInt(900000));
            Account acc = new Account(accNum, holderName, pin);
            accounts.put(accNum, acc);
            return acc;
        }

        public Account getAccount(String accNum) {
            return accounts.get(accNum);
        }

        public boolean transfer(String fromAcc, String toAcc, String pin, double amount) {
            Account sender = accounts.get(fromAcc);
            Account receiver = accounts.get(toAcc);
            if (sender != null && receiver != null && sender.verifyPin(pin)) {
                if (sender.withdraw(amount)) {
                    receiver.deposit(amount);
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        boolean running = true;

        System.out.println("=== Welcome to Codingal Bank ===");

        while (running) {
            System.out.println("\n1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter your name: ");
                    String name = sc.nextLine();
                    System.out.print("Set a 4-digit PIN: ");
                    String pin = sc.nextLine();
                    Account newAcc = bank.createAccount(name, pin);
                    System.out.println("Account created! Your account number is: " + newAcc.getAccountNumber());
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String accNum = sc.nextLine();
                    System.out.print("Enter PIN: ");
                    String inputPin = sc.nextLine();
                    Account acc = bank.getAccount(accNum);

                    if (acc != null && acc.verifyPin(inputPin)) {
                        boolean loggedIn = true;
                        while (loggedIn) {
                            System.out.println("\n--- Account Menu ---");
                            System.out.println("1. Check Balance");
                            System.out.println("2. Deposit");
                            System.out.println("3. Withdraw");
                            System.out.println("4. Transfer");
                            System.out.println("5. Account Details");
                            System.out.println("6. Logout");
                            System.out.print("Choose option: ");
                            int op = sc.nextInt();
                            sc.nextLine();

                            switch (op) {
                                case 1:
                                    System.out.println("Balance: ₹" + acc.getBalance());
                                    break;
                                case 2:
                                    System.out.print("Enter amount to deposit: ");
                                    double dep = sc.nextDouble();
                                    acc.deposit(dep);
                                    System.out.println("Deposited ₹" + dep);
                                    break;
                                case 3:
                                    System.out.print("Enter amount to withdraw: ");
                                    double wd = sc.nextDouble();
                                    if (acc.withdraw(wd)) {
                                        System.out.println("Withdrew ₹" + wd);
                                    } else {
                                        System.out.println("Insufficient balance.");
                                    }
                                    break;
                                case 4:
                                    System.out.print("Enter recipient account number: ");
                                    String toAcc = sc.nextLine();
                                    System.out.print("Enter amount to transfer: ");
                                    double amt = sc.nextDouble();
                                    if (bank.transfer(accNum, toAcc, inputPin, amt)) {
                                        System.out.println("Transferred ₹" + amt + " to " + toAcc);
                                    } else {
                                        System.out.println("Transfer failed.");
                                    }
                                    break;
                                case 5:
                                    acc.displayDetails();
                                    break;
                                case 6:
                                    loggedIn = false;
                                    System.out.println("Logged out.");
                                    break;
                                default:
                                    System.out.println("Invalid option.");
                            }
                        }
                    } else {
                        System.out.println("Invalid account number or PIN.");
                    }
                    break;

                case 3:
                    running = false;
                    System.out.println("Thank you for banking with Codingal!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
