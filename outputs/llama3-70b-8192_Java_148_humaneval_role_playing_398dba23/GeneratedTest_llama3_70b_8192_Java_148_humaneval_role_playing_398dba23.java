
    import java.lang.*;
import java.util.*;
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
    There are eight planets in our solar system: the closerst to the Sun
    is Mercury, the next one is Venus, then Earth, Mars, Jupiter, Saturn,
    Uranus, Neptune.
    Write a function that takes two planet names as strings planet1 and planet2.
    The function should return a tuple containing all planets whose orbits are
    located between the orbit of planet1 and the orbit of planet2, sorted by
    the proximity to the sun.
    The function should return an empty tuple if planet1 or planet2
    are not correct planet names.
    Examples
    bf("Jupiter", "Neptune") ==> ["Saturn", "Uranus"]
    bf("Earth", "Mercury") ==> ["Venus"]
    bf("Mercury", "Uranus") ==> ["Venus", "Earth", "Mars", "Jupiter", "Saturn"]
     */
    public List<String> bf(String planet1, String planet2) {

            List<String> planet_names = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune");
        if (!planet_names.contains(planet1) || !planet_names.contains(planet2) || planet1.equals(planet2)) {
            return List.of();
        }
        int planet1_index = planet_names.indexOf(planet1);
        int planet2_index = planet_names.indexOf(planet2);
        if (planet1_index < planet2_index) {
            return planet_names.subList(planet1_index + 1, planet2_index);
        } else {
            return planet_names.subList(planet2_index + 1, planet1_index);
        }
    }
}
    
    public class GeneratedTest_llama3_70b_8192_Java_148_humaneval_role_playing_398dba23 {

    @Test
    void should_return_empty_list_when_planet1_or_planet2_is_not_correct() {
        Solution solution = new Solution();
        assertEquals(List.of(), solution.bf("Jupiter", "Pluto"));
        assertEquals(List.of(), solution.bf("Pluto", "Neptune"));
        assertEquals(List.of(), solution.bf("Earth", "Pluto"));
    }

    @Test
    void should_return_planets_between_planet1_and_planet2_in_order_of_proximity_to_sun() {
        Solution solution = new Solution();
        assertEquals(List.of("Saturn", "Uranus"), solution.bf("Jupiter", "Neptune"));
        assertEquals(List.of("Venus"), solution.bf("Earth", "Mercury"));
        assertEquals(List.of("Venus", "Earth", "Mars", "Jupiter", "Saturn"), solution.bf("Mercury", "Uranus"));
    }

    @Test
    void should_return_empty_list_when_planet1_equals_planet2() {
        Solution solution = new Solution();
        assertEquals(List.of(), solution.bf("Jupiter", "Jupiter"));
        assertEquals(List.of(), solution.bf("Neptune", "Neptune"));
    }
}
    