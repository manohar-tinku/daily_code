package day_1;

import java.util.Arrays;

public class TwoNumberSum {
    public static void main(String[] args) {
        int[] input={10,15,3,6};
        int k=17;
        if(checkSumOfTwoNumbersEquals(input,k)){
            System.out.println("Thank god.. it's there");
        }else{
            System.out.println("Oh no.. bad luck");
        }
    }

    private static boolean checkSumOfTwoNumbersEquals(int[] input, int k) {
        Arrays.sort(input);
        int start=0;
        int end=input.length-1;
        while(start<end){
            int sum=input[start]+input[end];
            if(sum==k){
                return true;
            }
            else if(sum>k){
                end-=1;
            }else{
                start+=1;
            }
        }
        return false;
    }
}
