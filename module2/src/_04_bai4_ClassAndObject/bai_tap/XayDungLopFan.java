package _04_bai4_ClassAndObject.bai_tap;

import java.time.LocalTime;
import java.util.Scanner;


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
                status += (" Speed is: " + getSpeed()+" ,"  );
            } else {
                status += (" Fan is off," );
            }
            status += (" Radius is: " + getRadius() +" ," );
            status += (" Color is: " + getColor() +"." );
            return status;
        }
    }


class RunFan {
    public static void main(String[] args) {
        Fan quatA = new Fan(3, true, 10, "yellow");
        Fan quatB = new Fan(2, false, 5, "blue");
        System.out.println("Infor of Fan A : " + quatA.toString());
        System.out.println("Infor of Fan B : " + quatB.toString());
        Scanner input = new Scanner(System.in);
        System.out.println("Enter speed of fan: ");
        int speedOfFan = Integer.parseInt(input.nextLine());
        System.out.println("Choose status of Fan:");
        boolean status = Boolean.parseBoolean(input.nextLine());
        System.out.println("Enter radius of Fan:");
        double radius = Double.parseDouble(input.nextLine());
        System.out.println("Enter color of Fan:");
        String color = input.nextLine();
        Fan newFan = new Fan(speedOfFan, status, radius, color);
        System.out.println("Infor of new Fan : " + newFan.toString());

    }
}