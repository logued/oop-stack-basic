package dkit.oop;

/**                                                 Feb 2023
 * A Stack is a LIFO Queue (Last-In First-Out)
 * It operates like a stack of plates add at top and remove from top.
 * In this sample we use a Stack that uses underlying ArrayDeque.
 * ("Deque" stands for Double-Ended Queue)
 * We use a reference of Interface type Deque ('deck').
 *
 * (Use of the Java Stack class is no longer recommended, so , although
 * it is easier to read the code, we will not use it).
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        App app = new App();
        app.start();
    }

    public void start() {
        stack1();
        stack2();
        stack3();
    }

    public void stack1()
    {
        Deque<String> myStack = new ArrayDeque<>();
        // A stack that uses an underlying Array to store elements
        // and uses a Deque interface for access.(pronounced "Deck")

        // PUSH (add) elements on to stack
        System.out.println("Pushing, A, B, C on to the stack:");
        myStack.push("A");    // top->      A]
        myStack.push("B");    // top->    B|A]
        myStack.push("C");    // top->  C|B|A]

        // PEEK - use myStack.peek() to get a reference to, but not remove, the top element
        String topElement = myStack.peek();
        System.out.println("stack.peek() = " + topElement ); // top->  C|B|A]

        // POP - stack.pop() - return a reference to the top element and remove it from stack
        String str = myStack.pop();  // remove from head (top).   stack is now : top->  B|A]
        System.out.println("value popped = " + str);

        // PUSH is used to add an element on to the head of the stack
        myStack.push("W");    // top->  W|B|A]

        System.out.println("Popping (removing) all elements:");
        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop());
        }
        System.out.println("Stack has been emptied.");

        // POPping an element from an empty stack will throw an exception
        // myStack.pop();   // this line causes exception.
    }

    public void stack2()
    {
        //TODO add code to this starter code as described in TODOs

        //TODO create a stack to store String objects

        Scanner in = new Scanner(System.in);

        String word = "";
        System.out.println("Stack sample stack2().");
        System.out.println("Please enter a list of words, \"q\" to exit");

        while (!word.equals("q")) {
            word = in.next();
            if (!word.equals("q")) {
                //TODO add word to stack
            }
        }

        System.out.println("Your words in reverse order are: ");
        //TODO Write code to retrieve words from the stack - one by one
        // and display them as they are removed.

    }

    public void stack3()
    {
        //TODO Write code that will take a decimal digit (e.g. 6)
        // and will output the binary sequence for that number.
        // A stack will be of use in this case!

        /* Tip: decimal 6 is binary 110
                6 % 2 = 0 <- (the last binary digit) - store it
                6 / 2 = 3   (integer division) - get the remainder
                3 % 2 = 1 <- (the second-last binary digit) - store it
                3 / 2 = 1   (integer division)
                1 % 2 = 1 <- (the next binary digit) - store it
                1 / 2 = 0   (if zero, we are finished)
        */
        System.out.println("Stack sample stack3().");
        int value = 6;

        // Try your program using the number 153.
        // Check that it gives the right binary number
    }

    //TODO  Implement the algorithm to balance brackets as described
    // in the textbook extract in section 15.6.1 (see PDF) in moodle.

}
