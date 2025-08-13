package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.owner.PetController;
import java.time.LocalDate;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_pet_guided_tree_of_thought_89eee8a3 {

    @Mock
    private OwnerRepository ownerRepository;

    @InjectMocks
    private PetController petController;

    @Test
    void testPetCreation() {
        // Setup
        Pet pet = new Pet();
        pet.setBirthDate(LocalDate.now());
        pet.setName("Fluffy");
        
        // Action - test that pet can be created
        assertNotNull(pet);
        assertEquals("Fluffy", pet.getName());
        assertEquals(LocalDate.now(), pet.getBirthDate());
    }

    @Test
    void testPetBirthDate() {
        // Setup
        Pet pet = new Pet();
        LocalDate birthDate = LocalDate.of(2020, 1, 15);
        pet.setBirthDate(birthDate);
        
        // Action & Assertion
        assertEquals(birthDate, pet.getBirthDate());
    }

    @Test
    void testPetName() {
        // Setup
        Pet pet = new Pet();
        pet.setName("Buddy");
        
        // Action & Assertion
        assertEquals("Buddy", pet.getName());
    }
}