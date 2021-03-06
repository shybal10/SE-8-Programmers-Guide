import java.util.Arrays;
import java.util.Scanner;

/**
 * class shows the implementation of a stack
 * @author shybal
 * @version 1.0
 */
public class CharStack {
    /**
     * client method to display execution
     * @param args remains unused
     */
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
                case 6 : System.out.println(Arrays.toString(stack.array));
                    break;
                case 7 : return;
            }
        }
    }
    char[] array;      //represent the stack
    private int stackTop;      //represents the index of the top element of the stack
    private static int counter;  //keeps count of the number of stacks created;
    CharStack(int capacity){
        this.array = new char[capacity];
        this.stackTop = -1;
        counter++;
    }

    /**
     * adds an element to the stack
     * @param element is of the type char
     */
     void push(char element){ this.array[++this.stackTop] = element; }

    /**
     * removes the top element from the stack
     * @return element of the type char
     */
     char pop(){ return this.array[this.stackTop--]; }

    /**
     * displays the top element of the stack
     * @return element of the type char
     */
     char peek(){ return this.array[this.stackTop]; }

    /**
     * checks if the stack is empty
     * @return true if the stack is empty
     */
     boolean isEmpty(){ return this.stackTop == -1; }

    /**
     * checks if the stack is full
     * @return true if the stack is full
     */
    boolean isFull(){ return this.stackTop == this.array.length-1; }

}
