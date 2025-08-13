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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass3 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Class<?> wildcardClass3 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        java.lang.Class<?> wildcardClass4 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType5.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        boolean boolean6 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = petType5.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = petType2.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType3.setId((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.lang.String str6 = pet0.getName();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = petType6.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        java.lang.String str13 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.String str8 = pet0.toString();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int11 = petType10.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = petType3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(petType3);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = petType11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = petType8.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        pet0.setName("hi!");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        java.lang.String str8 = pet0.getName();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        boolean boolean7 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = localDate1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        boolean boolean8 = pet0.isNew();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = petType8.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.lang.String str9 = pet0.getName();
        pet0.setName("");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(petType9);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        org.springframework.samples.petclinic.owner.PetType petType13 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int14 = petType13.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        java.lang.Class<?> wildcardClass4 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        pet0.setName("hi!");
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        pet0.setName("hi!");
        java.lang.Class<?> wildcardClass15 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        boolean boolean7 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        pet0.setName("hi!");
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.Class<?> wildcardClass6 = visitCollection5.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        pet0.setId((java.lang.Integer) 10);
        java.lang.String str6 = pet0.getName();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = localDate5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 10);
        java.lang.String str7 = pet0.toString();
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.Class<?> wildcardClass7 = visitCollection6.getClass();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        java.time.LocalDate localDate16 = null;
        pet0.setBirthDate(localDate16);
        java.time.LocalDate localDate18 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType19 = null;
        pet0.setType(petType19);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean11 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.Class<?> wildcardClass6 = visitCollection5.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Integer int9 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        boolean boolean9 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.lang.Integer int12 = pet0.getId();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.Class<?> wildcardClass11 = visitCollection10.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        pet0.setId((java.lang.Integer) 10);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.lang.String str7 = pet0.toString();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = petType2.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType9.setName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(petType9);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.Class<?> wildcardClass7 = visitCollection6.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        java.lang.Integer int9 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit13 = null;
        pet0.addVisit(visit13);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 1);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(petType12);
        org.junit.Assert.assertNotNull(visitCollection15);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        boolean boolean7 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = petType5.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(petType5);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        pet0.setName("");
        pet0.setId((java.lang.Integer) (-1));
        pet0.setId((java.lang.Integer) 100);
        java.lang.String str11 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        boolean boolean9 = pet0.isNew();
        java.lang.Integer int10 = pet0.getId();
        boolean boolean11 = pet0.isNew();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        boolean boolean7 = pet0.isNew();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        boolean boolean6 = pet0.isNew();
        pet0.setId((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        boolean boolean4 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        boolean boolean4 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = petType7.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(petType7);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        pet0.setName("hi!");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.String str6 = pet0.getName();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        java.lang.Class<?> wildcardClass13 = visitCollection12.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNotNull(visitCollection12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        java.time.LocalDate localDate16 = null;
        pet0.setBirthDate(localDate16);
        java.lang.String str18 = pet0.toString();
        java.lang.Integer int19 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType20 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(petType20);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int12 = petType11.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        boolean boolean10 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = petType9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(petType9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        boolean boolean7 = pet0.isNew();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        java.lang.String str14 = pet0.toString();
        java.lang.Class<?> wildcardClass15 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        boolean boolean6 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        java.time.LocalDate localDate16 = null;
        pet0.setBirthDate(localDate16);
        java.time.LocalDate localDate18 = pet0.getBirthDate();
        pet0.setName("hi!");
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.lang.String str7 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        boolean boolean8 = pet0.isNew();
        pet0.setId((java.lang.Integer) 1);
        java.lang.String str11 = pet0.getName();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        pet0.setName("");
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.String str1 = pet0.getName();
        java.lang.String str2 = pet0.getName();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(visitCollection5);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        java.time.LocalDate localDate16 = null;
        pet0.setBirthDate(localDate16);
        java.lang.String str18 = pet0.toString();
        java.lang.Class<?> wildcardClass19 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        java.lang.Integer int9 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        java.time.LocalDate localDate13 = null;
        pet0.setBirthDate(localDate13);
        java.lang.String str15 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(petType12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.Class<?> wildcardClass7 = visitCollection6.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("");
        java.lang.String str12 = pet0.getName();
        java.lang.Integer int13 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(petType9);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit2 = null;
        pet0.addVisit(visit2);
        java.lang.String str4 = pet0.toString();
        java.lang.String str5 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit12 = null;
        pet0.addVisit(visit12);
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = petType14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(petType14);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        pet0.setName("");
        pet0.setId((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet0.setType(petType12);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection14 = pet0.getVisits();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(visitCollection14);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        pet0.setId((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet0.setType(petType11);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.String str8 = pet0.toString();
        java.lang.Integer int9 = pet0.getId();
        pet0.setName("");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        pet0.setName("");
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(visitCollection7);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = petType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        java.lang.Integer int10 = pet0.getId();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        java.lang.String str8 = pet0.toString();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType9.setId((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType9);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection11 = pet0.getVisits();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNotNull(visitCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType6.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.String str6 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(petType7);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = petType8.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        boolean boolean10 = pet0.isNew();
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        boolean boolean10 = pet0.isNew();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        boolean boolean9 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.lang.Integer int12 = pet0.getId();
        java.time.LocalDate localDate13 = null;
        pet0.setBirthDate(localDate13);
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate17 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        boolean boolean8 = pet0.isNew();
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean3 = pet0.isNew();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        java.lang.Integer int5 = pet0.getId();
        boolean boolean6 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.String str6 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(petType7);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.lang.Integer int7 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Class<?> wildcardClass9 = visitCollection8.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = petType10.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        boolean boolean8 = pet0.isNew();
        pet0.setName("");
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str13 = pet0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        org.junit.Assert.assertNull(petType3);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.Integer int1 = pet0.getId();
        java.time.LocalDate localDate2 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.lang.Integer int5 = pet0.getId();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(localDate2);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        java.lang.String str13 = pet0.toString();
        java.lang.String str14 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean11 = pet0.isNew();
        pet0.setName("hi!");
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        boolean boolean9 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.lang.Integer int12 = pet0.getId();
        boolean boolean13 = pet0.isNew();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        java.lang.String str12 = pet0.getName();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        pet0.setId((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        boolean boolean9 = pet0.isNew();
        java.lang.Integer int10 = pet0.getId();
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType5.setName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        java.lang.String str13 = pet0.getName();
        boolean boolean14 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass17 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        pet0.setName("");
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        java.lang.Integer int10 = pet0.getId();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        java.lang.String str16 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType17 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNull(petType17);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit2 = null;
        pet0.addVisit(visit2);
        java.lang.Integer int4 = pet0.getId();
        pet0.setName("");
        boolean boolean7 = pet0.isNew();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        pet0.setName("hi!");
        java.lang.Integer int12 = pet0.getId();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("");
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean3 = pet0.isNew();
        java.lang.String str4 = pet0.getName();
        java.lang.String str5 = pet0.toString();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection11 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit12 = null;
        pet0.addVisit(visit12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNotNull(visitCollection11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = petType5.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.Class<?> wildcardClass7 = visitCollection6.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType12.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNull(petType12);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        java.time.LocalDate localDate16 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection17 = pet0.getVisits();
        java.lang.Class<?> wildcardClass18 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNotNull(visitCollection17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        java.lang.Integer int5 = pet0.getId();
        boolean boolean6 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(visitCollection7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        pet0.setName("hi!");
        java.lang.String str7 = pet0.toString();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = localDate9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        pet0.setId((java.lang.Integer) 0);
        pet0.setId((java.lang.Integer) 0);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = visitCollection7.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str12 = pet0.toString();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        java.lang.String str13 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        java.lang.String str8 = pet0.getName();
        java.lang.Integer int9 = pet0.getId();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.String str11 = pet0.getName();
        java.lang.String str12 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.lang.String str10 = pet0.getName();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        pet0.setName("");
        pet0.setId((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        pet0.setName("hi!");
        java.lang.Integer int9 = pet0.getId();
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.Integer int1 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType2 = null;
        pet0.setType(petType2);
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.lang.Integer int7 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(visitCollection8);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean3 = pet0.isNew();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.lang.String str6 = pet0.toString();
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.Integer int11 = pet0.getId();
        java.lang.String str12 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(visitCollection13);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection6);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.lang.String str10 = pet0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNotNull(visitCollection12);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.lang.Integer int10 = pet0.getId();
        java.lang.String str11 = pet0.getName();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean11 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType13 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(petType12);
        org.junit.Assert.assertNull(petType13);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.lang.String str10 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        boolean boolean4 = pet0.isNew();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        boolean boolean6 = pet0.isNew();
        java.lang.String str7 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.junit.Assert.assertNotNull(visitCollection7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.lang.String str8 = pet0.toString();
        java.lang.Integer int9 = pet0.getId();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        java.lang.Integer int8 = pet0.getId();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        pet0.setName("");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = petType6.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        java.lang.Integer int6 = pet0.getId();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(visitCollection8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.lang.String str11 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        java.lang.Integer int13 = pet0.getId();
        java.time.LocalDate localDate14 = pet0.getBirthDate();
        java.time.LocalDate localDate15 = null;
        pet0.setBirthDate(localDate15);
        org.springframework.samples.petclinic.owner.Visit visit17 = null;
        pet0.addVisit(visit17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNotNull(visitCollection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = petType6.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        boolean boolean7 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        boolean boolean9 = pet0.isNew();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str12 = pet0.getName();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = petType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(petType4);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit12 = null;
        pet0.addVisit(visit12);
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet0.setType(petType14);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        org.junit.Assert.assertNull(petType5);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int9 = petType8.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.lang.String str8 = pet0.getName();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        pet0.setName("hi!");
        java.lang.String str6 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        boolean boolean12 = pet0.isNew();
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        pet0.setName("hi!");
        java.lang.String str7 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean12 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit13 = null;
        pet0.addVisit(visit13);
        java.time.LocalDate localDate15 = pet0.getBirthDate();
        java.lang.Integer int16 = pet0.getId();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.String str1 = pet0.getName();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType6.setName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        pet0.setName("hi!");
        java.lang.String str6 = pet0.getName();
        pet0.setId((java.lang.Integer) 0);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(visitCollection9);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        java.lang.String str6 = pet0.toString();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet0.setType(petType12);
        java.time.LocalDate localDate14 = pet0.getBirthDate();
        java.time.LocalDate localDate15 = null;
        pet0.setBirthDate(localDate15);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        boolean boolean8 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(visitCollection9);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType3.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(petType3);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        boolean boolean4 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = visitCollection7.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.Integer int8 = pet0.getId();
        java.lang.String str9 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(visitCollection12);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        java.lang.Integer int10 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.lang.String str12 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet0.setType(petType13);
        java.lang.Integer int15 = pet0.getId();
        java.time.LocalDate localDate16 = null;
        pet0.setBirthDate(localDate16);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        boolean boolean6 = pet0.isNew();
        pet0.setName("");
        java.lang.String str9 = pet0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        boolean boolean8 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        boolean boolean10 = pet0.isNew();
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection3 = pet0.getVisits();
        java.lang.Integer int4 = pet0.getId();
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(petType7);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = petType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(petType9);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.String str1 = pet0.getName();
        java.lang.String str2 = pet0.getName();
        pet0.setName("");
        boolean boolean5 = pet0.isNew();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        org.springframework.samples.petclinic.owner.PetType petType13 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType13.setId((java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType13);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        pet0.setId((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.lang.String str12 = pet0.getName();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType5.setName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        boolean boolean9 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.lang.String str12 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.Class<?> wildcardClass4 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        pet0.setName("hi!");
        java.lang.String str7 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        pet0.setName("");
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        boolean boolean4 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        pet0.setName("");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("");
        pet0.setId((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        java.lang.Integer int8 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        boolean boolean9 = pet0.isNew();
        java.lang.Integer int10 = pet0.getId();
        java.lang.Integer int11 = pet0.getId();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.String str9 = pet0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        pet0.setId((java.lang.Integer) 1);
        pet0.setId((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int10 = petType9.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        pet0.setName("hi!");
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.lang.String str8 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection11 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNotNull(visitCollection11);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        pet0.setId((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        java.lang.Integer int11 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit12 = null;
        pet0.addVisit(visit12);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        pet0.setName("hi!");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.String str6 = pet0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        pet0.setName("");
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        pet0.setId((java.lang.Integer) 1);
        java.lang.String str9 = pet0.getName();
        pet0.setName("");
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        pet0.setId((java.lang.Integer) 10);
        boolean boolean12 = pet0.isNew();
        boolean boolean13 = pet0.isNew();
        java.time.LocalDate localDate14 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        boolean boolean8 = pet0.isNew();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        pet0.setName("hi!");
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        pet0.setName("");
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        pet0.setName("");
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        java.lang.Integer int8 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.lang.String str10 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet0.setType(petType11);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        java.lang.Integer int5 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        boolean boolean3 = pet0.isNew();
        boolean boolean4 = pet0.isNew();
        java.lang.String str5 = pet0.toString();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection3 = pet0.getVisits();
        java.lang.Integer int4 = pet0.getId();
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        pet0.setId((java.lang.Integer) 0);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        pet0.setName("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 100);
        java.lang.String str14 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit15 = null;
        pet0.addVisit(visit15);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        pet0.setName("");
        boolean boolean7 = pet0.isNew();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection3 = pet0.getVisits();
        java.lang.Integer int4 = pet0.getId();
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        pet0.setId((java.lang.Integer) 0);
        java.lang.String str9 = pet0.toString();
        java.lang.String str10 = pet0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.lang.Integer int10 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection11 = pet0.getVisits();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(visitCollection11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        java.lang.Integer int8 = pet0.getId();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 1);
        java.lang.String str12 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        java.lang.String str5 = pet0.getName();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 1);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.Class<?> wildcardClass11 = visitCollection10.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = petType8.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = petType7.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNull(petType7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        java.lang.Integer int8 = pet0.getId();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.lang.String str10 = pet0.getName();
        java.lang.Integer int11 = pet0.getId();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.String str9 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType10.setId((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.Integer int8 = pet0.getId();
        java.lang.String str9 = pet0.getName();
        java.time.LocalDate localDate10 = null;
        pet0.setBirthDate(localDate10);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.String str11 = pet0.getName();
        boolean boolean12 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType13 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = petType13.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(petType13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet0.setType(petType12);
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet0.setType(petType14);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit2 = null;
        pet0.addVisit(visit2);
        java.lang.Integer int4 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.String str1 = pet0.getName();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        boolean boolean7 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(visitCollection10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        java.lang.Integer int9 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(visitCollection10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = visitCollection7.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        pet0.setId((java.lang.Integer) 10);
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        pet0.setName("");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        pet0.setName("hi!");
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        boolean boolean9 = pet0.isNew();
        java.lang.String str10 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(visitCollection13);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.Integer int1 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection2 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet0.getType();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNotNull(visitCollection2);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(petType4);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        java.lang.String str6 = pet0.getName();
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        pet0.setName("");
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.lang.Integer int7 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.lang.Integer int9 = pet0.getId();
        pet0.setName("");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        boolean boolean8 = pet0.isNew();
        pet0.setId((java.lang.Integer) 1);
        java.lang.String str11 = pet0.toString();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType8.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.Integer int9 = pet0.getId();
        java.lang.Integer int10 = pet0.getId();
        java.lang.String str11 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        java.lang.Integer int5 = pet0.getId();
        pet0.setId((java.lang.Integer) 10);
        pet0.setName("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 100);
        boolean boolean14 = pet0.isNew();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        boolean boolean3 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(visitCollection4);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        pet0.setName("");
        boolean boolean6 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        java.lang.String str11 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(petType7);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        java.lang.Integer int8 = pet0.getId();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        pet0.setName("");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        boolean boolean7 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        java.time.LocalDate localDate14 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet0.setType(petType15);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        java.lang.Integer int2 = pet0.getId();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection3 = pet0.getVisits();
        java.lang.Integer int4 = pet0.getId();
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        pet0.setId((java.lang.Integer) 0);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        java.lang.String str10 = pet0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection3);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.String str1 = pet0.getName();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection11 = pet0.getVisits();
        boolean boolean12 = pet0.isNew();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        java.lang.Integer int13 = pet0.getId();
        java.time.LocalDate localDate14 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet0.setType(petType15);
        java.lang.Class<?> wildcardClass17 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNotNull(visitCollection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet0.getVisits();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(petType14);
        org.junit.Assert.assertNotNull(visitCollection15);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNotNull(visitCollection5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(petType7);
        org.junit.Assert.assertNotNull(visitCollection8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        boolean boolean9 = pet0.isNew();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        pet0.setName("");
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet0.setType(petType13);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNotNull(visitCollection15);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        java.lang.String str6 = pet0.getName();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        pet0.setName("hi!");
        java.lang.String str7 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        java.lang.Integer int10 = pet0.getId();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.lang.String str6 = pet0.toString();
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Integer int9 = pet0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        java.lang.Class<?> wildcardClass10 = visitCollection9.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        pet0.setId((java.lang.Integer) (-1));
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        java.lang.String str9 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        java.lang.String str14 = pet0.toString();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType17 = pet0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(petType17);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.Integer int1 = pet0.getId();
        java.time.LocalDate localDate2 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(localDate2);
        org.junit.Assert.assertNotNull(visitCollection5);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet0.setType(petType11);
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.lang.String str6 = pet0.toString();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        boolean boolean4 = pet0.isNew();
        java.lang.String str5 = pet0.toString();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        boolean boolean10 = pet0.isNew();
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        org.springframework.samples.petclinic.owner.Visit visit13 = null;
        pet0.addVisit(visit13);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        pet0.setName("hi!");
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType14.setId((java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(petType14);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str12 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNull(petType14);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        org.springframework.samples.petclinic.owner.Visit visit13 = null;
        pet0.addVisit(visit13);
        java.lang.String str15 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        java.lang.Integer int5 = pet0.getId();
        boolean boolean6 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        pet0.setName("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        boolean boolean6 = pet0.isNew();
        pet0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        boolean boolean6 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.String str8 = pet0.getName();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        pet0.setId((java.lang.Integer) (-1));
        org.springframework.samples.petclinic.owner.Visit visit15 = null;
        pet0.addVisit(visit15);
        java.time.LocalDate localDate17 = null;
        pet0.setBirthDate(localDate17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection8);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        boolean boolean8 = pet0.isNew();
        pet0.setName("");
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        pet0.setId((java.lang.Integer) 0);
        pet0.setId((java.lang.Integer) 10);
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        java.lang.Integer int14 = pet0.getId();
        java.lang.String str15 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        pet0.setName("hi!");
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        boolean boolean8 = pet0.isNew();
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet0.setType(petType11);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        boolean boolean3 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        pet0.setName("");
        java.lang.String str12 = pet0.toString();
        boolean boolean13 = pet0.isNew();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        pet0.setId((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        pet0.setName("");
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        boolean boolean8 = pet0.isNew();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType6.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.lang.String str10 = pet0.getName();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = localDate12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        boolean boolean5 = pet0.isNew();
        boolean boolean6 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = petType12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNull(petType12);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.lang.String str9 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        org.springframework.samples.petclinic.owner.Visit visit12 = null;
        pet0.addVisit(visit12);
        pet0.setId((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass16 = pet0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        java.lang.String str6 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        java.lang.String str8 = pet0.toString();
        boolean boolean9 = pet0.isNew();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.toString();
        java.lang.String str7 = pet0.getName();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        boolean boolean9 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        boolean boolean12 = pet0.isNew();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.lang.String str11 = pet0.getName();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        java.lang.Integer int9 = pet0.getId();
        java.lang.String str10 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        boolean boolean9 = pet0.isNew();
        java.lang.Integer int10 = pet0.getId();
        boolean boolean11 = pet0.isNew();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        java.time.LocalDate localDate15 = null;
        pet0.setBirthDate(localDate15);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(petType14);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        org.springframework.samples.petclinic.owner.Visit visit13 = null;
        pet0.addVisit(visit13);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNotNull(visitCollection10);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        pet0.setId((java.lang.Integer) 10);
        boolean boolean12 = pet0.isNew();
        boolean boolean13 = pet0.isNew();
        boolean boolean14 = pet0.isNew();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.junit.Assert.assertNull(localDate1);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        pet0.setName("hi!");
        pet0.setName("");
        java.time.LocalDate localDate13 = null;
        pet0.setBirthDate(localDate13);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setId((java.lang.Integer) 0);
        java.lang.Integer int6 = pet0.getId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        java.lang.Integer int2 = pet0.getId();
        java.lang.Integer int3 = pet0.getId();
        java.lang.Class<?> wildcardClass4 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(int2);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        boolean boolean9 = pet0.isNew();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        pet0.setName("hi!");
        java.lang.String str7 = pet0.toString();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.String str8 = pet0.getName();
        java.lang.Integer int9 = pet0.getId();
        boolean boolean10 = pet0.isNew();
        pet0.setName("");
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        pet0.setName("hi!");
        java.time.LocalDate localDate14 = null;
        pet0.setBirthDate(localDate14);
        java.time.LocalDate localDate16 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNull(localDate16);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.String str8 = pet0.toString();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        java.time.LocalDate localDate10 = null;
        pet0.setBirthDate(localDate10);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        pet0.setName("");
        java.lang.String str6 = pet0.toString();
        java.lang.Integer int7 = pet0.getId();
        java.lang.Integer int8 = pet0.getId();
        java.lang.String str9 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(visitCollection10);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean3 = pet0.isNew();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        boolean boolean11 = pet0.isNew();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.Integer int11 = pet0.getId();
        java.lang.String str12 = pet0.toString();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.lang.Integer int5 = pet0.getId();
        java.lang.Integer int6 = pet0.getId();
        java.lang.Class<?> wildcardClass7 = pet0.getClass();
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        java.lang.String str14 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet0.setType(petType15);
        java.lang.String str17 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.Class<?> wildcardClass6 = visitCollection5.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        pet0.setId((java.lang.Integer) 10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int8 = petType7.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(petType7);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        java.lang.String str2 = pet0.toString();
        pet0.setName("");
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        boolean boolean8 = pet0.isNew();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.lang.String str11 = pet0.toString();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        java.time.LocalDate localDate14 = null;
        pet0.setBirthDate(localDate14);
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet0.setType(petType16);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        java.lang.String str14 = pet0.toString();
        java.time.LocalDate localDate15 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType16 = pet0.getType();
        java.lang.Class<?> wildcardClass17 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertNull(petType16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        boolean boolean8 = pet0.isNew();
        boolean boolean9 = pet0.isNew();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        pet0.setName("");
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        java.lang.Integer int8 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNotNull(visitCollection10);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNull(petType10);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.lang.String str7 = pet0.toString();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(petType7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        java.lang.String str14 = pet0.toString();
        java.time.LocalDate localDate15 = pet0.getBirthDate();
        pet0.setName("hi!");
        java.lang.Integer int18 = pet0.getId();
        java.lang.String str19 = pet0.getName();
        java.lang.String str20 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean11 = pet0.isNew();
        java.lang.String str12 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Integer int9 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        java.lang.String str14 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass17 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        java.lang.String str8 = pet0.getName();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        java.lang.String str8 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = petType9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(petType9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.String str1 = pet0.getName();
        java.lang.String str2 = pet0.getName();
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.String str8 = pet0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        java.lang.String str14 = pet0.toString();
        pet0.setName("");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean12 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit13 = null;
        pet0.addVisit(visit13);
        java.lang.Class<?> wildcardClass15 = pet0.getClass();
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        pet0.setName("hi!");
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = petType7.isNew();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNull(petType7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        org.springframework.samples.petclinic.owner.PetType petType12 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            petType12.setName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNull(petType12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        java.lang.String str2 = pet0.getName();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.lang.String str10 = pet0.getName();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Integer int9 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        java.lang.String str14 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.Visit visit19 = null;
        pet0.addVisit(visit19);
        org.springframework.samples.petclinic.owner.PetType petType21 = null;
        pet0.setType(petType21);
        org.springframework.samples.petclinic.owner.PetType petType23 = pet0.getType();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(petType23);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        java.lang.Integer int13 = pet0.getId();
        java.time.LocalDate localDate14 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType15 = null;
        pet0.setType(petType15);
        org.springframework.samples.petclinic.owner.PetType petType17 = pet0.getType();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNotNull(visitCollection12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(petType17);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = localDate8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Integer int9 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        java.lang.String str14 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.Visit visit19 = null;
        pet0.addVisit(visit19);
        org.springframework.samples.petclinic.owner.PetType petType21 = null;
        pet0.setType(petType21);
        java.lang.Class<?> wildcardClass23 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = petType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(petType8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        java.lang.String str11 = pet0.getName();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        boolean boolean9 = pet0.isNew();
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        boolean boolean5 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        pet0.setId((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        pet0.setName("");
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        java.lang.String str9 = pet0.toString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        pet0.setName("");
        java.lang.Class<?> wildcardClass5 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.Integer int1 = pet0.getId();
        java.time.LocalDate localDate2 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(localDate2);
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        java.lang.Integer int13 = pet0.getId();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        java.lang.Integer int8 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        java.time.LocalDate localDate14 = null;
        pet0.setBirthDate(localDate14);
        java.lang.String str16 = pet0.getName();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        boolean boolean3 = pet0.isNew();
        java.lang.String str4 = pet0.getName();
        java.lang.String str5 = pet0.toString();
        java.lang.String str6 = pet0.getName();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNotNull(visitCollection8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        pet0.setId((java.lang.Integer) 0);
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.time.LocalDate localDate9 = null;
        pet0.setBirthDate(localDate9);
        boolean boolean11 = pet0.isNew();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.String str1 = pet0.getName();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        boolean boolean7 = pet0.isNew();
        java.lang.Integer int8 = pet0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.lang.String str8 = pet0.getName();
        java.lang.Integer int9 = pet0.getId();
        boolean boolean10 = pet0.isNew();
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        java.lang.String str13 = pet0.getName();
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        pet0.setId((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        pet0.setName("");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.Visit visit12 = null;
        pet0.addVisit(visit12);
        java.time.LocalDate localDate14 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection15 = pet0.getVisits();
        java.lang.Class<?> wildcardClass16 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNotNull(visitCollection15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        java.lang.String str7 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.lang.Integer int10 = pet0.getId();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet0.setType(petType12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setId((java.lang.Integer) (-1));
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(visitCollection8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        pet0.setName("hi!");
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        java.time.LocalDate localDate14 = null;
        pet0.setBirthDate(localDate14);
        java.time.LocalDate localDate16 = pet0.getBirthDate();
        java.lang.Class<?> wildcardClass17 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDate13);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        boolean boolean10 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet0.setType(petType11);
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet0.setType(petType13);
        org.springframework.samples.petclinic.owner.PetType petType15 = pet0.getType();
        java.lang.String str16 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(petType15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        java.lang.String str2 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.lang.String str4 = pet0.getName();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection7 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.Integer int11 = pet0.getId();
        java.lang.String str12 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        java.lang.String str14 = pet0.getName();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNotNull(visitCollection7);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        pet0.setName("hi!");
        java.lang.Integer int6 = pet0.getId();
        java.lang.String str7 = pet0.getName();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        boolean boolean8 = pet0.isNew();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        boolean boolean10 = pet0.isNew();
        java.lang.String str11 = pet0.getName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(visitCollection9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        boolean boolean9 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        java.time.LocalDate localDate12 = pet0.getBirthDate();
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        pet0.setName("");
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.Class<?> wildcardClass11 = visitCollection10.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType8 = null;
        pet0.setType(petType8);
        org.springframework.samples.petclinic.owner.Visit visit10 = null;
        pet0.addVisit(visit10);
        java.lang.String str12 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType13 = pet0.getType();
        boolean boolean14 = pet0.isNew();
        java.time.LocalDate localDate15 = pet0.getBirthDate();
        java.lang.String str16 = pet0.toString();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(petType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        org.springframework.samples.petclinic.owner.PetType petType5 = null;
        pet0.setType(petType5);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection9 = pet0.getVisits();
        org.junit.Assert.assertNotNull(visitCollection9);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        pet0.setName("hi!");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.String str6 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        boolean boolean1 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType2 = pet0.getType();
        pet0.setName("hi!");
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        pet0.setName("hi!");
        java.lang.Integer int8 = pet0.getId();
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(petType2);
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        pet0.setName("hi!");
        java.lang.String str8 = pet0.getName();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        pet0.setId((java.lang.Integer) 1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = petType6.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.lang.Integer int10 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet0.setType(petType11);
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet0.setType(petType13);
        boolean boolean15 = pet0.isNew();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        pet0.setName("");
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        java.lang.String str11 = pet0.getName();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        java.time.LocalDate localDate12 = null;
        pet0.setBirthDate(localDate12);
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        java.time.LocalDate localDate16 = null;
        pet0.setBirthDate(localDate16);
        java.time.LocalDate localDate18 = pet0.getBirthDate();
        pet0.setName("hi!");
        org.springframework.samples.petclinic.owner.PetType petType21 = null;
        pet0.setType(petType21);
        org.springframework.samples.petclinic.owner.PetType petType23 = null;
        pet0.setType(petType23);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(petType11);
        org.junit.Assert.assertNull(localDate18);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(petType7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        boolean boolean7 = pet0.isNew();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        boolean boolean12 = pet0.isNew();
        java.lang.String str13 = pet0.getName();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        pet0.setId((java.lang.Integer) 1);
        java.lang.String str9 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        pet0.setName("");
        java.lang.Class<?> wildcardClass13 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        boolean boolean9 = pet0.isNew();
        pet0.setId((java.lang.Integer) 10);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.toString();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        java.lang.Class<?> wildcardClass6 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = null;
        pet0.setBirthDate(localDate5);
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection11 = pet0.getVisits();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType14 = null;
        pet0.setType(petType14);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(visitCollection11);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        java.lang.String str4 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        pet0.setId((java.lang.Integer) 1);
        boolean boolean9 = pet0.isNew();
        java.lang.Class<?> wildcardClass10 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        java.lang.String str11 = pet0.getName();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        java.time.LocalDate localDate11 = null;
        pet0.setBirthDate(localDate11);
        boolean boolean13 = pet0.isNew();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.Integer int1 = pet0.getId();
        java.time.LocalDate localDate2 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType3 = null;
        pet0.setType(petType3);
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        org.junit.Assert.assertNull(int1);
        org.junit.Assert.assertNull(localDate2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.String str6 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(petType7);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str12 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection13 = pet0.getVisits();
        java.lang.String str14 = pet0.getName();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(visitCollection13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        boolean boolean6 = pet0.isNew();
        boolean boolean7 = pet0.isNew();
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        java.lang.Integer int8 = pet0.getId();
        boolean boolean9 = pet0.isNew();
        java.time.LocalDate localDate10 = pet0.getBirthDate();
        java.lang.Integer int11 = pet0.getId();
        boolean boolean12 = pet0.isNew();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType4 = null;
        pet0.setType(petType4);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertNotNull(visitCollection8);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.time.LocalDate localDate4 = pet0.getBirthDate();
        pet0.setId((java.lang.Integer) 1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(localDate4);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        java.time.LocalDate localDate4 = null;
        pet0.setBirthDate(localDate4);
        pet0.setId((java.lang.Integer) 1);
        pet0.setId((java.lang.Integer) 100);
        boolean boolean10 = pet0.isNew();
        java.lang.Class<?> wildcardClass11 = pet0.getClass();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        java.lang.String str3 = pet0.getName();
        pet0.setId((java.lang.Integer) 10);
        pet0.setName("hi!");
        java.lang.String str8 = pet0.toString();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        pet0.setName("hi!");
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        pet0.setId((java.lang.Integer) (-1));
        pet0.setName("hi!");
        java.lang.String str11 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(visitCollection12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        boolean boolean8 = pet0.isNew();
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        boolean boolean10 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType11 = null;
        pet0.setType(petType11);
        org.springframework.samples.petclinic.owner.PetType petType13 = null;
        pet0.setType(petType13);
        org.springframework.samples.petclinic.owner.PetType petType15 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet0.setType(petType16);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(petType15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.Integer int3 = pet0.getId();
        boolean boolean4 = pet0.isNew();
        java.lang.String str5 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        java.lang.String str7 = pet0.toString();
        pet0.setName("hi!");
        java.lang.String str10 = pet0.toString();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(petType6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        pet0.setName("");
        boolean boolean6 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType9 = null;
        pet0.setType(petType9);
        org.springframework.samples.petclinic.owner.PetType petType11 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = petType11.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(petType7);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNull(petType11);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.lang.String str3 = pet0.toString();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.String str5 = pet0.getName();
        org.springframework.samples.petclinic.owner.Visit visit6 = null;
        pet0.addVisit(visit6);
        java.time.LocalDate localDate8 = pet0.getBirthDate();
        java.time.LocalDate localDate9 = pet0.getBirthDate();
        pet0.setName("");
        pet0.setName("");
        java.lang.Class<?> wildcardClass14 = pet0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        boolean boolean6 = pet0.isNew();
        java.lang.Integer int7 = pet0.getId();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.toString();
        java.lang.Integer int10 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit11 = null;
        pet0.addVisit(visit11);
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setName("");
        java.lang.Integer int3 = pet0.getId();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        java.lang.String str6 = pet0.getName();
        java.time.LocalDate localDate7 = null;
        pet0.setBirthDate(localDate7);
        java.lang.Class<?> wildcardClass9 = pet0.getClass();
        org.junit.Assert.assertNull(int3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection6 = pet0.getVisits();
        java.lang.String str7 = pet0.toString();
        boolean boolean8 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit9 = null;
        pet0.addVisit(visit9);
        pet0.setName("hi!");
        java.time.LocalDate localDate13 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit14 = null;
        pet0.addVisit(visit14);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(visitCollection6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        java.lang.Integer int5 = pet0.getId();
        pet0.setId((java.lang.Integer) 0);
        org.springframework.samples.petclinic.owner.PetType petType8 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.time.LocalDate localDate11 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit12 = null;
        pet0.addVisit(visit12);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection14 = pet0.getVisits();
        java.lang.String str15 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType16 = null;
        pet0.setType(petType16);
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(petType8);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNotNull(visitCollection14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.String str11 = pet0.getName();
        boolean boolean12 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType13 = pet0.getType();
        java.lang.String str14 = pet0.toString();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(petType13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.time.LocalDate localDate5 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.PetType petType6 = pet0.getType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int7 = petType6.getId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(petType6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        pet0.setId((java.lang.Integer) 100);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        java.lang.String str6 = pet0.getName();
        org.springframework.samples.petclinic.owner.PetType petType7 = pet0.getType();
        java.lang.Class<?> wildcardClass8 = pet0.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(petType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit4 = null;
        pet0.addVisit(visit4);
        boolean boolean6 = pet0.isNew();
        java.time.LocalDate localDate7 = pet0.getBirthDate();
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.toString();
        org.springframework.samples.petclinic.owner.PetType petType5 = pet0.getType();
        java.lang.Integer int6 = pet0.getId();
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        pet0.setName("");
        java.lang.String str11 = pet0.getName();
        java.lang.Class<?> wildcardClass12 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        org.springframework.samples.petclinic.owner.PetType petType10 = pet0.getType();
        boolean boolean11 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType12 = null;
        pet0.setType(petType12);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(petType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        org.springframework.samples.petclinic.owner.Visit visit1 = null;
        pet0.addVisit(visit1);
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.lang.String str5 = pet0.toString();
        java.time.LocalDate localDate6 = pet0.getBirthDate();
        org.springframework.samples.petclinic.owner.Visit visit7 = null;
        pet0.addVisit(visit7);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        boolean boolean9 = pet0.isNew();
        java.lang.String str10 = pet0.getName();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = pet0.getBirthDate();
        boolean boolean2 = pet0.isNew();
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        pet0.setId((java.lang.Integer) 1);
        java.time.LocalDate localDate6 = null;
        pet0.setBirthDate(localDate6);
        org.springframework.samples.petclinic.owner.Visit visit8 = null;
        pet0.addVisit(visit8);
        pet0.setName("hi!");
        org.junit.Assert.assertNull(localDate1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNull(petType3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = null;
        pet0.setBirthDate(localDate3);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection5 = pet0.getVisits();
        org.springframework.samples.petclinic.owner.PetType petType6 = null;
        pet0.setType(petType6);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection8 = pet0.getVisits();
        java.lang.Class<?> wildcardClass9 = visitCollection8.getClass();
        org.junit.Assert.assertNotNull(visitCollection5);
        org.junit.Assert.assertNotNull(visitCollection8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.time.LocalDate localDate1 = null;
        pet0.setBirthDate(localDate1);
        org.springframework.samples.petclinic.owner.PetType petType3 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType4 = pet0.getType();
        org.springframework.samples.petclinic.owner.Visit visit5 = null;
        pet0.addVisit(visit5);
        java.lang.String str7 = pet0.getName();
        org.junit.Assert.assertNull(petType3);
        org.junit.Assert.assertNull(petType4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        pet0.setId((java.lang.Integer) 100);
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        pet0.setName("hi!");
        pet0.setId((java.lang.Integer) 1);
        org.springframework.samples.petclinic.owner.PetType petType14 = pet0.getType();
        java.time.LocalDate localDate15 = null;
        pet0.setBirthDate(localDate15);
        org.springframework.samples.petclinic.owner.Visit visit17 = null;
        pet0.addVisit(visit17);
        pet0.setName("hi!");
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(petType14);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection4 = pet0.getVisits();
        java.lang.Integer int5 = pet0.getId();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.time.LocalDate localDate8 = null;
        pet0.setBirthDate(localDate8);
        pet0.setName("");
        java.lang.String str12 = pet0.getName();
        pet0.setName("");
        java.lang.Class<?> wildcardClass15 = pet0.getClass();
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNotNull(visitCollection4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.time.LocalDate localDate3 = pet0.getBirthDate();
        java.lang.String str4 = pet0.getName();
        pet0.setId((java.lang.Integer) 100);
        org.springframework.samples.petclinic.owner.PetType petType7 = null;
        pet0.setType(petType7);
        org.springframework.samples.petclinic.owner.PetType petType9 = pet0.getType();
        org.springframework.samples.petclinic.owner.PetType petType10 = null;
        pet0.setType(petType10);
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection12 = pet0.getVisits();
        java.lang.String str13 = pet0.getName();
        pet0.setName("");
        org.junit.Assert.assertNull(localDate3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(petType9);
        org.junit.Assert.assertNotNull(visitCollection12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        java.lang.String str1 = pet0.getName();
        java.time.LocalDate localDate2 = null;
        pet0.setBirthDate(localDate2);
        pet0.setName("hi!");
        java.lang.Integer int6 = pet0.getId();
        java.lang.String str7 = pet0.getName();
        java.lang.Integer int8 = pet0.getId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.springframework.samples.petclinic.owner.Pet pet0 = new org.springframework.samples.petclinic.owner.Pet();
        pet0.setId((java.lang.Integer) (-1));
        java.lang.String str3 = pet0.toString();
        java.lang.String str4 = pet0.toString();
        boolean boolean5 = pet0.isNew();
        java.lang.String str6 = pet0.getName();
        boolean boolean7 = pet0.isNew();
        java.lang.String str8 = pet0.toString();
        java.lang.String str9 = pet0.getName();
        java.util.Collection<org.springframework.samples.petclinic.owner.Visit> visitCollection10 = pet0.getVisits();
        java.lang.String str11 = pet0.getName();
        boolean boolean12 = pet0.isNew();
        org.springframework.samples.petclinic.owner.Visit visit13 = null;
        pet0.addVisit(visit13);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(visitCollection10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }
}

