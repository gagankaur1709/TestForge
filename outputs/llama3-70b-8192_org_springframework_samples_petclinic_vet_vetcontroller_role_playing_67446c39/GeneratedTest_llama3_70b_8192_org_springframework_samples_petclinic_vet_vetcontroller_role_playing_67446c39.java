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
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_vet_vetcontroller_role_playing_67446c39 {

    @Mock
    private VetRepository vetRepository;

    @Mock
    private Model model;

    @InjectMocks
    private VetController vetController;

    @Test
    void shouldReturnVetListPage_whenShowVetListIsCalled() {
        // Arrange
        int page = 1;
        Page<Vet> paginated = Page.empty();
        when(vetRepository.findAll(any(Pageable.class))).thenReturn(paginated);
        
        // Act
        String result = vetController.showVetList(page, model);
        
        // Assert
        assertEquals("vets/vetList", result);
        verify(model, times(1)).addAttribute("currentPage", page);
        verify(model, times(1)).addAttribute("totalPages", paginated.getTotalPages());
        verify(model, times(1)).addAttribute("totalItems", paginated.getTotalElements());
        verify(model, times(1)).addAttribute("listVets", paginated.getContent());
    }

    @Test
    void shouldReturnVets_whenShowResourcesVetListIsCalled() {
        // Arrange
        List<Vet> vets = List.of(new Vet());
        when(vetRepository.findAll()).thenReturn(vets);
        
        // Act
        Vets result = vetController.showResourcesVetList();
        
        // Assert
        assertNotNull(result);
        assertEquals(vets, result.getVetList());
    }
}