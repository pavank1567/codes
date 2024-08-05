import java.util.*;

public class POD {
    public static void main(String[] args) {
//        int[] nums = {0,4,3,0,4};
//        Arrays.sort(nums);
//        for(int x=1;x<=nums[nums.length-1];x++){
//            int index = search(nums,x);
//            if(nums.length-index==x){
//                System.out.println(x);
//                return;
//            }
//
//        }
//        System.out.println(-1);

//        String s="ujteygggjwxnfl";
//        String t="nstsenrzttikoy";
//        int maxCost = 43;
//        System.out.println(equalSubstring(s,t,maxCost));



//        String s="1101";
//        System.out.println(numSteps(s));

//        int[] nums={2,3,1,6,7};
////        System.out.println(firstMissingPositive(nums));
//        System.out.println(countTriplets(nums));
//        checkRecord(1000);
//
//        int[] nums = {1,2,2,3,3,4,5};
////        System.out.println(Arrays.toString(singleNumber(nums)));
//
////        System.out.println(removeElement(nums,1));
//
////        rotate(nums,3);
//        removeDuplicates(nums);
//
//        System.out.println(appendCharacters("coaching","coding" ));

         ;
        //        System.out.println(maxProfit2(nums));

//        jump(nums);
//        System.out.println(Arrays.toString(arrayProduct(nums)));

//        int nums[]= {5,7,7,8,8,10};
//        System.out.println(Arrays.toString(searchRange(nums,8)));
//
//        int[][] queries = {{1,2},{2,13,5},{1,5},{1,11},{2,15,7}};
//        getResults(queries);
//        int[] nums= {1,2,3,6,2,3,4,7,8};
//        System.out.println(isNStraightHand(nums,3));;


//        String password = "bbaaaaaaaaaaaaaaacccccc";
//        System.out.println("pass :: " + password.length());
//        System.out.println(strongPasswordChecker(password));
//        int[] nums = {1,2,2};
////        some(nums,2,1);
//
//        minIncrementForUnique(nums);

//        int[] nums = {1000000000,1000000000};
//        minDays(nums, 1, 1);
//
//        int[] cust = {1,0,1,2,1,1,7,5};
//        int[] grumpy = {0,1,0,1,0,1,0,1};
//        maxSatisfied(cust, grumpy, 3);

//        int[] nums = {0,0,0,1,0,1,1,0};
//        minKBitFlips(nums,3,0);
//        int[][] nums = {{0,1},{1,2},{2,3},{0,2},{1,3},{2,4}};
//
//        maximumImportance(5,nums);
//        Node n1 = new Node(1);
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(4);
//
//        n1.neighbors = Arrays.asList(n2,n4);
//        n2.neighbors = Arrays.asList(n1,n3);
//        n3.neighbors = Arrays.asList(n2,n4);
//        n4.neighbors = Arrays.asList(n1,n3);
//        cloneGraph(n1);

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,4,5));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(5,4,8,6));
        Sol solution= new Sol();
        Sol.maxProfit(arr1,arr2,4,5);

//        int[][] graph = {{2,3,5,6,7,8,9},
//{2,3,4,5,6,7,8,9},
//{0,1,3,4,5,6,7,8,9},
//{0,1,2,4,5,6,7,8,9},
//{1,2,3,6,9},
//{0,1,2,3,7,8,9},
//{0,1,2,3,4,7,8,9},
//{0,1,2,3,5,6,8,9},
//{0,1,2,3,5,6,7},
//{0,1,2,3,4,5,6,7}};
//
//        solution.isBipartite(graph);
//        solution.recoverFromPreorder("d");
//        solution.paths;
//        solution.cycleLengthQueries(1, new int[][]{});
        /*TreeNode root = new TreeNode(1);

        TreeNode temp1 = new TreeNode(2);
        temp1.left = new TreeNode(3);
        temp1.right = new TreeNode(4);

        TreeNode temp2 = new TreeNode(5);
        temp2.left = new TreeNode(6);
        temp2.right = new TreeNode(7);
        root.left = temp1;
        root.right = temp2;

//        solution.sym(root);

//        solution.connect(root);

        solution.isValidBST(root);*/
//        MedianFinder medianFinder = new MedianFinder();
//        medianFinder.addNum(1);
//        System.out.println(medianFinder.root);
//        System.out.println(medianFinder.findMedian());
//        medianFinder.addNum(2);
//        System.out.println(medianFinder.root);
//        System.out.println(medianFinder.findMedian());
//        medianFinder.addNum(3);
//        System.out.println(medianFinder.root);
//        System.out.println(medianFinder.findMedian());

        int[] nums = {10,9,2,5,3,7,101,18};
        solution.lengthOfLIS(nums);
        solution.maxProduct(new int[]{});

    }


    private static int search(int[] nums, int x) {

        int high = nums.length-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]<x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
