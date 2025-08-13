package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_system_welcomecontroller_constraint_based_f45ea706 {

    @InjectMocks
    private WelcomeController welcomeController;

    @ExtendWith(MockitoExtension.class)
    @Test
    void testWelcome() {
        String result = welcomeController.welcome();
        assertEquals("welcome", result);
    }
}