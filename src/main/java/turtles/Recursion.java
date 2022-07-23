package turtles;

public class Recursion {
    public static Integer factorial (Integer x) {
        if (x==1) {
            return 1;
        }
        return x*factorial(x-1);
    }
}
