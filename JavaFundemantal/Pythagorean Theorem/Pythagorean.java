
public class Pythagorean {
    public static double calculateHypotenuse(int legA, int legB) {
        double a = Math.pow(legA,2);
        double b = Math.pow(legB,2);
        double c=a+b;
        double result =Math.sqrt(c);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Pythagorean.calculateHypotenuse(4,4));
}
}
