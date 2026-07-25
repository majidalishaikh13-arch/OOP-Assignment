public class main{
    public static void main(String[]args){
        car bmw = new car(10, 30, "black", "left");
        car audi = new car(20, 50, "white", "right");
        System.out.println("--------------------------------------");
        System.out.println("BMW Car Info:");
        System.out.println("--------------------------------------");
        bmw.accelerate();
        bmw.brake();
        bmw.turnRight();
        bmw.displayinfo();
        bmw.turbo();
        bmw.displayinfo();
        System.out.println("--------------------------------------");
        System.out.println("Audi Car Info:");
        System.out.println("--------------------------------------");
        audi.accelerate();
        audi.brake();
        audi.turnRight();
        audi.displayinfo();
    }
}


