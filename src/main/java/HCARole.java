import java.util.ArrayList;
import java.util.List;

public class HCARole {

    public List<String> HCARoleFromDB = new ArrayList<String>();

    public HCARole() {
        /* Replace with DB Query */
        HCARoleFromDB.add(FTMConstants.getGroupId());
        HCARoleFromDB.add(FTMConstants.getGroupName());
        HCARoleFromDB.add(FTMConstants.getLastTpDate());
        HCARoleFromDB.add(FTMConstants.getCLIENT());
        HCARoleFromDB.add(FTMConstants.getLOB());
        HCARoleFromDB.add(FTMConstants.getMSO());
        HCARoleFromDB.add(FTMConstants.getMvolElgblIoa());
        HCARoleFromDB.add(FTMConstants.getOPPORTUNITY());
        HCARoleFromDB.add(FTMConstants.getPpngPgm());
        HCARoleFromDB.add(FTMConstants.getServiceLevel());
    }

    public List<String> getElements() {
        return this.HCARoleFromDB;
    }

    public void display() {
        for(int i=0; i<HCARoleFromDB.size(); i++) {
            System.out.print(HCARoleFromDB.get(i) + ", ");
        }
    }
}

