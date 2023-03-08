package array;

import java.util.Scanner;

public class ArrayTest {

	static ArrayOperation ob = new ArrayOperation();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" ** Welcome to Menu Driven project **");
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Element :" + (i + 1));
			a[i] = sc.nextInt();
		}

		while (true) {
			System.out.println("\nArray Operations");
			System.out.println(
					"1.Insert \n 2.Delete \n 3.Update \n 4.Sort \n 5.Search \n 6.Revers \n 7.min \n 8.max \n 9.Display \n 10.isEmpty \n 11.Exit");
			System.out.println("\nChoose your Operation");

			int option = sc.nextInt();
			switch (option) {
			case 1: {
				System.out.println("Enter new Element");
				int new_el = sc.nextInt();
				System.out.println("Enter Position");
				int pos = sc.nextInt();
				a = ob.insert(a, new_el, pos);
				ob.display(a);
				break;
			}

			case 2: {
				System.out.println("Enter new Element");
				int new_el = sc.nextInt();
				System.out.println("Enter Position");
				int pos = sc.nextInt();
				a = ob.delete(a, pos);
				ob.display(a);
				break;
			}
			case 3: {
				System.out.println("Enter new Element");
				int new_el = sc.nextInt();
				System.out.println("Enter Replace Element");
				int re = sc.nextInt();
				ob.update(a, new_el, re);
				ob.display(a);
				break;
			}
			case 4: {
				ob.sort(a);
				ob.display(a);
				break;
			}
			case 5: {
				System.out.println("Enter the Searching Element");
				int ele = sc.nextInt();
				int index = ob.search(a, ele);
				if (index == -1) {
					System.out.println("Element not found");
				} else {
					System.out.println("Element found at Position : " + (index + 1));
				}
				break;
			}

			case 6: {
				int rev[] = ob.reverse(a);
				ob.display(a);
				break;
			}

			case 7: {
				int min = ob.min(a);
				System.out.println("Minimum element is : " + min);
				break;
			}

			case 8: {
				int max = ob.max(a);
				System.out.println("Maximum Element is : " + max);
				break;
			}

			case 9: {
				ob.display(a);
				break;
			}

			case 10: {
				if (ob.isEmpty(a)) {
					System.out.println("Array is Empty");
				} else {
					System.out.println("Array is not Empty");

				}
				break;
			}

			case 11: {
				System.out.println("thank you For using our Application....");
				System.exit(0);
			}

			default: {
				System.out.println("Choose the current Optio");
			}
				sc.close();
			}
		}
	}

}
