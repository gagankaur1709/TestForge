package org.springframework.samples.petclinic.owner;

import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import jakarta.validation.Valid;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_ownercontroller_guided_tree_of_thought_595f8dcd {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private OwnerController ownerController;

    @Test
    void testGetPet_HappyPath() {
        // Setup
        Owner owner = new Owner();
        when(owners.findById(anyInt())).thenReturn(Optional.of(owner));

        // Action
        ModelAndView modelAndView = ownerController.showOwner(1);

        // Assertion
        assertEquals("owners/ownerDetails", modelAndView.getViewName());
        assertEquals(owner, modelAndView.getModel());
    }

    @Test
    void testGetPet_OwnerNotFound() {
        // Setup
        when(owners.findById(anyInt())).thenReturn(Optional.empty());

        // Action and Assertion
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> ownerController.showOwner(1));
        assertEquals("Owner not found with id: 1. Please ensure the ID is correct ", exception.getMessage());
    }
}