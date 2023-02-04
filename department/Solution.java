package com.department;

import java.util.Scanner;

import com.exception.InvalidChioceException;

public class Solution {

	private static void displayMenu() {

		System.out.println(
				"1: addProduct \n2:Remove \n3: Remove All \n4: Display \n5:DisplayAll \n6:Update product \n7:Count product \n8:Sort Product\n9:Exit");
	}

	public static void main(String[] args) {
		// menu - Driven Program --> 9 options
		// switch
		// com.customexception -->InvalidChoiceException
		Scanner sc = new Scanner(System.in);
		DepartmentStore store = new DepartmentStoreImpl();
		while (true) {
			System.out.println("Welcome to departmental store\n-----------------------------\n");
			displayMenu();
			System.out.println("\n Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1: {
				store.addProduct();
				break;
			}
			case 2: {
				store.remove();
				break;
			}
			case 3: {
				store.removeAll();
				break;
			}
			case 4: {
				store.display();
				break;
			}
			case 5: {
				store.displayAll();
				break;
			}
			case 6: {
				store.update();
				break;
			}
			case 7: {
				store.count();
				break;
			}
			case 8: {
				store.sortProduct();
				break;
			}
			default: {
				try {
					throw new InvalidChioceException("InvalidchoiceException");
				} catch (InvalidChioceException e) {
					System.out.println(e.getMessage());
				}
			}

			}
		}
	}

}
