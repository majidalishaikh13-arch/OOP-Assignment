// public class MainCalculator {
//     public static void main(String[]args){
//         Calculator myCalculator = new Calculator(10, 5);
//         Calculator yourCalculator = new Calculator(20, 0);

//         myCalculator.showInfo();
//         System.out.println("Addition: " + myCalculator.add());
//         System.out.println("Subtraction: " + myCalculator.subtract());

//         yourCalculator.showInfo();
//         try{
//             System.out.println("Division: " + yourCalculator.divide());
//         } catch (ArithmeticException e) {
//             System.out.println("Error: " + e.getMessage());
//         }

//         System.out.println("Addition of multiple numbers: " + yourCalculator.addition(5,3,7,8,1,9));
        

//     }
// }




public class MainCalculator {

    public static void main(String[] args) {

        // Parameterized Constructor
        Calculator myCalculator = new Calculator(10, 5);
        Calculator yourCalculator = new Calculator(20, 0);

        // Default Constructor
        Calculator defaultCalculator = new Calculator();

        // Copy Constructor
        Calculator copyCalculator = new Calculator(myCalculator);

        System.out.println("===== My Calculator =====");
        myCalculator.showInfo();
        System.out.println("Addition: " + myCalculator.add());
        System.out.println("Subtraction: " + myCalculator.subtract());
        System.out.println("Multiplication: " + myCalculator.multiply());
        System.out.println("Division: " + myCalculator.divide());
        System.out.println("Power: " + myCalculator.power());
        System.out.println("Average: " + myCalculator.average());
        System.out.println("Maximum: " + myCalculator.max());

        System.out.println();

        System.out.println("===== Edge Case =====");
        yourCalculator.showInfo();

        try {
            System.out.println("Division: " + yourCalculator.divide());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("Modulus: " + yourCalculator.modulus());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        System.out.println("Varargs Addition: "
                + yourCalculator.addition(5, 3, 7, 8, 1, 9));

        System.out.println();

        System.out.println("===== Default Constructor =====");
        defaultCalculator.showInfo();

        System.out.println();

        System.out.println("===== Copy Constructor =====");
        copyCalculator.showInfo();

        System.out.println();

        System.out.println("===== Getter =====");
        System.out.println("Num1 = " + myCalculator.getNum1());

        System.out.println();

        System.out.println("===== Setter =====");
        myCalculator.setNum1(100);
        myCalculator.setNum2(50);
        myCalculator.showInfo();

        System.out.println();

        System.out.println("===== toString() =====");
        System.out.println(myCalculator);

        System.out.println();

        System.out.println("Total Objects Created: "
                + Calculator.getObjectCount());
    }
}




// STACK MEMORY                                    HEAP MEMORY

// +-----------------------------+                 +------------------------------------------+
// |      main() Frame           |                 | String[] Object (args)                   |
// |                             |                 | [ ]                                      |
// | args ------------+----------|---------------->|                                          |
// |                  |          |                 +------------------------------------------+
// |                  |          |
// | myCalculator ----+----------|---------------->| Calculator Object #1 (myCalculator)      |
// |                  |          |                 |------------------------------------------|
// | yourCalculator --+------+   |                 | num1 : 10                               |
// |                  |      |   |                 | num2 : 5                                |
// | defaultCalculator|---+  |   |                 +------------------------------------------+
// |                  |   |  |   |
// | copyCalculator --+   |  |   |                 +------------------------------------------+
// +----------------------+--|---+---------------->| Calculator Object #2 (yourCalculator)    |
//                           |                     |------------------------------------------|
//                           |                     | num1 : 20                               |
//                           |                     | num2 : 0                                |
//                           |                     +------------------------------------------+
//                           |
//                           |-------------------->| Calculator Object #3 (defaultCalculator) |
//                           |                     |------------------------------------------|
//                           |                     | num1 : 0                                |
//                           |                     | num2 : 0                                |
//                           |                     +------------------------------------------+
//                           |
//                           |-------------------->| Calculator Object #4 (copyCalculator)    |
//                                                 |------------------------------------------|
//                                                 | num1 : 10                               |
//                                                 | num2 : 5                                |
//                                                 +------------------------------------------+
//
//
//                          Static Variable
//
//                   +----------------------------+
//                   | count = 4                  |
//                   +----------------------------+
