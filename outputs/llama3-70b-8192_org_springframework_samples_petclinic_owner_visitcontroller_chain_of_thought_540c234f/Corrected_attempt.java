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
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_visitcontroller_chain_of_thought_540c234f {

    @Mock
    private OwnerRepository owners;

    @InjectMocks
    private VisitController visitController;

    @Test
    void testSetAllowedFields() {
        WebDataBinder dataBinder = mock(WebDataBinder.class);
        visitController.setAllowedFields(dataBinder);
        verify(dataBinder).setDisallowedFields("id");
    }

    @Test
    void testLoadPetWithVisit() {
        int ownerId = 1;
        int petId = 1;
        Map<String, Object> model = mock(Map.class);
        Owner owner = mock(Owner.class);
        Pet pet = mock(Pet.class);
        when(owners.findById(ownerId)).thenReturn(Optional.of(owner));
        when(owner.getPet(petId)).thenReturn(pet);
        Visit visit = visitController.loadPetWithVisit(ownerId, petId, model);
        assertNotNull(visit);
        verify(model, times(2)).put(anyString(), any());
    }

    @Test
    void testInitNewVisitForm() {
        assertEquals("pets/createOrUpdateVisitForm", visitController.initNewVisitForm());
    }

    @Test
    void testProcessNewVisitFormValid() {
        Owner owner = mock(Owner.class);
        Visit visit = mock(Visit.class);
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(false);
        String resultString = visitController.processNewVisitForm(owner, 1, visit, result, redirectAttributes);
        assertEquals("redirect:/owners/{ownerId}", resultString);
        verify(owner).addVisit(1, visit);
        verify(owners).save(owner);
        verify(redirectAttributes).addFlashAttribute("message", "Your visit has been booked");
    }

    @Test
    void testProcessNewVisitFormInvalid() {
        Owner owner = mock(Owner.class);
        Visit visit = mock(Visit.class);
        BindingResult result = mock(BindingResult.class);
        RedirectAttributes redirectAttributes = mock(RedirectAttributes.class);
        when(result.hasErrors()).thenReturn(true);
        assertEquals("pets/createOrUpdateVisitForm", visitController.processNewVisitForm(owner, 1, visit, result, redirectAttributes));
    }
}