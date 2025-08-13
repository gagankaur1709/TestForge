package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.samples.petclinic.model.PetRepository;
import org.springframework.samples.petclinic.service.PetService;
import java.time.LocalDate;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;

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
        given(petRepository.findById(anyLong())).willReturn(Optional.of(pet));

        // Action
        Pet result = petService.getPet(1L);

        // Assertion
        assertEquals(pet, result);
    }

    @Test
    void getPet_PetNotFound() {
        // Setup
        given(petRepository.findById(anyLong())).willReturn(Optional.empty());

        // Action
        Pet result = petService.getPet(1L);

        // Assertion
        assertNull(result);
    }
}