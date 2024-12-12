import java.util.*;
class takeTry{
    public int try1(int []arr, int []arr1){
        int index = 0;
        int index1 = 0;
        int sum = 0; int num, temp = 0, n = 1;
       for(int i = 0; i < arr.length; i++){
           System.out.print(" " + arr[i]);
           index = index * 10 + arr[i];
       }
        System.out.println();
       for(int i = 0; i < arr1.length; i++){
           System.out.print(" " + arr1[i]);
           index1 = index1 * 10 + arr1[i];
       }

        System.out.println();
        sum = index + index1;

        for(int i = 0; i < arr.length; i++){
            num = sum % 10;
            temp = (temp * 10) + num;
            sum = sum / 10;
            System.out.print(" " + num);
        }
       return sum;
    }
}

public class leet2 {
    public static void main(String[] args) {
        takeTry t1 = new takeTry();
        t1.try1(new int[]{2, 3, 4, 7},new int[]{1, 4, 5, 5});
    }
}
