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

@ExtendWith(MockitoExtension.class)
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_pettypeformatter_role_playing_c1b437cd {

    @Mock
    private PetTypeRepository types;

    @InjectMocks
    private PetTypeFormatter petTypeFormatter;

    @Test
    void shouldReturnPetTypeName_whenPrintingPetType() throws Exception {
        // Arrange
        PetType petType = new PetType("Test Pet Type");
        Locale locale = Locale.US;

        // Act
        String result = petTypeFormatter.print(petType, locale);

        // Assert
        assertEquals("Test Pet Type", result);
    }

    @Test
    void shouldReturnParsedPetType_whenValidTextIsProvided() throws Exception {
        // Arrange
        String text = "Test Pet Type";
        Locale locale = Locale.US;
        PetType petType = new PetType(text);
        when(types.findPetTypes()).thenReturn(List.of(petType));

        // Act
        PetType result = petTypeFormatter.parse(text, locale);

        // Assert
        assertEquals(petType, result);
    }

    @Test
    void shouldThrowParseException_whenInvalidTextIsProvided() {
        // Arrange
        String text = "Invalid Pet Type";
        Locale locale = Locale.US;
        when(types.findPetTypes()).thenReturn(List.of());

        // Act and Assert
        ParseException exception = assertThrows(ParseException.class, () -> petTypeFormatter.parse(text, locale));
        assertEquals("type not found: Invalid Pet Type", exception.getMessage());
    }
}