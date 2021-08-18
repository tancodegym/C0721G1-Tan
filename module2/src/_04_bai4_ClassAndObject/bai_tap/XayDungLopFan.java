package _04_bai4_ClassAndObject.bai_tap;

import java.time.LocalTime;

public class XayDungLopFan {
    static class Fan {
        private final int SLOW = 1;
        private final int MEDIUM = 2;
        private final int FAST = 3;
        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "Blue";

        public int getSpeed() {
            return speed;
        }

        public boolean isOn() {
            return on;
        }

        public double getRadius() {
            return radius;
        }

        public String getColor() {
            return color;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public Fan (int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }
        public String toString () {
            String status = "";
            if (this.isOn()) {
                status += (" Fan is on," );
                status += (" Speed is: " + this.speed+" ,"  );
            } else {
                status += (" Fan is off," );
            }
            status += (" Radius is: " + this.radius +" ," );
            status += (" Color is: " + this.color +"." );
            return status;
        }
    }
    public static void main(String[] args) {
        Fan quatA = new Fan(3,true,10,"yellow");
        Fan quatB = new Fan(2,false,5,"blue");
        System.out.println("Infor of Fan A : " +quatA.toString());
        System.out.println("Infor of Fan B : " +quatB.toString());


    }


}
