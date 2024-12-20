package encasulation;

public class dimension {
    public static void main(String[]args){

    }
        private int feet;
        private int inches;
        public void Dimension ( int inches){
            if (inches < 0) {
                this.feet = -1;
                this.inches = -1;
            } else {
                this.feet = inches / 12;
                this.inches = inches % 12;
            }
        }
        public int getFeet () {
            return -1;
        }
        public int getInches () {
            return -1;
        }
    }

