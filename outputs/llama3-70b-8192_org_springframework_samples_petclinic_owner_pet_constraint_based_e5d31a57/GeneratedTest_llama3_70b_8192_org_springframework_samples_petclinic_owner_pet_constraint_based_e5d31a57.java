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
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_pet_constraint_based_e5d31a57 {

    @InjectMocks
    private Pet pet;

    @Mock
    private PetType petType;

    @Mock
    private Visit visit;

    @Test
    void testSetAndGetBirthDate() {
        LocalDate birthDate = LocalDate.of(2022, 1, 1);
        pet.setBirthDate(birthDate);
        assertEquals(birthDate, pet.getBirthDate());
    }

    @Test
    void testSetAndGetPetType() {
        pet.setType(petType);
        assertEquals(petType, pet.getType());
    }

    @Test
    void testAddVisit() {
        pet.addVisit(visit);
        assertTrue(pet.getVisits().contains(visit));
    }

    @Test
    void testGetVisits() {
        Set<Visit> visits = new LinkedHashSet<>();
        visits.add(visit);
        when(pet.getVisits()).thenReturn(visits);
        assertEquals(visits, pet.getVisits());
    }
}