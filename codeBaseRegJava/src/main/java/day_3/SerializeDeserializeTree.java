package day_3;

import java.util.Stack;

public class SerializeDeserializeTree {
    public static void main(String[] args) {
        Node node=new Node("r", new Node("l", new Node("k")), new Node("r"));
        String result=serialize(node);
        Node resultNode=deserialize(result,0,result.length()-1);
        System.out.println(result);
        System.out.println(serialize(resultNode));
    }

    private static Node deserialize(String result, int start, int end) {
        if(start>end){
            return null;
        }
        Node node=new Node(String.valueOf(result.charAt(start)));
        int index=-1;
        if(start+1<=end && result.charAt(start+1)=='('){
            index=findIndex(result,start+1,end);
        }
        if(index!=-1){
            node.left=deserialize(result,start+2,index-1);
            node.right=deserialize(result,index+2,end-1);
        }
        return node;
    }

    private static int findIndex(String result, int start, int end) {
        if(start>end) {
            return -1;
        }
        Stack<Character> stack=new Stack<>();
        for(int i=start;i<=end;i++){
            if(result.charAt(i)=='('){
                stack.add(result.charAt(i));
            }else if(result.charAt(i)==')'){
                if(stack.peek()=='('){
                    stack.pop();
                    if(stack.isEmpty()){
                        return i;
                    }
                }
            }
        }
        return -1;
    }


    private static String serialize(Node root) {
        if(root==null){
            return "";
        }
        String ans=root.val;
        if(root.left!=null && root.right!=null){
            ans+="("+serialize(root.left)+")("+serialize(root.right)+")";
        }
        if(root.left!=null){
            ans+="("+serialize(root.left)+")";
        }
        if(root.right!=null){
            ans+="()("+serialize(root.right)+")";
        }
        return ans;
    }
}
class Node{
    String val;
    Node left;
    Node right;
    Node(String val,Node left,Node right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
    Node(String val,Node left){
        this.val=val;
        this.left=left;
    }
    Node(String val){
        this.val=val;
    }
}

