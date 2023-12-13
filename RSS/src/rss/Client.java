package rss;

/**
 * This is the Client class. It is a class template used for the other Client classes.
 * 
 * @author Spaced
 */
public class Client {
    private int clientid,contactnumber;
    private String firstName,lastName,email;

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
     * This is the getContactNumber method. It returns the contactnumber.
     * 
     * @return the contactnumber
     */
    public int getContactnumber() {
        return contactnumber;
    }

    /**
     * This is the setContactNumber method. It sets the value of the contactnumber.
     * 
     * @param contactnumber the contactnumber
     */
    public void setContactnumber(int contactnumber) {
        this.contactnumber = contactnumber;
    }

    /**
     * This is the getFirstName method. It returns the firstName.
     * 
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This is the setFirstName method. It sets the value of the firstName.
     * 
     * @param firstName the firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * This is the getLastName method. It returns the lastName.
     * 
     * @return lastName the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is the setLastName method. It sets the value of the lastName.
     * 
     * @param lastName the lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This is the getEmail method. It returns the value of the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This is the setEmail method. It sets the value of the email.
     * 
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
