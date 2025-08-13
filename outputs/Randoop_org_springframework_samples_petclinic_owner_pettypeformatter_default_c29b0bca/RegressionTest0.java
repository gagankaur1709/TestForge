import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        org.springframework.samples.petclinic.owner.PetTypeRepository petTypeRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petTypeRepository0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType4 = petTypeFormatter1.parse("", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.samples.petclinic.owner.PetTypeRepository.findPetTypes()\" because \"this.types\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.springframework.samples.petclinic.owner.PetTypeRepository petTypeRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petTypeRepository0);
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = petTypeFormatter1.print(petType2, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.samples.petclinic.owner.PetType.getName()\" because \"petType\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.springframework.samples.petclinic.owner.PetTypeRepository petTypeRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petTypeRepository0);
        java.lang.Class<?> wildcardClass2 = petTypeFormatter1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.springframework.samples.petclinic.owner.PetTypeRepository petTypeRepository0 = null;
        org.springframework.samples.petclinic.owner.PetTypeFormatter petTypeFormatter1 = new org.springframework.samples.petclinic.owner.PetTypeFormatter(petTypeRepository0);
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.samples.petclinic.owner.PetType petType4 = petTypeFormatter1.parse("hi!", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.springframework.samples.petclinic.owner.PetTypeRepository.findPetTypes()\" because \"this.types\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

