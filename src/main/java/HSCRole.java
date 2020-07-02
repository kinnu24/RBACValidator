import java.util.ArrayList;
import java.util.List;

public class HSCRole {

    public static List<String> HSCRoleFromDB = new ArrayList<String>();

    public HSCRole() {
        /* Replace with DB Query */
        HSCRoleFromDB.add(FTMConstants.getGroupId());
        HSCRoleFromDB.add(FTMConstants.getGroupName());
        HSCRoleFromDB.add(FTMConstants.getServiceLevel());
        HSCRoleFromDB.add(FTMConstants.getOPPORTUNITY());
        HSCRoleFromDB.add(FTMConstants.getLastTpDate());
        HSCRoleFromDB.add(FTMConstants.getLastTpChannel());
        HSCRoleFromDB.add(FTMConstants.getMemberEngagement());
        HSCRoleFromDB.add(FTMConstants.getFlaggingCharts());
        HSCRoleFromDB.add(FTMConstants.getElgblSndrySubs());
        HSCRoleFromDB.add(FTMConstants.getHcaOwner());
        HSCRoleFromDB.add(FTMConstants.getCLIENT());
        HSCRoleFromDB.add(FTMConstants.getPpngPgm());
        HSCRoleFromDB.add(FTMConstants.getMvolElgblIoa());
        HSCRoleFromDB.add(FTMConstants.getOutlierFlagging());
        HSCRoleFromDB.add(FTMConstants.getGA());
        HSCRoleFromDB.add(FTMConstants.getDV());
        HSCRoleFromDB.add(FTMConstants.getLOB());
    }

    public List<String> getElements() {
        return this.HSCRoleFromDB;
    }

    public static void display() {
        for(int i=0; i<HSCRoleFromDB.size(); i++) {
            System.out.print(HSCRoleFromDB.get(i) + ", ");
        }
    }
}

