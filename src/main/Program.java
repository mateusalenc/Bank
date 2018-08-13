package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exception.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account data");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.next();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();

		Account account = new Account(number, holder, balance, withdrawLimit);
		System.out.print("Enter amount for withdraw: ");
		Double amount = sc.nextDouble();
		try {

			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());

		} catch (DomainException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
