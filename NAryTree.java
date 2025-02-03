import java.util.*;

public class NAryTree {
    private static class TreeNode{
        int val;
        List<TreeNode> children;
        TreeNode(int data){
            this.val = data;
            this.children = new ArrayList<>();
        }
    }
    TreeNode root;
    NAryTree(){
        this.root = null;
    }

    void constructTree(){
        this.root = new TreeNode(1);

        this.root.children.add(new TreeNode(2));
        this.root.children.get(0).children.add(new TreeNode(3));
        this.root.children.get(0).children.add(new TreeNode(4));
        this.root.children.get(0).children.add(new TreeNode(6));

        this.root.children.add(new TreeNode(5));
        this.root.children.get(1).children.add(new TreeNode(7));

        this.root.children.add(new TreeNode(8));
        this.root.children.get(2).children.add(new TreeNode(9));
        this.root.children.get(2).children.add(new TreeNode(11));
    }

    void preOrder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val+" ");

        for(int index = 0; index < root.children.size(); index++){
            preOrder(root.children.get(index));
        }
    }

    void postOrder(TreeNode root){
        if(root == null) return;

        for(int index = 0; index < root.children.size(); index++){
            postOrder(root.children.get(index));
        }
        System.out.print(root.val+" ");
    }

    void inOrder(TreeNode root){
        if(root == null) return;

        int length = root.children.size();

        // Left part - all element excluding last
        for(int index = 0; index < length - 1; index++){
            inOrder(root.children.get(index));
        }
        // print root
        System.out.print(root.val+" ");
        // Right most element
        if(length > 0) inOrder(root.children.get(length - 1));
    }

    public  void levelOrder (TreeNode root, List<List<Integer>> ans) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.addFirst(root);

        boolean isLeftToRight = true;

        while(!queue.isEmpty()){
            int size = queue.size(); // 4
            List<Integer> level = new ArrayList<>();
            for(int idk = 0; idk < size; idk++) {
                TreeNode node = isLeftToRight ? queue.pollFirst(): queue.pollLast();

                level.add(node.val); // [3, 4, 7, 8]

                for(TreeNode eachNode: node.children){
                    if(isLeftToRight){
                        queue.offerLast(eachNode);
                    } else {
                        queue.offerFirst(eachNode);
                    }
                }
            }
            isLeftToRight = !isLeftToRight;
            ans.add(level);
        }
    };

}