//        System.out.println(x + " " + (low));
        return low;
    }

    public static int equalSubstring(String s, String t, int maxCost) {

        int prevCost = 0;
        int index =0;
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            int currentCost = Math.abs(s.charAt(i)-t.charAt(i));
//            System.out.println(index + " " + (currentCost+prevCost));

            if((currentCost+prevCost) > maxCost){
                prevCost=prevCost-(Math.abs(s.charAt(index)-t.charAt(index)))+currentCost;
                index++;
                if(prevCost<maxCost){
                    maxLen = Math.max(maxLen, i-index+1);
                }
            }
            else{
                prevCost+=currentCost;
                maxLen=Math.max(maxLen, i-index+1);
            }

        }
        return maxLen;

    }

    public static int numSteps(String s) {

        int len = s.length();
        int steps=len-1, carry=0;
        for(int i = len-1;i>0;i--) {

            if(s.charAt(i)-'0'+carry==1) {
                steps++;
                carry = 1;
            }
        }
        return steps+carry;
    }

    public static int firstMissingPositive(int[] nums) {

        for(int i=0;i<nums.length;i++) {
            System.out.println(i);
            while(nums[i]!=i+1 && nums[i]>0) {
                if(nums[i]<nums.length) {
                    if(nums[nums[i]-1]==nums[i])
                        break;
                    swap(nums, i, nums[i] - 1);
                }
                else
                    break;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return nums.length;
    }

    public static void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }

    public static int countTriplets(int[] arr) {

        int count=0;
        for(int i=0;i<arr.length;i++){

            int ijxor = 0;
            for(int j=i+1;j<arr.length;j++){
                ijxor^=arr[j-1];
                int jkxor=0;
                for(int k=j;k<arr.length;k++){
                    jkxor^=arr[k];
                    if(ijxor==jkxor)
                        count++;

                }
            }
        }
        return count;
    }

    public static int checkRecord(int n) {

//        int res[] = {0};
//
//        recur(0,n,0,0, res);
//
//        System.out.println(res[0]);
//
//        return 0;



return 0;
    }

    private static void recur(int index, int n, int countA, int countL, int[] res) {
        if(index==n) {
            res[0]++;
//            System.out.println("HERE");
            return;
        }
        for(int cur: new int[]{0,1,2}){
            if(cur==0)
                countA++;
            if(cur==1)
                countL++;
            else
                countL=0;

            if(countA>=2) {
                countA--;
                continue;
            }
            if(countL==3) {
                countL--;
                continue;
            }
            recur(index+1,n,countA,countL, res);
            if(cur==0)
                countA--;
            if(cur==1)
                countL--;
        }
    }

    public static int[] singleNumber(int[] nums) {

        int allxor = 0;
        for (int num : nums) {
            allxor ^= num;
        }

        int setBit = allxor & (-allxor);

        int[] result = new int[2];
        for (int num : nums) {
            if ((setBit & num) == 0) {
                result[0] ^= num;
            } else {
                result[1] ^= num;
            }
        }

        return result;

    }
    public static int removeElement(int[] nums, int val) {

        int low = 0;
        int high= nums.length-1;
        while(low<=high){
            while(low<=high && nums[high]==val)
                high--;
            while(low<=high && nums[low]!=val)
                low++;

            if(low<=high) {
                nums[low] = nums[high];
                low++;
                high--;
            }
        }
        return low;

    }
    public static void rotate(int[] nums, int k) {

//        reverse(nums,0,nums.length-1);
//        reverse(nums,0,k-1);
//        reverse(nums,k,nums.length-1);

        k=k%nums.length;
        int[] temp = new int[nums.length-k];
        int index=0;
        for(int i=0;i<nums.length-k;i++){
            temp[i]=nums[i];
        }

        for(int i = nums.length-k; i<nums.length; i++){
            nums[index++]=nums[i];
        }

        for(int i:temp){
            nums[index++]=i;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void reverse(int[] nums,int i,int j){

        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

//        int[] temp= new int[m+n];
//        int i=0,j=0, index=0;
//        while(i<m && j<n){
//            if(nums1[i]<nums2[j]) {
//                temp[index++] = nums1[i];
//                i++;
//            }
//            else {
//                temp[index++] = nums2[j];
//                j++;
//            }
//        }
//        while(i<m){
//            temp[index++]=nums1[i++];
//        }
//        while(j<n){
//            temp[index++]=nums2[j++];
//        }
//        for(int ind=0;ind<m+n;ind++){
//            nums1[ind]=temp[ind];
//        }
        int i = m-1, j = n-1, k = m+n-1;
        while(j >= 0){
            if(i >= 0 &&nums1[i] > nums2[j]) nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }

    }
    public static int removeDuplicates(int[] nums) {

        int index=0;

        nums[index++]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }

    public static int appendCharacters(String s, String t) {

        int index=0;
        int i=0;

        int m = s.length();
        int n = t.length();

        while(i<m && index<n){
            if(s.charAt(index) == t.charAt(i)){
                i++;
            }
            index++;
        }

        return n-i;

    }

    public void reverseString(char[] s) {

        int i=0,j=s.length-1;
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }

    public int scoreOfString(String s) {


        int total =0;
        for(int i=0;i<s.length()-1;i++){
            total += Math.abs(s.charAt(i)-s.charAt(i+1));
        }
        return total;
    }

    public int majorityElement(int[] nums) {

        int ele=nums[0];
        int count=0;

        for(int i:nums){
            if(ele==i)
                count++;
            else
                count--;
            if(count==0)
                ele=i;
        }
        return ele;
    }
    public int[] majorityElement2(int[] nums) {


        int ele1=-1;
        int ele2=-1;
        int count1=0;
        int count2=0;

        for(int i:nums){

            if(count1==0)
                ele1=i;
            else if(count2==0)
                ele2=i;
            if(ele1==i)
                count1++;
            else
                count1--;
            if(ele2==i)
                count2++;
            else
                count2--;
        }
        return new int[]{ele1,ele2};
    }

    public int maxProfit(int[] prices) {

        int profit=0;
        int n=prices.length;

        if(n<=1)
            return 0;

        int last=prices[n-1];
        for(int i=n-2;i>=0;i--){
            if(prices[i]>last){
                last=prices[i];
            }
            profit=Math.max(last-prices[i], profit);
        }
        return profit;
    }

    public static int maxProfit2(int[] prices) {

        int maxProfit = 0;
        stock(prices,0,0);
        return maxProfit;
    }

    public static int stock(int[] prices, int index, int buy){

        if(index==prices.length){
            return 0;
        }

        int pick=0,notPick =0;
        if(buy==0){
            pick = -prices[index] + stock(prices,index+1, 1);
            notPick=stock(prices,index+1,0);
        }
        else if(buy==1){
            pick = prices[index] + stock(prices,index+1, 0);
            notPick=stock(prices,index+1,1);
        }

//        return Math.max(pick,notPick);

        int max=0;
        int len=prices.length;
        for(int i=1;i<len;i++){
            if(prices[i-1]<prices[i])
                max+=prices[i]-prices[i-1];
        }
        return max;

    }

    public static boolean canJump(int[] nums) {

//        int dp[] = new int[nums.length+1];
//        Arrays.fill(dp,-1);
//        return jump(nums,0, dp);
        boolean[] dp = new boolean[nums.length];
        dp[nums.length-1] = true;

        int lastIndex = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]+i >= lastIndex){
                lastIndex=i;
            }
        }
        return lastIndex==0;
    }

    private static boolean jump(int[] nums, int index, int[] dp) {
        if(index>=nums.length-1)
            return true;

        if(dp[index]!=-1) {
            if(dp[index]==0)
                return false;
            return true;
        }
        for(int i=1;i<=nums[index];i++){
            if(jump(nums, index+i,dp)) {
                dp[index+i]=1;
                return true;
            }
        }
        dp[index]=0;
        return false;
    }
    private static int jump(int[] nums) {

        int n= nums.length;
        int[] dp = new int[n];
        dp[n-1]=0;
        for(int i=n-2; i>=0; i--){
            int mini=Integer.MAX_VALUE-1;
            for(int j=i+1; j<= Math.min(n-1,i+nums[i]); j++){
                mini = Math.min(dp[j]+1, mini);
            }
            dp[i]=mini;
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }


    public int longestPalindrome(String s) {

        Map<Character,Integer> map = new HashMap<>();

        int[] count = new int[58];

        int res=0;

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'A']++;
        }

        boolean oddPresent=false;
        for(int i=0; i<s.length(); i++){

            char ch = s.charAt(i);

            if(count[ch-'A']%2==0)
                res+=count[ch-'A'];
            else if (!oddPresent) {
                res+=count[ch-'A'];
                oddPresent=true;
            }
            else{
                res+=count[ch-'A']==1 ? 0 : count[ch-'A']-1;
            }

            count[ch-'A']=0;
        }
        return res;
