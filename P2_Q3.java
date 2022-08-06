package PR2_3;
public class ATM {
    private static int count;
    private final String id;
    private double balance;

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public ATM() {
        count++;
        if (count < 10) {
            id = "AC00" + (count);
        } else {
            id = "AC0" + (count);
        }
        balance = 300;
    }

    public void withdraw(double money) {
        if (balance - money >= 300) {
            balance -= money;
            System.out.println(money + " Money successfully withdrawn.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance !!!.");
        }
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "Rs deposited to your account.");
        System.out.println("Your Current Balance is : " + balance);
    }

    public void MoneyTransfer(ATM obj, double amount) {
        if (balance - amount >= 300) {
            balance -= amount;
            obj.balance += amount;
            System.out.println(amount + " Rs successfully Transferred.");
            System.out.println("Remaining Balance is : " + balance);
        } else {
            System.out.println("Insufficient balance to transfer the amount.");
        }
    }
}

// Second class 
package PR2_3;
import PR2_2.Account;

import java.util.ArrayList;
import java.util.Scanner;

public class ATMMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = "";
        String id2 = "";
        boolean flag = true;
        int choice;
        double amt;
        ArrayList<ATM> people = new ArrayList<ATM>();
        for (int i = 1; i <= 10; i++) {
            people.add(new ATM());
        }
        System.out.print("Enter Your Account Number : ");
        id = sc.next();
        int userNumber = userID(id, people);

        while (flag) {
            System.out.println();
            System.out.println("Make a choice......");
            System.out.println("1.    Balance inquiry ");
            System.out.println("2.    Withdraw money ");
            System.out.println("3.    Deposit money");
            System.out.println("4.    Money Transfer ");
            System.out.println("5.    Create Account ");
            System.out.println("6.    Deactivate Account");.   
            System.out.println("7.    Exit ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Account Number : " + id);
                    System.out.println("Current Balance : " + people.get(userNumber).getBalance());
                }
                case 2 -> {
                    System.out.print("Enter Amount To Withdraw : ");
                    amt = sc.nextDouble();
                    people.get(userNumber).withdraw(amt);
                }
                case 3 -> {
                    System.out.print("Enter Amount To Deposit : ");
                    amt = sc.nextInt();
                    people.get(userNumber).deposit(amt);
                }
                case 4 -> {
                    System.out.print("Enter Account Number To Transfer Money :");
                    id2 = sc.next();
                    int u2 = userID(id2, people);
                    System.out.print("Enter Amount To Transfer : ");
                    amt = sc.nextInt();
people.get(userNumber).MoneyTransfer(people.get(u2), amt);
                }
                case 5 -> {
                    people.add(new ATM());
                    System.out.println("Account Created Successfully.");
                    System.out.println("The New Account Number Is :" + people.get(people.size() - 1).getId());
                }
                case 6 -> {
                    people.remove(userNumber);
                    System.out.println("Account Deleted Successfully.");
                    flag = false;
                }
                case 7 -> flag = false;
                default -> System.out.println("Make a valid choice..");
            }
        }

    }

    public static int userID(String id, ArrayList<ATM> people) {
        Scanner s = new Scanner(System.in);
        int user = 10000;
        int i;
        for (i = 0; i < people.size(); i++) {
            if (id.equals(people.get(i).getId())) {
                user = i;
                break;
            }
        }
        if (i == people.size()) {
            System.out.println("No Such Account Exists.\nTry Again..");
            System.out.print("Enter your account id :");
            id = s.next();
            return userID(id, people);
        } else return user;
    }
}
