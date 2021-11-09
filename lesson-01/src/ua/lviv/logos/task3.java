package ua.lviv.logos;

public class task3 {
	public static void main(String[] args) {

		int[] a = { 3, 5, 8, 12, 16, 31, 45, 61, 65, 77 };

		int min, max;
		min = max = a[0];

		for (int i = 1; i < 10; i++) {
			if (a[i] < min)
				min = a[i];
			if (a[i] > max)
				max = a[i];
		}

		System.out.println("Найбільше число: " + max);
		System.out.println("Найменше число: " + min);
	}
}
