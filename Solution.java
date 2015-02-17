import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public int testCases = 0;
	public ArrayList<String> inputNumString = new ArrayList<String>();
	public ArrayList<Integer> count = new ArrayList<Integer>();
	
	public void getCount() {
		int sum = 0;	
		for (int i=0; i<inputNumString.size(); i++) {
			String numString = inputNumString.get(i);
			for (int j=0; j<numString.length(); j++) {
				int numerator = Integer.parseInt(numString);
				int denominator = Character.getNumericValue(numString.charAt(j));
				if (denominator != 0) {
					if (numerator % denominator == 0) {
						sum++;
					}
				}
			}
			count.add(sum);
			sum = 0;
		}		
	}
	
	public String outputCount() {
		String str = "";
		for (int i=1; i<count.size(); i++) {
			str += count.get(i) + "\r\n";
		}
		return str;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution fd = new Solution();
		Scanner kbd = new Scanner(System.in);
		fd.testCases = kbd.nextInt();
		for (int i=0; i<=fd.testCases; i++) {
			fd.inputNumString.add(kbd.nextLine());
		}
		
		fd.getCount();
		System.out.println(fd.outputCount());
      
    }
}