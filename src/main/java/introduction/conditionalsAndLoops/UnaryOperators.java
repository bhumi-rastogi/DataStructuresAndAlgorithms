package introduction.conditionalsAndLoops;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;

        // Increment

        // Post

        if (a++ == 10){            // First operation then increment
        System.out.println("The value of a is: " + a);
        }
        else {
            System.out.println("else part the value of a is: " + a);
        }


        //Pre
        if (++a == 10){                 //First increment then operation
            System.out.println("The value of a is: " + a);
        }
        else {
            System.out.println("else part the value of a is: " + a);
        }





        // Decrement

        //post
        if (a-- == 10){            // First operation then decrement
        System.out.println("The value of a is: " + a);
        }
        else {
            System.out.println("else part the value of a is: " + a);
        }


        //pre
        if (--a == 10){                 //First decrement then operation
            System.out.println("The value of a is: " + a);
        }
        else {
            System.out.println("else part the value of a is: " + a);
        }

    }
}
