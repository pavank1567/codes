import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

public class Traversals {
    public static void main(String[] args) {

        Solution solution = new Solution();

//        TreeNode root = insertNode(1);
//        root.right = insertNode(2);
//        root.left = insertNode(0);
//        root.right.right = insertNode(3);
////        root.left.left = insertNode(0);
////        root.left.right = insertNode(2);
////        root.right.left = insertNode(5);
////        root.right.right = insertNode(7);
////        root.left.right.right = insertNode(3);
//        root.right.right.right = insertNode(4);


//        solution.bstToGst(root);

        Object[] arr = {1,null,15,14,17,7,null,null,null,2,12,null,3,9,null,null,null,null,11};

        TreeNode root = solution.construct(arr);

        System.out.println(root);

        solution.balanceBST(root);

//        System.out.println(solution.inorderTraversal(root));

    }

    private static TreeNode insertNode(int ele) {
        return new TreeNode(ele);
    }
}
class Solution {
    public Map<String, List<Integer>> inorderTraversal(TreeNode root) {

        Map<String, List<Integer>> finalRes = new HashMap<>();
        List<Integer> inorderRes = new ArrayList<>();
        inorder(root,inorderRes);
        finalRes.put("inorderRes", inorderRes);

        List<Integer> preOrderRes = new ArrayList<>();
        preorder(root,preOrderRes);
        finalRes.put("preOrderRes", preOrderRes);

        List<Integer> postorderRes = new ArrayList<>();
        postorder(root,postorderRes);
        finalRes.put("postorderRes", postorderRes);
        return finalRes;
    }

    private void postorder(TreeNode root, List<Integer> res) {
        if(root==null)
            return;
        postorder(root.left,res);
        postorder(root.right,res);
        res.add(root.val);
    }

    private void preorder(TreeNode root, List<Integer> res) {
        if(root==null)
            return;
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }

