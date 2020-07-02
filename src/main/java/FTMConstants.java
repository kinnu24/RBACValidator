import java.util.ArrayList;
import java.util.List;

public final class FTMConstants {

    public static final String GROUP_ID                          = "groupId";
    public static final String GROUP_ID_SCREEN_DISPLAY           = "Group Id";
    public static final String GROUP_NAME                        = "groupName";
    public static final String GROUP_NAME_SCREEN_DISPLAY         = "Group Name";
    public static final String SERVICE_LEVEL                     = "serviceLevel";
    public static final String SERVICE_LEVEL_SCREEN_DISPLAY      = "Service Level";
    public static final String OPPORTUNITY                       = "Opportunity";
    public static final String OPPORTUNITY_SCREEN_DISPLAY        = "Opportunity Type";
    public static final String LAST_TP_DATE                      = "lastTouchPointDate";
    public static final String LAST_TP_DATE_SCREEN_DISPLAY       = "Last Touchpoint Date";
    public static final String LAST_TP_CHANNEL                   = "lastTouchPointChannel";
    public static final String LAST_TP_CHANNEL_SCREEN_DISPLAY    = "Last Touchpoint Channel";
    public static final String MEMBER_ENGAGEMENT                 = "memberEngagement";
    public static final String MEMBER_ENGAGEMENT_SCREEN_DISPLAY  = "Member Engagement";
    public static final String FLAGGING_CHARTS                   = "flaggingCharts";
    public static final String FLAGGING_CHARTS_SCREEN_DISPLAY    = "Flagging Charts";
    public static final String ELGBL_SNDRY_SUBS                  = "eligibleForSecondarySubmissions";
    public static final String ELGBL_SNDRY_SUBS_SCREEN_DISPLAY   = "Eligible for Secondary Submissions";
    public static final String HCA_OWNER                         = "hcaOwner";
    public static final String HCA_OWNER_SCREEN_DISPLAY          = "HCA Owner";
    public static final String CLIENT                            = "client";
    public static final String CLIENT_SCREEN_DISPLAY             = "Client";
    public static final String MSO                               = "mso";
    public static final String MSO_SCREEN_DISPLAY                = "MSO";
    public static final String PPNG_PGM                          = "participatingProgram";
    public static final String PPNG_PGM_SCREEN_DISPLAY           = "Participating Program Flags";
    public static final String MVOL_ELGBL_IOA                    = "membershipVolumeEligibleForIOA";
    public static final String MVOL_ELGBL_IOA_SCREEN_DISPLAY     = "Membership Volume Eligible For IOA";
    public static final String LOB                               = "lob";
    public static final String LOB_SCREEN_DISPLAY                = "LOB";
    public static final String GA                                = "ga";
    public static final String GA_SCREEN_DISPLAY                 = "GA";
    public static final String DV                                = "dv";
    public static final String DV_SCREEN_DISPLAY                 = "DV";
    public static final String REJECTION                         = "rejection";
    public static final String REJECTION_SCREEN_DISPLAY          = "Rejection";
    public static final String OUTLIER_FLAGGING                  = "outlierFlagging";
    public static final String OUTLIER_FLAGGING_SCREEN_DISPLAY   = "Outlier Flagging";

    public List<String> convertScreenElementsWithIdealValues(List<String> screenElements) {
        List<String> convertedScreenElements = new ArrayList<String>();

        for(int i=0; i<screenElements.size(); i++) {

            String strTemp = (String)screenElements.get(i);

            switch (strTemp) {
                case GROUP_ID_SCREEN_DISPLAY: convertedScreenElements.add(GROUP_ID); continue;
                case GROUP_NAME_SCREEN_DISPLAY: convertedScreenElements.add(GROUP_NAME); continue;
                case SERVICE_LEVEL_SCREEN_DISPLAY: convertedScreenElements.add(SERVICE_LEVEL); continue;
                case OPPORTUNITY_SCREEN_DISPLAY: convertedScreenElements.add(OPPORTUNITY); continue;
                case LAST_TP_DATE_SCREEN_DISPLAY: convertedScreenElements.add(LAST_TP_DATE); continue;
                case LAST_TP_CHANNEL_SCREEN_DISPLAY: convertedScreenElements.add(LAST_TP_CHANNEL); continue;
                case MEMBER_ENGAGEMENT_SCREEN_DISPLAY: convertedScreenElements.add(MEMBER_ENGAGEMENT); continue;
                case FLAGGING_CHARTS_SCREEN_DISPLAY: convertedScreenElements.add(FLAGGING_CHARTS); continue;
                case ELGBL_SNDRY_SUBS_SCREEN_DISPLAY: convertedScreenElements.add(ELGBL_SNDRY_SUBS); continue;
                case HCA_OWNER_SCREEN_DISPLAY: convertedScreenElements.add(HCA_OWNER); continue;
                case CLIENT_SCREEN_DISPLAY: convertedScreenElements.add(CLIENT); continue;
                case MSO_SCREEN_DISPLAY: convertedScreenElements.add(MSO); continue;
                case PPNG_PGM_SCREEN_DISPLAY: convertedScreenElements.add(PPNG_PGM); continue;
                case MVOL_ELGBL_IOA_SCREEN_DISPLAY: convertedScreenElements.add(MVOL_ELGBL_IOA); continue;
                case LOB_SCREEN_DISPLAY: convertedScreenElements.add(LOB); continue;
                case GA_SCREEN_DISPLAY: convertedScreenElements.add(GA); continue;
                case DV_SCREEN_DISPLAY: convertedScreenElements.add(DV); continue;
                case REJECTION_SCREEN_DISPLAY: convertedScreenElements.add(REJECTION); continue;
                case OUTLIER_FLAGGING_SCREEN_DISPLAY: convertedScreenElements.add(OUTLIER_FLAGGING);
            }
        }

        return convertedScreenElements;
    }

