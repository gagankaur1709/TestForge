
    import java.lang.*;
import java.util.*;
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
    You have to write a function which validates a given date string and
    returns true if the date is valid otherwise false.
    The date is valid if all of the following rules are satisfied:
    1. The date string is not empty.
    2. The number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12. And the number of days is not less than 1 or higher than 30 days for months 4,6,9,11. And, the number of days is not less than 1 or higher than 29 for the month 2.
    3. The months should not be less than 1 or higher than 12.
    4. The date should be in the format: mm-dd-yyyy

    for example:
    validDate("03-11-2000") => true
    validDate("15-01-2012") => false
    validDate("04-0-2040") => false
    validDate("06-04-2020") => true
    validDate("06/04/2020") => false
     */
    public boolean validDate(String date) {

            try {
            date = date.strip();
            String[] dates = date.split("-" );
            String m = dates[0];
            while (!m.isEmpty() && m.charAt(0) == '0') {
                m = m.substring(1);
            }
            String d = dates[1];
            while (!d.isEmpty() && d.charAt(0) == '0') {
                d = d.substring(1);
            }
            String y = dates[2];
            while (!y.isEmpty() && y.charAt(0) == '0') {
                y = y.substring(1);
            }
            int month = Integer.parseInt(m), day = Integer.parseInt(d), year = Integer.parseInt(y);
            if (month < 1 || month > 12) {
                return false;
            }
            if (Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(month) && (day < 1 || day > 31)) {
                return false;
            }
            if (Arrays.asList(4, 6, 9, 11).contains(month) && (day < 1 || day > 30)) {
                return false;
            }
            if (month == 2 && (day < 1 || day > 29)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_124_humaneval_role_playing_c79c411d {

    @Test
    void should_return_true_for_valid_date_in_format_mm_dd_yyyy() {
        Solution solution = new Solution();
        assertTrue(solution.validDate("03-11-2000"));
        assertTrue(solution.validDate("06-04-2020"));
    }

    @Test
    void should_return_false_for_invalid_date_in_format_mm_dd_yyyy() {
        Solution solution = new Solution();
        assertFalse(solution.validDate("15-01-2012"));
        assertFalse(solution.validDate("04-0-2040"));
    }

    @Test
    void should_return_false_for_date_in_invalid_format() {
        Solution solution = new Solution();
        assertFalse(solution.validDate("06/04/2020"));
        assertFalse(solution.validDate("06.04.2020"));
        assertFalse(solution.validDate("06042020"));
    }

    @Test
    void should_return_false_for_empty_date_string() {
        Solution solution = new Solution();
        assertFalse(solution.validDate(""));
        assertFalse(solution.validDate("   "));
    }

    @Test
    void should_return_false_for_date_with_invalid_month() {
        Solution solution = new Solution();
        assertFalse(solution.validDate("00-04-2020"));
        assertFalse(solution.validDate("13-04-2020"));
    }

    @Test
    void should_return_false_for_date_with_invalid_day() {
        Solution solution = new Solution();
        assertFalse(solution.validDate("04-00-2020"));
        assertFalse(solution.validDate("04-32-2020"));
        assertFalse(solution.validDate("02-30-2020"));
    }
}
    