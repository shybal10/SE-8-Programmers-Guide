import java.util.Arrays;
import java.util.Scanner;

/**
 * class shows the implementation of a stack
 * @author shybal
 * @version 1.0
 */
public class CharStack {
    public static void main(String[] args) {
        System.out.println("enter the stack capacity");
        Scanner input = new Scanner(System.in);
        int capacity = input.nextInt();
        CharStack stack = new CharStack(capacity);
        while (true) {
            System.out.println("your options are:");
            System.out.println("1.push\t2.pop\t3.peek\t4.isFull\t5.isEmpty\t6.Display\t7.Exit");
            int choice = input.nextInt();
            switch (choice) {
                case 1 : System.out.println("enter the element to be added");
                    char element = input.next().charAt(0);
                    stack.push(element);
                    break;
                case 2 : System.out.println(stack.pop());
                    System.out.println("element removed");
                    break;
                case 3 : System.out.println(stack.peek());
                    break;
                case 4 : if (stack.isFull())
                {
                    System.out.println("stack is full");
                } else {
                    System.out.println("stack is not full");
                }
                    break;
                case 5 : if (stack.isEmpty())
                {
                    System.out.println("stack is full");
                } else {
                    System.out.println("not full");
                }
                    break;
                case 6 : System.out.println(Arrays.toString(array));
                    break;
                case 7 : return;
            }
        }
    }
    private static char[] array;
    private static int stackTop;
    private CharStack(int capacity){
        array = new char[capacity];
        stackTop = -1;
    }

    /**
     * adds an element to the stack
     * @param element is of the type char
     */
    private  void push(char element){ array[++stackTop] = element; }

    /**
     * removes the top element from the stack
     * @return element of the type char
     */
    private  char pop(){ return array[stackTop--]; }

    /**
     * displays the top element of the stack
     * @return element of the type char
     */
    private  char peek(){ return array[stackTop]; }

    /**
     * checks if the stack is empty
     * @return true if the stack is empty
     */
    private  boolean isEmpty(){ return stackTop == -1; }

    /**
     * checks if the stack is full
     * @return true if the stack is full
     */
    private  boolean isFull(){ return stackTop == array.length-1; }

}
