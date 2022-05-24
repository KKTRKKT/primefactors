package primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {
    @Test public void
    canFactorIntoPrimes() {
        assertPrimeFactors(1, list());
        assertPrimeFactors(2, list(2));
        assertPrimeFactors(2, list(2));
        assertPrimeFactors(3, list(3));
        assertPrimeFactors(4, list(2, 2));
        assertPrimeFactors(5, list(5));
        assertPrimeFactors(6, list(2, 3));
        assertPrimeFactors(7, list(7));
        assertPrimeFactors(8, list(2, 2, 2));
        assertPrimeFactors(9, list(3, 3));
        assertPrimeFactors(2 * 2 * 3 * 3 * 3 * 7 * 7 * 11 * 11 * 13, list(2, 2, 3, 3, 3, 7, 7, 11, 11, 13));
    }

    private void assertPrimeFactors(int num, List<Integer> list) {
        assertEquals(list, of(num));
    }

    private List<Integer> list(Integer... nums) {
        return Arrays.asList(nums);
    }

    private List<Integer> of(int num) {
        List<Integer> factors = new ArrayList<Integer>();
        for(int divisor = 2; num > 1; divisor++ )
            for(;num % divisor == 0; num /= divisor)
                factors.add(divisor);
        return factors;
    }
}
