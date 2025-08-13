
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
    You are given two intervals,
    where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
    The given intervals are closed which means that the interval (start, end)
    includes both start and end.
    For each given interval, it is assumed that its start is less or equal its end.
    Your task is to determine whether the length of intersection of these two
    intervals is a prime number.
    Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
    which its length is 1, which not a prime number.
    If the length of the intersection is a prime number, return "YES",
    otherwise, return "NO".
    If the two intervals don't intersect, return "NO".


    [input/output] samples:
    intersection((1, 2), (2, 3)) ==> "NO"
    intersection((-1, 1), (0, 4)) ==> "NO"
    intersection((-3, -1), (-5, 5)) ==> "YES"
     */
    public String intersection(List<Integer> interval1, List<Integer> interval2) {

            int l = Math.max(interval1.get(0), interval2.get(0));
        int r = Math.min(interval1.get(1), interval2.get(1));
        int length = r - l;
        if (length <= 0) {
            return "NO";
        }
        if (length == 1) {
            return "NO";
        }
        if (length == 2) {
            return "YES";
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_127_humaneval_constraint_based_88e851d8 {
    @Test
    void testIntersection_NoIntersection() {
        Solution solution = new Solution();
        List<Integer> interval1 = Arrays.asList(1, 2);
        List<Integer> interval2 = Arrays.asList(3, 4);
        assertEquals("NO", solution.intersection(interval1, interval2));
    }

    @Test
    void testIntersection_PrimeLength() {
        Solution solution = new Solution();
        List<Integer> interval1 = Arrays.asList(-3, -1);
        List<Integer> interval2 = Arrays.asList(-5, 5);
        assertEquals("YES", solution.intersection(interval1, interval2));
    }

    @Test
    void testIntersection_NonPrimeLength() {
        Solution solution = new Solution();
        List<Integer> interval1 = Arrays.asList(1, 3);
        List<Integer> interval2 = Arrays.asList(2, 4);
        assertEquals("NO", solution.intersection(interval1, interval2));
    }

    @Test
    void testIntersection_SinglePointIntersection() {
        Solution solution = new Solution();
        List<Integer> interval1 = Arrays.asList(-1, 1);
        List<Integer> interval2 = Arrays.asList(0, 4);
        assertEquals("NO", solution.intersection(interval1, interval2));
    }

    @Test
    void testIntersection_EmptyIntervals() {
        Solution solution = new Solution();
        List<Integer> interval1 = Arrays.asList(1, 1);
        List<Integer> interval2 = Arrays.asList(1, 1);
        assertEquals("NO", solution.intersection(interval1, interval2));
    }
}
    