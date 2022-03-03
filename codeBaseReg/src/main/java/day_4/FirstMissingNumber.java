package day_4;

import java.util.Arrays;

public class FirstMissingNumber {
    public static void main(String[] args) {
        int[] input={1,2,0};
        System.out.println(findFirstMissingPositiveNumber(input));
    }

    private static int findFirstMissingPositiveNumber(int[] input) {
        Arrays.sort(input);
        int x;
        for(int i=1;i<input.length;i++){
            if(input[i-1]>0 && input[i-1]!=input[i]){
                x=input[i]-input[i-1];
                if(x!=1){
                    return input[i]-1;
                }
            }
        }
        return input[input.length-1]+1;
    }
}
