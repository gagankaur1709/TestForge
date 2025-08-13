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
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        java.lang.Class<?> wildcardClass1 = petValidator0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.validation.Errors errors2 = petValidator0.validateObject((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Long cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Long is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.samples.petclinic.owner.PetValidator petValidator1 = new org.springframework.samples.petclinic.owner.PetValidator();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.validation.Errors errors2 = petValidator0.validateObject((java.lang.Object) petValidator1);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class org.springframework.samples.petclinic.owner.PetValidator cannot be cast to class org.springframework.samples.petclinic.owner.Pet (org.springframework.samples.petclinic.owner.PetValidator and org.springframework.samples.petclinic.owner.Pet are in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.validation.Errors errors2 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((java.lang.Object) (byte) 1, errors2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Byte cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Byte is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.validation.Errors errors2 = petValidator0.validateObject((java.lang.Object) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Float cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Float is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test7");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        org.springframework.validation.Errors errors2 = null;
        // The following exception was thrown during execution in test generation
        try {
            petValidator0.validate((java.lang.Object) 10.0d, errors2);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.lang.Double cannot be cast to class org.springframework.samples.petclinic.owner.Pet (java.lang.Double is in module java.base of loader 'bootstrap'; org.springframework.samples.petclinic.owner.Pet is in unnamed module of loader 'app')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test8");
        org.springframework.samples.petclinic.owner.PetValidator petValidator0 = new org.springframework.samples.petclinic.owner.PetValidator();
        java.lang.Object obj1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.springframework.validation.Errors errors2 = petValidator0.validateObject(obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Target must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

