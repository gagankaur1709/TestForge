package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.validation.BindException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_petvalidator_chain_of_thought_af8f9c8b {

    @InjectMocks
    private PetValidator petValidator;

    @Mock
    private Errors errors;

    @Test
    void testValidate_withValidPet() {
        Pet pet = new Pet();
        pet.setName("TestName");
        pet.setType(new PetType());
        pet.setBirthDate(java.time.LocalDate.now());

        petValidator.validate(pet, new BindException(new Object(), "object"));

        verify(errors, never()).rejectValue(anyString(), anyString(), anyString());
    }

    @Test
    void testValidate_withInvalidPet_nameIsNull() {
        Pet pet = new Pet();
        pet.setType(new PetType());
        pet.setBirthDate(java.time.LocalDate.now());

        petValidator.validate(pet, new BindException(new Object(), "object"));

        verify(errors, times(1)).rejectValue("name", "required", "required");
    }

    @Test
    void testValidate_withInvalidPet_typeIsNull() {
        Pet pet = new Pet();
        pet.setName("TestName");
        pet.setBirthDate(java.time.LocalDate.now());

        petValidator.validate(pet, new BindException(new Object(), "object"));

        verify(errors, times(1)).rejectValue("type", "required", "required");
    }

    @Test
    void testValidate_withInvalidPet_birthDateIsNull() {
        Pet pet = new Pet();
        pet.setName("TestName");
        pet.setType(new PetType());

        petValidator.validate(pet, new BindException(new Object(), "object"));

        verify(errors, times(1)).rejectValue("birthDate", "required", "required");
    }

    @Test
    void testSupports_withPetClass() {
        assertTrue(petValidator.supports(Pet.class));
    }

    @Test
    void testSupports_withOtherClass() {
        assertFalse(petValidator.supports(String.class));
    }
}