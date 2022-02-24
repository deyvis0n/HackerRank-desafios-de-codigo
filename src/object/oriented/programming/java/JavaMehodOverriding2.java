package object.oriented.programming.java;

public class JavaMehodOverriding2 {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle();
        motorCycle.MotorCycle();
    }

    static class Bicycle {
        String define_me() {
            return "a vehicle with pedals.";
        }
    }

    static class MotorCycle extends Bicycle {
        String define_me() {
            return "a cycle with an engine.";
        }

        void MotorCycle() {
            System.out.println("Hello I am a motorcycle, I am " + define_me());

            String temp = super.define_me();

            System.out.println("My ancestor is a cycle who is " + temp);
        }
    }
}
