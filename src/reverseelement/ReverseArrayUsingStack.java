package reverseelement;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        Stack<Integer> stack= new Stack<>();
        int[] arr= {1,2,3,4,5};
        for (int i=0; i< arr.length; i++){
            stack.push(arr[i]);
        }
        int[] arrReverse= new int[arr.length];
        for (int i=0; i< arrReverse.length; i++){
            arrReverse[i]= stack.pop();

        }
        System.out.println(Arrays.toString(arrReverse));
    }
}
