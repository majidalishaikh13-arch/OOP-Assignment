public class Point{
    private int x;
    private int y;
    static int count = 0;
    
    public Point(){
        this.x = 2;
        this.y = 4;
        count++;
    }

    public Point (int x, int y){
        this.x = x;
        this.y = y;
        count++;
    }

    public Point (Point p){
        this.x = p.x;
        this.y = p.y;
        count++;
    }

    public int getX(){
        count++;
        return this.x;
    }

    public int getY(){
        count++;
        return this.y;
    }

    public void setX(int x){
        this.x = x;
        count++;
    }

    public void setY(int y){
        this.y = y;
        count++;
    }

    public float distanceFromOrigin(){
        count++;
       return(float) Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public float distance(Point p) {
    float dx = this.x - p.x;
    float dy = this.y - p.y;

    return (float) Math.sqrt(dx * dx + dy * dy);
    }

    public void move(int dx, int dy){
        this.x += dx;
        this.y += dy;
        count++;
    }

    public void add(Point P){
        this.x += P.x;
        this.y += P.y;
        count++;
    }

    public Point subtraction (Point P){
        this.x -= P.x;
        this.y -= P.y;
        count++;
        return this;
    }

    public boolean isOrigin(){
        count++;
        return (this.x == 0 && this.y == 0);
    }

    public boolean isEqual(Point p){
        count++;
        return (this.x == p.x && this.y == p.y);
    }

    public String quadrant() {
    if (this.x > 0 && this.y > 0) {
        count++;
        return "First Quadrant";
    }
    else if (this.x < 0 && this.y > 0) {
        count++;
        return "Second Quadrant";
    }
    else if (this.x < 0 && this.y < 0) {
        count++;
        return "Third Quadrant";
    }
    else if (this.x > 0 && this.y < 0) {
        count++;
        return "Fourth Quadrant";
    }
    else {
        count++;
        return "Point lies on X-axis, Y-axis, or Origin";
    }
    }

    int countPoints(){
        return count;
    }

    void display(){
        System.out.println("X: " + this.x + "\nY: " + this.y);
    }

    public String toString(){
        return "X: " + this.x + "\nY: " + this.y;
    }
}



/*
        STACK                              HEAP
   ┌───────────────┐              ┌──────────────────┐
   │    main()     │              │   Point Object   │
   │               │              │      #1          │
   │ p1 ───────────┼─────────────→│ x = 2            │
   │               │              │ y = 4            │
   │ p2 ───────────┼─────────────→│                  │
   │               │              └──────────────────┘
   └───────────────┘
                                  ┌──────────────────┐
                                  │   Point Object   │
                                  │      #2          │
                                  │ x = 5            │
                                  │ y = 6            │
                                  └──────────────────┘


             p2.add(p1) CALL
             ──────────────

   ┌───────────────┐              ┌──────────────────┐
   │    add()      │              │   Point Object   │
   │               │              │      #1          │
   │ this ─────────┼─────────────→│ x = 2            │
   │               │              │ y = 4            │
   │ p ────────────┼─────────────→│                  │
   └───────────────┘              └──────────────────┘
                                         ↑
                                         │
                                         │ p2 object
                                         │
                                  ┌──────────────────┐
                                  │   Point Object   │
                                  │      #2          │
                                  │ x = 5 + 2 = 7    │
                                  │ y = 6 + 4 = 10   │
                                  └──────────────────┘


             FINAL STATE
             ───────────

   ┌───────────────┐              ┌──────────────────┐
   │    main()     │              │   Point Object   │
   │               │              │      #1          │
   │ p1 ───────────┼─────────────→│ x = 2            │
   │               │              │ y = 4            │
   │ p2 ───────────┼─────────────→│                  │
   └───────────────┘              └──────────────────┘

                                  ┌──────────────────┐
                                  │   Point Object   │
                                  │      #2          │
                                  │ x = 7            │
                                  │ y = 10           │
                                  └──────────────────┘
*/
