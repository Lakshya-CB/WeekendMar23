package Lec_17_BS_Sliding;

import java.util.Scanner;

public class book {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();
		while (T > 0) {

			int[] books = new int[scn.nextInt()];
			int minWork = 0;
			int maxWork = 0;

			int total_ST = scn.nextInt();
			for (int i = 0; i < books.length; i++) {
				books[i] = scn.nextInt();
				maxWork = maxWork + books[i];
			}
			for(int pages = minWork; pages<=maxWork;pages++) {
				if(isPoss(pages, total_ST, books)) {
					System.out.println(pages);
					break;
				}
			}

		}
	}

	public static boolean isPoss(int max_workload, int total_st, int[] books) {
		// {10,20,15,17,16,30S}
		// st = 3;
		// max_work =35
		int load = 0;
		int curr_stu = 1;
		for (int book : books) {
			load = load + book;
			if (book > max_workload) {
				return false;
			}
			if (load > max_workload) {
				curr_stu++;
				load = book;
			}
		}
		return curr_stu <= total_st;
	}

}
