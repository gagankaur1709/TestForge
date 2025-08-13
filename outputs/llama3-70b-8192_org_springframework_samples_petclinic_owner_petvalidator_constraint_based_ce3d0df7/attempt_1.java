package org.springframework.samples.petclinic.owner;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_petvalidator_constraint_based_ce3d0df7 {

    @Mock
    private Errors errors;

    @Mock
    private Pet pet;

    @InjectMocks
    private PetValidator petValidator;

    @ExtendWith(MockitoExtension.class)

    @Test
    void testValidate_WithName() {
        when(pet.getName()).thenReturn("name");
        petValidator.validate(pet, errors);
        verify(errors, never()).rejectValue("name", "required", "required");
    }

    @Test
    void testValidate_WithoutName() {
        when(pet.getName()).thenReturn("");
        petValidator.validate(pet, errors);
        verify(errors).rejectValue("name", "required", "required");
    }

    @Test
    void testValidate_WithType() {
        when(pet.isNew()).thenReturn(true);
        when(pet.getType()).thenReturn("type");
        petValidator.validate(pet, errors);
        verify(errors, never()).rejectValue("type", "required", "required");
    }

    @Test
    void testValidate_WithoutType() {
        when(pet.isNew()).thenReturn(true);
        when(pet.getType()).thenReturn(null);
        petValidator.validate(pet, errors);
        verify(errors).rejectValue("type", "required", "required");
    }

    @Test
    void testValidate_WithBirthDate() {
        when(pet.getBirthDate()).thenReturn(java.time.LocalDate.now());
        petValidator.validate(pet, errors);
        verify(errors, never()).rejectValue("birthDate", "required", "required");
    }

    @Test
    void testValidate_WithoutBirthDate() {
        when(pet.getBirthDate()).thenReturn(null);
        petValidator.validate(pet, errors);
        verify(errors).rejectValue("birthDate", "required", "required");
    }

    @Test
    void testSupports_PetClass() {
        assertTrue(petValidator.supports(Pet.class));
    }

    @Test
    void testSupports_NotPetClass() {
        assertFalse(petValidator.supports(Object.class));
    }
}