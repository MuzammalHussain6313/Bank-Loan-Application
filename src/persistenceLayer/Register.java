
package persistenceLayer;
import BusinessLogicLayer.*;
import java.awt.HeadlessException;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import BusinessLogicLayer.Loan;
import javafx.scene.control.Alert;

public class Register {
    ResultSet resultSet;
    public Register() {
    }
    public static Connection getConnection()
    {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?verifyServerCertificate=false&useSSL=true", "root", "12345");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return connection;
    }
    public static void main(String a[]) {
//        try {
//            LocalDate date = LocalDate.now();
//            java.sql.Date d = java.sql.Date.valueOf(date);
//            Person person = new Person("Ali", "Abbas", "123456", d, "032417777", "address here", "osama", "0342561727", "342156", "nendows");
//            Loan loan = new Loan("100000", "1 year");
//            Account account = new Account("12345-987654-111DCA");
//            Applications application = new Applications(person, account, loan);
//            Register register = new Register();
//            register.saveLoanApplicationDabbtaToDB(application);
//        } catch (Exception e) {
//            System.err.println(e.getClass().getName() + ": " + e.getMessage());
//        }
        Register register = new Register();
        Applications applications = register.getReviewApplication(1);
        System.out.println(applications.getPerson().getName());
    }
    public void saveLoanApplicationDabbtaToDB(Applications application) {
        try {
            String query = "INSERT INTO application(name,fatherName,CNIC,dateOfBirth,phoneNumber,address,nameOfRefrance,phoneOfRefrance,yearlyIncom,jobDetail,accountNumber,amount,duration,status) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = null;
            Connection connection = Register.getConnection();
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, application.getPerson().getName());
            preparedStatement.setString(2, application.getPerson().getFatherName());
            preparedStatement.setString(3, application.getPerson().getCNIC());
            preparedStatement.setDate(4, application.getPerson().getDateOfBirth());
            preparedStatement.setString(5, application.getPerson().getPhoneNo());
            preparedStatement.setString(6, application.getPerson().getPermanenetAddressaddress());
            preparedStatement.setString(7, application.getPerson().getRefranceName());
            preparedStatement.setString(8, application.getPerson().getRefrancePhoneNumber());
            preparedStatement.setString(9, application.getPerson().getYearlyIncom());
            preparedStatement.setString(10, application.getPerson().getJobDetail());
            preparedStatement.setString(11, application.getAccount().getAccountNo());
            preparedStatement.setString(12, application.getLoan().getAmount());
            preparedStatement.setString(13, application.getLoan().getDuration());
            preparedStatement.setString(14, "Null");
            //preparedStatement.execute();
            int row = preparedStatement.executeUpdate();
            if (row > 0)
            {
                JOptionPane.showMessageDialog(null,"A row has been inserted successfully.");
            }
            preparedStatement.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Dialog");
            alert.setHeaderText(null);
            alert.setContentText("Applications successfully submitted.");
            alert.showAndWait();

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
    public Applications getReviewApplication(int id)
    {
        Person person = new Person();
        Loan loan = new Loan();
        Account account = new Account();
        Applications application = new Applications(person,account,loan);
        ResultSet RSet = null;
        Statement statement1 = null;
        try {
            statement1 = Register.getConnection().createStatement();
            String sqll = "select * from application";
            RSet = statement1.executeQuery(sqll);
            while (RSet.next()){
                application.getPerson().setName(RSet.getString("name"));
                application.getPerson().setFatherName(RSet.getString("fatherName"));
                application.getPerson().setCNIC(RSet.getString("CNIC"));
                java.sql.Date date = RSet.getDate("dateOfBirth");
                //java.sql.Date utilDate = new java.util.Date(date.getTime());
                application.getPerson().setDateOfBirth(date);
                application.getPerson().setPhoneNo(RSet.getString("phoneNumber"));
                application.getPerson().setPermanenetAddress(RSet.getString("address"));
                application.getPerson().setRefranceName(RSet.getString("nameOfRefrance"));
                application.getPerson().setRefrancePhoneNumber(RSet.getString("phoneOfRefrance"));
                application.getPerson().setYearlyIncom(RSet.getString("yearlyIncom"));
                application.getPerson().setJobDetail(RSet.getString("jobDetail"));
                application.getLoan().setAmount(RSet.getString("amount"));
                application.getLoan().setDuration(RSet.getString("duration"));
                application.getAccount().setAccountNo(RSet.getString("accountNumber"));
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return application;
    }
    public void saveStatusToDB() {
//        try {
//            String query = "update Customer set Status where App_Number ='" + appNo + "'";
//
//            preparedStatement = connection.prepareStatement(query);
//            Review rev = review.get(Integer.parseInt(appNo));
//            preparedStatement.setString(16, "Null");
//            /**
//             * Execute and close the prepared statement
//             */
//            preparedStatement.execute();
//            preparedStatement.close();
//
//            Alert alert = new Alert(Alert.AlertType.INFORMATION);
//            alert.setTitle("Information Dialog");
//            alert.setHeaderText(null);
//            alert.setContentText("Applications status successfully Added.");
//            alert.showAndWait();
//
//        } catch (SQLException ex) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("SQL Database Error Dialog");
//            alert.setHeaderText(null);
//            alert.setContentText("Error in database: " + ex);
//            alert.showAndWait();
//        }
    }
//
//    public ArrayList<Applications> loadLoanApplicationDataFromDB() {
//        ArrayList<Applications> app = new ArrayList<>();
//        String query = "select App_Number from Customer";
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                //app.add(new Applications()));
//            }
//            resultSet.close();
//            preparedStatement.close();
//            return app;
//        } catch (SQLException e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("SQL Database Error Dialog");
//            alert.setHeaderText(null);
//            alert.setContentText("Error in database: " + e);
//            alert.showAndWait();
//        }
//        return null;
//    }
//
//    public ArrayList<Person> loadCustomerDataFromDB() {
//        ArrayList<Person> per;
//        per = new ArrayList<>();
//        String query = "select * from Customer";
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//            }
//            resultSet.close();
//            preparedStatement.close();
//            return per;
//        } catch (SQLException e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("SQL Database Error Dialog");
//            alert.setHeaderText(null);
//            alert.setContentText("Error in database: " + e);
//            alert.showAndWait();
//            return per;
//        }
//    }
//
//    public ArrayList<Account> loadBankAccountDataFromDB() {
//        ArrayList<Account> acc;
//        acc = new ArrayList<>();
//
//        String query = "select * from Customer";
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                acc.add(new Account(resultSet.getString("AccountNo")));
//            }
//            resultSet.close();
//            preparedStatement.close();
//            return acc;
//        } catch (SQLException e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("SQL Database Error Dialog");
//            alert.setHeaderText(null);
//            alert.setContentText("Error in database: " + e);
//            alert.showAndWait();
//            return acc;
//        }
//    }
//    public ArrayList<Loan> loadLoanCollectionDataFromDB() {
//        ArrayList<Loan> lon;
//        lon = new ArrayList<>();
//
//        String query = "select * from Customer";
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                lon.add(new Loan(resultSet.getString("Loan_Amount"), resultSet.getString("Loan_Duration")));
//            }
//            resultSet.close();
//            preparedStatement.close();
//            return lon;
//        } catch (SQLException e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("SQL Database Error Dialog");
//            alert.setHeaderText(null);
//            alert.setContentText("Error in database: " + e);
//            alert.showAndWait();
//            return lon;
//        }
//    }
//
////    public ArrayList<Review> loadLoanReviewDataFromDB() {
////        ArrayList<Review> rev;
////        rev = new ArrayList<>();
////
////        String query = "select * from Customer";
////        try {
////            preparedStatement = connection.prepareStatement(query);
////            resultSet = preparedStatement.executeQuery();
////            while (resultSet.next()) {
////                rev.add(new Review(resultSet.getString("Status")));
////            }
////            resultSet.close();
////            preparedStatement.close();
////            return rev;
////        } catch (SQLException e) {
////            Alert alert = new Alert(Alert.AlertType.ERROR);
////            alert.setTitle("SQL Database Error Dialog");
////            alert.setHeaderText(null);
////            alert.setContentText("Error in database: " + e);
////            alert.showAndWait();
////            return rev;
////        }
////    }
//
//    public Integer getMaxSize() {
//        int i = 1;
//        String query = "select App_Number from Customer";
//        try {
//            preparedStatement = connection.prepareStatement(query);
//            resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                resultSet.getInt("App_Number");
//                i++;
//            }
//            preparedStatement.close();
//            resultSet.close();
//            return i;
//        } catch (SQLException e) {
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setTitle("SQL Database Error Dialog");
//            alert.setHeaderText(null);
//            alert.setContentText("Error in database: " + e);
//            alert.showAndWait();
//            return 1;
//        }
//    }

}
