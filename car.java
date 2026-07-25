public class car {
    private int fuel;
    private int speed;
    private String color;
    private String direction;
    
    public car(int fuel, int speed, String color, String direction) {
        this.fuel = fuel;
        this.speed = speed;
        this.color = color;
        this.direction = direction;
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
        while(this.speed>0){
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
        System.out.println("Fuel: " + fuel + "\nSpeed: " + speed + "\nColor: " + color + "\nDirection: " + direction);
    }
}
