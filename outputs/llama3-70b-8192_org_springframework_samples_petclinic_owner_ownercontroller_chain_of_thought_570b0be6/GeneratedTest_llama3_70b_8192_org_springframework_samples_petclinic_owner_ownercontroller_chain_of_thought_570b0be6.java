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
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_ownercontroller_chain_of_thought_570b0be6 {

    @Mock
    private OwnerRepository owners;

    @Mock
    private Model model;

    @Mock
    private RedirectAttributes redirectAttributes;

    @Mock
    private BindingResult result;

    @InjectMocks
    private OwnerController ownerController;

    @Test
    void testInitCreationForm() {
        assertEquals("owners/createOrUpdateOwnerForm", ownerController.initCreationForm());
    }

    @Test
    void testProcessCreationFormValidOwner() {
        Owner owner = new Owner();
        when(result.hasErrors()).thenReturn(false);
        when(owners.save(owner)).thenReturn(owner);
        assertEquals("redirect:/owners/" + owner.getId(), ownerController.processCreationForm(owner, result, redirectAttributes));
        verify(owners, times(1)).save(owner);
    }

    @Test
    void testProcessCreationFormInvalidOwner() {
        Owner owner = new Owner();
        when(result.hasErrors()).thenReturn(true);
        assertEquals("owners/createOrUpdateOwnerForm", ownerController.processCreationForm(owner, result, redirectAttributes));
    }

    @Test
    void testInitFindForm() {
        assertEquals("owners/findOwners", ownerController.initFindForm());
    }

    @Test
    void testProcessFindFormNoOwners() {
        Owner owner = new Owner();
        when(result.hasErrors()).thenReturn(true);
        assertEquals("owners/findOwners", ownerController.processFindForm(1, owner, result, model));
    }

    @Test
    void testProcessFindFormOneOwner() {
        Owner owner = new Owner();
        Page<Owner> ownersResults = Page.empty();
        ownersResults.getContent().add(owner);
        when(owners.findByLastNameStartingWith(owner.getLastName(), PageRequest.of(0, 5))).thenReturn(ownersResults);
        assertEquals("redirect:/owners/" + owner.getId(), ownerController.processFindForm(1, owner, result, model));
    }

    @Test
    void testProcessFindFormMultipleOwners() {
        Owner owner = new Owner();
        Page<Owner> ownersResults = Page.empty();
        ownersResults.getContent().addAll(List.of(owner, new Owner()));
        when(owners.findByLastNameStartingWith(owner.getLastName(), PageRequest.of(0, 5))).thenReturn(ownersResults);
        assertEquals("owners/ownersList", ownerController.processFindForm(1, owner, result, model));
    }

    @Test
    void testInitUpdateOwnerForm() {
        assertEquals("owners/createOrUpdateOwnerForm", ownerController.initUpdateOwnerForm());
    }

    @Test
    void testProcessUpdateOwnerFormValidOwner() {
        Owner owner = new Owner();
        when(result.hasErrors()).thenReturn(false);
        when(owners.save(owner)).thenReturn(owner);
        assertEquals("redirect:/owners/" + owner.getId(), ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes));
        verify(owners, times(1)).save(owner);
    }

    @Test
    void testProcessUpdateOwnerFormInvalidOwner() {
        Owner owner = new Owner();
        when(result.hasErrors()).thenReturn(true);
        assertEquals("owners/createOrUpdateOwnerForm", ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes));
    }

    @Test
    void testShowOwner() {
        Owner owner = new Owner();
        when(owners.findById(1)).thenReturn(Optional.of(owner));
        ModelAndView modelAndView = ownerController.showOwner(1);
        assertEquals("owners/ownerDetails", modelAndView.getViewName());
        assertEquals(owner, modelAndView.getModel().get("owner"));
    }
}