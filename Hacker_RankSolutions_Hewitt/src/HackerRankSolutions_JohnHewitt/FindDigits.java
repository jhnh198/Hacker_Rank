/*
 * Author : John Hewitt, 2015
 *  Hacker Rank Competitive Programming Group
 *  NEIU Comuputer Science Society 
 */
package HackerRankSolutions_JohnHewitt;

import java.util.Scanner;

/** This program is designed to divide and modulus a large integer by 10's 
 * and find the number of single digits that evenly divide that number. 
 * number % digit == 0
 * zero does not count as a digit. cannot mod or divide a number by zero
 * 
 * 
 */
public class FindDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //declare scanner
	int digitCount = 0; //output
	int t = sc.nextInt(); //get test values
            
	while(t > 0){ //run one test for each value
	    //get our n
            int testNumberOrig = sc.nextInt(); //stores original value to be divided
            int testNumberNew = testNumberOrig; //stores new value for iteration
            int temp = 0;
            
            	while(testNumberNew > 0){
                    temp = testNumberNew % 10;
                    if(temp == 0){ //do nothing
                    }
                    else if(testNumberOrig % temp == 0){
                        digitCount++;
                    }
                
                testNumberNew /= 10;
                } //end nested while
            
	System.out.println(digitCount);
	digitCount = 0;
	t--;
        } //end while loop
    }//end main
} //end class
