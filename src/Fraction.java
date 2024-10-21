public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        if(denominator < 0){
            throw new IllegalArgumentException("incorrect value denominator's");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public final String toString() {
        return numerator + "/" + denominator;
    }


    public final Fraction sum(Fraction f2) {
        int newNum;
        int newDen;
        if(denominator == f2.denominator){
             newNum = numerator + f2.numerator;
             newDen = denominator;
        } else {
             newNum = (numerator * f2.denominator) + (f2.numerator * denominator);
             newDen = denominator * f2.denominator;
        }
        return create(newNum,newDen);
    }

    public final Fraction sum(int x) {
        Fraction fraction = new Fraction(x,1);
        return sum(fraction);
    }

    public final Fraction minus(Fraction f2) {
        int newNum;
        int newDen;
        if(denominator == f2.denominator){
            newNum = numerator - f2.numerator;
            newDen = denominator;
        } else {
            newNum = (numerator * f2.denominator) - (f2.numerator * denominator);
            newDen = denominator * f2.denominator;
        }
        return create(newNum,newDen);
    }

    public final Fraction minus(int x) {
        Fraction fraction = new Fraction(x,1);
        return minus(fraction);
    }
    public final Fraction toMultiply(Fraction f2) {
        int newNum = numerator * f2.numerator;
        int newDen = denominator * f2.denominator;
        return create(newNum,newDen);
    }
    public final Fraction toMultiply(int x) {
        Fraction fraction = new Fraction(x,1);
        return toMultiply(fraction);
    }
    public final Fraction toDivide(Fraction f2) {
        int newNum = numerator * f2.denominator;
        int newDen = denominator * f2.numerator;
        return create(newNum,newDen);
    }

    public final Fraction toDivide(int x) {
        Fraction fraction = new Fraction(x,1);
        return toDivide(fraction);
    }
    private Fraction create(int newNum, int newDen){
        Fraction newFraction = new Fraction(newNum, newDen);
        return newFraction;
    }

}
