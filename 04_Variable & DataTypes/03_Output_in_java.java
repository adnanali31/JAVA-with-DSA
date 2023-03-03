// Output in Java refers to the result of executing a program, which can be displayed on the screen (console), written to a file, or sent to a network socket. 
// In Java, the standard way to output text to the console is by using the System.out.println() method, which prints the specified message followed by a newline character.

// For example, the following code outputs the text "Hello, World!" to the console:

System.out.println("Hello, World!");

// The output of this code will be:

Hello, World!

  
//  Note that you can also use the System.out.print() method to output text without adding a newline character at the end.
  
  
  
//   In Java, \n is an escape sequence that represents a newline character. 
//   It is used to insert a new line in a string, which moves the cursor to the beginning of the next line. 
//   The newline character is used to format the output of a program and make it easier to read.

//   Here is an example that demonstrates the use of the \n escape sequence:

  
  public class NewlineExample {
    public static void main(String[] args) {
        System.out.println("Hello\nWorld");
    }
}

// In this example, the string "Hello\nWorld" is printed to the console using the println() method. 
// The \n escape sequence inserts a newline character between "Hello" and "World", which causes "World" to be printed on the next line.

// The output of this program will be:
//  "    Hello   "
//  "    World   "


// Escape sequences are a powerful feature of Java and are used to represent special characters in a string, such as tabs, backslashes, and quotation marks. 
// They are typically written as a backslash (\) followed by a character that represents the special sequence.
