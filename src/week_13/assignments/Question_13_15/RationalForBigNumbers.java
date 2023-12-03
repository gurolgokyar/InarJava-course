package week_13.assignments.Question_13_15;

import java.math.BigInteger;

public class RationalForBigNumbers extends Number implements Comparable<RationalForBigNumbers> {
    BigInteger[] r = new BigInteger[2];

    public RationalForBigNumbers(BigInteger numerator, BigInteger denominator){
        BigInteger gcd = getGcd(numerator.abs(), denominator.abs());
        r[0] =
                (denominator.compareTo(BigInteger.ZERO) < 0 ? new BigInteger("-1") : BigInteger.ONE).multiply(numerator).divide(gcd);
        r[1] = denominator.abs().divide(gcd);
    }

    public BigInteger getGcd(BigInteger numerator, BigInteger denominator){
       BigInteger gcd = BigInteger.ONE;

        for (BigInteger i = BigInteger.TWO; i.compareTo( denominator.min(numerator)) <= 0; i =
                i.add(BigInteger.ONE)) {
            if (numerator.remainder(i).compareTo(BigInteger.ZERO) == 0 && denominator.remainder(i).compareTo(BigInteger.ZERO) == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public BigInteger getNumerator(){
        return r[0];
    }

    public BigInteger getDenominator(){
        return r[1];
    }

    public RationalForBigNumbers add(RationalForBigNumbers rational){
        BigInteger numerator =
                getNumerator().multiply(rational.getDenominator()).add(getDenominator().multiply(rational.getNumerator()));
        BigInteger deNominator =
                getDenominator().multiply(rational.getDenominator());
        return new RationalForBigNumbers(numerator,deNominator);
    }

    public RationalForBigNumbers subtract(RationalForBigNumbers rational){
        BigInteger numerator =
                getNumerator().multiply(rational.getDenominator()).subtract(getDenominator().multiply(rational.getNumerator()));
        BigInteger deNominator =
                getDenominator().multiply(rational.getDenominator());
        return new RationalForBigNumbers(numerator,deNominator);
    }

    public RationalForBigNumbers multiply(RationalForBigNumbers rational){
        BigInteger numerator =
                getNumerator().multiply(rational.getNumerator());
        BigInteger deNominator =
                getDenominator().multiply(rational.getDenominator());
        return new RationalForBigNumbers(numerator,deNominator);
    }

    public RationalForBigNumbers divide(RationalForBigNumbers rational){
        BigInteger numerator = getNumerator().multiply(rational.getDenominator());
        BigInteger denominator = getDenominator().multiply(rational.getNumerator());
        return new RationalForBigNumbers(numerator, denominator);
    }

    public String toString(){
        if (getDenominator().compareTo(BigInteger.ONE) == 0){
            return getNumerator() + "";
        }else {
            return getNumerator() + "/" + getDenominator();
        }
    }

    public boolean equals(RationalForBigNumbers rational){
        return this.subtract(rational).compareTo(new RationalForBigNumbers(new BigInteger("0"), new BigInteger("1"))) == 0;
    }

    public double doubleValue(){
        return getNumerator().divide(getDenominator()).doubleValue();
    }

    public int intValue(){
        return (int)(doubleValue());
    }

    public float floatValue(){
        return (float) doubleValue();
    }

    public long longValue(){
        return (long) doubleValue();
    }

    public int compareTo(RationalForBigNumbers rational){
        if (this.subtract(rational).doubleValue() > 0){
            return 1;
        } else if (this.subtract(rational).doubleValue() == 0) {
            return 0;
        }else{
            return -1;
        }
    }
}
