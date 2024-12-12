class palindrome{
    public int sol(int num){
        int temp = num;
        int sum = 0;
        while(num > 0){
            int r = num % 10;
            sum = sum * 10 + r;
            num = num / 10;
        }
        if(temp == sum){
            System.out.print(" " + temp);
        } else System.out.println("not palindrome");
        return num;
    }
}
public class leet9 {

    public static void main(String[] args) {
        palindrome p1 = new palindrome();
        p1.sol(12322);
    }
}
