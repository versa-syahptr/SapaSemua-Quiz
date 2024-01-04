package sapasemua;

/*
 * boleh jadi entry point
 */

/**
 *
 * @author versa
 */

import java.sql.SQLException;
import javax.swing.JOptionPane;
import sapasemua.controller.DB;
import sapasemua.controller.StartPageController;

import sapasemua.view.StartPage;

public class Application {
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

       StartPage page = new StartPage();
       StartPageController control = new StartPageController();
        try {
            DB.connect();
            DB.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(page, ex, "DB Connection Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
        control.setView(page);
        page.setVisible(true);
    }
}
