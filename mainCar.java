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

public class mainCar {

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



// STACK MEMORY                                    HEAP MEMORY

// +-----------------------------+                 +------------------------------------------+
// |      main() Frame           |                 | String[] Object (args)                   |
// |                             |                 | [ ]                                      |
// | args ------------+----------|---------------->|                                          |
// |                  |          |                 +------------------------------------------+
// |                  |          |
// | bmw -------------+----------|---------------->| Car Object #1 (bmw)                      |
// |                  |          |                 |------------------------------------------|
// | audi ------------+------+   |                 | fuel : 10                               |
// |                  |      |   |                 | speed : 30                              |
// | civic -----------|---+  |   |                 | color : "Black"                         |
// |                  |   |  |   |                 | direction : "Left"                      |
// | copyCar ---------+   |  |   |                 +------------------------------------------+
// +----------------------+--|---+
//                           |
//                           |-------------------->| Car Object #2 (audi)                     |
//                           |                     |------------------------------------------|
//                           |                     | fuel : 20                               |
//                           |                     | speed : 50                              |
//                           |                     | color : "White"                         |
//                           |                     | direction : "Right"                     |
//                           |                     +------------------------------------------+
//                           |
//                           |-------------------->| Car Object #3 (civic)                    |
//                           |                     |------------------------------------------|
//                           |                     | fuel : 0                                |
//                           |                     | speed : 0                               |
//                           |                     | color : "Unknown"                       |
//                           |                     | direction : "Straight"                  |
//                           |                     +------------------------------------------+
//                           |
//                           |-------------------->| Car Object #4 (copyCar)                  |
//                                                 |------------------------------------------|
//                                                 | fuel : 10                               |
//                                                 | speed : 30                              |
//                                                 | color : "Black"                         |
//                                                 | direction : "Left"                      |
//                                                 +------------------------------------------+
//
//
//                         Static Variable
//
//                   +----------------------------+
//                   | count = 4                  |
//                   +----------------------------+