    public static String getGroupId() {
        return GROUP_ID;
    }

    public static String getGroupIdScreenDisplay() {
        return GROUP_ID_SCREEN_DISPLAY;
    }

    public static String getGroupName() {
        return GROUP_NAME;
    }

    public static String getGroupNameScreenDisplay() {
        return GROUP_NAME_SCREEN_DISPLAY;
    }

    public static String getServiceLevel() {
        return SERVICE_LEVEL;
    }

    public static String getServiceLevelScreenDisplay() {
        return SERVICE_LEVEL_SCREEN_DISPLAY;
    }

    public static String getOPPORTUNITY() {
        return OPPORTUNITY;
    }

    public static String getOpportunityScreenDisplay() {
        return OPPORTUNITY_SCREEN_DISPLAY;
    }

    public static String getLastTpDate() {
        return LAST_TP_DATE;
    }

    public static String getLastTpDateScreenDisplay() {
        return LAST_TP_DATE_SCREEN_DISPLAY;
    }

    public static String getCLIENT() {
        return CLIENT;
    }

    public static String getClientScreenDisplay() {
        return CLIENT_SCREEN_DISPLAY;
    }

    public static String getMSO() {
        return MSO;
    }

    public static String getMsoScreenDisplay() {
        return MSO_SCREEN_DISPLAY;
    }

    public static String getPpngPgm() {
        return PPNG_PGM;
    }

    public static String getPpngPgmScreenDisplay() {
        return PPNG_PGM_SCREEN_DISPLAY;
    }

    public static String getMvolElgblIoa() {
        return MVOL_ELGBL_IOA;
    }

    public static String getMvolElgblIoaScreenDisplay() {
        return MVOL_ELGBL_IOA_SCREEN_DISPLAY;
    }

    public static String getLOB() {
        return LOB;
    }

    public static String getLobScreenDisplay() {
        return LOB_SCREEN_DISPLAY;
    }

    public static String getLastTpChannel() {
        return LAST_TP_CHANNEL;
    }

    public static String getLastTpChannelScreenDisplay() {
        return LAST_TP_CHANNEL_SCREEN_DISPLAY;
    }

    public static String getMemberEngagement() {
        return MEMBER_ENGAGEMENT;
    }

    public static String getMemberEngagementScreenDisplay() {
        return MEMBER_ENGAGEMENT_SCREEN_DISPLAY;
    }

    public static String getFlaggingCharts() {
        return FLAGGING_CHARTS;
    }

    public static String getFlaggingChartsScreenDisplay() {
        return FLAGGING_CHARTS_SCREEN_DISPLAY;
    }

    public static String getElgblSndrySubs() {
        return ELGBL_SNDRY_SUBS;
    }

    public static String getElgblSndrySubsScreenDisplay() {
        return ELGBL_SNDRY_SUBS_SCREEN_DISPLAY;
    }

    public static String getHcaOwner() {
        return HCA_OWNER;
    }

    public static String getHcaOwnerScreenDisplay() {
        return HCA_OWNER_SCREEN_DISPLAY;
    }

    public static String getGA() {
        return GA;
    }

    public static String getGaScreenDisplay() {
        return GA_SCREEN_DISPLAY;
    }

    public static String getDV() {
        return DV;
    }

    public static String getDvScreenDisplay() {
        return DV_SCREEN_DISPLAY;
    }

    public static String getREJECTION() {
        return REJECTION;
    }

    public static String getRejectionScreenDisplay() {
        return REJECTION_SCREEN_DISPLAY;
    }

    public static String getOutlierFlagging() {
        return OUTLIER_FLAGGING;
    }

    public static String getOutlierFlaggingScreenDisplay() {
        return OUTLIER_FLAGGING_SCREEN_DISPLAY;
    }

}
