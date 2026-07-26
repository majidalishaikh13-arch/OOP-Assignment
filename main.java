// public class main{
//     public static void main(String[]args){
//         car bmw = new car(10, 30, "black", "left");
//         car audi = new car(20, 50, "white", "right");
//         System.out.println("--------------------------------------");
//         System.out.println("BMW Car Info:");
//         System.out.println("--------------------------------------");
//         bmw.accelerate();
//         bmw.brake();
//         bmw.turnRight();
//         bmw.displayinfo();
//         bmw.turbo();
//         bmw.displayinfo();
//         System.out.println("--------------------------------------");
//         System.out.println("Audi Car Info:");
//         System.out.println("--------------------------------------");
//         audi.accelerate();
//         audi.brake();
//         audi.turnRight();
//         audi.displayinfo();
//     }
// }

public class main {

    public static void main(String[] args) {

        // Parameterized Constructor
        car bmw = new car(10, 30, "Black", "Left");
        car audi = new car(20, 50, "White", "Right");

        // Default Constructor
        car civic = new car();

        // Copy Constructor
        car copyCar = new car(bmw);

        System.out.println("--------------------------------------");
        System.out.println("BMW Car Info");
        System.out.println("--------------------------------------");

        bmw.accelerate();
        bmw.brake();
        bmw.turnRight();
        bmw.displayinfo();

        System.out.println();

        bmw.turbo();

        System.out.println("After Turbo");
        bmw.displayinfo();

        System.out.println("\n--------------------------------------");
        System.out.println("Audi Car Info");
        System.out.println("--------------------------------------");

        audi.accelerate();
        audi.brake();
        audi.turnRight();
        audi.displayinfo();

        System.out.println("\n--------------------------------------");
        System.out.println("Default Constructor Object");
        System.out.println("--------------------------------------");

        civic.displayinfo();

        System.out.println("\n--------------------------------------");
        System.out.println("Copy Constructor Object");
        System.out.println("--------------------------------------");

        copyCar.displayinfo();

        System.out.println("\n--------------------------------------");
        System.out.println("Using Getter");
        System.out.println("--------------------------------------");

        System.out.println("BMW Speed = " + bmw.getSpeed());

        System.out.println("\n--------------------------------------");
        System.out.println("Using Setter");
        System.out.println("--------------------------------------");

        bmw.setSpeed(80);
        bmw.displayinfo();

        System.out.println("\n--------------------------------------");
        System.out.println("Using toString()");
        System.out.println("--------------------------------------");

        System.out.println(bmw);

        System.out.println("\n--------------------------------------");
        System.out.println("Total Objects Created = " + car.getObjectCount());
    }
}

