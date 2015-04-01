import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaxXor {
    static int maxXor(int l, int r) {
        int a = l;
        int b = l;
        int max = 0;
        int compare = 0;
        
        for(int i = a; i <= r; i++)
            for(int j = b; j <= r; j++){
                compare = i ^ j;
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
