package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

@ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_petcontroller_guided_tree_of_thought_89a2cb3d {

    @Mock
    private OwnerRepository owners;

    @Mock
    private PetTypeRepository types;

    @InjectMocks
    private PetController petController;

    @Test
    void testGetPet_HappyPath() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        Owner owner = new Owner();
        Pet pet = new Pet();
        owner.addPet(pet);
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));
        when(owner.getPet(petId)).thenReturn(pet);

        // Action
        Pet result = petController.findPet(ownerId, petId);

        // Assertion
        assertEquals(pet, result);
    }

    @Test
    void testGetPet_PetNotFound() {
        // Setup
        int ownerId = 1;
        int petId = 1;
        Owner owner = new Owner();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));
        when(owner.getPet(petId)).thenReturn(null);

        // Action and Assertion
        assertThrows(IllegalArgumentException.class, () -> petController.findPet(ownerId, petId));
    }
}