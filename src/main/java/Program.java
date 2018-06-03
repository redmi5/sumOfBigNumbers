import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigDecimal a= in.nextBigDecimal();
        BigDecimal b= in.nextBigDecimal();
        System.out.println(NumbersSum.sum(a,b));
    }
}
