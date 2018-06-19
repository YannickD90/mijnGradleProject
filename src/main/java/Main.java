public class Main {
    public static void main(String[] args) {
        Fraction myFraction = new Fraction(5,10);
        Fraction myFraction2 = new Fraction(18,9);
        Fraction output = new Fraction(0,0);

        output = myFraction.plus(myFraction2);
        String toString = output.toString();

        System.out.println(toString);

    }
}
