class Solution{
    public void twoNum(int []nums, int target){
        for(int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int finale = nums[i] + nums[j];
                if (finale == target)
                    System.out.println("The target is: " + target + " on positions: " + i + " and " + j);
            }
        }
    }
}
public class leet1{
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.twoNum(new int[]{0, 1, 2, 3, 4, 5, 6},8);
    }
}

