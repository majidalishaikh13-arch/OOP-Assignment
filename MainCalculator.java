public class MainCalculator {
    public static void main(String[]args){
        Calculator myCalculator = new Calculator(10, 5);
        Calculator yourCalculator = new Calculator(20, 0);

        myCalculator.showInfo();
        System.out.println("Addition: " + myCalculator.add());
        System.out.println("Subtraction: " + myCalculator.subtract());

        yourCalculator.showInfo();
        try{
            System.out.println("Division: " + yourCalculator.divide());
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Addition of multiple numbers: " + yourCalculator.addition(5,3,7,8,1,9));
        

    }
}