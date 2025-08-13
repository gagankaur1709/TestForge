package org.springframework.samples.petclinic.owner;

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
public class GeneratedTest_llama3_70b_8192_org_springframework_samples_petclinic_owner_pettypeformatter_chain_of_thought_bb76d001 {

    @Mock
    private PetTypeRepository types;

    @InjectMocks
    private PetTypeFormatter petTypeFormatter;

    @Test
    void testPrint() {
        PetType petType = new PetType();
        petType.setName("TestName");
        Locale locale = Locale.US;

        String result = petTypeFormatter.print(petType, locale);

        assertEquals("TestName", result);
    }

    @Test
    void testParse() throws ParseException {
        PetType petType = new PetType();
        petType.setName("TestName");
        Collection<PetType> findPetTypes = java.util.Collections.singleton(petType);
        when(types.findPetTypes()).thenReturn(findPetTypes);
        String text = "TestName";
        Locale locale = Locale.US;

        PetType result = petTypeFormatter.parse(text, locale);

        assertEquals(petType, result);
    }

    @Test
    void testParse_ThrowsParseException() {
        when(types.findPetTypes()).thenReturn(java.util.Collections.emptyList());
        String text = "TestName";
        Locale locale = Locale.US;

        ParseException exception = assertThrows(ParseException.class, () -> petTypeFormatter.parse(text, locale));
        assertEquals("type not found: TestName", exception.getMessage());
    }
}