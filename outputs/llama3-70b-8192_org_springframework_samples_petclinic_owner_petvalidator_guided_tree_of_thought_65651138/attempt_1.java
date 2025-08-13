package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.model.Pet;
import org.springframework.validation.Errors;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_petvalidator_guided_tree_of_thought_65651138 {

    @Mock
    private Errors errors;

    @InjectMocks
    private PetValidator petValidator;

    @Test
    void testValidateHappyPath() {
        Pet pet = new Pet();
        pet.setName("Valid Name");
        pet.setType("Valid Type");
        pet.setBirthDate(java.time.LocalDate.now());
        
        petValidator.validate(pet, errors);
        
        verify(errors, never()).rejectValue(anyString(), anyString(), anyString());
    }

    @Test
    void testValidateNameIsRequired() {
        Pet pet = new Pet();
        pet.setType("Valid Type");
        pet.setBirthDate(java.time.LocalDate.now());
        
        petValidator.validate(pet, errors);
        
        verify(errors).rejectValue("name", "required", "required");
    }

    @Test
    void testValidateTypeIsRequired() {
        Pet pet = new Pet();
        pet.setName("Valid Name");
        pet.setBirthDate(java.time.LocalDate.now());
        
        petValidator.validate(pet, errors);
        
        verify(errors).rejectValue("type", "required", "required");
    }

    @Test
    void testValidateBirthDateIsRequired() {
        Pet pet = new Pet();
        pet.setName("Valid Name");
        pet.setType("Valid Type");
        
        petValidator.validate(pet, errors);
        
        verify(errors).rejectValue("birthDate", "required", "required");
    }

    @Test
    void testSupports() {
        assertTrue(petValidator.supports(Pet.class));
        assertFalse(petValidator.supports(Object.class));
    }
}