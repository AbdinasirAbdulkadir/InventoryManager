import java.sql.*;

public class ProductManager {
    public void addProduct(String name, int quantity, double price) {
        String query = "INSERT INTO products (name, quantity, price) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseHelper.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, name);
            pstmt.setInt(2, quantity);
            pstmt.setDouble(3, price);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void viewProducts() {
        String query = "SELECT * FROM products";
        try (Connection conn = DatabaseHelper.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" + 
                                   rs.getString("name") + "\t" +
                                   rs.getInt("quantity") + "\t" +
                                   rs.getDouble("price"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Similarly, methods for updateProduct, deleteProduct, getProduct can be added
}
