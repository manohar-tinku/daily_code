package day_8;

public class UnivalTree {
    public static void main(String[] args) {
        Node node=new Node(1,new Node(1,new Node(1,new Node(1),new Node(1)),new Node(0)),new Node(0));
        Node node1=new Node(0,new Node(0),new Node(0,new Node(0),new Node(0,null,new Node(1))));
        System.out.println(countUnivalSubTree(node1));
    }

    private static int countUnivalSubTree(Node root) {
        if(root==null){
            return 0;
        }
        int left=countUnivalSubTree(root.left);
        int right=countUnivalSubTree(root.right);
        if(isUnival(root)){
            return 1+left+right;
        }else{
            return left+right;
        }
    }

    private static boolean isUnival(Node root) {
        return univalHelper(root,root.val);
    }

    private static boolean univalHelper(Node root, int val) {
        if(root==null){
            return true;
        }
        if(root.val==val){
            return univalHelper(root.left,val) && univalHelper(root.right,val);
        }
        return false;
    }
}
class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
    Node(int val,Node left,Node right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
    Node(int val,Node left){
        this.val=val;
        this.left=left;
    }
}
