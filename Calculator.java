public class Calculator{
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
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
        return (num1 + num2) /2;
    }
    public double max() {
        if (num1 > num2){
            return num1;
        } else {
            return num2;
        }
    }

    public double addition(double...numbers){
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
}