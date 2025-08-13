package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_petcontroller_constraint_based_d22e92f0 {

    @InjectMocks
    private PetController petController;

    @Mock
    private OwnerRepository owners;

    @Mock
    private PetTypeRepository types;

    @Mock
    private RedirectAttributes redirectAttributes;

    @Mock
    private BindingResult bindingResult;

    @Mock
    private WebDataBinder webDataBinder;

    @Mock
    private ModelMap modelMap;

    @ExtendWith(MockitoExtension.class)

    @Test
    void testInitCreationForm() {
        Owner owner = new Owner();
        String result = petController.initCreationForm(owner, modelMap);
        assertEquals("pets/createOrUpdatePetForm", result);
    }

    @Test
    void testProcessCreationForm() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        when(bindingResult.hasErrors()).thenReturn(false);
        String result = petController.processCreationForm(owner, pet, bindingResult, redirectAttributes);
        assertEquals("redirect:/owners/{ownerId}", result);
    }

    @Test
    void testProcessCreationFormWithErrors() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        when(bindingResult.hasErrors()).thenReturn(true);
        String result = petController.processCreationForm(owner, pet, bindingResult, redirectAttributes);
        assertEquals("pets/createOrUpdatePetForm", result);
    }

    @Test
    void testInitUpdateForm() {
        String result = petController.initUpdateForm();
        assertEquals("pets/createOrUpdatePetForm", result);
    }

    @Test
    void testProcessUpdateForm() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        when(bindingResult.hasErrors()).thenReturn(false);
        String result = petController.processUpdateForm(owner, pet, bindingResult, redirectAttributes);
        assertEquals("redirect:/owners/{ownerId}", result);
    }

    @Test
    void testProcessUpdateFormWithErrors() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        when(bindingResult.hasErrors()).thenReturn(true);
        String result = petController.processUpdateForm(owner, pet, bindingResult, redirectAttributes);
        assertEquals("pets/createOrUpdatePetForm", result);
    }

    @Test
    void testFindOwner() {
        int ownerId = 1;
        Owner owner = new Owner();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));
        Owner result = petController.findOwner(ownerId);
        assertEquals(owner, result);
    }

    @Test
    void testFindPet() {
        int ownerId = 1;
        int petId = 1;
        Owner owner = new Owner();
        Pet pet = new Pet();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));
        when(owner.getPet(petId)).thenReturn(pet);
        Pet result = petController.findPet(ownerId, petId);
        assertEquals(pet, result);
    }

    @Test
    void testPopulatePetTypes() {
        Collection<PetType> petTypes = petController.populatePetTypes();
        assertNotNull(petTypes);
    }
}