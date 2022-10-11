package RahulKumar_FOPJava_LabAlgo2;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Problem2 {
	int arr[];
	int store;
	int divide;

	public void reversion(int arr[]) {
		int temp;
		int n = arr.length;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
	}

	public void implement(int arr[]) {
		int store;
		int divide;
		System.out.println("Enter the amount ");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();
		System.out.println("Your Payment Approach in order to give minimum number of notes will be");
		for (int i = 0; i < arr.length; i++) {
			if (amount >= arr[i]) {
				store = amount % arr[i];
				divide = amount / arr[i];
				System.out.println("Denomination " + arr[i] + " notes " + ":: " + divide);
				amount = store;
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of currency demnominations");
		Scanner sc = new Scanner(System.in);
		int denominations = sc.nextInt();
		System.out.println("Enter the currency demnominations value");
		int arr[] = new int[denominations];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		Problem2 a = new Problem2();
		a.reversion(arr);
		a.implement(arr);
	}
}
