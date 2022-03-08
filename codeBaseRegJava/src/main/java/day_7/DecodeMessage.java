package day_7;

public class DecodeMessage {
    public static void main(String[] args) {
        String message="111";
        int numOfWays=decodeMessage(message);
        System.out.println(numOfWays);
    }
    //it works with recursion.
    private static int decodeMessage(String message) {
        if(message.charAt(0)=='0' && message.length()==1){
            return 0;
        }
        return decodeMsg(message,message.length());
    }

    private static int decodeMsg(String message,int n){
        if(n==0 || n==1){
            return 1;
        }
        if(message.charAt(0)=='0'){
            return 0;
        }
        int count=0;
        if(message.charAt(n-1)>'0'){
            count=decodeMsg(message,n-1);
        }
        if(message.charAt(n-2)=='1' || message.charAt(n-2)=='2' || message.charAt(n-1)<'7'){
            count+=decodeMsg(message,n-2);
        }
        return count;
    }
}
