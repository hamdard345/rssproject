package rss;

/**
 * This is the Appointment class. It is a class template used for the other Appointment classes.
 * 
 * @author Spaced
 */
public class Appointment {
    private int appId,caseID,cwID,timeSlotID;

    /**
     * This is the getAppId method. It returns the appId.
     * 
     * @return the appId
     */
    public int getAppId() {
        return appId;
    }

    /**
     * This is the setAppId method. It sets the value of appId.
     * 
     * @param appId the appId
     */
    public void setAppId(int appId) {
        this.appId = appId;
    }

    /**
     * This is the getCaseID method. It returns the value of caseID.
     * 
     * @return the caseID 
     */
    public int getCaseID() {
        return caseID;
    }

    /**
     * This is the setCaseID method. It sets the value of caseID.
     * 
     * @param caseID the caseID
     */
    public void setCaseID(int caseID) {
        this.caseID = caseID;
    }

    /**
     * This is the getCwID method. It returns the value of cwID.
     * 
     * @return the cwID
     */
    public int getCwID() {
        return cwID;
    }

    /**
     * This is the setCwID method. It sets the value of cwID.
     * 
     * @param cwID the cwID
     */
    public void setCwID(int cwID) {
        this.cwID = cwID;
    }

    /**
     * This is the getTimeSlotID method. It returns the value of timeSlotID.
     * 
     * @return the timeSlotID
     */
    public int getTimeSlotID() {
        return timeSlotID;
    }

    /**
     * This is the setTimeSlotID method. It returns the value of timeSlotID.
     * 
     * @param timeSlotID the timeSlotID
     */
    public void setTimeSlotID(int timeSlotID) {
        this.timeSlotID = timeSlotID;
    }
    
    
}
