package org.springframework.samples.petclinic.vet;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_vet_vet_guided_tree_of_thought_3cafd665 {

    @Mock
    private VetRepository vetRepository;

    @Mock
    private Model model;

    @InjectMocks
    private VetController vetController;

    @Test
    void testShowVetList() {
        // Setup
        Vet vet1 = new Vet();
        vet1.setId(1);
        Vet vet2 = new Vet();
        vet2.setId(2);
        List<Vet> vets = Arrays.asList(vet1, vet2);
        Page<Vet> page = new PageImpl<Vet>(vets);
        when(vetRepository.findAll(any(Pageable.class))).thenReturn(page);

        // Action
        String result = vetController.showVetList(1, model);

        // Assertion
        assertEquals("vets/vetList", result);
        verify(model).addAttribute("currentPage", 1);
        verify(model).addAttribute("totalPages", 1);
        verify(model).addAttribute("totalItems", 2L);
        verify(model).addAttribute("listVets", vets);
    }

    @Test
    void testShowResourcesVetList() {
        // Setup
        Vet vet1 = new Vet();
        vet1.setId(1);
        Vet vet2 = new Vet();
        vet2.setId(2);
        Collection<Vet> vets = Arrays.asList(vet1, vet2);
        when(vetRepository.findAll()).thenReturn(vets);

        // Action
        Vets result = vetController.showResourcesVetList();

        // Assertion
        assertNotNull(result);
        assertEquals(2, result.getVetList().size());
        assertTrue(result.getVetList().contains(vet1));
        assertTrue(result.getVetList().contains(vet2));
    }
}