import java.util.ArrayList;
import java.util.List;

public class TestHCAScreenElements {

    public static List<String> HCARoleScreenDisplay = new ArrayList<String>();

    public TestHCAScreenElements() {
        /* Replace with JSON and XPATH */
        HCARoleScreenDisplay.add(FTMConstants.getGroupIdScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getGroupNameScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getServiceLevelScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getOpportunityScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getLastTpDateScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getClientScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getMsoScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getPpngPgmScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getMvolElgblIoaScreenDisplay());
        HCARoleScreenDisplay.add(FTMConstants.getLobScreenDisplay());
    }

    public List<String> getElements() {
        return this.HCARoleScreenDisplay;
    }

    private static void display() {
        for(int i=0; i<HCARoleScreenDisplay.size(); i++) {
            System.out.print(HCARoleScreenDisplay.get(i) + ", ");
        }
    }
}
