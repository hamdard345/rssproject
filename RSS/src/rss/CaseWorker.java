package rss;

/**
 * This is the CaseWorker class. It is a class template used for the other CaseWorker classes.
 * 
 * @author Spaced
 */
public class CaseWorker {
    private Integer id,contact;
    private String firstName,lastName,email,category;
    
    /**
     * This is the getid method. It returns the id.
     * 
     * @return the id
     */
    public Integer getid(){
        return id;
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
     * This is the getLastName method. It returns the lastName.
     * 
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This is the getEmail method. It returns the email.
     * 
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * This is the getContact method. It returns the contact.
     * 
     * @return the contact
     */
    public Integer getContact() {
        return contact;
    }

    /**
     * This is the getCategory method. It returns the category.
     * 
     * @return the category
     */
    public String getCategory() {
        return category;
    }
    
    /**
     * This is the setId method. It sets the value of the id.
     * 
     * @param id the id
     */
    public void setId(Integer id){
        this.id = id;
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
     * This is the setLastName method. It sets the value of the lastName.
     * 
     * @param lastName the lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * This is the setEmail method. It sets the value of the email.
     * 
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This is the setContact method. It sets the value of the contact.
     * 
     * @param contact the contact
     */
    public void setContact(Integer contact) {
        this.contact = contact;
    }

    /**
     * This is the setCategory method. It sets the value of the category.
     * 
     * @param category the category
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
    
}
