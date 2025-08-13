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
import java.util.List;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_petcontroller_role_playing_5167ffbc {

    @InjectMocks
    private PetController petController;

    @Mock
    private OwnerRepository owners;

    @Mock
    private PetTypeRepository types;

    @Test
    void shouldReturnOwner_whenValidIdIsProvided() {
        // Arrange
        int ownerId = 1;
        Owner owner = new Owner();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));

        // Act
        Owner result = petController.findOwner(ownerId);

        // Assert
        assertEquals(owner, result);
    }

    @Test
    void shouldThrowIllegalArgumentException_whenOwnerIdIsInvalid() {
        // Arrange
        int ownerId = 1;
        when(owners.findById(ownerId)).thenReturn(Optional.empty());

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> petController.findOwner(ownerId));
    }

    @Test
    void shouldReturnNewPet_whenPetIdIsNull() {
        // Arrange
        int ownerId = 1;
        Owner owner = new Owner();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));

        // Act
        Pet result = petController.findPet(ownerId, null);

        // Assert
        assertNotNull(result);
    }

    @Test
    void shouldReturnPet_whenPetIdIsValid() {
        // Arrange
        int ownerId = 1;
        int petId = 1;
        Owner owner = new Owner();
        Pet pet = new Pet();
        owner.addPet(pet);
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));

        // Act
        Pet result = petController.findPet(ownerId, petId);

        // Assert
        assertEquals(pet, result);
    }

    @Test
    void shouldReturnPetTypes_whenPopulatePetTypesIsCalled() {
        // Arrange
        List<PetType> petTypes = mock(List.class);
        when(types.findPetTypes()).thenReturn(petTypes);

        // Act
        Collection<PetType> result = petController.populatePetTypes();

        // Assert
        assertEquals(petTypes, result);
    }

    @Test
    void shouldInitCreationForm_whenGetMappingIsCalled() {
        // Arrange
        Owner owner = new Owner();
        ModelMap model = new ModelMap();

        // Act
        String result = petController.initCreationForm(owner, model);

        // Assert
        assertEquals("pets/createOrUpdatePetForm", result);
    }

    @Test
    void shouldProcessCreationForm_whenPostMappingIsCalled() {
        // Arrange
        Owner owner = new Owner();
        Pet pet = new Pet();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);

        // Act
        String resultString = petController.processCreationForm(owner, pet, result, redirectAttributes);

        // Assert
        assertEquals("redirect:/owners/{ownerId}", resultString);
    }

    @Test
    void shouldInitUpdateForm_whenGetMappingIsCalled() {
        // Arrange

        // Act
        String result = petController.initUpdateForm();

        // Assert
        assertEquals("pets/createOrUpdatePetForm", result);
    }

    @Test
    void shouldProcessUpdateForm_whenPostMappingIsCalled() {
        // Arrange
        Owner owner = new Owner();
        Pet pet = new Pet();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);

        // Act
        String resultString = petController.processUpdateForm(owner, pet, result, redirectAttributes);

        // Assert
        assertEquals("redirect:/owners/{ownerId}", resultString);
    }
}