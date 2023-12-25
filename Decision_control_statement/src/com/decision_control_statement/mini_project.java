package com.decision_control_statement;

import java.util.Scanner;


public class mini_project {
    private static int PIN = 1234;
    private static int balance = 500;
    private static int amount;

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        amount = sc.nextInt();
        balance += amount;
        System.out.println("Deposit of Rs:" + amount + " Successful");
    }

    public static void withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount to withdrawal:");
        amount = sc.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of Rs:" + amount + " Successful");
        } else {
            System.out.println("Insufficient amount");
        }
    }

    public static void checkBalance() {
        System.out.println("Your balance is Rs:" + balance);
    }

    public static void exit() {
        System.out.println("Exiting");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pin");
        int enteredPIN = sc.nextInt();

        if (enteredPIN == PIN) {
            System.out.println("Select operation");
            System.out.println("1. Deposit\n2. Withdrawal\n3. Check Balance\n4. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdrawal();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } else {
            System.out.println("Invalid PIN. Exiting...");
        }
    }
}

