import java.sql.*;

public class TransactionHandling {
    private static final String URL = "jdbc:mysql://localhost:3306/bank";
    private static final String USER = "root";
    private static final String PASSWORD = "your_password";

    public static void transferMoney(int fromAccount, int toAccount, double amount) {
        String debitQuery = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
        String creditQuery = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            con.setAutoCommit(false);

            try (PreparedStatement debit = con.prepareStatement(debitQuery);
                 PreparedStatement credit = con.prepareStatement(creditQuery)) {

                debit.setDouble(1, amount);
                debit.setInt(2, fromAccount);
                debit.executeUpdate();

                credit.setDouble(1, amount);
                credit.setInt(2, toAccount);
                credit.executeUpdate();

                con.commit();
                System.out.println("Transaction successful.");

            } catch (Exception e) {
                con.rollback();
                System.out.println("Transaction failed. Rolled back.");
            }

        } catch (Exception e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        transferMoney(101, 102, 5000);
    }
}