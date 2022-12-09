package accessibility;

public class main {
    public static void main(String[] args) {

        AccessibilityResults a = new AccessibilityResults("src/accessibility/a11yCheckersResults.txt");
        System.out.println(a.numTests());                         //returns 142
        System.out.println("----------");
        a.showTestResults("Colour"); //returns 5 tests
        System.out.println("----------");
        a.showByCategory("keyboard");          //returns 16 tests
        System.out.println("----------");
        a.showAllFailed();                     //returns 51 tests
        System.out.println("----------");
        a.numPass("lint","htm"); //returns 2
    }

}
