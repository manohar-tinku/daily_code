package day_2;

import java.util.Arrays;

public class ProductArray {
    public static void main(String[] args) {
        int[] input={1,2,3,4,5};
        arrayProduct(input,input.length);

    }

    private static void arrayProduct(int[] input,int n) {
        if(n==1){
            System.out.println(0);
            return;
        }
        int[] output=new int[n];
        int temp=1;
        Arrays.fill(output,1);
        for(int i=0;i<n;i++){
            output[i]=temp;
            temp*=input[i];
        }
        temp=1;
        for(int j=n-1;j>=0;j--){
            output[j]*=temp;
            temp*=input[j];
        }
        for(int i=0;i<n;i++){
            System.out.print(output[i]+" ");
        }
    }
}
