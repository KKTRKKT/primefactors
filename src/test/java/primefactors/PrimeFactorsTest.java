package primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    @Test public void
    canFactorsIntoPrime() {
        assertEqaulsFactors(1, list());
        assertEqaulsFactors(2, list(2));
        assertEqaulsFactors(3, list(3));
        assertEqaulsFactors(4, list(2, 2));
        assertEqaulsFactors(5, list(5));
        assertEqaulsFactors(6, list(2, 3));
        assertEqaulsFactors(7, list(7));
        assertEqaulsFactors(8, list(2, 2, 2));
        assertEqaulsFactors(9, list(3, 3));
        assertEqaulsFactors(10, list(2, 5));
    }

    private void assertEqaulsFactors(int i, List<Integer> list) {
        assertEquals(list, factors(i));
    }

    private List<Integer> list(Integer... nums) {
        return Arrays.asList(nums);
    }

    private List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        int divisor = 2;
        for (;n > 1;divisor++)
            for (;n % divisor == 0;n /= divisor)
                factors.add(divisor);
        return factors;
    }
}
