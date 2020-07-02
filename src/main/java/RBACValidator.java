import java.util.*;

public class RBACValidator {

    public static void main (String args[]) {

        HCARole hcaRole = new HCARole();
        TestHCAScreenElements testHCAScreenElements = new TestHCAScreenElements();

        System.out.println("\n\n Untranslated Screen Elements: \n");
        testHCAScreenElements.display();

        System.out.println("\n\n Translated Screen Elements: \n"); 
        FTMConstants ftmConstants = new FTMConstants();
        List<String> translatedList = ftmConstants.convertScreenElementsWithIdealValues(testHCAScreenElements.getElements());
        for(int i=0; i<translatedList.size(); i++) {
            System.out.print(translatedList.get(i) + ", ");
        }
        System.out.println("\n \n DB Elements: \n"); 
        hcaRole.display();

        /*boolean comparisonResultHCA = ComparisonUtils.compareScreenElementsWithIdealRole(FTMConstants.convertScreenElementsWithIdealValues(testHCAScreenElements.getElements()), hcaRole.getElements());
        if(comparisonResultHCA)
            System.out.println("HCA TEST - PASS");
        else
            System.out.println("HCA TEST - FAIL");

        HSCRole hscRole = new HSCRole();
        TestHSCScreenElements testHSCScreenElements = new TestHSCScreenElements();

        boolean comparisonResultHSC = ComparisonUtils.compareScreenElementsWithIdealRole(FTMConstants.convertScreenElementsWithIdealValues(testHSCScreenElements.getElements()), hscRole.getElements());
        if(comparisonResultHSC)
            System.out.println("HSC TEST - PASS");
        else
            System.out.println("HSC TEST - FAIL");*/
    }
}
