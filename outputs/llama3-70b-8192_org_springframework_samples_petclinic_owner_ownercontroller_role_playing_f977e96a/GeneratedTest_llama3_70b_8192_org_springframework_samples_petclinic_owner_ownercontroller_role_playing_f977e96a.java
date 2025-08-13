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

@ExtendWith(MockitoExtension.class)
class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_ownercontroller_role_playing_f977e96a {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private OwnerController ownerController;

    @Test
    void shouldReturnOwner_whenValidIdIsProvided() {
        // Arrange
        Integer ownerId = 1;
        Owner owner = new Owner();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));

        // Act
        Owner result = ownerController.findOwner(ownerId);

        // Assert
        assertEquals(owner, result);
    }

    @Test
    void shouldThrowIllegalArgumentException_whenOwnerIdIsNotValid() {
        // Arrange
        Integer ownerId = 1;
        when(owners.findById(ownerId)).thenReturn(Optional.empty());

        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> ownerController.findOwner(ownerId));
    }

    @Test
    void shouldReturnViewName_whenInitCreationFormIsCalled() {
        // Arrange

        // Act
        String result = ownerController.initCreationForm();

        // Assert
        assertEquals("owners/createOrUpdateOwnerForm", result);
    }

    @Test
    void shouldReturnViewName_whenProcessCreationFormIsValid() {
        // Arrange
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(false);

        // Act
        String viewName = ownerController.processCreationForm(owner, result, redirectAttributes);

        // Assert
        assertEquals("redirect:/owners/" + owner.getId(), viewName);
    }

    @Test
    void shouldReturnViewName_whenProcessCreationFormIsInvalid() {
        // Arrange
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(true);

        // Act
        String viewName = ownerController.processCreationForm(owner, result, redirectAttributes);

        // Assert
        assertEquals("owners/createOrUpdateOwnerForm", viewName);
    }

    @Test
    void shouldReturnViewName_whenInitFindFormIsCalled() {
        // Arrange

        // Act
        String result = ownerController.initFindForm();

        // Assert
        assertEquals("owners/findOwners", result);
    }

    @Test
    void shouldReturnViewName_whenProcessFindFormIsValid() {
        // Arrange
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        Model model = mock(Model.class);
        when(result.hasErrors()).thenReturn(false);

        // Act
        String viewName = ownerController.processFindForm(1, owner, result, model);

        // Assert
        assertEquals("owners/ownersList", viewName);
    }

    @Test
    void shouldReturnViewName_whenProcessFindFormIsInvalid() {
        // Arrange
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        Model model = mock(Model.class);
        when(result.hasErrors()).thenReturn(true);

        // Act
        String viewName = ownerController.processFindForm(1, owner, result, model);

        // Assert
        assertEquals("owners/findOwners", viewName);
    }

    @Test
    void shouldReturnViewName_whenInitUpdateOwnerFormIsCalled() {
        // Arrange

        // Act
        String result = ownerController.initUpdateOwnerForm();

        // Assert
        assertEquals("owners/createOrUpdateOwnerForm", result);
    }

    @Test
    void shouldReturnViewName_whenProcessUpdateOwnerFormIsValid() {
        // Arrange
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(false);

        // Act
        String viewName = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);

        // Assert
        assertEquals("redirect:/owners/" + owner.getId(), viewName);
    }

    @Test
    void shouldReturnViewName_whenProcessUpdateOwnerFormIsInvalid() {
        // Arrange
        Owner owner = new Owner();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(true);

        // Act
        String viewName = ownerController.processUpdateOwnerForm(owner, result, 1, redirectAttributes);

        // Assert
        assertEquals("owners/createOrUpdateOwnerForm", viewName);
    }

    @Test
    void shouldReturnModelAndView_whenShowOwnerIsCalled() {
        // Arrange
        int ownerId = 1;
        Owner owner = new Owner();
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));

        // Act
        ModelAndView modelAndView = ownerController.showOwner(ownerId);

        // Assert
        assertEquals("owners/ownerDetails", modelAndView.getViewName());
        assertEquals(owner, modelAndView.getModel());
    }
}