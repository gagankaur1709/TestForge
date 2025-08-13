package org.springframework.samples.petclinic.owner;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_visitcontroller_guided_tree_of_thought_80ae77fb {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private VisitController visitController;

    @Test
    void testLoadPetWithVisit_HappyPath() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        Owner owner = mock(Owner.class);
        Pet pet = mock(Pet.class);
        given(owners.findById(ownerId)).willReturn(Optional.of(owner));
        given(owner.getPet(petId)).willReturn(pet);

        // Action
        Visit visit = visitController.loadPetWithVisit(ownerId, petId, new HashMap<>());

        // Assertion
        assertNotNull(visit);
        assertNotNull(visit.getDate());
    }

    @Test
    void testLoadPetWithVisit_OwnerNotFound() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        given(owners.findById(ownerId)).willReturn(Optional.empty());

        // Action and Assertion
        assertThrows(IllegalArgumentException.class, () -> visitController.loadPetWithVisit(ownerId, petId, new HashMap<>()));
    }

    @Test
    void testInitNewVisitForm() {
        // Action
        String result = visitController.initNewVisitForm();

        // Assertion
        assertEquals("pets/createOrUpdateVisitForm", result);
    }

    @Test
    void testProcessNewVisitForm_HappyPath() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        Owner owner = mock(Owner.class);
        Pet pet = mock(Pet.class);
        Visit visit = new Visit();
        BindingResult bindingResult = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        given(bindingResult.hasErrors()).willReturn(false);
        given(owners.save(owner)).willReturn(owner);

        // Action
        String result = visitController.processNewVisitForm(owner, petId, visit, bindingResult, redirectAttributes);

        // Assertion
        assertEquals("redirect:/owners/{ownerId}", result);
        verify(owner).addVisit(petId, visit);
        verify(owners).save(owner);
        verify(redirectAttributes).addFlashAttribute("message", "Your visit has been booked");
    }

    @Test
    void testProcessNewVisitForm_ValidationError() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        Owner owner = mock(Owner.class);
        Pet pet = mock(Pet.class);
        Visit visit = new Visit();
        BindingResult bindingResult = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        given(bindingResult.hasErrors()).willReturn(true);

        // Action
        String result = visitController.processNewVisitForm(owner, petId, visit, bindingResult, redirectAttributes);

        // Assertion
        assertEquals("pets/createOrUpdateVisitForm", result);
    }
}