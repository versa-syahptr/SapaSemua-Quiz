package sapasemua.controler;

/* TP_MOD_13
 * DB.java
 *
 * Nama : Versa Syahputra Santo
 * NIM  : 1301213373
 * Kelas: IF-45-03
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author versa
 */
public class DB {
    static final String DB_URL = "jdbc:mysql://45.90.230.165:3306/u1425398_versa_PBO?useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String DB_USER = "u1425398_versa_pbo";
    static final String DB_PASS = "HMK.o{OdW$-5";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void connect() throws SQLException{
        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
    }
    
    public static ResultSet fetch(String sql) throws SQLException{
        connect();
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sql);
        return rs;
    }
       
//    public static ResultSet get() throws SQLException{
//        connect();
//        String sql = "SELECT * FROM mahasiswa";
//        stmt = conn.createStatement();
//        rs = stmt.executeQuery(sql);
//        return rs;
//    }
//    
//    public static void insert(Mahasiswa m) throws SQLException{
//        connect();
//        stmt = conn.createStatement();
//        String sql = "INSERT INTO mahasiswa (`nim`, `nama`, `prodi`) VALUES('%s','%s','%s')";
//        stmt.executeUpdate(sql.formatted(m.getNim(), m.getNama(), m.getProdi())); 
//        stmt.close();
//    }
//    
//    public static void update(Mahasiswa m) throws SQLException{
//        connect();
//        String q = "UPDATE `mahasiswa` SET `nim`='%s',`nama`='%s',`prodi`='%s' WHERE `id`='%d'";
//        stmt = conn.createStatement();
//        stmt.executeUpdate(q.formatted(m.getNim(), m.getNama(), m.getProdi(), m.getId()));
//    }
//    
//    public static void delete(int id) throws SQLException{
//        connect();
//        String q = "DELETE FROM mahasiswa WHERE `id` = %d";
//        stmt = conn.createStatement();
//        stmt.executeUpdate(q.formatted(id));
//    }
    
    public static void close(){
        try {
            if (conn != null && !conn.isClosed()) conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
