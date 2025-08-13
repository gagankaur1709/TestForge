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

public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_vet_vet_constraint_based_647831d9 {

    @Mock
    private Specialty specialty;

    @InjectMocks
    private Vet vet;

    @ExtendWith(MockitoExtension.class)

    @Test
    void testGetSpecialtiesInternal() {
        assertNotNull(vet.getSpecialtiesInternal());
        assertTrue(vet.getSpecialtiesInternal() instanceof HashSet);
    }

    @Test
    void testGetSpecialties() {
        List<Specialty> specialties = vet.getSpecialties();
        assertNotNull(specialties);
        assertTrue(specialties.isEmpty());
    }

    @Test
    void testGetNrOfSpecialties() {
        assertEquals(0, vet.getNrOfSpecialties());
    }

    @Test
    void testAddSpecialty() {
        vet.addSpecialty(specialty);
        assertEquals(1, vet.getNrOfSpecialties());
    }
}