//        boolean oddPresent=false;
//        int count=0;
//        for(Character ch : map.keySet()){
//            if(map.get(ch)%2==0){
//                count+=map.get(ch);
//            }
//            else if(!oddPresent){
//                count+=map.get(ch);
//            }
//            else{
//                count+=map.get(ch)-1;
//            }
//        }
//        return count;
    }

    public int hIndex(int[] citations) {

        int n = citations.length;
        int[] count = new int[n+1];

        for(int i=0;i<n;i++){
            if(citations[i]>=n){
                count[n]++;
            }
            else{
                count[citations[i]]++;
            }
        }

        int sufSum=0;
        for(int i=n;i>=1;i--){
            sufSum += count[i];
            if(sufSum>=i)
                return i;
        }
        return 0;


    }

    public static int[] arrayProduct(int[] nums){

        int n = nums.length;
        int[] prefix = new int[n];

        int[] res = new int[n];

        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i];
        }

        int suffixProduct=1;
        for(int i=n-1;i>=0;i--){

            res[i]=1;
            if(i>0)
                res[i]*=prefix[i-1];
            if(i<n-1)
                res[i]*=suffixProduct;
            suffixProduct*=nums[i];
        }

        return res;

    }
    public List<String> commonChars(String[] words) {



        List<String> res = new ArrayList<>();
        int n = words.length;

        int[][] count = new int[n][26];
        for(int i=0;i<words.length;i++){
            for(int j=0; j<words[i].length(); j++){
                count[i][words[i].charAt(j)-'a']++;
            }
        }
        for(int i=0;i<words[0].length();i++){
            char ch = words[0].charAt(i);
            int j;
            for(j=1;j<n;j++){
                if(count[j][ch-'a']>0){
                    count[j][ch-'a']--;
                }
                else
                    break;
            }
            if(j==n)
                res.add(String.valueOf(ch));
        }
        return res;

    }

    public List<String> commonChars(String[] words,int k) {
        int[] last = count(words[0]);
        for (int i = 1; i < words.length; i++) {
            last = intersection(last, count(words[i]));
        }
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (last[i] != 0) {
                char a = 'a';
                a += i;
                String s = String.valueOf(a);
                while (last[i] > 0) {
                    arr.add(s);
                    last[i]--;
                }
            }
        }
        return arr;
    }
    int[] intersection(int[] a, int[] b) {
        int[] t = new int[26];
        for (int i = 0; i < 26; i++) {
            t[i] = Math.min(a[i], b[i]);
        }
        return t;
    }
    int[] count(String str) {
        int[] t = new int[26];
        for (char c : str.toCharArray()) t[c - 'a']++;
        return t;
    }

    public static int[] searchRange(int[] nums, int target) {

        int low=0,high=nums.length-1;
        int pos1=-1,pos2=-1;
        while(low<=high){
            int mid  = (low+high)/2;
            if(nums[mid]==target) {
                pos1=mid;
                if(low==high)
                    break;
                high=mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        if(pos1==-1)
            return new int[]{-1,-1};

        low=0;
        high=nums.length-1;

        while(low<=high){
            int mid  = (low+high)/2;

            if(target==nums[mid]){
                pos2=mid;
                if(low==high)
                    break;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return new int[]{pos1,pos2};

    }
    public boolean isMatch(String s, String p) {

        int index=0;
        int i=0;
        int n=s.length();
        while(index<p.length()){
            if(i>=n){
                if(p.charAt(index)!='.' && p.charAt(index)!='*')
                    return false;
                index++;
            }
            else if(s.charAt(i)==p.charAt(index)){
                index++;
                i++;
            } else if (p.charAt(index)=='.') {
                index++;
                i++;
            } else if (p.charAt(index)=='*') {
                if(p.charAt(index-1)!='.' && p.charAt(index-1)!=s.charAt(i))
                    return false;
                index++;
                i++;
                while(i<n && s.charAt(i) == s.charAt(i-1))
                    i++;
            } else {
                index++;
                if(p.charAt(index)=='*')
                    index++;
                else
                    return false;
            }
        }
        return i == s.length();
    }

    public boolean fun(String s, String p, int i, int j, int dp[][]) {


        boolean res;
        if(dp[i][j]!=0)
            return dp[i][j]==2;

        if(j==p.length()){
            res = i==s.length();
        }
        else {
            boolean match = i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.');

            if(j+1<p.length() && p.charAt(j+1)=='*'){
                res = (fun(s, p, i,j+2, dp) || (match && fun(s,p,i+1,j,dp)));
            }
            else {
                res = match && fun(s,p,i+1,j+1,dp);
            }
        }
        if(res)
            dp[i][j]=2;
        else
            dp[i][j]=1;
        return res;

    }
    enum Result {
        TRUE, FALSE
    }

    class Solution {
        Result[][] memo;

        public boolean isMatch(String text, String pattern) {
            memo = new Result[text.length() + 1][pattern.length() + 1];
            return dp(0, 0, text, pattern);
        }

        public boolean dp(int i, int j, String text, String pattern) {
            if (memo[i][j] != null) {
                return memo[i][j] == Result.TRUE;
            }
            boolean ans;
            if (j == pattern.length()){
                ans = i == text.length();
            } else{
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));

                if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                    ans = (dp(i, j+2, text, pattern) ||
                            first_match && dp(i+1, j, text, pattern));
                } else {
                    ans = first_match && dp(i+1, j+1, text, pattern);
                }
            }
            memo[i][j] = ans ? Result.TRUE : Result.FALSE;
            return ans;
        }
    }

    public static List<Boolean> getResults(int[][] queries) {


        List<Integer> obs = new ArrayList<>();
        List<Boolean> res = new ArrayList<>();

        int count=0;
        for(int[] query: queries){
            if(query[0]==1){
                obs.add(query[1]);
            }
            else {
                int index = query[1];
                int size = query[2];
                Collections.sort(obs);
                int prev=0;
                for(int i=0;i<obs.size();i++){

                   if(Math.min(index,obs.get(i))-prev>=size){
                       res.add(true);
                       break;
                   }
                   if(index<obs.get(i))
                       break;
                   prev=obs.get(i);
                }
                if(res.size()==count)
                    res.add(false);
            }
        }
        return res;

    }
    public static List<Boolean> getResults(int[][] queries, int k) {

        int[] obs = new int[queries.length];
        List<Boolean> res = new ArrayList<>();

        int count=0;
        int ind=0;
        for(int[] query: queries){
            if(query[0]==1){
                obs[ind++] = query[1];
            }
            else {
                int index = query[1];
                int size = query[2];
//                Collections.sort(obs);
                Arrays.sort(obs,0,ind);
                if(ind==0){
                    if(index>=size)
                        res.add(true);
                    else
                        res.add(false);
                }
                else if(index - obs[ind] >=size)
                    res.add(true);
                else{
                    int prev=0;
                    for(int i=0;i<=ind;i++){

                        if(Math.min(index,obs[i])-prev>=size){
                            res.add(true);
                            break;
                        }
                        if(index<obs[i])
                            break;
                        prev=obs[i];
                    }
                    if(res.size()==count)
                        res.add(false);
                }
                count++;
            }

        }
        return res;

    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {

        if(hand.length%groupSize!=0)
            return false;
        if(groupSize==1)
            return true;


        Arrays.sort(hand);
        int totalCount = hand.length/groupSize;
        while(totalCount-- > 0){
            int start=-1;
            int count=0;
            int prev=-1;
            for(int i=0;i<hand.length;i++){
                if(start==-1 && hand[i]!=-1) {
                    start = hand[i];
                    prev = start;
                }

//                System.out.println(prev + " " + hand[i]);

                if(start!=-1){
                    if(count==0 || prev+1==hand[i]){
                        count++;
                        prev=hand[i];
                        hand[i]=-1;
                    }
                    if(count==groupSize)
                        break;
                }
            }
//            System.out.println(count);
            if(count!=groupSize)
                return false;
        }

        return true;


    }

    public static int strongPasswordChecker(String password) {


        boolean isLowerPresent=false, isDigitPresent=false, isUpperPresent=false;
        int dupCount=0;
        int index=2;
        for(int i=0;i<password.length();i++){

            char ch=password.charAt(i);

            if(i>=index){
                if(ch == password.charAt(i-1) && ch==password.charAt(i-2)){
                    dupCount++;
                    index=i+3;
                }
            }
            if(ch-'a' <= 'z'-'a' && ch-'a'>=0){
                isLowerPresent=true;
            }
            else if(ch-'A' >=0 && ch-'A' <= 'Z'-'A'){
                isUpperPresent=true;
            }
            else if(ch-'0'>=0 && ch-'0' <= '9'-'0'){
                isDigitPresent=true;
            }
        }

        int steps=0;
        while(dupCount!=0 && (!isLowerPresent || !isDigitPresent || !isUpperPresent) ){

            if(!isLowerPresent) {
                steps++;
                dupCount--;
                isLowerPresent=true;
            }
            else if(!isUpperPresent) {
                steps++;
                dupCount--;
                isUpperPresent=true;
            }
            else if (!isDigitPresent) {
                dupCount--;
                steps++;
                isDigitPresent=true;
            }
        }

        System.out.println("DUP :: " + dupCount);

        System.out.println("STEPS :: " + steps);
        System.out.println("DUPCOUNY :: " + dupCount);

        if(password.length()<6){
            steps+=6-password.length();
            return steps;
        }

        if(password.length()>20){
            int val=password.length()-20;
            steps += val;
            dupCount -= val;
        }

        System.out.println("STEPSS :: " + steps);
        System.out.println("DUPS :: " + dupCount);


        System.out.println("STEPS 1000 :::: " + steps);


        System.out.println(isDigitPresent);
        System.out.println(isLowerPresent);
        System.out.println(isUpperPresent);

        System.out.println("DUP REMAINING " + dupCount);

        if(!isLowerPresent){
            steps+=1;
            dupCount--;
        }
        if(!isUpperPresent){
            steps+=1;
            dupCount--;

        }
        if(!isDigitPresent){
            steps+=1;
            dupCount--;
        }
        if(dupCount>0)
            steps+=dupCount;

        return steps;

    }

    public String replaceWords(List<String> dictionary, String sentence) {

        StringBuilder res = new StringBuilder();
        String[] temp = sentence.split(" ");

        for(int index=0;index<temp.length; index++){

            if(index>0)
                res.append(" ");

            String s = temp[index];
            String word=s ;
            boolean visited=false;
            for(String root:dictionary){
                int i=0;
                while(i<s.length() && i<root.length()){
                    if(s.charAt(i)!=root.charAt(i)){
                        break;
                    }
                    i++;
                }
                if(i==root.length()) {
                    if(!visited) {
                        word = root;
                        visited = true;
                    }
                    else if(root.length()<word.length())
                        word = root;
                }
            }
            res.append(word);
        }
        return String.valueOf(res);
     }
    public int heightChecker(int[] heights) {

        int[] expected = new int[heights.length];
        System.arraycopy(heights, 0, expected, 0, heights.length);

        Arrays.sort(expected);
        int count = 0;

        for(int i=0;i<heights.length;i++){
            if(expected[i]!=heights[i])
                count++;

        }
        return count;
    }


    public static int some(int[] nums, int cost1, int cost2){

        int maxi=Integer.MIN_VALUE;

        int mod =(int)Math.pow(10,9)+7;
        int cost=0;
        for(int i:nums){
            maxi = Math.max(maxi,i);
        }
        if(cost1<=cost2/2){
            for(int i:nums){
                if(i!=maxi){
                    cost+=((maxi-i)*cost1) % mod;
                }
            }
            return cost % mod;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==maxi)
                    break;
                if(nums[i]<maxi && nums[j]<maxi){
                    int val = Math.min(maxi-nums[i], maxi-nums[j]);
                    nums[i] += val;
                    nums[j] += val;
                    cost += (cost2*val)%mod;
                    System.out.println(cost);
                    System.out.println(Arrays.toString(nums));
                }

            }
        }
        System.out.println("COST :::: " + cost);
        System.out.println("MAXI :: " + maxi);
        for(int i:nums){
            if(i!=maxi){
                cost+=((maxi-i)*cost1)%mod;
            }
        }
        return cost%mod;
    }

    public void sortColors(int[] nums) {

        int zeroCount = 0;
        int onesCount = 0;

        for(int i: nums){
            if(i==0)
                zeroCount++;
            else if(i==1)
                onesCount++;

        }

        for(int i=0;i<nums.length;i++){
            if(zeroCount!=0) {
                nums[i] = 0;
                zeroCount--;
            }
            else if(onesCount!=0) {
                nums[i] = 1;
                onesCount--;
            }
            else
                nums[i]=2;

        }
    }

    public void sortColors(int[] nums, int k) {

        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(low<=mid && mid<=high){
           if(nums[mid]==0){
               nums[mid]=nums[low];
               nums[low]=0;
               low++;
               mid = low;
           }
           if(nums[mid]==2){
               nums[mid]=nums[high];
               nums[high]=2;
               high--;
           }
           if(nums[mid]==1)
               mid++;
        }
    }


    public int minMovesToSeat(int[] seats, int[] students) {

        Arrays.sort(seats);
        Arrays.sort(students);
        int moves = 0;
        for(int i=0; i<seats.length;i++){
            moves+= Math.abs(students[i]-seats[i]);
        }
        return moves;

    }

    public static int minIncrementForUnique(int[] nums) {

        nums=new int[]{1,2,2};

        Arrays.sort(nums);
        int count =0;
        for(int i=0;i<nums.length;i++){
            boolean isDupPresent=false;
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    isDupPresent=true;
                }
            }
            if (isDupPresent){
                int k=nums[i];
                for(int j:nums){
                    if(nums[i]+1 == j){

                    }
                }
            }
        }
        return 0;

    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int totalProfit = 0;
        for(int w : worker){
            int curProfit=0;
            for(int i=0;i<difficulty.length;i++){
                if(difficulty[i]<=w){
                    curProfit = Math.max(profit[i],curProfit);
                }

            }
            totalProfit+=curProfit;
        }

        return totalProfit;
    }

    public static int minDays(int[] bloomDay, int m, int k) {

        if(bloomDay.length < m*k)
            return -1;

        int days=0;
        int nextMin = Integer.MAX_VALUE;

        int mini = Integer.MAX_VALUE;
        for(int i : bloomDay){
            if(i>0){
                mini = Math.min(mini,i);
            }
        }
        while(true){
            days+=mini;
            int adjCount = 0;
            int bouquetCount = 0;
            for (int i = 0; i < bloomDay.length; i++) {
                bloomDay[i]-=mini;
                if(bloomDay[i]<=0){
                    adjCount++;
                    if(adjCount==k){
                        bouquetCount++;
                        adjCount=0;
                    }
                }
                else {
                    adjCount = 0;
                    nextMin=Math.min(nextMin,bloomDay[i]);
                }
            }

            if(bouquetCount>=m)
                return days;
            mini=nextMin;
        }
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = (position[position.length-1]-position[0])/(m-1);
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(canWePlace(position, mid, m))
            {
                low=mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return high;
    }

    private boolean canWePlace(int[] position, int mid, int m) {

        int last = position[0];
        int count=1;
        for(int i:position){
            if(i-last >= mid){
                count++;
                last=i;
            }
            if(count>=m)
                return true;
        }
        return false;
    }

    public boolean equalFrequency(String word) {

        int[] count = new int[26];

        int last = 0;
        for(int i=0;i<word.length();i++){
            count[word.charAt(i)-'a']++;
//            last = count[word.charAt(i)-'a'];
        }

        Map<Integer,Integer> map = new HashMap<>();
        for(int i: count){
            if(i!=0){
                map.put(i,1);
            }
        }
        if(map.size()>2){
            return false;
        }

        return true;


    }

    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {

        int total = 0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0)
                total+=customers[i];
        }

        int curValue = 0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                curValue+=customers[i];
            }
        }
        int maxi = curValue;

        int index=0;
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[index]==1){
                curValue-=customers[index];
            }
            if(grumpy[i]==1){
                curValue+=customers[i];
            }
            maxi = Math.max(curValue, maxi);
            index++;

        }
        return total+maxi;

    }
    public int minKBitFlips(int[] nums, int k) {

        int count=0;
        for(int i=0;i<nums.length-k+1;i++){
            if(nums[i]==1)
                continue;
            for(int j=i;j<i+k;j++){
                nums[j] = nums[j] ^ 1;
            }
            count++;
        }
        for(int i:nums){
            if(i==0)
                return -1;
        }
        return count;
    }
    public static int minKBitFlips(int[] nums, int k, int m) {

        int count=0;
        int zeroCount =0;

        for(int i=0;i<k;i++){
            if(nums[i]==0)
                zeroCount++;
        }
        System.out.println(zeroCount);

        for(int i=k;i<nums.length;i++){
            if(nums[i-k]==0) {
                zeroCount = k - zeroCount;
                count++;
            }
            System.out.println("fakldjflk :: " + zeroCount);
            if(nums[i]==0)
                zeroCount++;
            System.out.println("kl;fdja ::: " + zeroCount);
        }
        System.out.println(zeroCount);
        System.out.println(count);
        return count;
    }


    public static long maximumImportance(int n, int[][] roads) {

        int[] arr = new int[n];
        for(int[] i : roads){
            arr[i[0]]++;
            arr[i[1]]++;
        }
        int[] count = new int[n];
        for(int i: arr){
            count[i]++;
        }
        long sum =0 ;
        for(int i=n-1 ; i>0; i--){
            for(int j=count[i] ;j>0; j--){
                sum += (long) i * n--;
                System.out.println(sum);
            }

        }
        System.out.println(sum);
        return sum;
    }

        public static Node cloneGraph(Node node) {

            if(node==null)
                return null;
            Map<Integer, Node> map = new HashMap<>();
            Map<Integer, Integer> visited = new HashMap<>();

            Node root = new Node(node.val);
            map.put(root.val, root);

            Queue<Node> queue = new LinkedList<>();
            queue.add(node);

            while (!queue.isEmpty()){
                Node curNode = queue.remove();

                Node tempNode;
                if(map.containsKey(curNode.val))
                    tempNode = map.get(curNode.val);
                else
                    tempNode = new Node(curNode.val);

                System.out.println("curNode ::: " + curNode.val);
                List<Node> neighbours = new ArrayList<>();

                for(Node i : curNode.neighbors){
                    Node newNode;
                    if(!map.containsKey(i.val)) {
                        newNode = new Node(i.val);
                        map.put(i.val, newNode);
                    }
                    else {
                        System.out.println("HERE");
                        newNode = map.get(i.val);
                    }
                    System.out.println(newNode.val);
                    neighbours.add(newNode);
                    if(!visited.containsKey(i.val)) {
                        queue.add(i);
                        visited.put(i.val,1);
                    }
                }
                tempNode.neighbors = neighbours;
                map.put(tempNode.val, tempNode);
                visited.put(curNode.val,1);
            }
            return root;
        }


}
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        // Write your code here
        Queue<Integer> q = new LinkedList<>();

        int[] weight = new int[V];

        Arrays.fill(weight, Integer.MAX_VALUE);

        q.add(S);
        weight[S]=0;

        while (!q.isEmpty()){
            int node = q.poll();
            for(ArrayList<Integer> i : adj.get(node)){
                int ele = i.get(0);
                int w = i.get(1);
                if(weight[ele] > w + weight[node]){
                    q.add(ele);
                    weight[ele] = w + weight[node];
                }

            }
        }
        return weight;
    }



