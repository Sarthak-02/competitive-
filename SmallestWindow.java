//http://www.geeksforgeeks.org/find-the-smallest-window-in-a-string-containing-all-characters-of-another-string/

import java.util.Arrays;

public class SmallestWiindow {

	static void findSmallestWindow(String str) {
		int str_hash[] = new int[256];
		int pat_hash[] = new int[256];
		char[] s = str.toCharArray();
		int window = 0;
		// Arrays.fill(pat_hash, 0);
		for (int i = 0; i < str.length(); i++) {
			pat_hash[s[i]]++;
		}
		int len = 0;
		for (int i = 0; i < 256; i++) {
			if (pat_hash[i] >= 1) {
				pat_hash[i] = 1;
				len++;
			}
		}
		int min = Integer.MAX_VALUE;
		int start = 0;
		int startIndex = -1;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			str_hash[s[i]]++;

			if (str_hash[s[i]] <= pat_hash[s[i]] && pat_hash[s[i]] != 0) {
				count++;
			}

			if (count == len) {
				while (str_hash[s[start]] > pat_hash[s[start]] || pat_hash[s[start]] == 0) {
					if (str_hash[s[start]] > pat_hash[s[start]]) {
						str_hash[s[start]]--;
					}
					start++;
					window = i - start + 1;

					if (min > window) {
						min = window;
						startIndex = start;
					}
				}
			}

		}
		if (startIndex == -1) {
			System.out.println("No window possible");
		} else {
			System.out.print(window);
		}

	}

	public static void main(String args[]) {
		String str = "aabacaab";
		findSmallestWindow(str);
	}
}
