package dkit.oop;

/**
 * Stack using ArrayDeque      Feb 2022
 * (Deque stands for Double-Ended Queue)
 *
 * Stack implemented using the ArrayDeque class and
 * referenced using the Deque ('deck') interface.
 *
 * A Stack is a LIFO Queue (Last-In First-Out)
 * (operates like a stack of plates)
 *
 * (Use of Java Stack class is no longer recommended)
 */

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        App app = new App();
        app.start();

    }
    public void start() {
        stack1();
        stack2();  // Exercise Q10
        stack3();
    }

    public void stack1()
    {
        Deque<String> stack = new ArrayDeque<>();
        // Stack that uses an underlying Array to store elements
        // and uses a Deque ("Deck") interface for access.

        // PUSH elements on to stack
        System.out.println("Pushing, A, B, C on to the stack:");
        stack.push("A");    // top->      A]
        stack.push("B");    // top->    B|A]
        stack.push("C");    // top->  C|B|A]

        // PEEK - use stack.peek() to take a copy of, but not remove, the top element
        String topElement = stack.peek();
        System.out.println("stack.peek() = " + topElement ); // top->  C|B|A]

        // POP - stack.pop() - return the top element and remove it from stack
        String s = stack.pop();  // remove from head (top)   state: top->  B|A]
        System.out.println("value popped = " + s);

        stack.push("W");    // top->  W|B|A]

        System.out.println("Popping (removing) all elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Stack has been emptied.");
    }

    public void stack2()
    {
        // See Collections Exercise - Q10
        // Finish the code (based on stack1() above)

        Scanner in = new Scanner(System.in);

        String word = "";
        System.out.println("Stack sample stack2().");
        System.out.println("Please enter a list of words, -1 to exit");

        while (!word.equals("-1")) {
            word = in.next();
            if (!word.equals("-1")) {
                // add word to stack
            }
        }

        System.out.println("Your words in reverse order are: ");
        //TODO Write the code to complete Collections Exercises Q.10

        // pop all elements off the stack, and display
    }

    public void stack3()
    {
        // Collections Exercise Q11
        /* Tip: decimal 6 is binary 110

                6 % 2 = 0  (the last binary digit) - store it
                6 / 2 = 3  (integer division)
                3 % 2 = 1  (the second-last binary digit) - store it
                3 / 2 = 1  (integer division)
                1 % 2 = 1  (the next binary digit) - store it
                1 / 2 = 0  (if zero, we are finished)

        How do we get the binary digits in the right order????
         */

        System.out.println("Stack sample stack3().");

        //TODO Write the solution to Collections Exercise Q.11.

    }

    //TODO  Implement the algorithm to balance brackets as described
    // in the textbook extract in section 15.6.1 (see PDF)

}
