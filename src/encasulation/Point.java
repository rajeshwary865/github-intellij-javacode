package encasulation;

public class Point {
    public static void main(String[] args) {
    }
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
        public void move(int dx, int dy){
            this.x = this.x + dx;
            this.y = this.y + dy;
        }
        public double distanceTo(Point other) {
            int diffX = this.x - this.x;
            int diffY = this.y -this.y;
            return (int) Math.sqrt(diffX * diffX + diffY * diffY);
        }

    }
