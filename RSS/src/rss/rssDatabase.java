/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rss;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author w18002720
 */
public class rssDatabase {

    private String databasefileLocation;

    public rssDatabase() {
        databasefileLocation = "src\\rss\\rssdb2.db";
    }

    public ResultSet loadCaseWorker() {

        String querycaseworker = "SELECT * FROM case_Worker;";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadCaseWorker()).");
        }
        ResultSet result = database.RunSQLQuery(querycaseworker);
        return result;
    }

    public ResultSet loadcwdetails() {

        String querycaseworker = "SELECT case_worker_id,\n"
                + "       cw_firstname,\n"
                + "       cw_categories FROM case_Worker;";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadCaseWorker()).");
        }
        ResultSet result = database.RunSQLQuery(querycaseworker);
        return result;

    }

    public ResultSet loadclients() {

        String queryclients = "Select * from client";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(queryclients);
        return result;
    }

    //test result set

    public ResultSet loadCases() {
        String querycases = "Select * from cases";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(querycases);
        return result;
    }

    public ResultSet loadTimeSlots() {

        String querytimeslot = "Select * from time_slot";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(querytimeslot);
        return result;
    }

    public ResultSet loadavailableappointment() {

        String querappointment = "SELECT cw_firstname,cw_categories,\n"
                + "       date,time,room\n"
                + "       FROM appointment\n"
                + "       join time_slot on time_slot=time_slot_id\n"
                + "       join case_worker on case_worker =case_worker_id\n"
                + "   where case_client is null;";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(querappointment);
        return result;

    }
    
    public String date(){
        java.util.Date date = Calendar.getInstance().getTime();  
DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
String strDate = dateFormat.format(date); 
     
    return strDate;
    }
    public ResultSet loadtoadysappointment() {
   
  
     String SQL=  "SELECT appointment_id,cw_firstname,cw_categories,\n"
                + "  date,time,room,case_client,case_client,cl_firstname,cl_lastname\n"
                +" FROM appointment\n"
                +"  join time_slot on time_slot=time_slot_id\n"
                +"  join case_worker on case_worker =case_worker_id\n"
                +"  join client on case_client=id  where case_client is not null and date='"+ date()+"';";
sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(SQL);
        return result;

    
    }
        public ResultSet loadBookedappointmentToClose(){
    String querappointment = "SELECT appointment_id,cw_firstname,cw_categories,\n"
                + "       date,time,room,case_id,case_client,cl_firstname,cl_lastname,case_category\n"
                + "       FROM appointment\n"
                + "       join time_slot on time_slot=time_slot_id\n"
                + "       join case_worker on case_worker =case_worker_id\n"
                +"        join cases on case_client=case_id"
                +"        join client on case_client=id\n"
                + "   where case_client is not null and case_close_date is null;";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(querappointment);
        return result;

}
        public ResultSet loadbookedappointment() {
            

        String querappointment = "SELECT appointment_id,cw_firstname,cw_categories,\n"
                + "       date,time,room,case_id,case_client,cl_firstname,cl_lastname,case_category\n"
                + "       FROM appointment\n"
                + "       join time_slot on time_slot=time_slot_id\n"
                + "       join case_worker on case_worker =case_worker_id\n"
                +"        join cases on case_client=case_id"
                +"        join client on case_client=id\n"
                + "   where case_client is not null;";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(querappointment);
        return result;

    }
   
    

    public void printresult() {
        try {
            rssDatabase rs = new rssDatabase();
            ResultSet rst = rs.findappointment("debt");
            ResultSetMetaData rsmd = rst.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rst.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) {
                        System.out.print(",  ");
                    }
                    String columnValue = rst.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
        } catch (Exception e) {
        }
        
    }
    public void printresulttestappointment() {
        try {
            rssDatabase rs = new rssDatabase();
            ResultSet rst = rs.loadBookedappointmentToClose();
            ResultSetMetaData rsmd = rst.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (rst.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) {
                        System.out.print(",  ");
                    }
                    String columnValue = rst.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }
        } catch (Exception e) {
        }
        
    }
    
    public ResultSet testinsertap(){
          sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            String sqltestsqltest = "SELECT appointment_id,case_worker,time_slot FROM appointment where time_slot='10'";
            ResultSet rs = sq.RunSQLQuery(sqltestsqltest);
            return rs;
    }
    //inserting into appointment with testing if the data already exist