//    @Override
//    public String toString() {
//        return "Node{" +
//                "val=" + val +
//                ", neighbors=" + neighbors +
//                '}';
//    }
}


class Sol {
    public boolean isBipartite(int[][] graph) {

        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for(int i=0; i<n ; i++){
            if(color[i]==-1) {
//                if (!bfs(i, graph, color))
//                    return false;
                color[i]=0;
                System.out.println(Arrays.toString(color));
                if(!dfs(i, graph, color)){
                    return false;
                }
            }
        }
        return true;

    }

    public boolean bfs(int node, int[][] graph, int[] color){

        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 0;
        while (!q.isEmpty()){
            int ele = q.poll();
            for(int i : graph[ele]){
                if(color[i] == -1) {
                    q.add(i);
                    color[i] = color[ele] ^ 1;
                } else if ((color[ele] ^ 1) != color[i]) {
                    return false;
                }
            }
        }
        return true;

    }
    public boolean dfs(int node, int[][] graph, int[] color){

        for(int i: graph[node]){

            System.out.println(color[node] + " :: " + color[i]);
            if(color[i]==-1){
                color[i] = color[node]^1;
                if(!dfs(i, graph, color))
                    return false;
            } else if (color[i] == color[node]) {
                return false;
            }
        }
        return true;
    }

