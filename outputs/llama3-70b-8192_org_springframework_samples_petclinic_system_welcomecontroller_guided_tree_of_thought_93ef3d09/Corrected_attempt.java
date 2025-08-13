package org.springframework.samples.petclinic.system;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_system_welcomecontroller_guided_tree_of_thought_93ef3d09 {

    private WelcomeController welcomeController = new WelcomeController();

    @Test
    public void testWelcome() {
        // Given
        // No setup needed for this test case

        // When
        String result = welcomeController.welcome();

        // Then
        assertEquals("welcome", result);
    }
}