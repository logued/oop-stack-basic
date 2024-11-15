package dkit.oop;

/**                                                 Nov 2024
 * A Stack is a LIFO Queue (Last-In First-Out)
 * It operates like a stack of plates - add at top and remove from top.
 * In this sample we use a Stack that uses underlying ArrayDeque (as this is what
 * the Java documentation recommends)
 * ("Deque" stands for Double-Ended Queue)
 * We use a reference of Interface type Deque ('deck').
 *
 * (Use of the Java Stack class is no longer recommended, so, although
 * it appears to be the obvious choice, we will not use it).
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
        // Three different stack samples:
        stack1();
        //stack2();
        //stack3();
    }

    public void stack1()
    {
        Deque<String> stack = new ArrayDeque<>();
        // A stack that uses an underlying Array to store elements
        // and uses a Deque interface for access. (pronounced "Deck")

        // PUSH (add) elements on to stack - always at the top
        System.out.println("Pushing, A, B, C on to the stack:");
        stack.push("A");    // top->      A]
        stack.push("B");    // top->    B|A]
        stack.push("C");    // top->  C|B|A]

        // PEEK - use stack.peek() to get a reference to, but not remove, the top element
        String topElement = stack.peek();
        System.out.println("stack.peek() = " + topElement ); // top->  C|B|A]

        // POP - stack.pop() - return a reference to the top element and remove it from stack
        //                     note that the object itself is not deleted,
        //                     only the reference to it is removed from the stack
        String str = stack.pop();  // remove from head (top).   stack is now : top->  B|A]
        System.out.println("value popped = " + str);

        // PUSH is used to add an element on to the head/top of the stack
        System.out.println("Pushing W on stack.");
        stack.push("W");    // top->  W|B|A]

        System.out.println("Popping (removing) all elements: - repeatedly pop() until stack is empty ");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Stack has been emptied.");

        // POPping an element from an empty stack will throw an exception
         // stack.pop();   // this line causes exception.
    }

    public void stack2()
    {
        // Here we will create a stack to hold String values.
        // We will add a number of words to the stack by 'pushing'
        // them on to the stack.
        // Finally, we 'pop' each word off, and print it, thus printing
        // the sequence of words in reverse.
        // Add the code required below.

        //TODO add code to this starter code as described below.
        // 1. declare a stack to store objects of type String

        Scanner in = new Scanner(System.in);

        String word = "";
        System.out.println("Stack sample stack2().");
        System.out.println("Please enter a list of words, \"q\" to exit");

        while (!word.equals("q")) {
            word = in.next();
            if (!word.equals("q")) {
                //TODO 2. add the inputted word to the stack  (push())
            }
        }

        System.out.println("Your words in reverse order are: ");
        //TODO 3. Write code to retrieve words from the stack - one by one -
        // and display them as they are removed.  (see loop is sample function above)
        // Keep going until the stack is empty.

    }

    public void stack3()
    {
        //TODO Write code that will take a decimal digit (e.g. 6)
        // and will output the binary sequence for that number.
        // A stack will be of use in this case!

        /* Tip: decimal 6 is binary 110
                6 % 2 = 0 <- (the last binary digit) - store it  (% = Modulus operator)
                6 / 2 = 3   (integer division) - get the new value
                3 % 2 = 1 <- (the second-last binary digit) - store it
                3 / 2 = 1   (integer division, remainder is discarded)
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
