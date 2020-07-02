import java.util.ArrayList;
import java.util.List;

public class TestHSCScreenElements {

    public List<String> HSCRoleScreenDisplay = new ArrayList<String>();

    public TestHSCScreenElements() {
        /* Replace with JSON and XPATH */
        HSCRoleScreenDisplay.add(FTMConstants.getGroupIdScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getGroupNameScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getServiceLevelScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getOpportunityScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getLastTpDateScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getLastTpChannelScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getMemberEngagementScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getFlaggingChartsScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getElgblSndrySubsScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getHcaOwnerScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getClientScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getPpngPgmScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getMvolElgblIoaScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getOutlierFlaggingScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getGaScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getDvScreenDisplay());
        HSCRoleScreenDisplay.add(FTMConstants.getLobScreenDisplay());
    }

    public List<String> getElements() {
        return this.HSCRoleScreenDisplay;
    }

    public void display() {
        for(int i=0; i<HSCRoleScreenDisplay.size(); i++) {
            System.out.print(HSCRoleScreenDisplay.get(i) + ", ");
        }
    }
}

