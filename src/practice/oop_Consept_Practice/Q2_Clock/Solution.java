package practice.oop_Consept_Practice.Q2_Clock;

public class Solution {

    public static void main(String[] args) {

    }
    public static double angleClock(int hour, int minutes) {
        double ek = (double) minutes / 12;
        double hourAngle = ((hour % 12) * 30) + (ek * 6);
        double newMinute = (double) minutes / 5;
        double minuteAngle = newMinute * 30;
        double angle = Math.abs(hourAngle - minuteAngle);
        if (angle > 180) return (360 - angle);
        else return angle;
    }



}
