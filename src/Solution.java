//import java.util.Arrays;
//
//class Solution {
//    private int len, c1, c2;
//    private final int mod = (int) 1e9 + 7;
//
//    // Solves the minCost to reach max value:
//    // If a Polygon can be formed with maxDelta and all other deltas, use cost2 as
//    // much as possible
//    // Else fill the diff to form Polygon with cost1
//    private long solve(long maxD, long sumD) {
//        if (maxD * 2 <= sumD)// Polygon can be formed with maxD and other edges,
//            return (sumD / 2) * c2 + (sumD & 1) * c1;// use cost2 as much as possible, cost1 to fill
//        else// else (cannot form Polygon), fill diff with cost1,
//            return (2 * maxD - sumD) * c1 + (sumD - maxD) * c2;
//    }
//
//    public int minCostToEqualizeArray(int[] nums, int cost1, int cost2) {
//        if (nums.length <= 1)
//            return 0;
//        len = nums.length;
//        c1 = cost1;
//        c2 = cost2;
//        int max = Arrays.stream(nums).max().getAsInt();
//        long sumD = 0;// sum of Deltas
//        long maxD = 0;// max Delta
//        for (int i = 0; i < len; i++) {
//            maxD = Math.max(maxD, max - nums[i]);
//            sumD += max - nums[i];
//        }
//        // System.out.println("int: " + (int) (sumD * c1 % mod));
//        if (c2 >= c1 * 2)
//            return (int) (sumD * c1 % mod);
//
//        if (nums.length == 2)
//            return (int) (sumD * c1 % mod);
//
//        long ans = solve(maxD, sumD);
//        while (maxD * 2 > sumD) {
//            maxD++;
//            sumD += len;
//            ans = Math.min(ans, solve(maxD, sumD));
//        }
//        if (sumD % 2 == 1) {// just in case it's odd
//            maxD++;
//            sumD += len;
//            ans = Math.min(ans, solve(maxD, sumD));
//        }
//        return (int) (ans % mod);
//    }
//}