    public double averageWaitingTime(int[][] customers) {


        int start = 0;
        double wt = 0;
        for(int[] customer : customers){

            start = Math.max(start, customer[0]);//3ms
            start += customer[1];
            wt += start - customer[0];

        }
        return wt/customers.length;

    }
    public double averageWaitingTime2(int[][] customers) {
        double wait = 0;
        int t = -1;
        for(int[] a : customers) {
            t = (t<a[0])?a[0]:t;//2ms
            t += a[1];
            wait += t-a[0];
        }
        return wait/customers.length;
    }

    public int minOperations(String[] logs) {

        int count = 0;
        for(String log : logs){
            count = log.charAt(1) == '.' ? count > 0 ? count-1 : 0 : log.charAt(0)!='.' ? count+1 : count;
        }

        return count;
    }


    public ArrayList <Integer> bottomView(TreeNode root)
    {
        // Code here


        ArrayList <Integer> res = new ArrayList<>();

        if(root==null)
            return res;
        Queue<Pair> q = new LinkedList<>();

        Map<Integer,Integer> map = new TreeMap<>();

        q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair cur = q.poll();
            map.put(cur.level, cur.node.val);
            if(cur.node.left!=null){
                q.add(new Pair(cur.node.left, cur.level-1));
            }
            if(cur.node.right!=null){
                q.add(new Pair(cur.node.right, cur.level+1));
            }
        }

