package leetcode;

import java.util.ArrayList;

public class Solution {


    public boolean isHappy(int n) {
        int temp = 0;
        int sum = 0;
        ArrayList<Integer> unhappy = new ArrayList<>();

        if (n == 1) {
            return true;
        }
        while (sum != 1) {
            sum = 0;
            ArrayList<Integer> nums = new ArrayList<>();
            int length = Integer.toString(n).length();
            for (int i = 0; i < length; i++) {
                temp = n % 10;
                nums.add(temp);
                n /= 10;
            }
            for (Integer num : nums) {
                System.out.print(num + "^2 + ");
                sum += num * num ;
            }
            System.out.println(" = " + sum);
            n = sum;
            if (unhappy.contains(sum)) {
                return false;
            }
            unhappy.add(sum);

        }
        if (sum == 1) {
            return true;
        }
        return false;
    }
}