package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.samples.petclinic.model.NamedEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_pet_role_playing_3afd2609 {

    @InjectMocks
    private Pet pet;

    @Mock
    private PetType petType;

    @Mock
    private Visit visit;

    @Test
    void shouldReturnBirthDate_whenGetBirthDateIsCalled() {
        // Arrange
        LocalDate birthDate = LocalDate.of(2022, 1, 1);
        pet.setBirthDate(birthDate);

        // Act
        LocalDate result = pet.getBirthDate();

        // Assert
        assertEquals(birthDate, result);
    }

    @Test
    void shouldSetBirthDate_whenSetBirthDateIsCalled() {
        // Arrange
        LocalDate birthDate = LocalDate.of(2022, 1, 1);

        // Act
        pet.setBirthDate(birthDate);

        // Assert
        assertEquals(birthDate, pet.getBirthDate());
    }

    @Test
    void shouldReturnPetType_whenGetTypeIsCalled() {
        // Arrange
        when(pet.getType()).thenReturn(petType);

        // Act
        PetType result = pet.getType();

        // Assert
        assertEquals(petType, result);
    }

    @Test
    void shouldSetPetType_whenSetTypeIsCalled() {
        // Arrange
        PetType petType = mock(PetType.class);

        // Act
        pet.setType(petType);

        // Assert
        assertEquals(petType, pet.getType());
    }

    @Test
    void shouldReturnVisits_whenGetVisitsIsCalled() {
        // Arrange
        Set<Visit> visits = new LinkedHashSet<>();
        when(pet.getVisits()).thenReturn(visits);

        // Act
        Collection<Visit> result = pet.getVisits();

        // Assert
        assertEquals(visits, result);
    }

    @Test
    void shouldAddVisit_whenAddVisitIsCalled() {
        // Arrange
        Visit visit = mock(Visit.class);

        // Act
        pet.addVisit(visit);

        // Assert
        assertTrue(pet.getVisits().contains(visit));
    }
}