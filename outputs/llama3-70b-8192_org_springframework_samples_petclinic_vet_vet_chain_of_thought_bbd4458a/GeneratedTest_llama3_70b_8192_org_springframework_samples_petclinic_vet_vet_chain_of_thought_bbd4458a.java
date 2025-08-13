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
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_vet_vet_chain_of_thought_bbd4458a {

    @InjectMocks
    private Vet vet;

    @Mock
    private Specialty specialty;

    @Test
    void testGetSpecialtiesInternal() {
        Set<Specialty> specialties = vet.getSpecialtiesInternal();
        assertNotNull(specialties);
        assertTrue(specialties instanceof HashSet);
    }

    @Test
    void testGetSpecialties() {
        Specialty specialty1 = new Specialty();
        specialty1.setName("Specialty1");
        Specialty specialty2 = new Specialty();
        specialty2.setName("Specialty2");

        vet.addSpecialty(specialty1);
        vet.addSpecialty(specialty2);

        List<Specialty> specialties = vet.getSpecialties();
        assertNotNull(specialties);
        assertEquals(2, specialties.size());
        assertEquals("Specialty1", specialties.get(0).getName());
        assertEquals("Specialty2", specialties.get(1).getName());
    }

    @Test
    void testGetNrOfSpecialties() {
        assertEquals(0, vet.getNrOfSpecialties());

        vet.addSpecialty(specialty);
        assertEquals(1, vet.getNrOfSpecialties());
    }

    @Test
    void testAddSpecialty() {
        vet.addSpecialty(specialty);
        assertEquals(1, vet.getNrOfSpecialties());
    }
}