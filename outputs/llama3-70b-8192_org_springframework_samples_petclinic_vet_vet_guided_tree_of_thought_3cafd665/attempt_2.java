package org.springframework.samples.petclinic.vet;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.samples.petclinic.model.Person;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.samples.petclinic.repository.VetRepository;
import org.springframework.samples.petclinic.vet.Vet;
import org.springframework.samples.petclinic.vet.VetService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class VetServiceTest {

    @Mock
    private VetRepository vetRepository;

    @InjectMocks
    private VetService vetService;

    @Test
    void testGetPet_HappyPath() {
        // Setup
        Vet vet = new Vet();
        vet.setId(1L);
        when(vetRepository.findById(anyLong())).thenReturn(Optional.of(vet));

        // Action
        Vet result = vetService.getPet(1L);

        // Assertion
        assertEquals(vet, result);
    }

    @Test
    void testGetPet_PetNotFound() {
        // Setup
        when(vetRepository.findById(anyLong())).thenReturn(Optional.empty());

        // Action and Assertion
        assertThrows(RuntimeException.class, () -> vetService.getPet(1L));
    }
}