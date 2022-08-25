package Database_connection;

public class Patient_Enter {
    public static void insert_into(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9) {
           try {
        	   Connection con=Connection.createC();
        	   String query="insert into Patients";
           }catch(Exception e) {
        	   e.printStackTrace();
           }
    }
}