        res.addAll(map.values());
        return res;
    }

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;

        Queue<Pair> q = new LinkedList<>();

        Map<Integer,List<Integer>> map = new TreeMap<>();

        //[3,9,20,null,null,15,7]
        q.add(new Pair(root,0));
        while (!q.isEmpty()){

            int sz = q.size();
            Map<Integer,List<Integer>> innerMap  = new HashMap<>();
            for(int i=0;i<sz; i++){
                Pair cur = q.poll();
                innerMap.computeIfAbsent(cur.level, k-> new ArrayList<>()).add(cur.node.val);
                if(cur.node.left!=null){
                    q.add(new Pair(cur.node.left, cur.level-1));
                }
                if(cur.node.right!=null){
                    q.add(new Pair(cur.node.right, cur.level+1));
                }
            }
            for(int i : innerMap.keySet()){
                List<Integer> list = innerMap.get(i);
                Collections.sort(list);
                map.computeIfAbsent(i, k-> new ArrayList<>()).addAll(list);
            }
        }

        res.addAll(map.values());

        return res;
    }

    public int widthOfBinaryTree(TreeNode root) {

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        int maxi=0;
        while (!q.isEmpty()){

            int sz = q.size();
            int start = 0;
            int end =0;
            for(int i=0;i<sz; i++){
                Pair cur = q.poll();
                if(i==0)
                    start=cur.level;
                if(i==sz-1)
                    end = cur.level;

                if(cur.node.left!=null){
                    q.add(new Pair(cur.node.left, 2 * cur.level+1));
                }
                if(cur.node.right!=null){
                    q.add(new Pair(cur.node.right, 2 * cur.level+2));
                }
            }
            maxi = Math.max(maxi, end-start+1);

        }

        return maxi;

    }
    public TreeNode recoverFromPreorder(String traversal) {

        traversal = "10-7--8";
        int i=0;
        int n = traversal.length();
        TreeNode[] arr = new TreeNode[n];

        while(i<n && traversal.charAt(i)!='-'){
            i++;
        }
        TreeNode root= new TreeNode(Integer.parseInt(traversal.substring(0,i)));
        arr[0] = root;
        while(i < n){
            int depth =0;
            while(i<n && traversal.charAt(i)=='-'){
                i++;
                depth++;
            }
            int start = i;
            int end = i;
            while(i<n && traversal.charAt(i)!='-'){
                end = i;
                i++;
            }
            TreeNode curNode = new TreeNode(Integer.parseInt(traversal.substring(start,end+1)));
            arr[depth] = curNode;

//            System.out.println(depth);
            TreeNode prevNode = arr[depth-1];
            if(prevNode.left==null)
                prevNode.left = curNode;
            else
                prevNode.right = curNode;
        }
        return root;
    }

    public ArrayList<ArrayList<Integer>> paths(TreeNode root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        preorder(root, new ArrayList<>(), res);
        System.out.println(res);
        return res;

    }
    public static void preorder(TreeNode root, List<Integer> path, ArrayList<ArrayList<Integer>> res){
        if(root==null){
            res.add(new ArrayList<>(path));
            return;
        }
        path.add(root.val);
        preorder(root.left, path, res);
        preorder(root.right, path,res);
        path.remove(path.size()-1);
    }

    public int[] cycleLengthQueries(int n, int[][] queries) {

        n=3;
        queries = new int[][]{{5,3},{4,7},{2,3}};
        int[] res = new int[queries.length];
        int index=0;
        for(int[] query : queries){
            int u = query[0];
            int v = query[1];
            res[index++] = calculateLength(u,v,1);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
    public int calculateLength(int u, int v, int count){

        System.out.println(u + " :: " + v);
        if(u==v)
            return count;
        count++;
        if(u>v)
            u=u/2;
        else
            v=v/2;
        return calculateLength(u,v, count);
    }

    public int maximumGain(String s, int x, int y) {

        boolean[] visited = new boolean[s.length()];
        int points  =0;

        if(x>y){
            points += calculatePoints(s, x, y, true, visited);
            points += calculatePoints(s, x, y, false, visited);
        }
        else {
            points += calculatePoints(s, x, y, false, visited);
            points += calculatePoints(s, x, y, true, visited);
        }
        return points;

    }

    public int calculatePoints(String s, int x, int y, boolean isAb, boolean[] visited){
        int points = 0 ;
        for(int i=0;i<s.length()-1;i++){
            if(!visited[i] && !visited[i+1]){
                if(isAb && s.charAt(i)=='a' && s.charAt(i+1)=='b') {
                    visited[i] = true;
                    visited[i+1] = true;
                    points += x;
                }
                if(!isAb && s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                    visited[i] = true;
                    visited[i+1] = true;
                    points+=y;
                }
            }
        }
        return points;

    }


    public List<List<Integer>> levelorder(TreeNode root){

        List<List<Integer>> res = new ArrayList<>();
        if(root==null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){

            int n = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0; i<n ; i++){
                TreeNode node = q.poll();
                list.add(node.val);

                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            res.add(list);
        }

        return res;
    }


    public List<List<Integer>> spiral(TreeNode root){


        boolean rev = false;

        List<List<Integer>> finalRes = new ArrayList<>();
        if(root==null)
            return finalRes;
        Queue<TreeNode>  queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> res = new ArrayList<>();
            int n = queue.size();

            for(int i=0; i<n ; i++){
                TreeNode node = queue.remove();
                res.add(node.val);
                if(node.left!=null)
                    queue.add(root.left);
                if(node.right!=null)
                    queue.add(root.right);
            }
            if(rev){
                Collections.reverse(res);
            }
            finalRes.add(res);
            rev = !rev;
        }
        return finalRes;
    }

    public int maxPathSum(TreeNode root){
        int[] maxi = {root.val};
        traverse(root, maxi);
        return maxi[0];
    }
    public int traverse(TreeNode root, int[] maxi){

        if(root == null){
            return 0;
        }
        int left = Math.max(0,traverse(root.left, maxi));
        int right = Math.max(0, traverse(root.right, maxi));

        maxi[0] = Math.max(maxi[0], root.val + left +right);

        return Math.max(left,right) + root.val;
    }

    public boolean sym(TreeNode root){

        System.out.println(preorder(root.left, root.right));

        return preorder(root.left, root.right);
    }

    public boolean preorder(TreeNode p, TreeNode q){
        if(p==null)
            return q==null;
        if(q==null)
            return false;

        System.out.println(p.val + " :: " + q.val);
        if(p.val!=q.val)
            return false;
        if(!preorder(p.left, q.right))
            return false;
        return preorder(p.right, q.left);

    }

    public TreeNode helper(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode left = helper(root.left);
        TreeNode right = helper(root.right);

        if(left!=null){
            left.right = root.right;
            root.right = root.left;
            root.left=null;
            if(right==null)
                return left;
            return right;
        }
        if(right!=null)
            return right;
        return root;
    }
    void mirror(TreeNode node) {

        if(node==null)
            return;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirror(node.left);
        mirror(node.right);
    }

    public int isSumProperty(TreeNode root)
    {
        if(childSum(root) == -1)
            return 0;
        return 1;

    }

    int childSum(TreeNode root){
        if(root == null)
            return 1;
        if(childSum(root.left) == 0)
            return 0;
        if(childSum(root.right)==0)
            return 0;
        int sum = 0;
        if(root.left!=null)
            sum += root.left.val;
        if(root.right!=null)
            sum+=root.right.val;
        if(sum!=0 && sum!=root.val)
            return 0;
        return 1;
    }
    public TreeNode searchBST(TreeNode root, int val) {

        TreeNode temp = root;

        while (temp != null){
            if(temp.val == val)
                return temp;
            if(val < temp.val )
                temp =temp.left;
            else
                temp = temp.right;
        }
        return null;
    }

    public void flatten(TreeNode root){
        helper(root);
    }

    public TreeNode buildBST(int[] arr, int start, int end){
        if(start<=end){
            int mid = (start+end)/2;
            TreeNode node = new TreeNode(arr[mid]);
            node.left = buildBST(arr, start, mid-1);
            node.right = buildBST(arr,mid+1, end);
            return node;
        }
        return null;
    }
    public boolean checkBST(TreeNode root){
        return checkBST(root, root.val);
    }

    public boolean checkBST(TreeNode root, int parent){
        if(root == null)
            return true;

        if(root.left!=null) {
            if(parent <= root.left.val){
                return false;
            }
            if(!checkBST(root.left, Math.max(root.val, parent)))
                return false;
        }
        if(root.right!=null) {
            if(parent >= root.right.val)
                return false;
            return checkBST(root.right, Math.min(parent, root.val));
        }
        return true;

    }
    public int maxProduct(int[] nums) {

        nums = new int[]{0,10,10,10,10,10,10,10,10,-10,-10,-10,10,10,10,10,10,10,10,10,10,0};

        int maxProduct=nums[0];
        int product = 1;
        int product2 = 1;
        for (int num : nums) {
            product = product * num;
            if (product <= 0) {
                product = 1;
            }
            maxProduct = Math.max(product, maxProduct);
        }
        System.out.println(maxProduct);
        return maxProduct;
    }

//    public TreeNode buildTree(int[] preorder, int[] inorder) {
//
//        Map<Integer,Integer> map = new HashMap<>();
//        for(int i=0; i<inorder.length; i++){
//            map.put(inorder[i], i);
//        }
//        return buildTree(map, preorder, 0, preorder.length-1, inorder, 0,inorder.length-1);
//
//    }
//
//    public TreeNode buildTree(Map<Integer, Integer> map, int[] pre, int preStart, int preEnd, int[] in, int inStart, int inEnd){
//
//        if(preStart>preEnd || inStart>inEnd)
//            return null;
//        int index = map.get(pre[preStart]);
//
//        TreeNode root = new TreeNode(pre[preStart]);
//        int inLength = index-inStart ;
//
//        root.left = buildTree(map,pre, preStart+1, preStart + inLength, in, inStart , index-1);
//
//        root.right = buildTree(map,pre, preStart+inLength+1, preEnd, in, index+1, inEnd);
//        return root;
//
//
//
//    }
    public TreeNode buildTree(int[] postorder, int[] inorder) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }
        return buildTree(map, postorder, 0, postorder.length-1, inorder, 0,inorder.length-1);

    }

    public TreeNode buildTree(Map<Integer, Integer> map, int[] post, int postStart, int postEnd, int[] in, int inStart, int inEnd){

        if(postStart>postEnd || inStart>inEnd)
            return null;
        int index = map.get(post[postEnd]);

        TreeNode root = new TreeNode(post[postEnd]);
        int inLength = inEnd - index ;

        root.left = buildTree(map,post, postStart, postEnd - inLength - 1, in, inStart , index-1);

        root.right = buildTree(map,post, postEnd - inLength, postEnd-1, in, index+1, inEnd);
        return root;

    }
    public TreeNode connect(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){

            TreeNode prev = null;
            int sz = q.size();

            for(int i=0;i<sz; i++){
                TreeNode node = q.poll();
                if(prev!=null)
                    prev.next = node;

                if(node.left!=null) {
                    q.add(node.left);
                    q.add(node.right);
                }
                prev = node;
            }
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {


        Stack<TreeNode> stack = new Stack<>();

        TreeNode root = new TreeNode(preorder[0]);
        stack.push(root);
        int i=0;
        while(!stack.isEmpty()){
            TreeNode node = new TreeNode(preorder[i++]);
            if(stack.peek().val > node.val){
                stack.peek().left = node;
            }
            else{
                TreeNode temp=stack.peek();
                while(!stack.isEmpty() && stack.peek().val < node.val) {
                    temp = stack.peek();
                    stack.pop();
                }
                temp.right = node;

            }
            stack.push(node);
        }
        return root;
    }

    public TreeNode bstHelper(int[] preorder, int start, int end, TreeNode parent, TreeNode cur){

        TreeNode node = new TreeNode(preorder[start]);
        if(cur.val > node.val){
            cur.left = node;
            bstHelper(preorder, start+1, end, cur,node);
        }
        else {
            if(parent.val < node.val)
                return null;
            cur.right = node;
        }
        return node;
    }



    public int lengthOfLIS(int[] nums) {
        int[] dp =new int[nums.length];
        int res=1;
        for(int i = nums.length-1;i>=0;i--){
            int maxi = 1;
            for(int j = i ; j< nums.length ;j++){
                if(nums[i] < nums[j]){
                    maxi = Math.max(maxi,1 + dp[j]);
                }
            }
            dp[i]= maxi;
            res = Math.max(maxi,res);
        }

        return res;

    }
    public int msis(int[] nums) {
        int[] dp =new int[nums.length];
        int res=1;
        for(int i = nums.length-1;i>=0;i--){
            int maxi = nums[i];
            for(int j = i ; j< nums.length ;j++){
                if(nums[i] < nums[j]){
                    maxi = Math.max(maxi,nums[i] + dp[j]);
                }
            }
            dp[i]= maxi;
            res = Math.max(maxi,res);
        }

        return res;

    }

    public int mcm(int[] nums){
        int[][] dp = new int[nums.length][nums.length];
        return mcm(nums, 1, nums.length-1, dp);
    }
    public int mcm(int[] nums, int i, int j, int[][] dp){
        if(i==j)
            return 0;
        if (dp[i][j]!=0)
            return dp[i][j];

        int mini = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int multi = mcm(nums, i, k, dp) + mcm(nums,k+1,j, dp) + nums[i-1] * nums[k] * nums[j];
            mini = Math.min(mini, multi);
        }
        dp[i][j] = mini;
        return mini;
    }

    int[][] dp;
    public int lcs(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        int[] prev = new int[n+1];
        int[] current = new int[n+1];

        for(int i=1;i<=s1.length();i++){
            for(int j=1; j<=s2.length(); j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    current[j] = 1 + prev[j-1];
                }
                else {
                    current[j] = Math.max(prev[j],current[j-1]);
                }
            }
            prev = current;
        }
        return current[m];
