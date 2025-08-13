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

public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_visitcontroller_role_playing_ab433c79 {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private VisitController visitController;

    @Test
    void shouldSetDisallowedFields_whenInitBinderIsCalled() {
        // Arrange
        WebDataBinder dataBinder = mock(WebDataBinder.class);

        // Act
        visitController.setAllowedFields(dataBinder);

        // Assert
        verify(dataBinder).setDisallowedFields("id");
    }

    @Test
    void shouldReturnVisit_whenLoadPetWithVisitIsCalled() {
        // Arrange
        int ownerId = 1;
        int petId = 1;
        Map<String, Object> model = mock(Map.class);
        Owner owner = mock(Owner.class);
        Pet pet = mock(Pet.class);
        Visit visit = new Visit();

        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));
        when(owner.getPet(petId)).thenReturn(pet);

        // Act
        Visit result = visitController.loadPetWithVisit(ownerId, petId, model);

        // Assert
        assertEquals(visit, result);
        verify(model).put("pet", pet);
        verify(model).put("owner", owner);
    }

    @Test
    void shouldReturnInitNewVisitForm_whenGetMappingIsCalled() {
        // Arrange

        // Act
        String result = visitController.initNewVisitForm();

        // Assert
        assertEquals("pets/createOrUpdateVisitForm", result);
    }

    @Test
    void shouldReturnRedirect_whenPostMappingIsCalledWithValidVisit() {
        // Arrange
        Owner owner = mock(Owner.class);
        int petId = 1;
        Visit visit = new Visit();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);

        when(result.hasErrors()).thenReturn(false);

        // Act
        String redirect = visitController.processNewVisitForm(owner, petId, visit, result, redirectAttributes);

        // Assert
        assertEquals("redirect:/owners/{ownerId}", redirect);
        verify(owner).addVisit(petId, visit);
        verify(owners).save(owner);
        verify(redirectAttributes).addFlashAttribute("message", "Your visit has been booked");
    }

    @Test
    void shouldReturnCreateOrUpdateVisitForm_whenPostMappingIsCalledWithInvalidVisit() {
        // Arrange
        Owner owner = mock(Owner.class);
        int petId = 1;
        Visit visit = new Visit();
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);

        when(result.hasErrors()).thenReturn(true);

        // Act
        String form = visitController.processNewVisitForm(owner, petId, visit, result, redirectAttributes);

        // Assert
        assertEquals("pets/createOrUpdateVisitForm", form);
    }
}