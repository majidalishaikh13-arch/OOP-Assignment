// class car{
//     String brand;
//     private int fuelAverage;
//     private int batteryLevel;
//     private boolean engineStart;
//     private int gear;
//     private boolean headlightsOn;

// public car(){
//     this.fuelAverage = 13;
//     this.batteryLevel = 100;
//     this.engineStart = false;
//     this.gear = 0;
//     this.headlightsOn = false;
// }
// public void fuelAverage(int fuelAverage){
//     this.fuelAverage = fuelAverage;
// }
// public void startEngine(){
//     if(this.engineStart == false){
//         this.engineStart = true;
//         System.out.println("Engine started");
//     }else{
//         System.out.println("Engine is already running");
//     }
// }
// public void batteryLevel(int batteryLevel){
//     this.batteryLevel = batteryLevel;
// }
// public void gear(int gear){
//     this.gear = gear;
// }
// public void headlightsOn(boolean headlightsOn){
//     this.headlightsOn = headlightsOn;
// }
// }



public class car {

    private int fuel;
    private int speed;
    private String color;
    private String direction;

    // Object Counter
    private static int count = 0;

    // Default Constructor
    public car() {
        this.fuel = 0;
        this.speed = 0;
        this.color = "Unknown";
        this.direction = "Straight";
        count++;
    }

    // Parameterized Constructor
    public car(int fuel, int speed, String color, String direction) {
        this.fuel = fuel;
        this.speed = speed;
        this.color = color;
        this.direction = direction;
        count++;
    }

    // Copy Constructor
    public car(car c) {
        this.fuel = c.fuel;
        this.speed = c.speed;
        this.color = c.color;
        this.direction = c.direction;
        count++;
    }

    // Getter Methods
    public int getFuel() {
        return fuel;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public String getDirection() {
        return direction;
    }

    // Setter Methods
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    // Object Count
    public static int getObjectCount() {
        return count;
    }

    public void fuel() {
        this.fuel = 100;
    }

    public void accelerate() {
        this.speed += 10;
    }

    public void brake() {
        if (this.speed >= 10) {
            this.speed -= 10;
        } else {
            this.speed = 0;
        }
    }

    public void stopCar() {
        while (this.speed > 0) {
            this.speed -= 10;
        }
    }

    public void turnLeft() {
        this.direction = "left";
    }

    public void turnRight() {
        this.direction = "right";
    }

    public void turbo() {
        this.speed += 100;
    }

    public void displayinfo() {
        System.out.println("Fuel: " + fuel);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Direction: " + direction);
    }

    @Override
    public String toString() {
        return "Fuel: " + fuel +
                "\nSpeed: " + speed +
                "\nColor: " + color +
                "\nDirection: " + direction;
    }
}
