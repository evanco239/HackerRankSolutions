import java.util.*;
import java.io.*;

public class JavaStringsIntro {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String A = scan.next();
		String B = scan.next();
		int a = 0;
		int b = 0;
		String no = "No";
		String yes = "Yes";

		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (int i = 0; i < 26; i++) {
			if (A.charAt(0) == alphabet[i]) {
				a = i;
			}
		}

		for (int x = 0; x < 26; x++) {
			if (B.charAt(0) == alphabet[x]) {
				b = x;
			}
		}
		
		A =  A.substring(0, 1).toUpperCase() + A.substring(1);
		B = B.substring(0, 1).toUpperCase() + B.substring(1);

		System.out.println(A.length() + B.length());
		if(a<=b) {
			System.out.println(no);
		}
		else System.out.println(yes);
		
		System.out.println(A + " " + B);

	}

}
