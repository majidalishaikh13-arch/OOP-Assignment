// public class Calculator{
//     private double num1;
//     private double num2;

//     public Calculator(double num1, double num2) {
//         this.num1 = num1;
//         this.num2 = num2;
//     }
//     public double add() {
//         return num1 + num2;
//     }
//     public double subtract() {
//         return num1 - num2;
//     }
//     public double multiply() {
//         return num1 * num2;
//     }
//     public double divide() {
//         if (num2 != 0) {
//             return num1 / num2;
//         } else {
//             throw new ArithmeticException("Cannot divide by zero");
//         }
//     }
//     public double modulus() {
//         if (num2 != 0) {
//             return num1 % num2;
//         } else {
//             throw new ArithmeticException("Cannot perform modulus by zero");
//         }
//     }
//     public double power() {
//             return Math.pow(num1, num2);
//     }
//     public double average() {
//         return (num1 + num2) /2;
//     }
//     public double max() {
//         if (num1 > num2){
//             return num1;
//         } else {
//             return num2;
//         }
//     }

//     public double addition(double...numbers){
//         double sum = 0;
//         for (double number : numbers) {
//             sum += number;
//         }
//         return sum;
//     }
        
//         public void showInfo() {
//             System.out.println("Number 1: " + num1);
//             System.out.println("Number 2: " + num2);
//     }
// }


public class Calculator {

    private double num1;
    private double num2;

    // Object Counter
    private static int count = 0;

    // Default Constructor
    public Calculator() {
        this.num1 = 0;
        this.num2 = 0;
        count++;
    }

    // Parameterized Constructor
    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        count++;
    }

    // Copy Constructor
    public Calculator(Calculator c) {
        this.num1 = c.num1;
        this.num2 = c.num2;
        count++;
    }

    // Getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // Setters
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    // Object Count
    public static int getObjectCount() {
        return count;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public double modulus() {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            throw new ArithmeticException("Cannot perform modulus by zero");
        }
    }

    public double power() {
        return Math.pow(num1, num2);
    }

    public double average() {
        return (num1 + num2) / 2;
    }

    public double max() {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }

    // Varargs
    public double addition(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public void showInfo() {
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    @Override
    public String toString() {
        return "Number 1: " + num1 +
               "\nNumber 2: " + num2;
    }
}
