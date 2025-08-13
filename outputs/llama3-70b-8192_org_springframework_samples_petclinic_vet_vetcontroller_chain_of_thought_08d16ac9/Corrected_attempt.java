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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_vet_vetcontroller_chain_of_thought_08d16ac9 {

    @Mock
    private VetRepository vetRepository;

    @Mock
    private Model model;

    @InjectMocks
    private VetController vetController;

    @Test
    void testShowVetList() {
        // Arrange
        int page = 1;
        Page<Vet> paginated = mock(Page.class);
        when(vetRepository.findAll(any(Pageable.class))).thenReturn(paginated);
        when(paginated.getTotalPages()).thenReturn(10);
        when(paginated.getTotalElements()).thenReturn(50L);
        List<Vet> vetList = List.of(new Vet());
        when(paginated.getContent()).thenReturn(vetList);

        // Act
        String result = vetController.showVetList(page, model);

        // Assert
        assertEquals("vets/vetList", result);
        verify(model, times(1)).addAttribute("currentPage", page);
        verify(model, times(1)).addAttribute("totalPages", 10);
        verify(model, times(1)).addAttribute("totalItems", 50L);
    }

    @Test
    void testShowResourcesVetList() {
        // Arrange
        List<Vet> vetList = List.of(new Vet());
        when(vetRepository.findAll()).thenReturn(vetList);

        // Act
        Vets result = vetController.showResourcesVetList();

        // Assert
        assertNotNull(result);
        assertEquals(vetList, result.getVetList());
    }
}