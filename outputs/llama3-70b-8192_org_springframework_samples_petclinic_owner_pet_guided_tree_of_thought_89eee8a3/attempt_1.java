package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.PetRepository;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_pet_guided_tree_of_thought_89eee8a3 {

    @Mock
    private PetRepository petRepository;

    @InjectMocks
    private PetService petService;

    @Test
    void getPet_HappyPath() {
        // Setup
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.now());
        when(petRepository.findById(anyLong())).thenReturn(java.util.Optional.of(pet));

        // Action
        Pet result = petService.getPet(1L);

        // Assertion
        assertEquals(pet, result);
    }

    @Test
    void getPet_PetNotFound() {
        // Setup
        when(petRepository.findById(anyLong())).thenReturn(java.util.Optional.empty());

        // Action
        Pet result = petService.getPet(1L);

        // Assertion
        assertNull(result);
    }
}