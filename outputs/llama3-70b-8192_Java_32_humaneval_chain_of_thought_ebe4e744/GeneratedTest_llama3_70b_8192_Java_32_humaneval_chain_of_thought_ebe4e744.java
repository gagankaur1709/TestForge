
    import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
    
    import static org.junit.jupiter.api.Assertions.*;
    import static org.junit.jupiter.api.Assertions.assertFalse;
    import static org.junit.jupiter.api.Assertions.assertTrue;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertThrows;
    import static org.junit.jupiter.api.Assertions.assertNotNull;
    import static org.junit.jupiter.api.Assertions.assertNull;
    import static org.junit.jupiter.api.Assertions.assertArrayEquals;
    import org.mockito.Mockito;
    import org.mockito.junit.jupiter.MockitoExtension;
    import org.junit.jupiter.api.extension.ExtendWith;
    import org.junit.jupiter.api.Test;
    import org.junit.jupiter.api.BeforeEach;
    import org.junit.jupiter.api.AfterEach;
    import org.junit.jupiter.api.BeforeAll;
    
    
    import java.util.*;
import java.lang.*;

class Solution {
    /**
    Evaluates polynomial with coefficients xs at point x.
    return xs[0] + xs[1] * x + xs[1] * x^2 + .... xs[n] * x^n
     */
    public double poly(List<Double> xs, double x) {
        double result = 0;
        for (int i = 0; i < xs.size(); i++) {
            result += xs.get(i) * Math.pow(x, i);
        }
        return result;
    }
    
    /**
    xs are coefficients of a polynomial.
    findZero find x such that poly(x) = 0.
    findZero returns only only zero point, even if there are many.
    Moreover, findZero only takes list xs having even number of coefficients
    and largest non zero coefficient as it guarantees
    a solution.
    >>> findZero(Arrays.asList(1, 2)) // f(x) = 1 + 2x
    -0.5
    >>> findZero(Arrays.asList(-6, 11, -6, 1)) // (x - 1) * (x - 2) * (x - 3) = -6 + 11x - 6x^2 + x^3
    1.0
     */
    public double findZero(List<Double> xs) {

            double begin = -1, end = 1;
        while (poly(xs, begin) * poly(xs, end) > 0) {
            begin *= 2;
            end *= 2;
        }
        while (end - begin > 1e-10) {
            double center = (begin + end) / 2;
            if (poly(xs, begin) * poly(xs, center) > 0) {
                begin = center;
            } else {
                end = center;
            }
        }
        return begin;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_32_humaneval_chain_of_thought_ebe4e744 {
    private Solution solution = new Solution();

    @Test
    void testPoly() {
        List<Double> xs = Arrays.asList(1.0, 2.0);
        assertEquals(3.0, solution.poly(xs, 1.0), 1e-10);
    }

    @Test
    void testFindZero_HappyPath() {
        List<Double> xs = Arrays.asList(1.0, 2.0);
        assertEquals(-0.5, solution.findZero(xs), 1e-10);
    }

    @Test
    void testFindZero_EdgeCase_EvenCoefficients() {
        List<Double> xs = Arrays.asList(-6.0, 11.0, -6.0, 1.0);
        assertEquals(1.0, solution.findZero(xs), 1e-10);
    }

    @Test
    void testFindZero_EdgeCase_SingleCoefficient() {
        List<Double> xs = Arrays.asList(2.0);
        assertEquals(0.0, solution.findZero(xs), 1e-10);
    }

    @Test
    void testFindZero_EdgeCase_ZeroCoefficients() {
        List<Double> xs = Arrays.asList(0.0, 0.0);
        assertEquals(0.0, solution.findZero(xs), 1e-10);
    }
}
    