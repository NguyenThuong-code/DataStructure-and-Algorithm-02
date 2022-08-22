package reverseelement;

import java.util.Arrays;

public class ReverseElement {
    private static void reverseElements(){
        ImplementStack<Integer> stack=new ImplementStack<Integer>();
        stack.push(3);
        stack.push(4);
        stack.push(5);
       while (!stack.isEmpty()){
           System.out.println(stack.pop());
       }
    }

    public static void main(String[] args) {
        System.out.println("Array after reverse Element");
        reverseElements();
    }
}
