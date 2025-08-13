package org.springframework.samples.petclinic.system;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_system_welcomecontroller_guided_tree_of_thought_93ef3d09 {

    @Mock
    private PetRepository petRepository;

    @InjectMocks
    private WelcomeController welcomeController;

    @ExtendWith(MockitoExtension.class)

    @Test
    void testWelcome() {
        // Given
        // No setup needed for this test case

        // When
        String result = welcomeController.welcome();

        // Then
        assertEquals("welcome", result);
    }
}