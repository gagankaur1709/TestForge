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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import jakarta.validation.Valid;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.verify;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_ownercontroller_constraint_based_26851da3 {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private OwnerController ownerController;

    @Test
    void testInitCreationForm() {
        assertEquals("owners/createOrUpdateOwnerForm", ownerController.initCreationForm());
    }

    @Test
    void testProcessCreationForm() {
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(false);
        assertEquals("redirect:/owners/" + owner.getId(), ownerController.processCreationForm(owner, result, redirectAttributes));
        verify(owners, times(1)).save(owner);
    }

    @Test
    void testProcessCreationFormWithError() {
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(true);
        assertEquals("owners/createOrUpdateOwnerForm", ownerController.processCreationForm(owner, result, redirectAttributes));
    }

    @Test
    void testInitFindForm() {
        assertEquals("owners/findOwners", ownerController.initFindForm());
    }

    @Test
    void testProcessFindForm() {
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        Model model = mock(Model.class);
        when(owner.getLastName()).thenReturn("lastName");
        Page<Owner> ownersResults = mock(Page.class);
        when(owners.findByLastNameStartingWith("lastName", PageRequest.of(0, 5))).thenReturn(ownersResults);
        assertEquals("owners/findOwners", ownerController.processFindForm(1, owner, result, model));
    }

    @Test
    void testProcessFindFormWithOneResult() {
        Owner owner = new Owner();
        owner.setId(1L);
        BindingResult result = mock(BindingResult.class);
        Model model = mock(Model.class);
        when(owner.getLastName()).thenReturn("lastName");
        Page<Owner> ownersResults = mock(Page.class);
        when(ownersResults.getTotalElements()).thenReturn(1L);
        when(ownersResults.iterator()).thenReturn(List.of(owner).iterator());
        when(ownersResults.getContent()).thenReturn(List.of(owner));
        assertEquals("redirect:/owners/" + owner.getId(), ownerController.processFindForm(1, owner, result, model));
    }

    @Test
    void testInitUpdateOwnerForm() {
        assertEquals("owners/createOrUpdateOwnerForm", ownerController.initUpdateOwnerForm());
    }

    @Test
    void testProcessUpdateOwnerForm() {
        Owner owner = new Owner();
        owner.setId(1L);
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(false);
        assertEquals("redirect:/owners/" + owner.getId(), ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes));
        verify(owners, times(1)).save(owner);
    }

    @Test
    void testProcessUpdateOwnerFormWithError() {
        Owner owner = new Owner();
        owner.setId(1L);
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(true);
        assertEquals("owners/createOrUpdateOwnerForm", ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes));
    }

    @Test
    void testShowOwner() {
        ModelAndView modelAndView = ownerController.showOwner(1);
        assertEquals("owners/ownerDetails", modelAndView.getViewName());
    }
}