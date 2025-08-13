
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
    It is the last week of the semester and the teacher has to give the grades
    to students. The teacher has been making her own algorithm for grading.
    The only problem is, she has lost the code she used for grading.
    She has given you a list of GPAs for some students and you have to write
    a function that can output a list of letter grades using the following table:
             GPA       |    Letter grade
              4.0                A+
            > 3.7                A
            > 3.3                A-
            > 3.0                B+
            > 2.7                B
            > 2.3                B-
            > 2.0                C+
            > 1.7                C
            > 1.3                C-
            > 1.0                D+
            > 0.7                D
            > 0.0                D-
              0.0                E


    Example:
    numericalLetterGrade(Arrays.asList(4.0, 3, 1.7, 2, 3.5)) ==> ["A+", "B", "C-", "C", "A-"]
     */
    public List<String> numericalLetterGrade(List<Double> grades) {

            List<String> letter_grade = new ArrayList<>();
        for (double gpa : grades) {
            if (gpa == 4.0) {
                letter_grade.add("A+");
            } else if (gpa > 3.7) {
                letter_grade.add("A");
            } else if (gpa > 3.3) {
                letter_grade.add("A-");
            } else if (gpa > 3.0) {
                letter_grade.add("B+");
            } else if (gpa > 2.7) {
                letter_grade.add("B");
            } else if (gpa > 2.3) {
                letter_grade.add("B-");
            } else if (gpa > 2.0) {
                letter_grade.add("C+");
            } else if (gpa > 1.7) {
                letter_grade.add("C");
            } else if (gpa > 1.3) {
                letter_grade.add("C-");
            } else if (gpa > 1.0) {
                letter_grade.add("D+");
            } else if (gpa > 0.7) {
                letter_grade.add("D");
            } else if (gpa > 0.0) {
                letter_grade.add("D-");
            } else {
                letter_grade.add("E");
            }
        }
        return letter_grade;
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_81_humaneval_role_playing_ff9475a7 {

    @Test
    void should_return_empty_list_when_input_is_empty() {
        Solution solution = new Solution();
        List<Double> grades = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_A_plus_when_GPA_is_4_point_0() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(4.0);
        List<String> expected = Arrays.asList("A+");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_A_when_GPA_is_greater_than_3_point_7() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(3.8);
        List<String> expected = Arrays.asList("A");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_A_minus_when_GPA_is_greater_than_3_point_3() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(3.4);
        List<String> expected = Arrays.asList("A-");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_B_plus_when_GPA_is_greater_than_3_point_0() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(3.1);
        List<String> expected = Arrays.asList("B+");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_B_when_GPA_is_greater_than_2_point_7() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(2.8);
        List<String> expected = Arrays.asList("B");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_B_minus_when_GPA_is_greater_than_2_point_3() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(2.4);
        List<String> expected = Arrays.asList("B-");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_C_plus_when_GPA_is_greater_than_2_point_0() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(2.1);
        List<String> expected = Arrays.asList("C+");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_C_when_GPA_is_greater_than_1_point_7() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(1.8);
        List<String> expected = Arrays.asList("C");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_C_minus_when_GPA_is_greater_than_1_point_3() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(1.4);
        List<String> expected = Arrays.asList("C-");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_D_plus_when_GPA_is_greater_than_1_point_0() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(1.1);
        List<String> expected = Arrays.asList("D+");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_D_when_GPA_is_greater_than_0_point_7() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(0.8);
        List<String> expected = Arrays.asList("D");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_D_minus_when_GPA_is_greater_than_0_point_0() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(0.1);
        List<String> expected = Arrays.asList("D-");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_E_when_GPA_is_0_point_0() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(0.0);
        List<String> expected = Arrays.asList("E");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }

    @Test
    void should_return_multiple_letter_grades_for_multiple_GPAs() {
        Solution solution = new Solution();
        List<Double> grades = Arrays.asList(4.0, 3, 1.7, 2, 3.5);
        List<String> expected = Arrays.asList("A+", "B", "C-", "C", "A-");
        assertEquals(expected, solution.numericalLetterGrade(grades));
    }
}
    