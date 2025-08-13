package org.springframework.samples.petclinic.system;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_system_welcomecontroller_role_playing_8477a7ff {

    @InjectMocks
    private WelcomeController welcomeController;

    @Test
    void shouldReturnWelcomeView_whenRootUrlIsRequested() {
        // Arrange

        // Act
        String result = welcomeController.welcome();

        // Assert
        assertEquals("welcome", result);
    }
}