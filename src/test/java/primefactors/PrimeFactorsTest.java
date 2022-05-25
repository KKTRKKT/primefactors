package primefactors;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    @Test
    public void
    canFactorsIntoPrime() {
        assertEqualsFactors(1, list());
        assertEqualsFactors(2, list(2));
        assertEqualsFactors(3, list(3));
        assertEqualsFactors(4, list(2, 2));
        assertEqualsFactors(5, list(5));
        assertEqualsFactors(6, list(2, 3));
        assertEqualsFactors(7, list(7));
        assertEqualsFactors(8, list(2, 2, 2));
        assertEqualsFactors(9, list(3, 3));
        assertEqualsFactors(2*2*2*3*5*7*11*11, list(2, 2, 2, 3, 5, 7, 11, 11));
    }

    private void assertEqualsFactors(int num, List<Integer> list) {
        assertEquals(list, of(num));
    }

    private List<Integer> list(Integer... nums) {
        return Arrays.asList(nums);
    }

    private List<Integer> of(int num) {
        List<Integer> factors = new ArrayList<Integer>();
        for(int divisor = 2;divisor < num;divisor++) {
            for(;num % divisor == 0;num /= divisor){
                factors.add(divisor);
            }
        }
        if(num > 1)
            factors.add(num);
        return factors;
    }
}
