package org.springframework.samples.petclinic.owner;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.BDDMockito.*;

import org.springframework.samples.petclinic.owner.VisitController;
import org.springframework.samples.petclinic.owner.Owner;
import org.springframework.samples.petclinic.owner.OwnerRepository;
import org.springframework.samples.petclinic.owner.Pet;
import org.springframework.samples.petclinic.owner.Visit;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import jakarta.validation.Valid;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_visitcontroller_constraint_based_3e7fef1f {

    @Mock
    private OwnerRepository owners;

    @Mock
    private WebDataBinder dataBinder;

    @Mock
    private RedirectAttributes redirectAttributes;

    @Mock
    private BindingResult result;

    @Mock
    private Visit visit;

    @Mock
    private Owner owner;

    @Mock
    private Pet pet;

    @InjectMocks
    private VisitController visitController;

    @Test
    void testSetAllowedFields() {
        visitController.setAllowedFields(dataBinder);
        verify(dataBinder).setDisallowedFields("id");
    }

    @Test
    void testLoadPetWithVisit() {
        when(owners.findById(anyInt())).thenReturn(Optional.of(owner));
        when(owner.getPet(anyInt())).thenReturn(pet);
        Visit loadedVisit = visitController.loadPetWithVisit(1, 2, new HashMap<>());
        assertNotNull(loadedVisit);
        verify(owner).getPet(2);
    }

    @Test
    void testInitNewVisitForm() {
        assertEquals("pets/createOrUpdateVisitForm", visitController.initNewVisitForm(new Model()));
    }

    @Test
    void testProcessNewVisitForm() {
        when(result.hasErrors()).thenReturn(false);
        when(owner.addVisit(anyInt(), any(Visit.class))).thenReturn(owner);
        assertEquals("redirect:/owners/{ownerId}", visitController.processNewVisitForm(owner, 1, visit, result, redirectAttributes));
        verify(owners).save(owner);
        verify(redirectAttributes).addFlashAttribute("message", "Your visit has been booked");
    }

    @Test
    void testProcessNewVisitForm_withErrors() {
        when(result.hasErrors()).thenReturn(true);
        assertEquals("pets/createOrUpdateVisitForm", visitController.processNewVisitForm(owner, 1, visit, result, redirectAttributes));
    }
}