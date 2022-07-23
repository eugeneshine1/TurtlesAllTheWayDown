package turtles;

public class GCD {
    public static Integer gcd (Integer a, Integer b){
        if(b==0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