//    public void insert(Appointment ap) {
//        try {
//            sqliteDB sq = new sqliteDB();
//            sq.Connect(databasefileLocation);
//            String sqltestsqltest = "SELECT appointment_id,case_worker,time_slot FROM appointment where time_slot='" + ap.getTimeSlotID() + "'";
//            ResultSet rs = sq.RunSQLQuery(sqltestsqltest);
//            if (!rs.next()) {
//                String SQL = "INSERT INTO appointment (appointment_id,case_client,case_worker,time_slot)"
//                    + "VALUES('" + null + "','" + null + "','" + ap.getCwID() + "','" + ap.getTimeSlotID() + "');";
//                sq.RunSQL(SQL);
//                JOptionPane.showMessageDialog(null, "time slot has been allocated to Case worker Number" + ap.getCwID());
//                
//            } else {
//                JOptionPane.showMessageDialog(null, "appointment already exist");
//                
//            }
//        } catch (Exception e) {
//        }
//    }
//insert into appointment to allocate case worker times
    //testing required
    public void insertap(Appointment ap) {
        try {
            String SQL = "INSERT INTO appointment (case_worker,time_slot)"
                    + "VALUES('" + ap.getCwID() + "','" + ap.getTimeSlotID() + "');";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            sq.RunSQL(SQL);
            JOptionPane.showMessageDialog(null, "time slot has been allocated to Case worker Number" + ap.getCwID());
        } catch (Exception e) {
        }
    }
    
    
    //Schedules a new appointment by assigning a case client to an appointment by client ID
    public void scheduleap(Appointment ap){
         try {
            String SQL = "UPDATE appointment " + "set appointment_id = ?," + "case_client = ?where appointment_id= ?;";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            PreparedStatement psmt = sq.prepareStatement(SQL);
            psmt.setInt(1, ap.getAppId());
            psmt.setInt(2, ap.getCaseID());
            psmt.setInt(3, ap.getAppId());
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Case has been allocated to Appointment" + ap.getAppId());

        } catch (Exception e) {
        }
    }
    
    public void addtimeslot(TimeSlot tm) {
        try {
            String SQL = "INSERT INTO time_slot (date,time,room)"
                    + "VALUES('" + tm.getDate() + "','" + tm.getTime() + "','" + tm.getRoomNumber() + "');";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            sq.RunSQL(SQL);
            JOptionPane.showMessageDialog(null, "time slot has been added to the system");
        } catch (Exception e) {
        }

    }

    public void addcasworker(CaseWorker cw) {
        try {
            String SQL = "insert into case_worker (cw_firstname,"
                    + "cw_lastname,cw_email, cw_contact_number,cw_categories)"
                    + "values('" + cw.getFirstName()
                    + "','" + cw.getLastName() + "','" + cw.getEmail() + "','"
                    + cw.getContact() + "','" + cw.getCategory() + "');";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            sq.prepareStatement(SQL);
            sq.RunSQL(SQL);
            
            JOptionPane.showMessageDialog(null, "case worker " + cw.getFirstName() + " has been added to the Database");
        } catch (Exception e) {
        }

    }

    public void addcase(Case newcase){
        try {
            String SQl = "INSERT INTO cases (client_id," + "case_category,case_start_date,case_note,first_meeting)"
                    + "values('" + newcase.getClientid()
                    + "','" + newcase.getCasecategory() + "','" + newcase.getCaseStartDate() + "','" + newcase.getCaseNotes() + "','" + newcase.getFirstMeeting()
                    + "');";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            sq.RunSQL(SQl);
            JOptionPane.showMessageDialog(null, "case has been added to the Database");
        } catch (Exception e) {

        }
    }

    public void addClient(Client client) {
        try {
            String SQl = "INSERT INTO client (cl_firstname," + "cl_lastname,cl_Contact_number,cl_email)"
                    + "values('"  + client.getFirstName()
                    + "','" + client.getLastName() + "','" + client.getContactnumber() + "','"
                    + client.getEmail() + "');";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            sq.RunSQL(SQl);
            JOptionPane.showMessageDialog(null, "client " + client.getFirstName() + " has been added to the Database");
        } catch (Exception e) {

        }
    }

    public void updateClient(Client client) {
        try {
            String SQl = "UPDATE client (client_id, cl_firstname," + "cl_lastname,cl_Contact_number,cl_email)"
                    + "values('" + client.getClientid() + "','" + client.getFirstName()
                    + "','" + client.getLastName() + "','" + client.getContactnumber() + "','"
                    + client.getEmail() + "');";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            sq.RunSQL(SQl);
            JOptionPane.showMessageDialog(null, "client " + client.getFirstName() + " has been added to the Database");
        } catch (Exception e) {

        }
    }
    public void updatecase(Case cs){
    try {
            String SQL = "Update cases " + "set case_note = ? where case_id= ?;";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            PreparedStatement psmt = sq.prepareStatement(SQL);
            psmt.setString(1, cs.getCaseNotes());
            psmt.setInt(2, cs.getCaseid());
            psmt.executeUpdate();

        } catch (Exception e) {
        }}
     public void closecase(Case cs){
    try {
            String SQL = "Update cases " + "set closing_notes = ?,case_close_date =? where case_id= ?;";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            PreparedStatement psmt = sq.prepareStatement(SQL);
            psmt.setString(1, cs.getClosingNotes());
            psmt.setString(2, cs.getCaseCloseDate());
            psmt.setInt(3, cs.getCaseid());
            psmt.executeUpdate();

        } catch (Exception e) {
        }}
    
    public void updateCaseWorker(CaseWorker cw){
        try {
            String SQL = "Update case_worker " + "set case_worker_id = ?,   cw_firstname = ? ,cw_lastname = ?  , cw_email = ? , cw_contact_number = ? ,cw_categories=? where case_worker_id= ?;";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            PreparedStatement psmt = sq.prepareStatement(SQL);
            psmt.setInt(1, cw.getid());
            psmt.setString(2, cw.getFirstName());
            psmt.setString(3, cw.getLastName());
            psmt.setString(4, cw.getEmail());
            psmt.setInt(5, cw.getContact());
            psmt.setString(6,cw.getCategory());
            psmt.setInt(7, cw.getid());
            psmt.executeUpdate();

        } catch (Exception e) {
        }
    }
    public void updateclients(Client client) {
        try {
            String SQL = "Update client " + "set id = ?,   cl_firstname = ? ,cl_lastname = ?  ,cl_contact_number = ? ,cl_email =? where id= ?;";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            PreparedStatement psmt = sq.prepareStatement(SQL);
            psmt.setInt(1, client.getClientid());
            psmt.setString(2, client.getFirstName());
            psmt.setString(3, client.getLastName());
            psmt.setInt(4, client.getContactnumber());
            psmt.setString(5, client.getEmail());
            psmt.setInt(6, client.getClientid());
            psmt.executeUpdate();

        } catch (Exception e) {
        }
    }
    public void cancelappointment(Integer i){
    try {
    String SQL = "UPDATE appointment SET case_client = null WHERE appointment_id = ?;";
    sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            PreparedStatement psmt = sq.prepareStatement(SQL);
            psmt.setInt(1, i);
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Appointment has been canceled");
 } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
}
    public void removeClient(Integer i) {
        try {
            String SQL = "DELETE FROM client where id =?";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            PreparedStatement psmt = sq.prepareStatement(SQL);
            psmt.setInt(1, i);
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "client with ID number" + i + " has been removed from the database");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }
    

    // return  result set of a specfic category appointment

    public ResultSet findappointment(String category) {
        String querycases = "SELECT appointment_id,case_worker,time_slot,cw_firstname,cw_categories,date,time\n"
                + "FROM appointment join time_slot on time_slot=time_slot_id\n"
                + "join case_worker on case_worker=case_worker_id \n"
                + "where  cw_categories like'%" + category + "%' And case_client is null;";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(querycases);
        return result;

    }
    public ResultSet findcase(Integer caseid) {
        String querycases = "SELECT * FROM cases WHERE case_id ='"+ caseid +"';";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(querycases);
        return result;

    }
    //Finds the cases that match the selected category in AddNewAppointment
        public ResultSet findcase(String category) {
        String querycases = "SELECT * FROM cases WHERE case_category ='"+ category +"';";
        sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(querycases);
        return result;

    }
        public ResultSet caseworkerid() {
        
            String Sql = "SELECT max(case_worker_id)  FROM case_worker;";
            sqliteDB database = new sqliteDB();
        boolean connectionSuccess = database.Connect(databasefileLocation);
        if (!connectionSuccess) {
            System.out.println("Failed to connect to the database in function loadclients().");
        }
        ResultSet result = database.RunSQLQuery(Sql);
        
        return result;
            
        
        
        
        }

    public void removeCaseWorker(Integer i) {
        try {
            String SQL = "DELETE FROM case_worker where case_worker_id=?";
            sqliteDB sq = new sqliteDB();
            sq.Connect(databasefileLocation);
            PreparedStatement psmt = sq.prepareStatement(SQL);
            psmt.setInt(1, i);
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "case worker with ID Number" + i + " has been removed from the database");
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
        }
    }

    public static void main(String[] args) throws SQLException {
        rssDatabase rdb = new rssDatabase();
        rssDatabase rdb2 = new rssDatabase();
        //component testing 
        //what happens if u wanna book an appointment does it work
        //if time is working
        //test case 1 adding new case worker
        //new caseworker should be in the case worker
//        CaseWorker x = new CaseWorker();
//        x.setFirstName("niel");
//        x.setLastName("mothan");
//        x.setEmail("a@yahoo.");
//        x.setContact(1213443);
//        rdb.addcasworker(x);
//        rdb2.printresult();
        rdb2.printresulttestappointment();

    }
}
