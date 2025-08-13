package org.springframework.samples.petclinic.vet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.samples.petclinic.model.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.xml.bind.annotation.XmlElement;
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
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_vet_vet_role_playing_b8fb70c7 {

    @InjectMocks
    private Vet vet;

    @Mock
    private Set<Specialty> specialties;

    @Test
    void shouldReturnEmptyList_whenGetSpecialtiesIsCalled() {
        // Arrange
        when(vet.getSpecialtiesInternal()).thenReturn(specialties);

        // Act
        List<Specialty> result = vet.getSpecialties();

        // Assert
        assertNotNull(result);
        assertTrue(result.isEmpty());
    }

    @Test
    void shouldReturnZero_whenGetNrOfSpecialtiesIsCalled() {
        // Arrange
        when(vet.getSpecialtiesInternal()).thenReturn(specialties);

        // Act
        int result = vet.getNrOfSpecialties();

        // Assert
        assertEquals(0, result);
    }

    @Test
    void shouldAddSpecialty_whenAddSpecialtyIsCalled() {
        // Arrange
        Specialty specialty = mock(Specialty.class);
        when(vet.getSpecialtiesInternal()).thenReturn(specialties);

        // Act
        vet.addSpecialty(specialty);

        // Assert
        verify(specialties).add(specialty);
    }

    @Test
    void shouldReturnSortedSpecialties_whenGetSpecialtiesIsCalled() {
        // Arrange
        Specialty specialty1 = mock(Specialty.class);
        Specialty specialty2 = mock(Specialty.class);
        when(specialty1.getName()).thenReturn("A");
        when(specialty2.getName()).thenReturn("B");
        when(vet.getSpecialtiesInternal()).thenReturn(new HashSet<>(Set.of(specialty1, specialty2)));

        // Act
        List<Specialty> result = vet.getSpecialties();

        // Assert
        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("A", result.get(0).getName());
        assertEquals("B", result.get(1).getName());
    }
}