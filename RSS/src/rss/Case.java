package rss;

/**
 * This is the Case class. It is a class template used for the other Case classes.
 * 
 * @author Spaced
 */
public class Case {
    private int caseid, clientid;
    private String casecategory,caseStartDate,caseCloseDate,caseNotes,ClosingNotes,firstMeeting;
    

    /**
     * This is the getCaseid method. It returns the caseid.
     * 
     * @return the caseid
     */
    public int getCaseid() {
        return caseid;
    }

    /**
     * This is the setCaseid method. It sets the value of the caseid.
     * 
     * @param caseid the caseid
     */
    public void setCaseid(int caseid) {
        this.caseid = caseid;
    }
    

    /**
     * This is the getClientid method. It returns the clientid.
     * 
     * @return the clientid
     */
    public int getClientid() {
        return clientid;
    }

    /**
     * This is the setClientid method. It sets the value of the clientid.
     * 
     * @param clientid the clientid
     */
    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    /**
     * This is the getCasecategory method. It returns the casecategory. 
     * 
     * @return the casecategory
     */
    public String getCasecategory() {
        return casecategory;
    }

    /**
     * This is the setCasecategory method. It sets the value of the casecategory.
     * 
     * @param casecategory the casecategory.
     */
    public void setCasecategory(String casecategory) {
        this.casecategory = casecategory;
    }

    /**
     * This is the getCaseStartDate method. It returns the caseStartDate
     * 
     * @return the caseStartDate
     */
    public String getCaseStartDate() {
        return caseStartDate;
    }

    /**
     * This is the setCaseStartDate method. It returns the caseStartDate.
     * 
     * @param caseStartDate the caseStartDate
     */
    public void setCaseStartDate(String caseStartDate) {
        this.caseStartDate = caseStartDate;
    }

    /**
     * This is the getCaseCloseDate method. It returns the caseCloseDate.
     * 
     * @return the caseCloseDate
     */
    public String getCaseCloseDate() {
        return caseCloseDate;
    }

    /**
     * This is the setCaseCloseDate method. It sets the value of caseCloseDate.
     * 
     * @param caseCloseDate the caseCloseDate
     */
    public void setCaseCloseDate(String caseCloseDate) {
        this.caseCloseDate = caseCloseDate;
    }

    /**
     * This is the getCaseNotes method. It returns caseNotes.
     * 
     * @return the caseNotes
     */
    public String getCaseNotes() {
        return caseNotes;
    }

    /**
     * This is the setCaseNotes method. It sets the value of caseNotes.
     * 
     * @param caseNotes the caseNotes
     */
    public void setCaseNotes(String caseNotes) {
        this.caseNotes = caseNotes;
    }

    /**
     * This is the getClosingNotes method. It returns the ClosingNotes.
     * 
     * @return the ClosingNotes
     */
    public String getClosingNotes() {
        return ClosingNotes;
    }

    /**
     * This is the setClosingNotes method. It sets the value of ClosingNotes.
     * 
     * @param ClosingNotes the ClosingNotes
     */
    public void setClosingNotes(String ClosingNotes) {
        this.ClosingNotes = ClosingNotes;
    }

    /**
     * This is the getFirstMeeting method. It returns firstMeeting.
     * 
     * @return the firstMeeting
     */
    public String getFirstMeeting() {
        return firstMeeting;
    }

    /**
     * This is the setFirstMeeting method. It sets the value of firstMeeting.
     * 
     * @param firstMeeting the firstMeeting
     */
    public void setFirstMeeting(String firstMeeting) {
        this.firstMeeting = firstMeeting;
    }
    
    
}
