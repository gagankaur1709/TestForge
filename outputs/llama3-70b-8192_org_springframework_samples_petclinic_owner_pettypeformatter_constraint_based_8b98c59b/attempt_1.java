package org.springframework.samples.petclinic.owner;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;
import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;
import static org.mockito.BDDMockito.*;

public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_pettypeformatter_constraint_based_8b98c59b {

    @Mock
    private PetTypeRepository types;

    @Mock
    private PetType petType;

    @InjectMocks
    private PetTypeFormatter formatter;

    @ExtendWith(MockitoExtension.class)

    @Test
    void testPrint() {
        Locale locale = Locale.US;
        String expected = "PetType Name";
        when(petType.getName()).thenReturn(expected);
        String actual = formatter.print(petType, locale);
        assertEquals(expected, actual);
    }

    @Test
    void testParse() throws ParseException {
        Locale locale = Locale.US;
        String text = "PetType Name";
        when(types.findPetTypes()).thenReturn(List.of(petType));
        when(petType.getName()).thenReturn(text);
        PetType actual = formatter.parse(text, locale);
        assertEquals(petType, actual);
    }

    @Test
    void testParse_ThrowsParseException() {
        Locale locale = Locale.US;
        String text = "Unknown PetType";
        when(types.findPetTypes()).thenReturn(List.of());
        ParseException exception = assertThrows(ParseException.class, () -> formatter.parse(text, locale));
        assertEquals("type not found: " + text, exception.getMessage());
    }
}