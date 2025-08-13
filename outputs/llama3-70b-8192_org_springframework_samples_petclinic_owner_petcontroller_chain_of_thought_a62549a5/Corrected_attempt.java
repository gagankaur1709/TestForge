package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.Collection;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_petcontroller_chain_of_thought_a62549a5 {

    @InjectMocks
    private PetController petController;

    @Mock
    private OwnerRepository owners;

    @Mock
    private PetTypeRepository types;

    @Test
    void testPopulatePetTypes() {
        Collection<PetType> petTypes = petController.populatePetTypes();
        verify(types).findPetTypes();
    }

    @Test
    void testFindOwner() {
        int ownerId = 1;
        Owner owner = new Owner();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));
        assertEquals(owner, petController.findOwner(ownerId));
        verify(owners).findById(ownerId);
    }

    @Test
    void testFindPet() {
        int ownerId = 1;
        Integer petId = 2;
        Owner owner = mock(Owner.class);
        Pet pet = new Pet();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));
        when(owner.getPet(petId)).thenReturn(pet);
        assertEquals(pet, petController.findPet(ownerId, petId));
        verify(owners).findById(ownerId);
        verify(owner).getPet(petId);
    }

    @Test
    void testInitCreationForm() {
        Owner owner = new Owner();
        ModelMap model = new ModelMap();
        assertEquals("pets/createOrUpdatePetForm", petController.initCreationForm(owner, model));
    }

    @Test
    void testProcessCreationForm() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(false);
        assertEquals("redirect:/owners/{ownerId}", petController.processCreationForm(owner, pet, result, redirectAttributes));
        verify(owners).save(owner);
        verify(redirectAttributes).addFlashAttribute("message", "New Pet has been Added");
    }

    @Test
    void testProcessCreationForm_withErrors() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(true);
        assertEquals("pets/createOrUpdatePetForm", petController.processCreationForm(owner, pet, result, redirectAttributes));
    }

    @Test
    void testInitUpdateForm() {
        assertEquals("pets/createOrUpdatePetForm", petController.initUpdateForm());
    }

    @Test
    void testProcessUpdateForm() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(false);
        assertEquals("redirect:/owners/{ownerId}", petController.processUpdateForm(owner, pet, result, redirectAttributes));
        verify(owners).save(owner);
        verify(redirectAttributes).addFlashAttribute("message", "Pet details has been edited");
    }

    @Test
    void testProcessUpdateForm_withErrors() {
        Owner owner = new Owner();
        Pet pet = new Pet();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(true);
        assertEquals("pets/createOrUpdatePetForm", petController.processUpdateForm(owner, pet, result, redirectAttributes));
    }
}