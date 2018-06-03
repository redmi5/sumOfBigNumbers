import javafx.util.converter.BigIntegerStringConverter;
import sun.nio.cs.ext.Big5;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.junit.Assert.*;

public class NumbersSumTest {

    @org.junit.Test
    public void sum() {


       BigDecimal actual=NumbersSum.sum(new BigDecimal("1234567889012345678890123456788901234567889012345678890123456788901234567"),new BigDecimal("8890123456788901234567889012345678890"));
       System.out.println("Test result: "+ actual);
       BigDecimal expected=new BigDecimal("1234567889012345678890123456788901243458012469134580124691345801246913457");
        assertEquals(expected,actual);

    }
}