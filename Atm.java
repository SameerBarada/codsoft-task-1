import java.util.Scanner;

public class Atm {
    public static void main(String args[]) {
        int balance = 100000, withdraw, deposit, pin, pinbu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pleaase set Your pin :");
        pin = sc.nextInt();
        System.out.println("");

        while (true) {

            System.out.println("1.Withdraw");
            System.out.println("2.Deposit");
            System.out.println("3.Check Balance");
            System.out.println("4.EXIT");
            System.out.print("Choose the operation you want to perform:");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Your pin");
                    pinbu = sc.nextInt();
                    if (pin == pinbu) {
                        System.out.print("Enter money to be withdrawn:");
                        withdraw = sc.nextInt();
                        if (balance >= withdraw) {
                            balance = balance - withdraw;
                            System.out.println("Please collect your money");
                            System.out.println("");
                            break;
                        } else {
                            System.out.println("Insufficient Balance...");
                            System.out.println("");
                            break;
                        }
                    } else {
                        System.out.println("Invalid PIN");
                        System.out.println("");
                        break;
                    }
                case 2:
                    System.out.println("Enter Your pin");
                    pinbu = sc.nextInt();
                    if (pin == pinbu) {
                        System.out.print("Enter money to be deposited:");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully depsited");
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Invalid PIN");
                        System.out.println("");
                    }
                case 3:
                    System.out.println("Enter Your pin");
                    pinbu = sc.nextInt();
                    if (pin == pinbu) {
                        System.out.println("Your Balance in your acc is: " + balance);
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Invalid PIN");
                        System.out.println("");
                    }
                case 4:
                    System.exit(0);
            }
        }
    }
}
