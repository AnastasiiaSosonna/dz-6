import com.sun.jdi.IntegerValue;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int [] numbers = new int[]{2,1,8,6,10,11,3};
        int sum=0;
        for (int i=0; i<numbers.length; i++){

            int b=numbers[i];
           // System.out.println(b%2);
            if (b%2==0){
                sum=sum+b;
            }

        }
        System.out.println(sum);


    }

}
