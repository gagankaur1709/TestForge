package org.springframework.samples.petclinic.owner;

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
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_visitcontroller_guided_tree_of_thought_80ae77fb {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private VisitController visitController;

    @Test
    void testLoadPetWithVisit_HappyPath() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        Owner owner = new Owner();
        owner.setId(ownerId);
        Pet pet = new Pet();
        pet.setId(petId);
        owner.addPet(pet);
        Optional<Owner> optionalOwner = Optional.of(owner);
        when(owners.findById(ownerId)).thenReturn(optionalOwner);

        // Action
        Visit visit = visitController.loadPetWithVisit(ownerId, petId, new HashMap<>());

        // Assertion
        assertNotNull(visit);
        assertEquals(pet, visit.getPet());
    }

    @Test
    void testLoadPetWithVisit_OwnerNotFound() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        when(owners.findById(ownerId)).thenReturn(Optional.empty());

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
        Owner owner = new Owner();
        owner.setId(ownerId);
        Pet pet = new Pet();
        pet.setId(petId);
        owner.addPet(pet);
        Visit visit = new Visit();
        when(owners.save(owner)).thenReturn(owner);

        // Action
        String result = visitController.processNewVisitForm(owner, petId, visit, new BindingResult() {}, new RedirectAttributes());

        // Assertion
        assertEquals("redirect:/owners/{ownerId}", result);
    }

    @Test
    void testProcessNewVisitForm_ValidationError() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        Owner owner = new Owner();
        owner.setId(ownerId);
        Pet pet = new Pet();
        pet.setId(petId);
        owner.addPet(pet);
        Visit visit = new Visit();
        BindingResult bindingResult = new BindingResult() {};
        bindingResult.reject("error");

        // Action
        String result = visitController.processNewVisitForm(owner, petId, visit, bindingResult, new RedirectAttributes());

        // Assertion
        assertEquals("pets/createOrUpdateVisitForm", result);
    }
}