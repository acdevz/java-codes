package BigNumbers;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        /* BigDecimals */
        BigDecimal bdFromString = new BigDecimal("0.1");
        BigDecimal bdFromCharArray = new BigDecimal(new char[] {'3', '.', '1', '6', '1', '5'});
        BigDecimal bdFromInt = new BigDecimal(42);
        BigDecimal bdFromLong = new BigDecimal(123412345678901L);
        BigDecimal bdFromLong1 = BigDecimal.valueOf(123412345678901L);
        BigDecimal bdFromDouble = BigDecimal.valueOf(0.1d);

        BigDecimal bd = new BigDecimal("2.5");
        // Round to 1 digit using HALF_EVEN
        BigDecimal rounded = bd
                .round(new MathContext(1, RoundingMode.HALF_EVEN));

        /* BigIntegers */
        BigInteger i = new BigInteger("31");
        BigInteger j = new BigInteger("24");
        BigInteger k = new BigInteger("16");

        BigInteger gcd = j.gcd(k);
        BigInteger multiplyAndmod = j.multiply(k).mod(i);
        BigInteger modInverse = j.modInverse(i);
        BigInteger modPow = j.modPow(k, i);
    }
}
