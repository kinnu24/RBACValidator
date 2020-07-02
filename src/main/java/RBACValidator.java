import java.lang.reflect.Array;
import java.util.*;

public class RBACValidator {

    public static void main (String args[]) {

        HCARole hcaRole = new HCARole();
        TestHCAScreenElements testHCAScreenElements = new TestHCAScreenElements();

        boolean comparisonResultHCA = ComparisonUtils.compareScreenElementsWithIdealRole(FTMConstants.convertScreenElementsWithIdealValues(testHCAScreenElements.getElements()), hcaRole.getElements());
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
            System.out.println("HSC TEST - FAIL");
    }
}
