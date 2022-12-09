//Katherine Watkins
//SDEV 301
//10/04/2022
package accessibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccessibilityTestTest {
//    two test objects because some set tests were skewing get tests by running first
    private static AccessibilityTest testOSubject = new AccessibilityTest("Category", "Google", "Wave", "SortSite", "ASLint", "Description");
    private static AccessibilityTest testOSubject2 = new AccessibilityTest("Category", "Google", "Wave", "SortSite", "ASLint", "Description");

    @Test
    void getCategory() {
        assertEquals("Category", testOSubject.getCategory());
    }

    @Test
    void setCategory() {
        testOSubject2.setCategory("New Category");
        assertEquals("New Category", testOSubject2.getCategory());
    }

    @Test
    void getGoogle() {
        assertEquals("Google", testOSubject.getGoogle());
    }

    @Test
    void setGoogle() {
        testOSubject2.setGoogle("Google test");
        assertEquals("Google test", testOSubject2.getGoogle());
    }

    @Test
    void getWave() {
        assertEquals("Wave", testOSubject.getWave());
    }

    @Test
    void setWave() {
        testOSubject2.setWave("Wave test");
        assertEquals("Wave test", testOSubject2.getWave());
    }

    @Test
    void getSortSite() {
        assertEquals("SortSite", testOSubject.getSortSite());
    }

    @Test
    void setSortSite() {
        testOSubject2.setSortSite("SortSite test");
        assertEquals("SortSite test", testOSubject2.getSortSite());
    }

    @Test
    void getASLint() {
        assertEquals("ASLint", testOSubject.getASLint());
    }

    @Test
    void setASLint() {
        testOSubject2.setASLint("ASLint test");
        assertEquals("ASLint test", testOSubject2.getASLint());
    }

    @Test
    void getDescription() {
        assertEquals("Description", testOSubject.getDescription());
    }

    @Test
    void setDescription() {
        testOSubject2.setDescription("Description test");
        assertEquals("Description test", testOSubject2.getDescription());
    }
}