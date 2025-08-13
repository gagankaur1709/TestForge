package org.springframework.samples.petclinic.owner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_pettypeformatter_guided_tree_of_thought_be42367d {

    @Mock
    private PetTypeRepository types;

    @InjectMocks
    private PetTypeFormatter petTypeFormatter;

    @ExtendWith(MockitoExtension.class)

    @Test
    void testPrint() {
        PetType petType = new PetType();
        petType.setName("Test Pet Type");
        String result = petTypeFormatter.print(petType, Locale.US);
        assertEquals("Test Pet Type", result);
    }

    @Test
    void testParse_HappyPath() throws ParseException {
        PetType petType = new PetType();
        petType.setName("Test Pet Type");
        given(types.findPetTypes()).willReturn(List.of(petType));
        PetType result = petTypeFormatter.parse("Test Pet Type", Locale.US);
        assertEquals(petType, result);
    }

    @Test
    void testParse_PetTypeNotFound() {
        given(types.findPetTypes()).willReturn(List.of());
        ParseException exception = assertThrows(ParseException.class, () -> petTypeFormatter.parse("Test Pet Type", Locale.US));
        assertEquals("type not found: Test Pet Type", exception.getMessage());
    }
}