//        return lcs(s1, s2, 0, 0);
    }

    public int lcs(String s1, String s2, int ind1, int ind2){
        if(ind1 == s1.length() || ind2==s2.length())
            return 0;
        if(dp[ind1][ind2]!=-1)
            return dp[ind1][ind2];
        if(s1.charAt(ind1)==s2.charAt(ind2)) {
            dp[ind1][ind2] = 1 + lcs(s1, s2, ind1 + 1, ind2 + 1);
        }
        else {
            int pick1 = lcs(s1, s2, ind1 + 1, ind2);
            int pick2 = lcs(s1, s2, ind1, ind2 + 1);
            dp[ind1][ind2] = Math.max(pick1, pick2);
        }
        return dp[ind1][ind2];
    }
//    public int lis(int[] nums, int index , int prev){
//
//        if(index==nums.length) {
//            return 0;
//        }
//        if(dp[prev+1][index]!=-1){
//            return dp[prev+1][index];
//        }
//        int pick =0;
//        if(prev==-1 || nums[index] > nums[prev]){
//            pick = 1+lis(nums,index+1,index);
//        }
//        int notPick = lis(nums,index+1,prev);
//
//        dp[prev+1][index] = Math.max(pick, notPick);
////        System.out.println(dp[prev+1][index]);
//        return Math.max(pick, notPick);
//    }
    public boolean canPick(int i, int j){
        return i > j;
    }

    class Pair{
        TreeNode node;
        int level;
        public Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }

    public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
        // Write your code here.
        ;
        int[][] dp = new int[n+1][w+1];
        return maxProfit(values, weights ,0, n, w, dp);
    }
    public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int ind, int n, int w, int[][] dp) {
        if(ind==n)
            return 0;
        if(dp[ind][w]!=-1)
            return dp[ind][w];
        int pick = 0;
        if(weights.get(ind) <= w ){
            pick = values.get(ind) + maxProfit(values, weights,ind+1,n,w - weights.get(ind), dp);
        }
        int notPick = maxProfit(values, weights,ind+1,n,w, dp);
        dp[ind][w] = Math.max(pick,notPick);
        return dp[ind][w];
    }






        public boolean isValidBST(TreeNode root) {
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
//        Long.MIN_VALUE
//        System.out.println(checkBST(root, Lon.MIN_VALUE, Integer.MAX_VALUE));
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean checkBST(TreeNode root, long lowerBound, long upperBound){
        if(root==null) {
            return true;
        }
        if(root.val <= lowerBound || root.val >= upperBound) {
            return false;
        }
        if(!checkBST(root.left, lowerBound, root.val)) {
            return false;
        }
        return checkBST(root.right, root.val, upperBound);

    }

    public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){

        if(root == null){
            return null;
        }
        if(root.val >= p.val && root.val<=q.val)
            return root;
        if(root.val > q.val){
            return findLCA(root.left, p, q);
        }
        return findLCA(root.right, p, q);
    }

    public static void findPreSuc(TreeNode root, TreeNode[] pre, TreeNode[] suc, int key) {
        // code here.
        // update pre[0] with the predecessor of the key
        // update suc[0] with the successor of the key

        //10 2 11 1 5 N N N N 3 6 N 4

    }

    public static void findPre(TreeNode root, TreeNode[] pre, int key){
        while (root!=null){
            if(key > root.val){
                pre[0] = root;
                root = root.right;
            }
            else {
                root = root.left;
            }
        }
    }
    public static void findSuccessor(TreeNode root, TreeNode[] pre, int key){
        while (root!=null){
            if(key < root.val){
                pre[0] = root;
                root = root.right;
            }
            else {
                root = root.left;
            }
        }
    }
    public static TreeNode findKey(TreeNode root, int key){
        while (root!=null){
            if(root.val == key )
                return root;
            if(root.val > key)
                root = root.left;
            else
                root = root.right;
        }
        return null;
    }

    public static void makeString(String s1, String s2){
        int[][] dp = new int[s1.length()][s2.length()];
        for(int[] i : dp){
            Arrays.fill(i, -1);
        }
        recur(s1,s2,s1.length()-1,s2.length()-1, dp);
    }
    public static int recur(String s1, String s2, int i, int j, int[][] dp){

        if(i==-1)
            return j+1;
        if (j==-1)
            return i+1;
        if(dp[i][j]!=-1)
            return dp[i][j];

        if(s1.charAt(i) == s2.charAt(j)){
            dp[i][j] = recur(s1,s2,i-1,j-1,dp);
        }
        else{
            dp[i][j] = Math.min(1+recur(s1,s2,i-1,j-1,dp), Math.min(1+recur(s1,s2,i-1,j,dp), 1+recur(s1,s2,i,j-1,dp)));
        }
        return dp[i][j];
    }



}

