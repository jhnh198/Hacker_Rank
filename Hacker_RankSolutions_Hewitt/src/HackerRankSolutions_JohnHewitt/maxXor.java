/*John Hewitt
4/1/15
Maximising the value of XOR through a range from L to R. L being the lower bound and R being the upper bound
O(N^2) time complexity due to the nested for loop*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxXor {
    static int maxXor(int l, int r) {
        int max = 0; // returns this max value
        int compare = 0; // value to be determined through iteration
        
        for(int a = l; a <= r; a++)
            for(int b = l; b <= r; b++){
                compare = a ^ b; // carat is XOR in java
                if(compare > max){
                    max = compare;
                }
            }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine()); 
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);        
    }
}
