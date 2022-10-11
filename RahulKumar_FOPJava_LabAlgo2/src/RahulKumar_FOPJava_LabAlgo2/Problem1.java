package RahulKumar_FOPJava_LabAlgo2;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the values of array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the total number of targets to be achieved");
		int target = sc.nextInt();
		for (int j = 0; j < target; j++) {
			if (target > 0) {
				int point = 0;
				long input;
				int sum = 0;
				System.out.println("Enter the value of target");
				input = sc.nextInt();

				for (int i = 0; i < size; i++) {
					sum += a[i];
					if (sum >= input) {
						System.out.println("Target achieved after " + (i + 1) + "transactions");
						point = 1;
						break;
					}

				}
				if (point == 0)
					System.out.println("Given Target is not achieved");
			}
		}
	}
}
