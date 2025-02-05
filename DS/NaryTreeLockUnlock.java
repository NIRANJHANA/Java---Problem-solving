package DS;
// import java.util.ArrayList;
// import java.util.List;
import java.util.*;

class NaryTreeLockUnlock{
    static class Node{
        int data;
        List<Node> children;
        boolean isLock;
        boolean isLockable;
        Node parent;

        Node(int val){
            this.data = val;
            this.children = new ArrayList<>();
            this.isLock = false;
            this.isLockable = true;
        }

        Node(int val, Node parent){
            this.data = val;
            this.children = new ArrayList<>();
            this.isLock = false;
            this.isLockable = true;
            this.parent = parent;
        }
    }

    Node root;
    
}