    private void inorder(TreeNode root, List<Integer> res) {

        if(root==null)
            return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);

    }

    public TreeNode bstToGst(TreeNode root) {

        traverse(root);
        calculateGST(root, 0);
        return null;

    }

    private void calculateGST(TreeNode root, int val) {
        if(root!=null){
            root.val += val;
            if(root.left!=null)
                root.val -= root.left.val;
            calculateGST(root.left, root.val);
            calculateGST(root.right, val);

        }
    }

    public int traverse(TreeNode root){
        if(root!=null){
            int left = traverse(root.left);
            int right = traverse(root.right);
            root.val=root.val+left+right;
            return root.val;
        }
        return 0;
    }

    public TreeNode balanceBST(TreeNode root) {

        Map<TreeNode, Pair> map = new HashMap<>();

        Map<TreeNode, Integer> map2 = new HashMap<>();
        calculateDepth2(root,map2);


        calculateDepth(root,map, map2);

//        System.out.println(map2);
//        System.out.println(map2);
//        root = makeBst(root,map2);

//        System.out.println(root);
        System.out.println(map);
//        root = trav(root,map);
        System.out.println(root);
        return root;
    }

    private TreeNode trav(TreeNode root, Map<TreeNode, Pair> map){
        if(root==null)
            return null;
        System.out.println(root);
        System.out.println(root.left);
        System.out.println(root.right);
        System.out.println(map.get(root));
        if(Math.abs(map.get(root).leftDepth-map.get(root).rightDepth) > 1){
            if(map.get(root).leftDepth < map.get(root).rightDepth){
                TreeNode temp = root.right;

                TreeNode tempRoot = root.right;

                int leftDepth = map.get(root).leftDepth;
                map.get(root).setRightDepth(0);
                root.right = null;
                while(temp.left!=null) {
                    int cur = map.get(temp).leftDepth;
                    map.get(temp).setRightDepth(1+cur+leftDepth);
                    temp = temp.left;
                }
                int cur = map.get(temp).leftDepth;
                map.get(temp).setRightDepth(1+cur+leftDepth);
                temp.left = root;
                root=tempRoot;
                leftDepth += map.get(root).leftDepth;
                map.get(root).setLeftDepth(leftDepth);

            }
            else {
                TreeNode temp = root.left;
                TreeNode tempRoot = root.left;
                int rightDepth = map.get(root).rightDepth;
                map.get(root).setLeftDepth(0);
                root.left = null;
                while(temp.right!=null) {
                    int cur = map.get(temp).rightDepth;
                    map.get(temp).setRightDepth(1+cur+rightDepth);
                    temp = temp.right;
                }
                int cur = map.get(temp).rightDepth;
                map.get(temp).setRightDepth(1+cur+rightDepth);
                temp.right = root;
                root=tempRoot;
                rightDepth += map.get(root).rightDepth;
                map.get(root).setRightDepth(rightDepth);

            }
            root = trav(root,map);
            root.left = trav(root.left,map);
            root.right = trav(root.right, map);
            return root;
        }
        return root;
    }
    private void calculateDepth(TreeNode root, Map<TreeNode,Pair> map , Map<TreeNode, Integer> map2) {

        if(root==null)
            return;
        int l = 0;
        int r = 0;
        if(root.left!=null)
            l = map2.get(root.left);
        if(root.right!=null)
            r= map2.get(root.right);
        int leftDepth = 1 + l;
        int rightDepth = 1 + r;
        map.put(root, new Pair(leftDepth, rightDepth));
        calculateDepth(root.left, map, map2);
        calculateDepth(root.right, map, map2);
    }

    public TreeNode construct(Object[] arr) {

        Queue<TreeNode> queue = new LinkedList<>();

        TreeNode root = new TreeNode((Integer) arr[0]);
        queue.add(root);

        int i=1;
        while ( i < arr.length ){
            TreeNode cur = queue.remove();
            if(arr[i] == null){
                cur.left=null;
            } else {
                cur.left= new TreeNode((Integer) arr[i]);
                queue.add(cur.left);
            }
            i++;
            if(i<arr.length) {
                if (arr[i] == null) {
                    cur.right = null;
                } else {
                    cur.right = new TreeNode((Integer) arr[i]);
                    queue.add(cur.right);
                }
            }
            i++;
        }
        return root;
    }

    class Pair{
        int leftDepth;
        int rightDepth;

        public Pair(int leftDepth, int rightDepth) {
            this.leftDepth = leftDepth;
            this.rightDepth = rightDepth;
        }

        public void setLeftDepth(int leftDepth) {
            this.leftDepth = leftDepth;
        }

        public void setRightDepth(int rightDepth) {
            this.rightDepth = rightDepth;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "leftDepth=" + leftDepth +
                    ", rightDepth=" + rightDepth +
                    '}';
        }
    }
    private int calculateDepth2(TreeNode root, Map<TreeNode,Integer> map) {

        if(root==null)
            return 0;
        int leftDepth = 1 + calculateDepth2(root.left, map);
        int rightDepth = 1 + calculateDepth2(root.right, map);
        map.put(root, Math.max(leftDepth,rightDepth));
        return Math.max(leftDepth, rightDepth);
    }

    private TreeNode makeBst(TreeNode root, Map<TreeNode, Integer> map) {
        if(root==null)
            return null;

        System.out.println(root.val);

        int leftD = 1;
        int rightD = 1;

        if(root.left!=null)
            leftD += map.get(root.left);
        if(root.right!=null)
            rightD += map.get(root.right);
//        System.out.println(leftD+ " " + rightD);
//        System.out.println(leftD + " " + rightD);
        if(Math.abs(leftD-rightD) > 1){
            if(leftD < rightD){
                TreeNode temp = root.right;

                TreeNode tempRoot = root.right;

                int leftDepth = map.get(root);

                int val=0;
                if(root.left!=null)
                    val = 1 + map.get(root.left);

                System.out.println("root " + root.val + " " + val);
                map.put(root,val);
                root.right = null;
                while(temp.left!=null)
                    temp = temp.left;
                temp.left = root;
                root=tempRoot;
                leftDepth += map.get(root);
                map.put(root,leftDepth);

            }
            else {
                TreeNode temp = root.left;
                TreeNode tempRoot = root.left;
                int rightDepth = map.get(root);
                int val=0;
                if(root.right!=null)
                    val = 1 + map.get(root.right);
                System.out.println("root " + root.val + " " + val);
                map.put(root,val);
                root.left = null;
                while(temp.right!=null) {
                    int cur = map.get(temp.right);
                    map.put(temp,Math.max(1+cur+val, map.get(temp)));
                    temp = temp.right;
                }
                temp.right = root;
                root=tempRoot;
                rightDepth += map.get(root);
                map.put(root,rightDepth);

            }
//            System.out.println(root);
            root = makeBst(root,map);
            root.left = makeBst(root.left,map);
            root.right = makeBst(root.right, map);
            return root;
        }
//        System.out.println(root);
        return root;
    }




}