package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.validation.Errors;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_petvalidator_role_playing_90c64276 {

    @Mock
    private Errors errors;

    @InjectMocks
    private PetValidator petValidator;

    @Test
    void shouldRejectValue_whenNameIsEmpty() {
        // Arrange
        Pet pet = new Pet();
        pet.setName("");
        when(errors.rejectValue("name", "required", "required")).thenReturn(true);

        // Act
        petValidator.validate(pet, errors);

        // Assert
        verify(errors).rejectValue("name", "required", "required");
    }

    @Test
    void shouldRejectValue_whenTypeIsNull() {
        // Arrange
        Pet pet = new Pet();
        pet.setNew(true);
        pet.setType(null);
        when(errors.rejectValue("type", "required", "required")).thenReturn(true);

        // Act
        petValidator.validate(pet, errors);

        // Assert
        verify(errors).rejectValue("type", "required", "required");
    }

    @Test
    void shouldRejectValue_whenBirthDateIsNull() {
        // Arrange
        Pet pet = new Pet();
        pet.setBirthDate(null);
        when(errors.rejectValue("birthDate", "required", "required")).thenReturn(true);

        // Act
        petValidator.validate(pet, errors);

        // Assert
        verify(errors).rejectValue("birthDate", "required", "required");
    }

    @Test
    void shouldSupportPetClass() {
        // Arrange
        Class<?> clazz = Pet.class;

        // Act
        boolean result = petValidator.supports(clazz);

        // Assert
        assertTrue(result);
    }

    @Test
    void shouldNotSupportOtherClass() {
        // Arrange
        Class<?> clazz = String.class;

        // Act
        boolean result = petValidator.supports(clazz);

        // Assert
        assertFalse(result);
    }
}