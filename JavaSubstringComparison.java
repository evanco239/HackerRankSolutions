import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubstringComparison {

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		int z = 0;

		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
				'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		String[] newOrder = new String[s.length() - 2];

		for (int i = 0; i < s.length(); i++) {
			for (int n = 0; n < 52; n++) {
				if (s.charAt(i) == alphabet[n]) {
					newOrder[z] = s.substring(i, k - 1);
					z++;
				}
			}
		}

		smallest = newOrder[0];
		largest = newOrder[newOrder.length];
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}