class MedianFinder {

    TreeNode root;
    PriorityQueue<Double> g;
    PriorityQueue<Double> s;
    public MedianFinder() {
        g = new PriorityQueue<>();
        s = new PriorityQueue<>();
    }
    public void addNum(int num) {
        s.add(-1.0 * num);
        g.add(-1.0 * s.poll());
        if (g.size() > s.size())
            s.add(-1.0 * g.poll());
    }

    public double findMedian() {
        if (g.size() != s.size())
            return  -1.0 * s.peek();
        else
            return (g.peek() - s.peek() ) / 2;
    }
    public void inorder(TreeNode root, int[] index, int[] num, int k){
        if(root == null) {
            return;
        }
        inorder(root.left, index, num, k);
        index[0]++;
        if(index[0]==k-1){
            num[1]=root.val;
        }
        if(index[0] == k ){
            num[0] = root.val;
            return;
        }
        inorder(root.right, index, num, k);
    }
    public static void streamMed(int A[], int N)
    {
        // Declaring two min heap
        PriorityQueue<Double> g = new PriorityQueue<>();
        PriorityQueue<Double> s = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {

            // Negation for treating it as max heap
            s.add(-1.0 * A[i]);
            g.add(-1.0 * s.poll());
            if (g.size() > s.size())
                s.add(-1.0 * g.poll());

            if (g.size() != s.size())
                System.out.println(-1.0 * s.peek());
            else
                System.out.println((g.peek() - s.peek())
                        / 2);
        }
    }
}