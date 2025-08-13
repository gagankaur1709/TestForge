package org.springframework.samples.petclinic.vet;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
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
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_vet_vetcontroller_constraint_based_2ac22085 {

    @Mock
    private VetRepository vetRepository;

    @Mock
    private Model model;

    @InjectMocks
    private VetController vetController;

    @Test
    void testShowVetList() {
        Page<Vet> page = Page.empty();
        when(vetRepository.findAll(any(Pageable.class))).thenReturn(page);
        String result = vetController.showVetList(1, model);
        assertEquals("vets/vetList", result);
        verify(model, times(4)).addAttribute(anyString(), anyObject());
    }

    @Test
    void testShowResourcesVetList() {
        List<Vet> vets = List.of(new Vet());
        when(vetRepository.findAll()).thenReturn(vets);
        Vets result = vetController.showResourcesVetList();
        assertNotNull(result);
        assertEquals(vets, result.getVetList());
    }
}