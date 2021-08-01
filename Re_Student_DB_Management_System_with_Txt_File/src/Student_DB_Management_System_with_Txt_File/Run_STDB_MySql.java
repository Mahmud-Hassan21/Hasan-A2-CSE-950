
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Run_STDB_MySql {

    private JFrame frame;
    static StudentPanel memberPanel = new StudentPanel();

    CardLayout appLayout;

    /**
     * Launch the application.
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        
        // UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
//        UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");  
        // UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
           UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
        //   UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel"); 
//        UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");  
//        UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");   
//        UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");          
//        UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");    
//        UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");       
//        UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");       
      //  UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Run_STDB_MySql window = new Run_STDB_MySql();
                    window.frame.setVisible(true);
                    window.frame.setLocationRelativeTo(null);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }

    public Run_STDB_MySql() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Student Database Managment System");
        frame.setBounds(100, 100, 1000, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new CardLayout(0, 0));

        frame.getContentPane().add(memberPanel, "memberPanel");

    }

}
