/*
 * Author : John Hewitt, 2015
 *  Hacker Rank Competitive Programming Group
 *  NEIU Comuputer Science Society 
 */
package HackerRankSolutions_JohnHewitt;

/**
 *
 *  This program takes an array of integers and looks for a pair. If it finds a 
 *   single instance of an integer, the method returns that number.
 */
public class LonelyInteger {
    static int lonelyinteger(int[] a) {
       int scanInt = 0;
       int intCount = 0;
       int answer = 0;
       for(answer = 0; answer < 100; answer++){
           intCount = 0;
           for(int i = 0; i < a.length; i++){
           scanInt = a[i];
           if(answer == a[i])
               intCount++;
           if(intCount == 2){
               break;
               }
           }
           
           if (intCount == 1)
               return answer;
       }
      return 0;
    }
}
