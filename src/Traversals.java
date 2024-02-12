import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}

public class Traversals {
    public static void main(String[] args) {

        Solution solution = new Solution();

        TreeNode root = insertNode(1);
        root.left = insertNode(2);
        root.right = insertNode(3);
        root.left.left = insertNode(4);
        root.left.right = insertNode(5);
        root.right.left = insertNode(6);
        root.right.right = insertNode(7);


        System.out.println(solution.inorderTraversal(root));

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
}