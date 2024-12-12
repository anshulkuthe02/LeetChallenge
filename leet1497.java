import java.util.ArrayList;
import java.util.*;

class takeTry1497{
    public boolean canArrrange(int []arr, int k){
        int []freq = new int[k];
        for(int num : arr){
            int remainder = (num % k + k) % k;
            freq[remainder]++;
        }
        if(freq[0] % 2 == 0) return false;
        for(int i = 1; i <= k; i++){
            if(freq[i] != freq[k - i]) return false;
        }
     return true;
    }
}
public class leet1497 {
    public static void main(String[] args) {
        takeTry1497 t1 = new takeTry1497();
        t1.canArrrange(new int[]{1,2,3,4,5,10,6,7,8,9},5);
    }
}
