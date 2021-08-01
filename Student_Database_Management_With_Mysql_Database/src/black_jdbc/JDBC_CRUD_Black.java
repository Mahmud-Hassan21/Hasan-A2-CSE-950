package black_jdbc;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hasan
 */
public class JDBC_CRUD_Black extends javax.swing.JFrame {

    Connection database_Connection;
    PreparedStatement prestm;
    ResultSet result;

    //***************** System Up time **************************************
    static Timer timer;
    static int second, minute; //hours;
    static String ddSecond, ddMinute;//ddHours
    static DecimalFormat dFormat = new DecimalFormat("00");

    //***********************************************************************
    public JDBC_CRUD_Black() {

        initComponents();

        everything.hide();
        sdsheet.hide();
        signout.hide();

        insert_into_Jtable1();
        insert_into_Jtable2();
        insert_into_Jtable3();

        ImageIcon icon = new ImageIcon(getClass().getResource("/JDBC_Icon/mysql1.png"));
        this.setIconImage(icon.getImage());

    }

    public void insert_into_Jtable1() {
        int J_table;
        try {
            //forName is a method which will help you to load the class
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
            Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
            prestm = database_Connection.prepareStatement("select * from student");
            result = prestm.executeQuery();

            ResultSetMetaData rsmd = result.getMetaData();
            J_table = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            dtm.setRowCount(0);

            while (result.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= J_table; i++) {

                    v.add(result.getString("id"));
                    v.add(result.getString("name"));
                    v.add(result.getString("roll"));
                    v.add(result.getString("batch"));
                    v.add(result.getString("department"));
                    v.add(result.getString("university"));
                    v.add(result.getString("phone"));
                }
                dtm.addRow(v);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            //  Logger.getLogger(JDBC_CRUD_Black.class.getName()).log(Level.SEVERE, null, ex);

            //JOptionPane.showMessageDialog(this, ex);
        }
    }

    //----------------------------------------------
    public void insert_into_Jtable2() {
        int J_table;
        try {
            //forName is a method which will help you to load the class
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
            Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
            prestm = database_Connection.prepareStatement("select * from student");
            result = prestm.executeQuery();

            ResultSetMetaData rsmd = result.getMetaData();
            J_table = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel) table2.getModel();
            dtm.setRowCount(0);

            while (result.next()) {
                Vector vector = new Vector();
                for (int i = 1; i <= J_table; i++) {
                    vector.add(result.getString("id"));
                    vector.add(result.getString("name"));
                    vector.add(result.getString("roll"));
                    vector.add(result.getString("batch"));
                    vector.add(result.getString("department"));
                    vector.add(result.getString("university"));
                    vector.add(result.getString("phone"));
                }
                dtm.addRow(vector);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            //  Logger.getLogger(JDBC_CRUD_Black.class.getName()).log(Level.SEVERE, null, ex);

            //JOptionPane.showMessageDialog(this, ex);
        }
    }
    //----------------------------------------------

    public void insert_into_Jtable3() {
        int J_table;
        try {
            //forName is a method which will help you to load the class
            Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");

            prestm = database_Connection.prepareStatement("select * from student");
            result = prestm.executeQuery();

            ResultSetMetaData rsmd = result.getMetaData();
            J_table = rsmd.getColumnCount();
            DefaultTableModel dtm = (DefaultTableModel) table3.getModel();
            dtm.setRowCount(0);

            while (result.next()) {
                Vector v = new Vector();
                for (int i = 1; i <= J_table; i++) {
                    v.add(result.getString("id"));
                    v.add(result.getString("name"));
                    v.add(result.getString("roll"));
                    v.add(result.getString("batch"));
                    v.add(result.getString("department"));
                    v.add(result.getString("university"));
                    v.add(result.getString("phone"));
                }
                dtm.addRow(v);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            //  Logger.getLogger(JDBC_CRUD_Black.class.getName()).log(Level.SEVERE, null, ex);

            //JOptionPane.showMessageDialog(this, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        loadinglabel = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        Loadingvalue = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        loadinglabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sdsheet = new javax.swing.JButton();
        everything = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        signout = new javax.swing.JButton();
        key = new javax.swing.JButton();
        sysuptime = new javax.swing.JLabel();
        aboutbtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        rightsign = new javax.swing.JLabel();
        hmit = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        txtfbatch = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtfphone = new javax.swing.JTextField();
        allinonedatabase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtfuni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        txtfroll = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnreset1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        alinonedatabase = new javax.swing.JButton();
        dball = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtfbatch2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtfphone2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtfuni2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        j = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtfname2 = new javax.swing.JTextField();
        txtfroll2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btninsert1 = new javax.swing.JButton();
        btnreset2 = new javax.swing.JButton();
        back1 = new javax.swing.JButton();
        back4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        databasetabtotalstudent = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        databasehomebtn = new javax.swing.JButton();
        printdatabase = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        dbshow = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        txtfbatch3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtfphone3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtfuni3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtfname3 = new javax.swing.JTextField();
        txtfroll3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        jLabel26 = new javax.swing.JLabel();
        back2 = new javax.swing.JButton();
        btnupdate1 = new javax.swing.JButton();
        btndelete1 = new javax.swing.JButton();
        btnreset3 = new javax.swing.JButton();
        back3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        modifytabtotalstudent = new javax.swing.JLabel();
        printdatabasemodify3 = new javax.swing.JButton();
        dbmo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        logintextstd = new javax.swing.JLabel();
        back7 = new javax.swing.JButton();
        loginicongreeen = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        loginpageblue = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        loginpanel = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        regusrnamelogintextfield = new javax.swing.JTextField();
        loginbtn = new javax.swing.JButton();
        passlogintextfield = new javax.swing.JPasswordField();
        forgotpass = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        forgotpass2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        createannew = new javax.swing.JLabel();
        newhere = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        regusrnametextfield = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        regpasstextfield = new javax.swing.JPasswordField();
        regloginbtncreatenew = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        confirmpass = new javax.swing.JPasswordField();
        usremail = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        tac = new javax.swing.JCheckBox();
        jLabel33 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        loginpageblue1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Gitbtn = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        procons = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        spus = new javax.swing.JLabel();
        abouthome = new javax.swing.JButton();
        pros = new javax.swing.JLabel();
        fr = new javax.swing.JLabel();
        so = new javax.swing.JLabel();
        of = new javax.swing.JLabel();
        con = new javax.swing.JLabel();
        lo = new javax.swing.JLabel();
        no = new javax.swing.JLabel();
        le = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        in = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        chgpasspanel = new javax.swing.JPanel();
        changepanel = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        e1 = new javax.swing.JTextField();
        loginbtn1 = new javax.swing.JButton();
        c1 = new javax.swing.JPasswordField();
        p1 = new javax.swing.JPasswordField();
        jLabel66 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel42 = new javax.swing.JLabel();
        cp = new javax.swing.JPasswordField();
        jLabel67 = new javax.swing.JLabel();
        changesign = new javax.swing.JLabel();
        logintextstd1 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        loginpageblue2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Database Management System");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setForeground(new java.awt.Color(0, 153, 153));
        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane1KeyPressed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(44, 62, 80));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setBackground(new java.awt.Color(44, 62, 80));
        jProgressBar1.setAutoscrolls(true);
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setDoubleBuffered(true);
        jProgressBar1.setFocusCycleRoot(true);
        jProgressBar1.setFocusTraversalPolicyProvider(true);
        jProgressBar1.setMinimumSize(new java.awt.Dimension(10, 15));
        jProgressBar1.setOpaque(true);
        jProgressBar1.setPreferredSize(new java.awt.Dimension(150, 25));
        jPanel9.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 675, 1000, 20));

        loadinglabel.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        loadinglabel.setForeground(new java.awt.Color(255, 255, 255));
        loadinglabel.setText("Loading...");
        jPanel9.add(loadinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 300, 30));

        jLabel38.setBackground(new java.awt.Color(0, 153, 153));
        jLabel38.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("GOVT. & UGC Approved");
        jPanel9.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 220, -1));

        jLabel39.setBackground(new java.awt.Color(0, 153, 153));
        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Port City International University");
        jPanel9.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 470, -1, -1));

        jSeparator5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 190, 20));

        jPanel17.setBackground(new java.awt.Color(53, 75, 97));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(53, 75, 97));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 620, 790));

        jPanel14.setBackground(new java.awt.Color(63, 89, 115));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(53, 75, 97));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 620, 790));

        jPanel19.setBackground(new java.awt.Color(73, 103, 133));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(53, 75, 97));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 620, 790));

        jPanel21.setBackground(new java.awt.Color(94, 130, 167));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(53, 75, 97));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 620, 790));

        jPanel19.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 70, 700));

        jPanel14.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 170, 710));

        jPanel17.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 320, 700));

        Loadingvalue.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        Loadingvalue.setForeground(new java.awt.Color(255, 255, 255));
        Loadingvalue.setText("0 %");
        jPanel17.add(Loadingvalue, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 50, 30));

        jPanel9.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 480, 700));

        jLabel37.setBackground(new java.awt.Color(255, 102, 153));
        jLabel37.setForeground(new java.awt.Color(102, 102, 255));
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/pciu.png"))); // NOI18N
        jPanel9.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));

        jLabel48.setBackground(new java.awt.Color(0, 153, 153));
        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Excellence in Higher Education");
        jPanel9.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 140, 20));

        loadinglabel1.setBackground(new java.awt.Color(112, 144, 176));
        loadinglabel1.setFont(new java.awt.Font("Segoe Print", 3, 10)); // NOI18N
        loadinglabel1.setForeground(new java.awt.Color(255, 255, 255));
        loadinglabel1.setText("Version 1.0");
        jPanel9.add(loadinglabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 20));

        jTabbedPane1.addTab("Loadingwindow", jPanel9);

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("With");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 40, 30));

        sdsheet.setBackground(new java.awt.Color(22, 31, 39));
        sdsheet.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        sdsheet.setForeground(new java.awt.Color(255, 255, 255));
        sdsheet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Generate-tables-icon (1).png"))); // NOI18N
        sdsheet.setText("Show Database");
        sdsheet.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        sdsheet.setBorderPainted(false);
        sdsheet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sdsheetActionPerformed(evt);
            }
        });
        jPanel1.add(sdsheet, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, 150, 35));

        everything.setBackground(new java.awt.Color(22, 31, 39));
        everything.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        everything.setForeground(new java.awt.Color(255, 255, 255));
        everything.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Clear-Tick-icon.png"))); // NOI18N
        everything.setText("Direct Access");
        everything.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        everything.setBorderPainted(false);
        everything.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                everythingActionPerformed(evt);
            }
        });
        jPanel1.add(everything, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 150, 35));

        jLabel28.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Java.png"))); // NOI18N
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 150));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 260, 30));

        jPanel15.setBackground(new java.awt.Color(53, 75, 97));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signout.setBackground(new java.awt.Color(22, 31, 39));
        signout.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        signout.setForeground(new java.awt.Color(255, 255, 255));
        signout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/logouticon.png"))); // NOI18N
        signout.setText("Sign Out");
        signout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signout.setBorderPainted(false);
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });
        jPanel15.add(signout, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 100, 30));

        key.setBackground(new java.awt.Color(22, 31, 39));
        key.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        key.setForeground(new java.awt.Color(255, 255, 255));
        key.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Register-icon.png"))); // NOI18N
        key.setText("Sign In");
        key.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        key.setBorderPainted(false);
        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });
        jPanel15.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 100, 30));

        sysuptime.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        sysuptime.setForeground(new java.awt.Color(255, 255, 255));
        sysuptime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sysuptime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/loading.gif"))); // NOI18N
        sysuptime.setText("Sys up time");
        jPanel15.add(sysuptime, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 150, 30));

        aboutbtn.setBackground(new java.awt.Color(22, 31, 39));
        aboutbtn.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        aboutbtn.setForeground(new java.awt.Color(255, 255, 255));
        aboutbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Sign-Info-icon.png"))); // NOI18N
        aboutbtn.setToolTipText("About us");
        aboutbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        aboutbtn.setBorderPainted(false);
        aboutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbtnActionPerformed(evt);
            }
        });
        jPanel15.add(aboutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 30, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/hillpng.png"))); // NOI18N
        jPanel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-440, 230, 920, -1));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 480, 700));

        rightsign.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rightsign.setForeground(new java.awt.Color(255, 255, 255));
        rightsign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/arrow-right-icon.png"))); // NOI18N
        rightsign.setText("Please, Sign In first to take action");
        jPanel1.add(rightsign, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, 60));

        hmit.setBackground(new java.awt.Color(22, 31, 39));
        hmit.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        hmit.setForeground(new java.awt.Color(255, 153, 0));
        hmit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hmit.setText("HRT IT Farm");
        jPanel1.add(hmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 170, 70));

        jLabel62.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Java Database Connectivity");
        jPanel1.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 280, 60));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("MySql DB");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 140, 90));

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel2.setBackground(new java.awt.Color(44, 62, 80));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        txtfbatch.setBackground(new java.awt.Color(53, 75, 97));
        txtfbatch.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfbatch.setForeground(new java.awt.Color(255, 255, 255));
        txtfbatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfbatchKeyPressed(evt);
            }
        });
        jPanel2.add(txtfbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 200, 30));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("University");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 200, 30));

        txtfphone.setBackground(new java.awt.Color(53, 75, 97));
        txtfphone.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfphone.setForeground(new java.awt.Color(255, 255, 255));
        txtfphone.setText("01");
        txtfphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfphoneKeyTyped(evt);
            }
        });
        jPanel2.add(txtfphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 200, 30));

        allinonedatabase.setBackground(new java.awt.Color(0, 0, 0));
        allinonedatabase.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        allinonedatabase.setForeground(new java.awt.Color(255, 255, 255));
        allinonedatabase.setText("Total Students");
        jPanel2.add(allinonedatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 480, 130, 25));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 200, 30));

        txtfuni.setBackground(new java.awt.Color(53, 75, 97));
        txtfuni.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfuni.setForeground(new java.awt.Color(255, 255, 255));
        txtfuni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfuniKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfuniKeyTyped(evt);
            }
        });
        jPanel2.add(txtfuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 200, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Roll");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 200, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Batch");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 200, 30));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Department");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, 200, 30));

        txtfname.setBackground(new java.awt.Color(53, 75, 97));
        txtfname.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfname.setForeground(new java.awt.Color(255, 255, 255));
        txtfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfnameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfnameKeyTyped(evt);
            }
        });
        jPanel2.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 200, 30));

        txtfroll.setBackground(new java.awt.Color(53, 75, 97));
        txtfroll.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfroll.setForeground(new java.awt.Color(255, 255, 255));
        txtfroll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfrollKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfrollKeyTyped(evt);
            }
        });
        jPanel2.add(txtfroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 200, 30));

        table.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        table.setForeground(new java.awt.Color(44, 62, 80));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr.No", "Name of Student", "Roll", "Batch", "Department", "University", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setPreferredWidth(5);
            table.getColumnModel().getColumn(0).setHeaderValue("Sr.No");
            table.getColumnModel().getColumn(1).setPreferredWidth(130);
            table.getColumnModel().getColumn(1).setHeaderValue("Name of Student");
            table.getColumnModel().getColumn(2).setPreferredWidth(80);
            table.getColumnModel().getColumn(2).setHeaderValue("Roll");
            table.getColumnModel().getColumn(3).setPreferredWidth(30);
            table.getColumnModel().getColumn(3).setHeaderValue("Batch");
            table.getColumnModel().getColumn(4).setPreferredWidth(135);
            table.getColumnModel().getColumn(4).setHeaderValue("Department");
            table.getColumnModel().getColumn(5).setHeaderValue("University");
            table.getColumnModel().getColumn(6).setPreferredWidth(80);
            table.getColumnModel().getColumn(6).setHeaderValue("Phone");
        }

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 920, 160));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("Student Information");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        back.setBackground(new java.awt.Color(22, 31, 39));
        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setForeground(new java.awt.Color(0, 153, 153));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/coffee-icon.png"))); // NOI18N
        back.setToolTipText("Home");
        back.setBorderPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 50, 35, 35));

        btninsert.setBackground(new java.awt.Color(22, 31, 39));
        btninsert.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btninsert.setForeground(new java.awt.Color(255, 255, 255));
        btninsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Action-db-add-icon.png"))); // NOI18N
        btninsert.setText("Insert");
        btninsert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 15, true));
        btninsert.setBorderPainted(false);
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        jPanel2.add(btninsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 110, 35));

        btnupdate.setBackground(new java.awt.Color(22, 31, 39));
        btnupdate.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Upload-Database-icon.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 15, true));
        btnupdate.setBorderPainted(false);
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel2.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 110, 35));

        btndelete.setBackground(new java.awt.Color(255, 51, 51));
        btndelete.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Trash-icon.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 15, true));
        btndelete.setBorderPainted(false);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 110, 35));

        btnreset1.setBackground(new java.awt.Color(22, 31, 39));
        btnreset1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnreset1.setForeground(new java.awt.Color(255, 255, 255));
        btnreset1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/reset.png"))); // NOI18N
        btnreset1.setText("Reset");
        btnreset1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 15, true));
        btnreset1.setBorderPainted(false);
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnreset1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 100, 35));

        jComboBox1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(44, 62, 80));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc in CSE", "M.Sc. in CSE", "BSc in EEE", "BSc in CEN", "MSc in CEN", "BSc in TEX", "MSc in TEX", "L.L.B (HONS)", "L.L.M", "B.A (HONS) IN English", "M.A. IN English", "BBA", "MBA", "Networking", "Machine learning" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 200, 30));

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Phone");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 200, 30));

        alinonedatabase.setBackground(new java.awt.Color(22, 31, 39));
        alinonedatabase.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        alinonedatabase.setForeground(new java.awt.Color(255, 255, 255));
        alinonedatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/print-icon.png"))); // NOI18N
        alinonedatabase.setText("Print");
        alinonedatabase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        alinonedatabase.setBorderPainted(false);
        alinonedatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alinonedatabaseActionPerformed(evt);
            }
        });
        jPanel2.add(alinonedatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 80, 35));

        dball.setBackground(new java.awt.Color(255, 255, 255));
        dball.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dball.setForeground(new java.awt.Color(44, 62, 80));
        jPanel2.add(dball, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 50, 25));

        jTabbedPane1.addTab("All in One", jPanel2);

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfbatch2.setBackground(new java.awt.Color(53, 75, 97));
        txtfbatch2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfbatch2.setForeground(new java.awt.Color(255, 255, 255));
        txtfbatch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfbatch2KeyPressed(evt);
            }
        });
        jPanel3.add(txtfbatch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 200, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("University");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 200, 30));

        txtfphone2.setBackground(new java.awt.Color(53, 75, 97));
        txtfphone2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfphone2.setForeground(new java.awt.Color(255, 255, 255));
        txtfphone2.setText("01");
        txtfphone2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfphone2KeyTyped(evt);
            }
        });
        jPanel3.add(txtfphone2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 200, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Phone");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 200, 30));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Name");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 200, 30));

        txtfuni2.setBackground(new java.awt.Color(53, 75, 97));
        txtfuni2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfuni2.setForeground(new java.awt.Color(255, 255, 255));
        txtfuni2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfuni2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfuni2KeyTyped(evt);
            }
        });
        jPanel3.add(txtfuni2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 200, 30));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Roll");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 200, 30));

        j.setBackground(new java.awt.Color(0, 0, 0));
        j.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        j.setForeground(new java.awt.Color(255, 255, 255));
        j.setText("Batch");
        jPanel3.add(j, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 200, 30));

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Department");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 200, 30));

        txtfname2.setBackground(new java.awt.Color(53, 75, 97));
        txtfname2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfname2.setForeground(new java.awt.Color(255, 255, 255));
        txtfname2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfname2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfname2KeyTyped(evt);
            }
        });
        jPanel3.add(txtfname2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 200, 30));

        txtfroll2.setBackground(new java.awt.Color(53, 75, 97));
        txtfroll2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfroll2.setForeground(new java.awt.Color(255, 255, 255));
        txtfroll2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfroll2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfroll2KeyTyped(evt);
            }
        });
        jPanel3.add(txtfroll2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 200, 30));

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 153, 255));
        jLabel17.setText("Modify Student Credential");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 420, -1));

        btninsert1.setBackground(new java.awt.Color(22, 31, 39));
        btninsert1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btninsert1.setForeground(new java.awt.Color(255, 255, 255));
        btninsert1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Action-db-add-icon.png"))); // NOI18N
        btninsert1.setText("Insert");
        btninsert1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btninsert1.setBorderPainted(false);
        btninsert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsert1ActionPerformed(evt);
            }
        });
        jPanel3.add(btninsert1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 110, 35));

        btnreset2.setBackground(new java.awt.Color(22, 31, 39));
        btnreset2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnreset2.setForeground(new java.awt.Color(255, 255, 255));
        btnreset2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/reset.png"))); // NOI18N
        btnreset2.setText("Reset");
        btnreset2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btnreset2.setBorderPainted(false);
        btnreset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset2ActionPerformed(evt);
            }
        });
        jPanel3.add(btnreset2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 110, 35));

        back1.setBackground(new java.awt.Color(22, 31, 39));
        back1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Apps-File-Db-icon.png"))); // NOI18N
        back1.setToolTipText("Database");
        back1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        back1.setBorderPainted(false);
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel3.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 35, 35));

        back4.setBackground(new java.awt.Color(22, 31, 39));
        back4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back4.setForeground(new java.awt.Color(255, 255, 255));
        back4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/coffee-icon.png"))); // NOI18N
        back4.setToolTipText("Home");
        back4.setBorderPainted(false);
        back4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back4ActionPerformed(evt);
            }
        });
        jPanel3.add(back4, new org.netbeans.lib.awtextra.AbsoluteConstraints(885, 40, 35, 35));

        jComboBox2.setEditable(true);
        jComboBox2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(44, 62, 80));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc in CSE", "M.Sc. in CSE", "BSc in EEE", "BSc in CEN", "MSc in CEN", "BSc in TEX", "MSc in TEX", "L.L.B (HONS)", "L.L.M", "B.A (HONS) IN English", "M.A. IN English", "BBA", "MBA", "Networking", "Machine learning" }));
        jPanel3.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, 200, 30));

        jTabbedPane1.addTab("Insert", jPanel3);

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));
        jPanel4.setName(""); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        table2.setForeground(new java.awt.Color(44, 62, 80));
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr.No", "Name of Student", "Roll", "Batch", "Department", "University", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setPreferredWidth(5);
            table2.getColumnModel().getColumn(1).setPreferredWidth(130);
            table2.getColumnModel().getColumn(2).setPreferredWidth(80);
            table2.getColumnModel().getColumn(3).setPreferredWidth(30);
            table2.getColumnModel().getColumn(4).setPreferredWidth(135);
            table2.getColumnModel().getColumn(6).setResizable(false);
            table2.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 910, 340));

        databasetabtotalstudent.setBackground(new java.awt.Color(255, 255, 255));
        databasetabtotalstudent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        databasetabtotalstudent.setForeground(new java.awt.Color(255, 255, 255));
        databasetabtotalstudent.setText("Total Students");
        jPanel4.add(databasetabtotalstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, 25));

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 255));
        jLabel19.setText("Student Information");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jButton2.setBackground(new java.awt.Color(22, 31, 39));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/appdrawerhomeicon.png"))); // NOI18N
        jButton2.setText("New");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 80, 35));

        jButton6.setBackground(new java.awt.Color(22, 31, 39));
        jButton6.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/App-package-settings-icon.png"))); // NOI18N
        jButton6.setText("Modify");
        jButton6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 100, 35));

        databasehomebtn.setBackground(new java.awt.Color(22, 31, 39));
        databasehomebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        databasehomebtn.setForeground(new java.awt.Color(0, 153, 153));
        databasehomebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/coffee-icon.png"))); // NOI18N
        databasehomebtn.setToolTipText("Home");
        databasehomebtn.setBorderPainted(false);
        databasehomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                databasehomebtnActionPerformed(evt);
            }
        });
        jPanel4.add(databasehomebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 50, 35, 35));

        printdatabase.setBackground(new java.awt.Color(22, 31, 39));
        printdatabase.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        printdatabase.setForeground(new java.awt.Color(255, 255, 255));
        printdatabase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/print-icon.png"))); // NOI18N
        printdatabase.setText("Print");
        printdatabase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        printdatabase.setBorderPainted(false);
        printdatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printdatabaseActionPerformed(evt);
            }
        });
        jPanel4.add(printdatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 80, 35));

        jLabel58.setBackground(new java.awt.Color(0, 0, 0));
        jLabel58.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("CSE A2 20th Batch");
        jPanel4.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        dbshow.setBackground(new java.awt.Color(255, 255, 255));
        dbshow.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dbshow.setForeground(new java.awt.Color(44, 62, 80));
        jPanel4.add(dbshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 50, 25));

        jLabel44.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("MySql DB");
        jPanel4.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 140, 50));

        jTabbedPane1.addTab("Database", jPanel4);

        jPanel5.setBackground(new java.awt.Color(44, 62, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(0, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(0, 153, 153));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        txtfbatch3.setBackground(new java.awt.Color(53, 75, 97));
        txtfbatch3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfbatch3.setForeground(new java.awt.Color(255, 255, 255));
        txtfbatch3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfbatch3KeyPressed(evt);
            }
        });
        jPanel5.add(txtfbatch3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 200, 30));

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("University");
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 200, 30));

        txtfphone3.setBackground(new java.awt.Color(53, 75, 97));
        txtfphone3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfphone3.setForeground(new java.awt.Color(255, 255, 255));
        txtfphone3.setText("01");
        txtfphone3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfphone3KeyTyped(evt);
            }
        });
        jPanel5.add(txtfphone3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 290, 200, 30));

        jLabel21.setBackground(new java.awt.Color(0, 0, 0));
        jLabel21.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Phone");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 200, 30));

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Name");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, 30));

        txtfuni3.setBackground(new java.awt.Color(53, 75, 97));
        txtfuni3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfuni3.setForeground(new java.awt.Color(255, 255, 255));
        txtfuni3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfuni3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfuni3KeyTyped(evt);
            }
        });
        jPanel5.add(txtfuni3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 200, 30));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Roll");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 200, 30));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Batch");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 200, 30));

        jLabel25.setBackground(new java.awt.Color(0, 0, 0));
        jLabel25.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Department");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 200, 30));

        txtfname3.setBackground(new java.awt.Color(53, 75, 97));
        txtfname3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfname3.setForeground(new java.awt.Color(255, 255, 255));
        txtfname3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfname3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfname3KeyTyped(evt);
            }
        });
        jPanel5.add(txtfname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 200, 30));

        txtfroll3.setBackground(new java.awt.Color(53, 75, 97));
        txtfroll3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtfroll3.setForeground(new java.awt.Color(255, 255, 255));
        txtfroll3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfroll3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfroll3KeyTyped(evt);
            }
        });
        jPanel5.add(txtfroll3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 200, 30));

        table3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        table3.setForeground(new java.awt.Color(44, 62, 80));
        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Sr.No", "Name of Student", "Roll", "Batch", "Department", "University", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table3.getTableHeader().setReorderingAllowed(false);
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        table3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table3KeyPressed(evt);
            }
        });
        jScrollPane4.setViewportView(table3);
        if (table3.getColumnModel().getColumnCount() > 0) {
            table3.getColumnModel().getColumn(0).setPreferredWidth(5);
            table3.getColumnModel().getColumn(1).setPreferredWidth(130);
            table3.getColumnModel().getColumn(2).setPreferredWidth(80);
            table3.getColumnModel().getColumn(3).setPreferredWidth(30);
            table3.getColumnModel().getColumn(4).setPreferredWidth(135);
            table3.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 900, 190));

        jLabel26.setBackground(new java.awt.Color(0, 0, 0));
        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 153, 255));
        jLabel26.setText("Student Information");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, -1));

        back2.setBackground(new java.awt.Color(22, 31, 39));
        back2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        back2.setForeground(new java.awt.Color(255, 255, 255));
        back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Apps-File-Db-icon.png"))); // NOI18N
        back2.setToolTipText("Database");
        back2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        back2.setBorderPainted(false);
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });
        jPanel5.add(back2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 60, 35, 35));

        btnupdate1.setBackground(new java.awt.Color(22, 31, 39));
        btnupdate1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnupdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Upload-Database-icon.png"))); // NOI18N
        btnupdate1.setText("Update");
        btnupdate1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btnupdate1.setBorderPainted(false);
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnupdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 110, 35));

        btndelete1.setBackground(new java.awt.Color(255, 51, 51));
        btndelete1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btndelete1.setForeground(new java.awt.Color(255, 255, 255));
        btndelete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Trash-icon.png"))); // NOI18N
        btndelete1.setText("Delete");
        btndelete1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btndelete1.setBorderPainted(false);
        btndelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete1ActionPerformed(evt);
            }
        });
        jPanel5.add(btndelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 110, 35));

        btnreset3.setBackground(new java.awt.Color(22, 31, 39));
        btnreset3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnreset3.setForeground(new java.awt.Color(255, 255, 255));
        btnreset3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/reset.png"))); // NOI18N
        btnreset3.setText("Reset");
        btnreset3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 153)));
        btnreset3.setBorderPainted(false);
        btnreset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset3ActionPerformed(evt);
            }
        });
        jPanel5.add(btnreset3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 110, 35));

        back3.setBackground(new java.awt.Color(22, 31, 39));
        back3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        back3.setForeground(new java.awt.Color(255, 255, 255));
        back3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/coffee-icon.png"))); // NOI18N
        back3.setToolTipText("Home");
        back3.setBorderPainted(false);
        back3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back3ActionPerformed(evt);
            }
        });
        jPanel5.add(back3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 35, 35));

        jComboBox3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(44, 62, 80));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc in CSE", "M.Sc. in CSE", "BSc in EEE", "BSc in CEN", "MSc in CEN", "BSc in TEX", "MSc in TEX", "L.L.B (HONS)", "L.L.M", "B.A (HONS) IN English", "M.A. IN English", "BBA", "MBA", "Networking", "Machine learning" }));
        jPanel5.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 200, 30));

        modifytabtotalstudent.setBackground(new java.awt.Color(0, 0, 0));
        modifytabtotalstudent.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        modifytabtotalstudent.setForeground(new java.awt.Color(255, 255, 255));
        modifytabtotalstudent.setText("Total Students");
        jPanel5.add(modifytabtotalstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 110, 25));

        printdatabasemodify3.setBackground(new java.awt.Color(22, 31, 39));
        printdatabasemodify3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        printdatabasemodify3.setForeground(new java.awt.Color(255, 255, 255));
        printdatabasemodify3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/print-icon.png"))); // NOI18N
        printdatabasemodify3.setText("Print");
        printdatabasemodify3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        printdatabasemodify3.setBorderPainted(false);
        printdatabasemodify3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printdatabasemodify3ActionPerformed(evt);
            }
        });
        jPanel5.add(printdatabasemodify3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, 80, 35));

        dbmo.setBackground(new java.awt.Color(255, 255, 255));
        dbmo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dbmo.setForeground(new java.awt.Color(44, 62, 80));
        jPanel5.add(dbmo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 430, 60, 25));

        jTabbedPane1.addTab("Modify", jPanel5);

        jPanel6.setBackground(new java.awt.Color(44, 62, 80));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logintextstd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logintextstd.setForeground(new java.awt.Color(255, 255, 255));
        logintextstd.setText("Sign in to the Database");
        jPanel6.add(logintextstd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, 70));

        back7.setBackground(new java.awt.Color(22, 31, 39));
        back7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back7.setForeground(new java.awt.Color(0, 153, 153));
        back7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/coffee-icon.png"))); // NOI18N
        back7.setToolTipText("Home");
        back7.setBorderPainted(false);
        back7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back7ActionPerformed(evt);
            }
        });
        jPanel6.add(back7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 35, 35));

        loginicongreeen.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        loginicongreeen.setForeground(new java.awt.Color(255, 255, 255));
        loginicongreeen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/user-icon.png"))); // NOI18N
        jPanel6.add(loginicongreeen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 90, 120));

        jPanel25.setBackground(new java.awt.Color(53, 75, 97));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginpageblue.setBackground(new java.awt.Color(22, 31, 39));
        loginpageblue.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        loginpageblue.setForeground(new java.awt.Color(255, 255, 255));
        loginpageblue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginpageblue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/TextEdit-icon.png"))); // NOI18N
        jPanel25.add(loginpageblue, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 160, 140));

        jLabel36.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Facebookicon.png"))); // NOI18N
        jLabel36.setText("Need a Help? Contact us");
        jLabel36.setToolTipText("My Facebook Profile");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel25.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 260, 60));

        jLabel45.setBackground(new java.awt.Color(22, 31, 39));
        jLabel45.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(0, 153, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("HRT IT Farm");
        jLabel45.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null));
        jPanel25.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 260, 70));

        jPanel6.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 480, 700));

        loginpanel.setBackground(new java.awt.Color(53, 75, 97));
        loginpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.green, java.awt.Color.green, null));
        loginpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Password");
        loginpanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 60));

        jLabel32.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Username");
        loginpanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 60));

        regusrnamelogintextfield.setBackground(new java.awt.Color(44, 62, 80));
        regusrnamelogintextfield.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        regusrnamelogintextfield.setForeground(new java.awt.Color(255, 255, 255));
        regusrnamelogintextfield.setDoubleBuffered(true);
        regusrnamelogintextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regusrnamelogintextfieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regusrnamelogintextfieldKeyTyped(evt);
            }
        });
        loginpanel.add(regusrnamelogintextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 30));

        loginbtn.setBackground(new java.awt.Color(35, 134, 54));
        loginbtn.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Sign In");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        loginbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginbtnKeyPressed(evt);
            }
        });
        loginpanel.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, 30));

        passlogintextfield.setBackground(new java.awt.Color(44, 62, 80));
        passlogintextfield.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        passlogintextfield.setForeground(new java.awt.Color(255, 255, 255));
        passlogintextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passlogintextfieldKeyPressed(evt);
            }
        });
        loginpanel.add(passlogintextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 30));

        forgotpass.setBackground(new java.awt.Color(255, 255, 255));
        forgotpass.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        forgotpass.setForeground(new java.awt.Color(88, 166, 255));
        forgotpass.setText(" Forgot password?");
        forgotpass.setToolTipText("Click to Recover");
        forgotpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpassMouseClicked(evt);
            }
        });
        loginpanel.add(forgotpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 110, 60));

        jLabel59.setBackground(new java.awt.Color(22, 31, 39));
        jLabel59.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(88, 166, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Change Password?");
        jLabel59.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(83, 117, 150), new java.awt.Color(83, 117, 150), null));
        jLabel59.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel59MouseClicked(evt);
            }
        });
        loginpanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 200, 30));

        forgotpass2.setBackground(new java.awt.Color(22, 31, 39));
        forgotpass2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        forgotpass2.setForeground(new java.awt.Color(255, 102, 102));
        forgotpass2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgotpass2.setText("Delete your account?");
        forgotpass2.setToolTipText("Click");
        forgotpass2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(83, 117, 150), new java.awt.Color(83, 117, 150), null));
        forgotpass2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotpass2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotpass2MouseClicked(evt);
            }
        });
        loginpanel.add(forgotpass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 200, 30));
        loginpanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, -1));
        loginpanel.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 80, 10));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Or");
        loginpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));
        loginpanel.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, -1));
        loginpanel.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 80, 10));

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Or");
        loginpanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        jPanel6.add(loginpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 260, 380));

        createannew.setBackground(new java.awt.Color(22, 31, 39));
        createannew.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        createannew.setForeground(new java.awt.Color(88, 166, 255));
        createannew.setText("                                    Create an account");
        createannew.setToolTipText("Click");
        createannew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(83, 117, 150), new java.awt.Color(83, 117, 150), null));
        createannew.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createannew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createannewMouseClicked(evt);
            }
        });
        jPanel6.add(createannew, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 260, 35));

        newhere.setBackground(new java.awt.Color(22, 31, 39));
        newhere.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        newhere.setForeground(new java.awt.Color(255, 255, 255));
        newhere.setText("               New here?");
        newhere.setToolTipText("Click");
        newhere.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(83, 117, 150), new java.awt.Color(83, 117, 150), null));
        newhere.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.add(newhere, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 590, 260, 35));

        jTabbedPane1.addTab("Login", jPanel6);

        jPanel7.setBackground(new java.awt.Color(44, 62, 80));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Registration");
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 140, 60));

        jLabel35.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Login-Registration-icon.png"))); // NOI18N
        jPanel7.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, 80));

        jPanel11.setBackground(new java.awt.Color(53, 75, 97));
        jPanel11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 153, 0), new java.awt.Color(255, 153, 0), null));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regusrnametextfield.setBackground(new java.awt.Color(44, 62, 80));
        regusrnametextfield.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        regusrnametextfield.setForeground(new java.awt.Color(255, 255, 255));
        regusrnametextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regusrnametextfieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                regusrnametextfieldKeyTyped(evt);
            }
        });
        jPanel11.add(regusrnametextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, 30));

        jLabel46.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Username");
        jPanel11.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 60));

        jLabel50.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Password");
        jPanel11.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 60));

        regpasstextfield.setBackground(new java.awt.Color(44, 62, 80));
        regpasstextfield.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        regpasstextfield.setForeground(new java.awt.Color(255, 255, 255));
        regpasstextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regpasstextfieldKeyPressed(evt);
            }
        });
        jPanel11.add(regpasstextfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, 30));

        regloginbtncreatenew.setBackground(new java.awt.Color(255, 153, 0));
        regloginbtncreatenew.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        regloginbtncreatenew.setForeground(new java.awt.Color(255, 255, 255));
        regloginbtncreatenew.setText("Create");
        regloginbtncreatenew.setEnabled(false);
        regloginbtncreatenew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regloginbtncreatenewActionPerformed(evt);
            }
        });
        regloginbtncreatenew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                regloginbtncreatenewKeyPressed(evt);
            }
        });
        jPanel11.add(regloginbtncreatenew, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 200, 30));

        jLabel60.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Email Address");
        jPanel11.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, 60));

        jLabel61.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Confirm Password");
        jPanel11.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 200, 60));

        confirmpass.setBackground(new java.awt.Color(44, 62, 80));
        confirmpass.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        confirmpass.setForeground(new java.awt.Color(255, 255, 255));
        confirmpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                confirmpassKeyPressed(evt);
            }
        });
        jPanel11.add(confirmpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        usremail.setBackground(new java.awt.Color(44, 62, 80));
        usremail.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        usremail.setForeground(new java.awt.Color(255, 255, 255));
        usremail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                usremailKeyPressed(evt);
            }
        });
        jPanel11.add(usremail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 200, 30));

        jCheckBox1.setBackground(new java.awt.Color(53, 75, 97));
        jCheckBox1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(88, 166, 255));
        jCheckBox1.setText("Show");
        jCheckBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel11.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        tac.setBackground(new java.awt.Color(53, 75, 97));
        tac.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        tac.setForeground(new java.awt.Color(88, 166, 255));
        tac.setText("<html><body><u>I Accept Terms and Conditions</u></body></html>");
        tac.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tacActionPerformed(evt);
            }
        });
        tac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tacKeyPressed(evt);
            }
        });
        jPanel11.add(tac, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 260, 420));

        jLabel33.setBackground(new java.awt.Color(22, 31, 39));
        jLabel33.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(88, 166, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("Sign In");
        jLabel33.setToolTipText("Click");
        jLabel33.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(83, 117, 150), new java.awt.Color(83, 117, 150), null));
        jLabel33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 610, 260, 35));

        jLabel68.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/back-arrow.png"))); // NOI18N
        jLabel68.setToolTipText("Close");
        jLabel68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel68MouseClicked(evt);
            }
        });
        jPanel7.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 35, 35));

        jPanel27.setBackground(new java.awt.Color(53, 75, 97));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Facebookicon.png"))); // NOI18N
        jLabel40.setText("Need a Help? Contact us");
        jLabel40.setToolTipText("My Facebook Profile");
        jLabel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel27.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, -1, 60));

        jLabel65.setBackground(new java.awt.Color(22, 31, 39));
        jLabel65.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 153, 0));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("HRT IT Farm");
        jLabel65.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null));
        jPanel27.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 260, 70));

        loginpageblue1.setBackground(new java.awt.Color(22, 31, 39));
        loginpageblue1.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        loginpageblue1.setForeground(new java.awt.Color(255, 255, 255));
        loginpageblue1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginpageblue1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/growth-statistics-icon.png"))); // NOI18N
        jPanel27.add(loginpageblue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 160, 140));

        jPanel7.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 480, 700));

        jTabbedPane1.addTab("Reg", jPanel7);

        jPanel8.setBackground(new java.awt.Color(44, 62, 80));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(44, 62, 80));
        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ID CSE 02006951");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 210, 30));

        Gitbtn.setBackground(new java.awt.Color(22, 31, 39));
        Gitbtn.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Gitbtn.setForeground(new java.awt.Color(255, 255, 255));
        Gitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/GitHub.png"))); // NOI18N
        Gitbtn.setText("GitHub");
        Gitbtn.setToolTipText("Our GitHub Repository");
        Gitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GitbtnActionPerformed(evt);
            }
        });
        jPanel8.add(Gitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 110, 30));

        jLabel43.setBackground(new java.awt.Color(22, 31, 39));
        jLabel43.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 51, 102));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("HRT IT Farm");
        jLabel43.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null));
        jPanel8.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 270, 70));

        jLabel49.setBackground(new java.awt.Color(22, 31, 39));
        jLabel49.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("©");
        jPanel8.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 30, 30));

        procons.setBackground(new java.awt.Color(0, 153, 51));
        procons.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        procons.setForeground(new java.awt.Color(255, 255, 255));
        procons.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Hand-thumbs-up-like-2-icon.png"))); // NOI18N
        procons.setText("Pros & Cons");
        procons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                proconsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                proconsMouseExited(evt);
            }
        });
        jPanel8.add(procons, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 115, 30));

        jLabel51.setBackground(new java.awt.Color(22, 31, 39));
        jLabel51.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Published in 1 August 2021");
        jPanel8.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 230, 50));

        jLabel53.setBackground(new java.awt.Color(22, 31, 39));
        jLabel53.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("This software is developed by");
        jPanel8.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 470, 50));

        jLabel55.setBackground(new java.awt.Color(44, 62, 80));
        jLabel55.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(51, 204, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("MD Rubel & Tapos Chondro");
        jPanel8.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 270, 30));

        jLabel54.setBackground(new java.awt.Color(22, 31, 39));
        jLabel54.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(51, 204, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText(" Batch: 20th (session 2019-2024), PCIU");
        jPanel8.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 410, 50));

        jLabel56.setBackground(new java.awt.Color(22, 31, 39));
        jLabel56.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Used Netbeans IDE & Java Swing");
        jPanel8.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 320, 50));

        jButton1.setBackground(new java.awt.Color(53, 75, 97));
        jButton1.setForeground(new java.awt.Color(0, 153, 153));
        jButton1.setBorderPainted(false);
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 10, 560));

        spus.setBackground(new java.awt.Color(22, 31, 39));
        spus.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        spus.setForeground(new java.awt.Color(255, 255, 255));
        spus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        spus.setText("♥ Support Us ♥");
        jPanel8.add(spus, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 330, 310, 50));

        abouthome.setBackground(new java.awt.Color(22, 31, 39));
        abouthome.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        abouthome.setForeground(new java.awt.Color(0, 153, 153));
        abouthome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/coffee-icon.png"))); // NOI18N
        abouthome.setToolTipText("Home");
        abouthome.setBorderPainted(false);
        abouthome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abouthomeActionPerformed(evt);
            }
        });
        jPanel8.add(abouthome, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 35, 35));

        pros.setBackground(new java.awt.Color(22, 31, 39));
        pros.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        pros.setForeground(new java.awt.Color(255, 255, 255));
        pros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/prosn.png"))); // NOI18N
        pros.setText("(Pros)");
        jPanel8.add(pros, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 190, 80));

        fr.setBackground(new java.awt.Color(22, 31, 39));
        fr.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        fr.setForeground(new java.awt.Color(255, 255, 255));
        fr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fr.setText("♦ Friendly UI");
        fr.setToolTipText("");
        jPanel8.add(fr, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 180, 40));

        so.setBackground(new java.awt.Color(22, 31, 39));
        so.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        so.setForeground(new java.awt.Color(255, 255, 255));
        so.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        so.setText("♦ Software Up time");
        so.setToolTipText("");
        jPanel8.add(so, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 170, 40));

        of.setBackground(new java.awt.Color(22, 31, 39));
        of.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        of.setForeground(new java.awt.Color(255, 255, 255));
        of.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        of.setText("♦ Offline Usable");
        of.setToolTipText("");
        jPanel8.add(of, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 180, 40));

        con.setBackground(new java.awt.Color(22, 31, 39));
        con.setFont(new java.awt.Font("MV Boli", 1, 18)); // NOI18N
        con.setForeground(new java.awt.Color(255, 255, 255));
        con.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        con.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/conscon.png"))); // NOI18N
        con.setText("(Cons)");
        jPanel8.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 340, 170, 90));

        lo.setBackground(new java.awt.Color(22, 31, 39));
        lo.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lo.setForeground(new java.awt.Color(255, 255, 255));
        lo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lo.setText("♦ Login Session Cleared");
        jPanel8.add(lo, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 230, 50));

        no.setBackground(new java.awt.Color(22, 31, 39));
        no.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        no.setForeground(new java.awt.Color(255, 255, 255));
        no.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        no.setText("♦ Manually Created DB");
        no.setToolTipText("");
        jPanel8.add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 230, 50));

        le.setBackground(new java.awt.Color(22, 31, 39));
        le.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        le.setForeground(new java.awt.Color(255, 255, 255));
        le.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        le.setText("♦ Less Secure");
        le.setToolTipText("");
        jPanel8.add(le, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 140, 50));

        jLabel57.setBackground(new java.awt.Color(22, 31, 39));
        jLabel57.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("2021. All right Reserved");
        jPanel8.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, 220, 50));

        in.setBackground(new java.awt.Color(22, 31, 39));
        in.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        in.setForeground(new java.awt.Color(255, 255, 255));
        in.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        in.setText("♦ Included with many features");
        in.setToolTipText("");
        jPanel8.add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 290, 40));

        jLabel71.setBackground(new java.awt.Color(44, 62, 80));
        jLabel71.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(51, 204, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Hasan Mahmud");
        jPanel8.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 210, 50));

        jLabel29.setBackground(new java.awt.Color(44, 62, 80));
        jLabel29.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 204, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("ID CSE 02006950");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 210, 30));

        jLabel31.setBackground(new java.awt.Color(44, 62, 80));
        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(51, 204, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("ID CSE 02006949");
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 210, 30));

        jTabbedPane1.addTab("About", jPanel8);

        chgpasspanel.setBackground(new java.awt.Color(44, 62, 80));
        chgpasspanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changepanel.setBackground(new java.awt.Color(53, 75, 97));
        changepanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 51, 51), null));
        changepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("ConfirmPass");
        changepanel.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 100, 60));

        e1.setBackground(new java.awt.Color(44, 62, 80));
        e1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        e1.setForeground(new java.awt.Color(255, 255, 255));
        e1.setDoubleBuffered(true);
        e1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                e1KeyPressed(evt);
            }
        });
        changepanel.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 200, 30));

        loginbtn1.setBackground(new java.awt.Color(255, 51, 51));
        loginbtn1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        loginbtn1.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn1.setText("Change");
        loginbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtn1ActionPerformed(evt);
            }
        });
        loginbtn1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginbtn1KeyPressed(evt);
            }
        });
        changepanel.add(loginbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 200, 30));

        c1.setBackground(new java.awt.Color(44, 62, 80));
        c1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                c1KeyPressed(evt);
            }
        });
        changepanel.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, 30));

        p1.setBackground(new java.awt.Color(44, 62, 80));
        p1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        p1.setForeground(new java.awt.Color(255, 255, 255));
        p1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                p1KeyPressed(evt);
            }
        });
        changepanel.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 30));

        jLabel66.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("New Password");
        changepanel.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, 60));

        jCheckBox2.setBackground(new java.awt.Color(53, 75, 97));
        jCheckBox2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(88, 166, 255));
        jCheckBox2.setText("Show");
        jCheckBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        changepanel.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        jLabel42.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Email Address");
        changepanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 60));

        cp.setBackground(new java.awt.Color(44, 62, 80));
        cp.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        cp.setForeground(new java.awt.Color(255, 255, 255));
        cp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpKeyPressed(evt);
            }
        });
        changepanel.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 30));

        jLabel67.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Password");
        changepanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 120, 60));

        chgpasspanel.add(changepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 260, 420));

        changesign.setBackground(new java.awt.Color(22, 31, 39));
        changesign.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        changesign.setForeground(new java.awt.Color(88, 166, 255));
        changesign.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changesign.setText("Sign In");
        changesign.setToolTipText("Click");
        changesign.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(83, 117, 150), new java.awt.Color(83, 117, 150), null));
        changesign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changesign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changesignMouseClicked(evt);
            }
        });
        chgpasspanel.add(changesign, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 260, 35));

        logintextstd1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logintextstd1.setForeground(new java.awt.Color(255, 51, 102));
        logintextstd1.setText("Change Password ");
        chgpasspanel.add(logintextstd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 150, 60));

        jLabel69.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/back-arrow.png"))); // NOI18N
        jLabel69.setToolTipText("Close");
        jLabel69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel69MouseClicked(evt);
            }
        });
        chgpasspanel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 35, 35));

        jPanel26.setBackground(new java.awt.Color(53, 75, 97));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel64.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/Facebookicon.png"))); // NOI18N
        jLabel64.setText("Need a Help? Contact us");
        jLabel64.setToolTipText("My Facebook Profile");
        jLabel64.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel26.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 210, 60));

        jLabel70.setBackground(new java.awt.Color(22, 31, 39));
        jLabel70.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(0, 153, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("HRT IT Farm");
        jLabel70.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), null));
        jPanel26.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 260, 70));

        loginpageblue2.setBackground(new java.awt.Color(22, 31, 39));
        loginpageblue2.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        loginpageblue2.setForeground(new java.awt.Color(255, 255, 255));
        loginpageblue2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginpageblue2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/JDBC_Icon/TextEdit-icon.png"))); // NOI18N
        jPanel26.add(loginpageblue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 160, 140));

        chgpasspanel.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 480, 700));

        jTabbedPane1.addTab("Changepass", chgpasspanel);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 970, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_LEFT) {

            jTabbedPane1.setEnabled(false);

        }

    }//GEN-LAST:event_jTabbedPane1KeyPressed

    private void changesignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changesignMouseClicked
        jTabbedPane1.setSelectedIndex(6);

    }//GEN-LAST:event_changesignMouseClicked

    private void cpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            p1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            e1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            p1.requestFocus();
        }
    }//GEN-LAST:event_cpKeyPressed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        if (jCheckBox2.isSelected()) {

            p1.setEchoChar((char) 0);
            c1.setEchoChar((char) 0);
            cp.setEchoChar((char) 0);

        } else {
            p1.setEchoChar('*');
            c1.setEchoChar('*');
            cp.setEchoChar('*');

        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void p1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_p1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            c1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            cp.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            c1.requestFocus();
        }
    }//GEN-LAST:event_p1KeyPressed

    private void c1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginbtn1.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            p1.requestFocus();
        }
    }//GEN-LAST:event_c1KeyPressed

    private void loginbtn1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginbtn1KeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_LEFT) {
            c1.requestFocus();
        } else {

            try {
//                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
                Class.forName("com.mysql.jdbc.Driver");
                database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/reg", "root", "");
                prestm = database_Connection.prepareStatement("SELECT Password,ConfirmPass FROM reg WHERE Email=? AND Password=? ");

                //***************************************
                if (e1.getText().isEmpty() || cp.getText().isEmpty() || c1.getText().isEmpty() || p1.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Enter your Credentials", "Want to Change Password?", JOptionPane.INFORMATION_MESSAGE);
                } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", e1.getText()))) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
                } else if (p1.getText() == null ? (c1.getText()) != null : !p1.getText().equals(c1.getText())) {
                    JOptionPane.showMessageDialog(this, "Password Does not match", "Error", JOptionPane.INFORMATION_MESSAGE);
                } else if (p1.getText().length() < 8 && c1.getText().length() < 8) {
                    JOptionPane.showMessageDialog(this, "Too Short Password", "Minimum length is 8", JOptionPane.INFORMATION_MESSAGE);
                } else if (e1.getText().length() <= 12) {
                    JOptionPane.showMessageDialog(this, "Too Short Email", "Invalid Email", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    //***************************************
                    prestm.setString(1, e1.getText());
                    prestm.setString(2, cp.getText());

                    result = prestm.executeQuery();

                    if (result.next() == false) {
                        JOptionPane.showMessageDialog(this, "Password or Email address does not match", "Incorrect Password or Email", JOptionPane.WARNING_MESSAGE);

                    } else {
                        //***************************************************************
                        //***************************************************************

                        prestm = database_Connection.prepareStatement("SELECT Password,ConfirmPass FROM reg WHERE Password=? or ConfirmPass=?");

                        prestm.setString(1, p1.getText());
                        prestm.setString(2, c1.getText());

                        result = prestm.executeQuery();

                        if (result.next() == true) {

                            if (p1.getText().equals(result.getString("Password"))) {
                                JOptionPane.showMessageDialog(null, "Already Taken this Password", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                            } else if (c1.getText().equals(result.getString("ConfirmPass"))) {
                                JOptionPane.showMessageDialog(null, "Already Taken this ConfirmPass", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                            }

                        } else {
                            //******************************************************************
                            //******************************************************************
                            prestm = database_Connection.prepareStatement("update reg set Password=?,ConfirmPass=? where Email =? ");

                            prestm.setString(1, p1.getText());
                            prestm.setString(2, c1.getText());
                            prestm.setString(3, e1.getText());

                            int showresult = JOptionPane.showConfirmDialog(null, "Do you want to Change your Password? ", "Warring", JOptionPane.YES_NO_OPTION);

                            if (showresult == JOptionPane.YES_NO_OPTION) {

                                prestm.executeUpdate();

                                JOptionPane.showMessageDialog(null, "Successfuly Changed", "Message", JOptionPane.INFORMATION_MESSAGE);

                                e1.setText(null);
                                p1.setText(null);
                                c1.setText(null);
                                cp.setText(null);

                            }

                        }
                    }
                }
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        }
    }//GEN-LAST:event_loginbtn1KeyPressed

    private void loginbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtn1ActionPerformed
        try {
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
            Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/reg", "root", "");
            prestm = database_Connection.prepareStatement("SELECT Password,ConfirmPass FROM reg WHERE Email=? AND Password=? ");

            //***************************************
            if (e1.getText().isEmpty() || cp.getText().isEmpty() || c1.getText().isEmpty() || p1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter your Credentials", "Want to Change Password?", JOptionPane.INFORMATION_MESSAGE);
            } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", e1.getText()))) {
                JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (p1.getText() == null ? (c1.getText()) != null : !p1.getText().equals(c1.getText())) {
                JOptionPane.showMessageDialog(this, "Password Does not match", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (p1.getText().length() < 8 && c1.getText().length() < 8) {
                JOptionPane.showMessageDialog(this, "Too Short Password", "Minimum length is 8", JOptionPane.INFORMATION_MESSAGE);
            } else if (e1.getText().length() <= 12) {
                JOptionPane.showMessageDialog(this, "Too Short Email", "Invalid Email", JOptionPane.INFORMATION_MESSAGE);
            } else {
                //***************************************
                prestm.setString(1, e1.getText());
                prestm.setString(2, cp.getText());

                result = prestm.executeQuery();

                if (result.next() == false) {
                    JOptionPane.showMessageDialog(this, "Password or Email address does not match", "Incorrect Password or Email", JOptionPane.WARNING_MESSAGE);

                } else {
                    //***************************************************************
                    //***************************************************************

                    prestm = database_Connection.prepareStatement("SELECT Password,ConfirmPass FROM reg WHERE Password=? or ConfirmPass=?");

                    prestm.setString(1, p1.getText());
                    prestm.setString(2, c1.getText());

                    result = prestm.executeQuery();

                    if (result.next() == true) {

                        if (p1.getText().equals(result.getString("Password"))) {
                            JOptionPane.showMessageDialog(null, "Already Taken this Password", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                        } else if (c1.getText().equals(result.getString("ConfirmPass"))) {
                            JOptionPane.showMessageDialog(null, "Already Taken this ConfirmPass", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {
                        //******************************************************************
                        //******************************************************************
                        prestm = database_Connection.prepareStatement("update reg set Password=?,ConfirmPass=? where Email =? ");

                        prestm.setString(1, p1.getText());
                        prestm.setString(2, c1.getText());
                        prestm.setString(3, e1.getText());

                        int showresult = JOptionPane.showConfirmDialog(null, "Do you want to Change your Password? ", "Warring", JOptionPane.YES_NO_OPTION);

                        if (showresult == JOptionPane.YES_NO_OPTION) {

                            prestm.executeUpdate();

                            JOptionPane.showMessageDialog(null, "Successfuly Changed", "Message", JOptionPane.INFORMATION_MESSAGE);

                            e1.setText(null);
                            p1.setText(null);
                            c1.setText(null);
                            cp.setText(null);

                        }

                    }
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_loginbtn1ActionPerformed

    private void e1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_e1KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            cp.requestFocus();
        }
    }//GEN-LAST:event_e1KeyPressed

    private void abouthomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abouthomeActionPerformed

        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_abouthomeActionPerformed

    private void proconsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proconsMouseExited

        pros.hide();
        fr.hide();
        of.hide();
        so.hide();

        spus.show();
        con.hide();
        lo.hide();
        no.hide();
        le.hide();
        in.hide();
    }//GEN-LAST:event_proconsMouseExited

    private void proconsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proconsMouseEntered

        spus.hide();
        pros.show();
        fr.show();
        of.show();
        so.show();

        con.show();
        lo.show();
        no.show();
        le.show();
        in.show();
    }//GEN-LAST:event_proconsMouseEntered

    private void GitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GitbtnActionPerformed

        Desktop github = Desktop.getDesktop();
        try {
            github.browse(new URI("https://github.com/Mahmud-Hassan21/Hasan-A2-CSE-950/tree/master"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "IOException", "Error", JOptionPane.INFORMATION_MESSAGE);
        } catch (URISyntaxException ex) {
            JOptionPane.showMessageDialog(null, "Invalid URL or Others", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_GitbtnActionPerformed

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked

        regusrnametextfield.setText(null);
        regpasstextfield.setText(null);
        confirmpass.setText(null);
        usremail.setText(null);
        jTabbedPane1.setSelectedIndex(6);

    }//GEN-LAST:event_jLabel33MouseClicked

    private void tacKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tacKeyPressed
        if (tac.isSelected()) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                regloginbtncreatenew.requestFocus();
            }
            regloginbtncreatenew.setEnabled(true);
        } else {
            regloginbtncreatenew.setEnabled(false);
        }

    }//GEN-LAST:event_tacKeyPressed

    private void tacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tacActionPerformed
        if (tac.isSelected()) {
            regloginbtncreatenew.setEnabled(true);
        } else {
            regloginbtncreatenew.setEnabled(false);
        }
    }//GEN-LAST:event_tacActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected()) {

            regpasstextfield.setEchoChar((char) 0);
            confirmpass.setEchoChar((char) 0);

        } else {
            regpasstextfield.setEchoChar('*');
            confirmpass.setEchoChar('*');

        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void usremailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usremailKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tac.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            confirmpass.requestFocus();
        }
    }//GEN-LAST:event_usremailKeyPressed

    private void confirmpassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_confirmpassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            usremail.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            regpasstextfield.requestFocus();
        }
    }//GEN-LAST:event_confirmpassKeyPressed

    private void regloginbtncreatenewKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regloginbtncreatenewKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_LEFT) {
            usremail.requestFocus();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                regloginbtncreatenew.requestFocus();
            }
            if (regusrnametextfield.getText().isEmpty() || regpasstextfield.getText().isEmpty() || confirmpass.getText().isEmpty() || usremail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter your Credentials", "Want to Sign Up?", JOptionPane.INFORMATION_MESSAGE);
            } else if (regusrnametextfield.getText() == null ? (confirmpass.getText()) != null : !regpasstextfield.getText().equals(confirmpass.getText())) {

                JOptionPane.showMessageDialog(this, "Password Does not match", "Error", JOptionPane.INFORMATION_MESSAGE);
            } else if (regusrnametextfield.getText().length() <= 3) {
                JOptionPane.showMessageDialog(this, "Too Short Usrname", "Minimum length is 5", JOptionPane.INFORMATION_MESSAGE);
            } else if (regpasstextfield.getText().length() < 8 && confirmpass.getText().length() < 8) {

                JOptionPane.showMessageDialog(this, "Too Short Password", "Minimum length is 8", JOptionPane.INFORMATION_MESSAGE);
            } else if (usremail.getText().length() <= 12) {

                JOptionPane.showMessageDialog(this, "Too Short Email", "Invalid Email", JOptionPane.INFORMATION_MESSAGE);

            } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", usremail.getText()))) {

                JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);

            } //******************************************************
            else {

                int showresult = JOptionPane.showConfirmDialog(null, "Do you want to Create an Account ? ", "Warring", JOptionPane.YES_NO_OPTION);

                if (showresult == JOptionPane.YES_NO_OPTION) {

                    //******************************************************
                    try {

//                        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                        database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
                        Class.forName("com.mysql.jdbc.Driver");
                        database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
                        prestm = database_Connection.prepareStatement("SELECT Name,Password,ConfirmPass,Email FROM reg WHERE Name=? or Password=? or ConfirmPass=? or Email=?");

                        prestm.setString(1, regusrnametextfield.getText());
                        prestm.setString(2, regpasstextfield.getText());
                        prestm.setString(3, confirmpass.getText());
                        prestm.setString(4, usremail.getText());

                        result = prestm.executeQuery();

                        if (result.next() == true) {
                            //----------
                            if (regusrnametextfield.getText().equalsIgnoreCase(result.getString("Name"))) {
                                JOptionPane.showMessageDialog(null, "Already Taken this Name ", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                            } else if (regpasstextfield.getText().equals(result.getString("Password"))) {
                                JOptionPane.showMessageDialog(null, "Already Taken this Password", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                            } else if (confirmpass.getText().equals(result.getString("ConfirmPass"))) {
                                JOptionPane.showMessageDialog(null, "Already Taken this ConfirmPass", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                            } else if (usremail.getText().equalsIgnoreCase(result.getString("Email"))) {
                                JOptionPane.showMessageDialog(null, "Already Taken this Email", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                            }

                        } else {

                            prestm = database_Connection.prepareStatement("insert into reg(Name,Password,ConfirmPass,Email)values(?,?,?,?) ");

                            prestm.setString(1, regusrnametextfield.getText());
                            prestm.setString(2, regpasstextfield.getText());
                            prestm.setString(3, confirmpass.getText());
                            prestm.setString(4, usremail.getText());
                            prestm.executeUpdate();

                            JOptionPane.showMessageDialog(this, "Account successfully created");

                            regusrnametextfield.setText(null);
                            regpasstextfield.setText(null);
                            confirmpass.setText(null);
                            usremail.setText(null);
                        }
                    } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
                        JOptionPane.showMessageDialog(null, "Something went wrong", "Failed to access database", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            }
        }
    }//GEN-LAST:event_regloginbtncreatenewKeyPressed

    private void regloginbtncreatenewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regloginbtncreatenewActionPerformed

        if (regusrnametextfield.getText().isEmpty() || regpasstextfield.getText().isEmpty() || confirmpass.getText().isEmpty() || usremail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter your Credentials", "Want to Sign Up?", JOptionPane.INFORMATION_MESSAGE);
        } else if (regusrnametextfield.getText() == null ? (confirmpass.getText()) != null : !regpasstextfield.getText().equals(confirmpass.getText())) {

            JOptionPane.showMessageDialog(this, "Password Does not match", "Error", JOptionPane.INFORMATION_MESSAGE);
        } else if (regusrnametextfield.getText().length() <= 3) {
            JOptionPane.showMessageDialog(this, "Too Short Usrname", "Minimum length is 5", JOptionPane.INFORMATION_MESSAGE);
        } else if (regpasstextfield.getText().length() < 8 && confirmpass.getText().length() < 8) {

            JOptionPane.showMessageDialog(this, "Too Short Password", "Minimum length is 8", JOptionPane.INFORMATION_MESSAGE);
        } else if (usremail.getText().length() <= 12) {

            JOptionPane.showMessageDialog(this, "Too Short Email", "Invalid Email", JOptionPane.INFORMATION_MESSAGE);

        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", usremail.getText()))) {

            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);

        } //******************************************************
        else {

            int showresult = JOptionPane.showConfirmDialog(null, "Do you want to Create an Account ? ", "Warring", JOptionPane.YES_NO_OPTION);

            if (showresult == JOptionPane.YES_NO_OPTION) {

                //******************************************************
                try {

//                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                    database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
                    Class.forName("com.mysql.jdbc.Driver");
                    database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/reg", "root", "");
                    prestm = database_Connection.prepareStatement("SELECT Name,Password,ConfirmPass,Email FROM reg WHERE Name=? or Password=? or ConfirmPass=? or Email=?");

                    prestm.setString(1, regusrnametextfield.getText());
                    prestm.setString(2, regpasstextfield.getText());
                    prestm.setString(3, confirmpass.getText());
                    prestm.setString(4, usremail.getText());

                    result = prestm.executeQuery();

                    if (result.next() == true) {
                        //----------
                        if (regusrnametextfield.getText().equalsIgnoreCase(result.getString("Name"))) {
                            JOptionPane.showMessageDialog(null, "Already Taken this Name ", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                        } else if (regpasstextfield.getText().equals(result.getString("Password"))) {
                            JOptionPane.showMessageDialog(null, "Already Taken this Password", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                        } else if (confirmpass.getText().equals(result.getString("ConfirmPass"))) {
                            JOptionPane.showMessageDialog(null, "Already Taken this ConfirmPass", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                        } else if (usremail.getText().equalsIgnoreCase(result.getString("Email"))) {
                            JOptionPane.showMessageDialog(null, "Already Taken this Email", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                        }

                    } else {

                        prestm = database_Connection.prepareStatement("insert into reg(Name,Password,ConfirmPass,Email)values(?,?,?,?) ");

                        prestm.setString(1, regusrnametextfield.getText());
                        prestm.setString(2, regpasstextfield.getText());
                        prestm.setString(3, confirmpass.getText());
                        prestm.setString(4, usremail.getText());
                        prestm.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Account successfully created");

                        regusrnametextfield.setText(null);
                        regpasstextfield.setText(null);
                        confirmpass.setText(null);
                        usremail.setText(null);
                    }
                } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Something went wrong", "Failed to access database", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_regloginbtncreatenewActionPerformed

    private void regpasstextfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regpasstextfieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            confirmpass.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            regusrnametextfield.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            confirmpass.requestFocus();
        }
    }//GEN-LAST:event_regpasstextfieldKeyPressed

    private void regusrnametextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regusrnametextfieldKeyTyped
        char num = evt.getKeyChar();

        if (!Character.isAlphabetic(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_regusrnametextfieldKeyTyped

    private void regusrnametextfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regusrnametextfieldKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            regpasstextfield.requestFocus();
        }
    }//GEN-LAST:event_regusrnametextfieldKeyPressed

    private void createannewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createannewMouseClicked
        jTabbedPane1.setSelectedIndex(7);
        regusrnametextfield.requestFocus();

    }//GEN-LAST:event_createannewMouseClicked

    private void forgotpass2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpass2MouseClicked

//        JTextField txtemail = new JTextField();
//        JPasswordField txtpass = new JPasswordField();
//        
//        txtemail.setBackground(Color.yellow);
//        txtemail.setForeground(Color.RED);
        e1.setBackground(Color.white);
        cp.setBackground(Color.white);

        e1.setForeground(Color.DARK_GRAY);
        cp.setForeground(Color.DARK_GRAY);

        Object[] textbox = {
            "Email Address", e1,
            "Password", cp
        };

        JOptionPane.showConfirmDialog(null, textbox, "Enter Your Email & Password", JOptionPane.OK_CANCEL_OPTION);

        //*****************************************
        try {
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
            Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/reg", "root", "");
            prestm = database_Connection.prepareStatement("SELECT Password,ConfirmPass FROM reg WHERE Email=? And Password=?");

            prestm.setString(1, e1.getText());
            prestm.setString(2, cp.getText());

            result = prestm.executeQuery();

            if (result.next() == true) {

                //****************
                int showresult = JOptionPane.showConfirmDialog(null, "Do you want to delete this account ? ", "Warring", JOptionPane.YES_NO_OPTION);

                if (showresult == JOptionPane.YES_NO_OPTION) {
                    //********************
                    prestm = database_Connection.prepareStatement("delete from reg where Email =? ");
                    prestm.setString(1, e1.getText());
                    prestm.executeUpdate();

                    JOptionPane.showMessageDialog(null, "Successfuly Deleted", "Message", JOptionPane.INFORMATION_MESSAGE);

                }
                //***********************

                //
            } else if (result.next() == false) {
                JOptionPane.showMessageDialog(this, "Email Or Password does not match", "Incorrect Email", JOptionPane.WARNING_MESSAGE);
            } else {

            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        //*******************************************************

//        loginpageblueicon2.hide();
//        delpanel.show();

    }//GEN-LAST:event_forgotpass2MouseClicked

    private void jLabel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel59MouseClicked

        jTabbedPane1.setSelectedIndex(9);
    }//GEN-LAST:event_jLabel59MouseClicked

    private void forgotpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotpassMouseClicked

        try {

//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/reg", "root", "");
            prestm = database_Connection.prepareStatement("SELECT Name,Password FROM reg WHERE Email=? ");

            String Input = JOptionPane.showInputDialog(null, "Enter your email address below", "Password Recovery", JOptionPane.QUESTION_MESSAGE);

            prestm.setString(1, Input);

            result = prestm.executeQuery();
            if (result.next() == true) {

                String Credentials = "Usrname is: " + result.getString("Name") + "\n\nPassword is: " + result.getString("Password");
                JOptionPane jo = new JOptionPane(Credentials);
                jo.setMessageType(JOptionPane.INFORMATION_MESSAGE);

                JDialog dialog = jo.createDialog(Credentials);
                dialog = jo.createDialog(null, "Credentials");
                dialog.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Email address does not match", "Incorrect Email", JOptionPane.WARNING_MESSAGE);
            }

        } catch (HeadlessException | NumberFormatException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }//GEN-LAST:event_forgotpassMouseClicked

    private void passlogintextfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passlogintextfieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            loginbtn.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            regusrnamelogintextfield.requestFocus();
        }
    }//GEN-LAST:event_passlogintextfieldKeyPressed

    private void loginbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginbtnKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_RIGHT || evt.getKeyCode() == KeyEvent.VK_LEFT) {
            passlogintextfield.requestFocus();
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                loginbtn.requestFocus();
            }

            String usrname = regusrnamelogintextfield.getText();
            String password = passlogintextfield.getText();

            if (regusrnamelogintextfield.getText().isEmpty() || passlogintextfield.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter Usrname or Password ", "Want to Sign In?", JOptionPane.INFORMATION_MESSAGE);
            } else {
                try {
//                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                    database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
                    Class.forName("com.mysql.jdbc.Driver");
                    database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/reg", "root", "");
                    prestm = database_Connection.prepareStatement("select * from reg where Name=? and Password=? ");

                    prestm.setString(1, usrname);
                    prestm.setString(2, password);

                    result = prestm.executeQuery();

                    result.next();

                    if (usrname.contains(result.getString("Name")) && password.contains(result.getString("Password")));
                    {
                        regusrnamelogintextfield.setText(null);
                        passlogintextfield.setText(null);

                        jTabbedPane1.setSelectedIndex(1);
                        signout.show();
                        signout.setEnabled(true);

                    }

                } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, "Incorrect Credentials", "Sign In Error", JOptionPane.INFORMATION_MESSAGE);
                    // JOptionPane.showMessageDialog(this, ex);

                    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

                        regusrnamelogintextfield.requestFocus();

                    }

                }
                // regusrnamelogintextfield.setText(null);
                passlogintextfield.setText(null);
            }
        }
    }//GEN-LAST:event_loginbtnKeyPressed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed

        String usrname = regusrnamelogintextfield.getText();
        String password = passlogintextfield.getText();

        if (regusrnamelogintextfield.getText().isEmpty() || passlogintextfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Usrname or Password ", "Want to Sign In?", JOptionPane.INFORMATION_MESSAGE);
        } else {

            try {
//                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
                Class.forName("com.mysql.jdbc.Driver");
                database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/reg", "root", "");
                prestm = database_Connection.prepareStatement("select * from reg where Name=? and Password=? ");

                prestm.setString(1, usrname);
                prestm.setString(2, password);

                result = prestm.executeQuery();

                result.next();

                if (usrname.contains(result.getString("Name")) && password.contains(result.getString("Password")));
                {
                    regusrnamelogintextfield.setText(null);
                    passlogintextfield.setText(null);

                    jTabbedPane1.setSelectedIndex(1);
                    signout.show();
                    signout.setEnabled(true);
                }

            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Incorrect Credentials", "Sign In Error", JOptionPane.INFORMATION_MESSAGE);
                //JOptionPane.showMessageDialog(this, ex);
                regusrnamelogintextfield.requestFocus();

            }

            // regusrnamelogintextfield.setText(null);
            passlogintextfield.setText(null);

        }
    }//GEN-LAST:event_loginbtnActionPerformed

    private void regusrnamelogintextfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regusrnamelogintextfieldKeyTyped
        char num = evt.getKeyChar();

        if (!Character.isAlphabetic(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_regusrnamelogintextfieldKeyTyped

    private void regusrnamelogintextfieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_regusrnamelogintextfieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            passlogintextfield.requestFocus();
        }
    }//GEN-LAST:event_regusrnamelogintextfieldKeyPressed

    private void back7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back7ActionPerformed

        String usrname = regusrnamelogintextfield.getText();
        String password = passlogintextfield.getText();

        try {
//            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/reg.accdb");
            Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/reg", "root", "");
            prestm = database_Connection.prepareStatement("select * from reg where Name=? and Password=? ");

            prestm.setString(1, usrname);
            prestm.setString(2, password);

            result = prestm.executeQuery();
            result.next();

            if (usrname.contains(result.getString("Name")) && password.contains(result.getString("Password")));
            {
                regusrnamelogintextfield.setText(null);
                passlogintextfield.setText(null);

                jTabbedPane1.setSelectedIndex(1);
                everything.setEnabled(true);
                sdsheet.setEnabled(true);
                //Gitbtn.setEnabled(true);
                key.setEnabled(true);

            }

        } catch (SQLException ex) {

            //JOptionPane.showMessageDialog(null, "SQLException", "Error", JOptionPane.INFORMATION_MESSAGE);
            jTabbedPane1.setSelectedIndex(1);
            //**************************
            //            everything.setEnabled(false);
            //            sdsheet.setEnabled(false);
            everything.hide();
            sdsheet.hide();
            //**********************
            //Gitbtn.setEnabled(false);
            rightsign.show();
            key.setEnabled(true);
            //*********************
            //            signout.show();
            //            signout.setEnabled(false);
            //**************************
            signout.hide();
            hmit.show();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "ClassNotFoundException", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        regusrnamelogintextfield.setText(null);
        passlogintextfield.setText(null);
    }//GEN-LAST:event_back7ActionPerformed

    private void printdatabasemodify3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printdatabasemodify3ActionPerformed
        MessageFormat header = new MessageFormat("Student Data Sheet of PCIU");
        MessageFormat footer = new MessageFormat("HM IT Farm");

        try {

            table3.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Could not Print", "Printing Error", JOptionPane.INFORMATION_MESSAGE);

        }
    }//GEN-LAST:event_printdatabasemodify3ActionPerformed

    private void back3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back3ActionPerformed
        signout.show();
        signout.setEnabled(true);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_back3ActionPerformed

    private void btnreset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset3ActionPerformed
        txtfname3.setText(null);
        txtfroll3.setText(null);
        txtfbatch3.setText(null);
        //jComboBox3.setSelectedItem(null);
        txtfuni3.setText(null);
        txtfphone3.setText(null);
    }//GEN-LAST:event_btnreset3ActionPerformed

    private void btndelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete1ActionPerformed

        try {
            DefaultTableModel update = (DefaultTableModel) table3.getModel();
            int selectedindex = table3.getSelectedRow();

            int id = Integer.parseInt(update.getValueAt(selectedindex, 0).toString());

            int showresult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the record ? ", "Warring", JOptionPane.YES_NO_OPTION);

            if (showresult == JOptionPane.YES_NO_OPTION) {

//                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
                Class.forName("com.mysql.jdbc.Driver");
                database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
                prestm = database_Connection.prepareStatement("delete from student where id =? ");

                prestm.setInt(1, id);
                int k = prestm.executeUpdate();
                if (k == 1) {

                    JOptionPane.showMessageDialog(this, "Data has been Deleted");
                    insert_into_Jtable3();
                    txtfname3.setText("");
                    txtfroll3.setText("");
                    txtfbatch3.setText("");
                    jComboBox3.setSelectedItem("");
                    txtfuni3.setText("");
                    txtfphone3.setText("");
                    txtfname3.requestFocus();

                    insert_into_Jtable1();
                    insert_into_Jtable2();
                    insert_into_Jtable3();

                    countupdate();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Nothing here to delete", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btndelete1ActionPerformed

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed

        if (txtfname3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "This NameField is Empty", "Student Name", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtfname3.getText().length() <= 3) {
            JOptionPane.showMessageDialog(this, "Too Short Name", "Student Name", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtfphone3.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "This PhoneField is Empty ", "Student Phone Number", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtfphone3.getText().length() != 11) {
            JOptionPane.showMessageDialog(this, "Supported length of Phone Number is 11", "Requirement does not match", JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {
                DefaultTableModel update = (DefaultTableModel) table3.getModel();
                int selectedindex = table3.getSelectedRow();

                int id = Integer.parseInt(update.getValueAt(selectedindex, 0).toString());

                String name, roll, batch, department, university, phone;

                name = txtfname3.getText();
                roll = txtfroll3.getText();
                batch = txtfbatch3.getText();
                department = jComboBox3.getSelectedItem().toString();
                university = txtfuni3.getText();
                phone = txtfphone3.getText();

//                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
                Class.forName("com.mysql.jdbc.Driver");
                database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
                prestm = database_Connection.prepareStatement("update student set Name=?,Roll=?,Batch=?,Department=?,University=?,Phone=? where id =? ");
                prestm.setString(1, name);
                prestm.setString(2, roll);
                prestm.setString(3, batch);
                prestm.setString(4, department);
                prestm.setString(5, university);
                prestm.setString(6, phone);
                prestm.setInt(7, id);
                prestm.executeUpdate();

                JOptionPane.showMessageDialog(this, "Data has been Updated");

                txtfname3.setText("");
                txtfroll3.setText("");
                txtfbatch3.setText("");
                jComboBox3.setSelectedItem("");
                txtfuni3.setText("");
                txtfphone3.setText("");
                //-------------------------------
                txtfname3.requestFocus();

                insert_into_Jtable1();
                insert_into_Jtable2();
                insert_into_Jtable3();

            } catch (ClassNotFoundException | SQLException | ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong", "Unable to access database", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnupdate1ActionPerformed

    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        jTabbedPane1.setSelectedIndex(4);

        insert_into_Jtable1();
        insert_into_Jtable2();
        insert_into_Jtable3();
    }//GEN-LAST:event_back2ActionPerformed

    private void table3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            try {
                DefaultTableModel update = (DefaultTableModel) table3.getModel();
                int selectedindex = table3.getSelectedRow();

                txtfname3.setText(update.getValueAt(selectedindex, 1).toString());
                txtfroll3.setText(update.getValueAt(selectedindex, 2).toString());
                txtfbatch3.setText(update.getValueAt(selectedindex, 3).toString());
                jComboBox3.setSelectedItem(update.getValueAt(selectedindex, 4).toString());
                txtfuni3.setText(update.getValueAt(selectedindex, 5).toString());
                txtfphone3.setText(update.getValueAt(selectedindex, 6).toString());
            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_table3KeyPressed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        try {
            DefaultTableModel update = (DefaultTableModel) table3.getModel();

            int selectedindex = table3.getSelectedRow();

            txtfname3.setText(update.getValueAt(selectedindex, 1).toString());
            txtfroll3.setText(update.getValueAt(selectedindex, 2).toString());
            txtfbatch3.setText(update.getValueAt(selectedindex, 3).toString());
            jComboBox3.setSelectedItem(update.getValueAt(selectedindex, 4).toString());
            txtfuni3.setText(update.getValueAt(selectedindex, 5).toString());
            txtfphone3.setText(update.getValueAt(selectedindex, 6).toString());

        } catch (Exception ex) {

        }
    }//GEN-LAST:event_table3MouseClicked

    private void txtfroll3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfroll3KeyTyped
        char ch = evt.getKeyChar();

        if (!Character.isDigit(ch)) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtfroll3KeyTyped

    private void txtfroll3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfroll3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfbatch3.requestFocus();
        }
    }//GEN-LAST:event_txtfroll3KeyPressed

    private void txtfname3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfname3KeyTyped
        char num = evt.getKeyChar();

        if (Character.isDigit(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfname3KeyTyped

    private void txtfname3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfname3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfroll3.requestFocus();
        }
    }//GEN-LAST:event_txtfname3KeyPressed

    private void txtfuni3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfuni3KeyTyped
        char num = evt.getKeyChar();

        if (Character.isDigit(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfuni3KeyTyped

    private void txtfuni3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfuni3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfphone3.requestFocus();
        }
    }//GEN-LAST:event_txtfuni3KeyPressed

    private void txtfphone3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfphone3KeyTyped
        char ch = evt.getKeyChar();

        if (!Character.isDigit(ch)) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtfphone3KeyTyped

    private void txtfbatch3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfbatch3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfuni3.requestFocus();
        }
    }//GEN-LAST:event_txtfbatch3KeyPressed

    private void printdatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printdatabaseActionPerformed
        MessageFormat header = new MessageFormat("Student Data Sheet of PCIU");
        MessageFormat footer = new MessageFormat("HM IT Farm");

        try {

            table2.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Could not Print", "Printing Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_printdatabaseActionPerformed

    private void databasehomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_databasehomebtnActionPerformed
        signout.show();
        signout.setEnabled(true);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_databasehomebtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTabbedPane1.setSelectedIndex(5);
        countupdate();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void back4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back4ActionPerformed
        signout.show();
        signout.setEnabled(true);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_back4ActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
        insert_into_Jtable1();
        insert_into_Jtable2();
        insert_into_Jtable3();
    }//GEN-LAST:event_back1ActionPerformed

    private void btnreset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset2ActionPerformed
        txtfname2.setText(null);
        txtfroll2.setText(null);
        txtfbatch2.setText(null);
        // jComboBox2.setSelectedItem(null);
        txtfuni2.setText(null);
        txtfphone2.setText(null);
    }//GEN-LAST:event_btnreset2ActionPerformed

    private void btninsert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsert1ActionPerformed

        try {
            String name, roll, batch, department, university, phone;
            name = txtfname2.getText();
            roll = txtfroll2.getText();
            batch = txtfbatch2.getText();
            department = jComboBox2.getSelectedItem().toString();
            university = txtfuni2.getText();
            phone = txtfphone2.getText();

//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
////  Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
            prestm = database_Connection.prepareStatement("SELECT Roll,Phone FROM student WHERE Roll=? or Phone=? ");
            prestm.setString(1, txtfroll2.getText());
            prestm.setString(2, txtfphone2.getText());
            result = prestm.executeQuery();
            if (result.next() == true) {

                if (txtfroll2.getText().equals(result.getString("Roll"))) {
                    JOptionPane.showMessageDialog(null, "Already Taken this Roll", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                }
                if (txtfphone2.getText().equals(result.getString("Phone"))) {
                    JOptionPane.showMessageDialog(null, "Already Taken this Phone Number", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                }
            } else if (txtfname2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "This NameField is Empty", "Student Name", JOptionPane.INFORMATION_MESSAGE);
            } else if (txtfname2.getText().length() <= 3) {
                JOptionPane.showMessageDialog(this, "Too Short Name", "Student Name", JOptionPane.INFORMATION_MESSAGE);
            } else if (txtfphone2.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "This PhoneField is Empty ", "Student Phone Number", JOptionPane.INFORMATION_MESSAGE);
            } else if (txtfphone2.getText().length() != 11) {
                JOptionPane.showMessageDialog(this, "Supported length of Phone Number is 11", "Requirement does not match", JOptionPane.INFORMATION_MESSAGE);
            } else {

                try {
//                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                    database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
                    Class.forName("com.mysql.jdbc.Driver");
                    database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
                    prestm = database_Connection.prepareStatement("Insert into student(Name,Roll,Batch,Department,University,Phone)values(?,?,?,?,?,?) ");
                    prestm.setString(1, name);
                    prestm.setString(2, roll);
                    prestm.setString(3, batch);
                    prestm.setString(4, department);
                    prestm.setString(5, university);
                    prestm.setString(6, phone);
                    int k = prestm.executeUpdate();

                    // prestm.executeQuery();
                    if (k == 1) {
                        JOptionPane.showMessageDialog(this, "Data has been Inserted");

                        txtfname2.setText("");
                        txtfroll2.setText("");
                        txtfbatch2.setText("");
                        jComboBox2.setSelectedItem("");
                        txtfuni2.setText("");
                        txtfphone2.setText("");
                        txtfname2.requestFocus();

                        insert_into_Jtable1();
                        insert_into_Jtable2();
                        insert_into_Jtable3();
                        countupdate();
                    }

                } catch (ClassNotFoundException | SQLException ex) {

                    JOptionPane.showMessageDialog(null, "Something went wrong", "Unable to access database", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBC_CRUD_Black.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btninsert1ActionPerformed

    private void txtfroll2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfroll2KeyTyped
        char ch = evt.getKeyChar();

        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfroll2KeyTyped

    private void txtfroll2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfroll2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfbatch2.requestFocus();
        }
    }//GEN-LAST:event_txtfroll2KeyPressed

    private void txtfname2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfname2KeyTyped
        char num = evt.getKeyChar();

        if (Character.isDigit(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfname2KeyTyped

    private void txtfname2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfname2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfroll2.requestFocus();
        }
    }//GEN-LAST:event_txtfname2KeyPressed

    private void txtfuni2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfuni2KeyTyped
        char num = evt.getKeyChar();

        if (Character.isDigit(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfuni2KeyTyped

    private void txtfuni2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfuni2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfphone2.requestFocus();
        }
    }//GEN-LAST:event_txtfuni2KeyPressed

    private void txtfphone2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfphone2KeyTyped
        char ch = evt.getKeyChar();

        if (!Character.isDigit(ch)) {
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtfphone2KeyTyped

    private void txtfbatch2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfbatch2KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfuni2.requestFocus();
        }
    }//GEN-LAST:event_txtfbatch2KeyPressed

    private void alinonedatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alinonedatabaseActionPerformed
        MessageFormat header = new MessageFormat("Student Data Sheet of PCIU");
        MessageFormat footer = new MessageFormat("HM IT Farm");

        try {

            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);

        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this, "Could't Print", "Printing Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_alinonedatabaseActionPerformed

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed
        txtfname.setText(null);
        txtfroll.setText(null);
        txtfbatch.setText(null);
        //jComboBox1.setSelectedItem(null);
        txtfuni.setText(null);
        txtfphone.setText(null);
    }//GEN-LAST:event_btnreset1ActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed

        try {

            DefaultTableModel update = (DefaultTableModel) table.getModel();

            int selectedindex = table.getSelectedRow();

            int id = Integer.parseInt(update.getValueAt(selectedindex, 0).toString());

            int showresult = JOptionPane.showConfirmDialog(null, "Do you want to Delete the record ? ", "Warring", JOptionPane.YES_NO_OPTION);

            if (showresult == JOptionPane.YES_NO_OPTION) {

//                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
                Class.forName("com.mysql.jdbc.Driver");
                database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
                prestm = database_Connection.prepareStatement("delete from student where ID =? ");

                prestm.setInt(1, id);
                int k = prestm.executeUpdate();

                if (k == 1) {

                    JOptionPane.showMessageDialog(this, "Data has been Deleted");

                    insert_into_Jtable1();
                    insert_into_Jtable2();
                    insert_into_Jtable3();
                    txtfname.setText("");
                    txtfroll.setText("");
                    txtfbatch.setText("");
                    jComboBox1.setSelectedItem("");
                    txtfuni.setText("");
                    txtfphone.setText("");
                    txtfname.requestFocus();

                    countupdate();
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(this, "Nothing here to delete", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        if (txtfname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "This NameField is Empty", "Student Name", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtfname.getText().length() <= 3) {
            JOptionPane.showMessageDialog(this, "Too Short Name", "Student Name", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtfphone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "This PhoneField is Empty ", "Student Phone Number", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtfphone.getText().length() != 11) {
            JOptionPane.showMessageDialog(this, "Supported length of Phone Number is 11", "Requirement does not match", JOptionPane.INFORMATION_MESSAGE);
        } else {

            try {
                DefaultTableModel update = (DefaultTableModel) table.getModel();
                int selectedindex = table.getSelectedRow();

                int id = Integer.parseInt(update.getValueAt(selectedindex, 0).toString());

                String name, roll, batch, department, university, phone;

                name = txtfname.getText();
                roll = txtfroll.getText();
                batch = txtfbatch.getText();
                department = jComboBox1.getSelectedItem().toString();
                university = txtfuni.getText();
                phone = txtfphone.getText();

//                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
                Class.forName("com.mysql.jdbc.Driver");
                database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
                prestm = database_Connection.prepareStatement("update student set Name=?,Roll=?,Batch=?,Department=?,University=?,Phone=? where id =? ");
                prestm.setString(1, name);
                prestm.setString(2, roll);
                prestm.setString(3, batch);
                prestm.setString(4, department);
                prestm.setString(5, university);
                prestm.setString(6, phone);
                prestm.setInt(7, id);
                prestm.executeUpdate();

                JOptionPane.showMessageDialog(this, "Data has been Updated");

                txtfname.setText("");
                txtfroll.setText("");
                txtfbatch.setText("");
                jComboBox1.setSelectedItem("");
                txtfuni.setText("");
                txtfphone.setText("");

                txtfname.requestFocus();

                insert_into_Jtable1();
                insert_into_Jtable2();
                insert_into_Jtable3();

            } catch (ClassNotFoundException | SQLException | ArrayIndexOutOfBoundsException ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong", "Unable to access database", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed

        try {
            String name, roll, batch, department, university, phone;
            name = txtfname.getText();
            roll = txtfroll.getText();
            batch = txtfbatch.getText();
            department = jComboBox1.getSelectedItem().toString();
            university = txtfuni.getText();
            phone = txtfphone.getText();
//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
            ////Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
            prestm = database_Connection.prepareStatement("SELECT Roll,Phone FROM student WHERE Roll=? or Phone=? ");
            prestm.setString(1, txtfroll.getText());
            prestm.setString(2, txtfphone.getText());
            result = prestm.executeQuery();
            if (result.next() == true) {

                if (txtfroll.getText().equals(result.getString("Roll"))) {
                    JOptionPane.showMessageDialog(null, "Already Taken this Roll", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                }
                if (txtfphone.getText().equals(result.getString("Phone"))) {
                    JOptionPane.showMessageDialog(null, "Already Taken this Phone Number", "Duplicate Cradentials", JOptionPane.WARNING_MESSAGE);
                }
            } else if (txtfname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "This NameField is Empty", "Student Name", JOptionPane.INFORMATION_MESSAGE);
            } else if (txtfname.getText().length() <= 3) {
                JOptionPane.showMessageDialog(this, "Too Short Name", "Student Name", JOptionPane.INFORMATION_MESSAGE);
            } else if (txtfphone.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "This PhoneField is Empty ", "Student Phone Number", JOptionPane.INFORMATION_MESSAGE);
            } else if (txtfphone.getText().length() != 11) {
                JOptionPane.showMessageDialog(this, "Supported length of Phone Number is 11", "Requirement does not match", JOptionPane.INFORMATION_MESSAGE);
            } else {

                try {
//                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//
//                    database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");

                    Class.forName("com.mysql.jdbc.Driver");
                    database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
                    prestm = database_Connection.prepareStatement("Insert into student(Name,Roll,Batch,Department,University,Phone)values(?,?,?,?,?,?) ");

                    prestm.setString(1, name);
                    prestm.setString(2, roll);
                    prestm.setString(3, batch);
                    prestm.setString(4, department);
                    prestm.setString(5, university);
                    prestm.setString(6, phone);
                    int k = prestm.executeUpdate();

                    if (k == 1) {

                        JOptionPane.showMessageDialog(this, "Data has been Inserted");

                        txtfname.setText("");
                        txtfroll.setText("");
                        txtfbatch.setText("");
                        jComboBox1.setSelectedItem("");
                        txtfuni.setText("");
                        txtfphone.setText("");
                        //-------------------------------
                        txtfname.requestFocus();

                        insert_into_Jtable1();
                        insert_into_Jtable2();
                        insert_into_Jtable3();

                        countupdate();

                    }

                } catch (ClassNotFoundException | SQLException ex) {

                    JOptionPane.showMessageDialog(null, "Something went wrong", "Unable to access database", JOptionPane.INFORMATION_MESSAGE);

                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Something went wrong", "Unable to access database", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btninsertActionPerformed

//********************************************************************************
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

        signout.show();
        signout.setEnabled(true);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_backActionPerformed

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            try {
                DefaultTableModel update = (DefaultTableModel) table.getModel();
                int selectedindex = table.getSelectedRow();

                txtfname.setText(update.getValueAt(selectedindex, 1).toString());
                txtfroll.setText(update.getValueAt(selectedindex, 2).toString());
                txtfbatch.setText(update.getValueAt(selectedindex, 3).toString());
                jComboBox1.setSelectedItem(update.getValueAt(selectedindex, 4).toString());
                txtfuni.setText(update.getValueAt(selectedindex, 5).toString());
                txtfphone.setText(update.getValueAt(selectedindex, 6).toString());
            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_tableKeyPressed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        try {
            DefaultTableModel update = (DefaultTableModel) table.getModel();
            int selectedindex = table.getSelectedRow();

            txtfname.setText(update.getValueAt(selectedindex, 1).toString());
            txtfroll.setText(update.getValueAt(selectedindex, 2).toString());
            txtfbatch.setText(update.getValueAt(selectedindex, 3).toString());
            jComboBox1.setSelectedItem(update.getValueAt(selectedindex, 4).toString());
            txtfuni.setText(update.getValueAt(selectedindex, 5).toString());
            txtfphone.setText(update.getValueAt(selectedindex, 6).toString());
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_tableMouseClicked

    private void txtfrollKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfrollKeyTyped
        char ch = evt.getKeyChar();

        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfrollKeyTyped

    private void txtfrollKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfrollKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfbatch.requestFocus();
        }
    }//GEN-LAST:event_txtfrollKeyPressed

    private void txtfnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyTyped
        char num = evt.getKeyChar();

        if (Character.isDigit(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfnameKeyTyped

    private void txtfnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfroll.requestFocus();
        }
    }//GEN-LAST:event_txtfnameKeyPressed

    private void txtfuniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfuniKeyTyped
        char num = evt.getKeyChar();

        if (Character.isDigit(num)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfuniKeyTyped

    private void txtfuniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfuniKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfphone.requestFocus();
        }
    }//GEN-LAST:event_txtfuniKeyPressed

    private void txtfphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfphoneKeyTyped
        char ch = evt.getKeyChar();

        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtfphoneKeyTyped

    private void txtfbatchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfbatchKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtfuni.requestFocus();
        }
    }//GEN-LAST:event_txtfbatchKeyPressed

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed

        everything.show();
        sdsheet.show();
        rightsign.hide();
        key.setEnabled(false);
        //Gitbtn.setEnabled(true);
        signout.setEnabled(true);

        jTabbedPane1.setSelectedIndex(6);
        regusrnamelogintextfield.requestFocus();
        everything.setEnabled(true);
        sdsheet.setEnabled(true);
        hmit.hide();

    }//GEN-LAST:event_keyActionPerformed

    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
        //        everything.setEnabled(false);
        //        sdsheet.setEnabled(false);
        everything.hide();
        sdsheet.hide();
        key.setEnabled(true);
        //        signout.show();
        //        signout.setEnabled(false);
        signout.hide();
        rightsign.show();
        hmit.show();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_signoutActionPerformed

    private void aboutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbtnActionPerformed

        pros.hide();
        lo.hide();
        no.hide();
        le.hide();

        con.hide();
        fr.hide();
        of.hide();
        so.hide();

        in.hide();

        jTabbedPane1.setSelectedIndex(8);
    }//GEN-LAST:event_aboutbtnActionPerformed

    private void everythingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_everythingActionPerformed

        jTabbedPane1.setSelectedIndex(2);
        aboutbtn.setEnabled(true);
        countupdate();
    }//GEN-LAST:event_everythingActionPerformed

    private void sdsheetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sdsheetActionPerformed

        jTabbedPane1.setSelectedIndex(4);
        aboutbtn.setEnabled(true);
        countupdate();
    }//GEN-LAST:event_sdsheetActionPerformed

    private void jLabel68MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel68MouseClicked
        jTabbedPane1.setSelectedIndex(6);

    }//GEN-LAST:event_jLabel68MouseClicked

    private void jLabel69MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel69MouseClicked
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel69MouseClicked

    public static void main(String args[]) {

        Main();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
//            
//            com.jtattoo.plaf.hifi.HiFiLookAndFeel.setTheme("Blue", "INSERT YOUR LICENSE KEY HERE", "my company");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
//
//         com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.setTheme("Green", "INSERT YOUR LICENSE KEY HERE", "my company");
//            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

//            com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setTheme("Red", "INSERT YOUR LICENSE KEY HERE", "my company");
//         UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDBC_CRUD_Black.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        JDBC_CRUD_Black ld = new JDBC_CRUD_Black();

        ld.setVisible(true);

        try {
            for (int i = 0; i <= 100; i++) {
                //TimeUnit.SECONDS.sleep(0);

                Thread.sleep(15);
                ld.Loadingvalue.setText(i + "%");

                if (i == 10) {
                    Thread.sleep(25);
                    ld.loadinglabel.setText("Turning On Modules...");
                }

                if (i == 20) {
                    ld.loadinglabel.setText("Loading Modules...");
                    Thread.sleep(25);
                }
                if (i == 50) {
                    ld.loadinglabel.setText("Connecting to Database...");
                }
                if (i == 70) {
                    ld.loadinglabel.setText("Connection Successful...");
                    Thread.sleep(25);
                }
                if (i == 90) {
                    ld.loadinglabel.setText("Launching Application...");
                }
                JDBC_CRUD_Black.jProgressBar1.setValue(i);
                if (i == 100) {
                    Thread.sleep(250);
                    ld.jTabbedPane1.setSelectedIndex(1);

                }

            }
        } catch (InterruptedException ex) {

            JOptionPane.showMessageDialog(null, "InterruptedException", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    //******************* sys up time **************************************

    public static void Main() {
        JDBC_CRUD_Black ld = new JDBC_CRUD_Black();

        // Enable this to use Normal Timer
        JDBC_CRUD_Black.sysuptime.setText("00:00");
        second = 0;
        minute = 0;
        normalTimer();
        timer.start();

    }

    // Enable this to use Normal Timer
    public static void normalTimer() {

        JDBC_CRUD_Black ld = new JDBC_CRUD_Black();

        timer = new Timer(1000, (ActionEvent e) -> {
            second++;

            ddSecond = dFormat.format(second);
            ddMinute = dFormat.format(minute);

            JDBC_CRUD_Black.sysuptime.setText("Up time " + ddMinute + ":" + ddSecond);

            if (second == 60) {
                second = 0;
                minute++;

                ddSecond = dFormat.format(second);
                ddMinute = dFormat.format(minute);

                JDBC_CRUD_Black.sysuptime.setText("Up time " + ddMinute + ":" + ddSecond);

            }
        });
    }
//***********************************************

    public void countupdate() {
        try {
//            database_Connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Student Database/Database.accdb");
//  Class.forName("com.mysql.jdbc.Driver");
            database_Connection = DriverManager.getConnection("jdbc:mysql://localhost/student", "root", "");
            prestm = database_Connection.prepareStatement("SELECT COUNT(*) as ID FROM student");
            result = prestm.executeQuery();

            while (result.next()) {
                int count = result.getInt("ID");

                dball.setText(String.valueOf(count));
                dbshow.setText(String.valueOf(count));
                dbmo.setText(String.valueOf(count));

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
    }

//*******************************************

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Gitbtn;
    private javax.swing.JLabel Loadingvalue;
    private javax.swing.JButton aboutbtn;
    private javax.swing.JButton abouthome;
    private javax.swing.JButton alinonedatabase;
    private javax.swing.JLabel allinonedatabase;
    private javax.swing.JButton back;
    private javax.swing.JButton back1;
    private javax.swing.JButton back2;
    private javax.swing.JButton back3;
    private javax.swing.JButton back4;
    private javax.swing.JButton back7;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btndelete1;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btninsert1;
    private javax.swing.JButton btnreset1;
    private javax.swing.JButton btnreset2;
    private javax.swing.JButton btnreset3;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JPasswordField c1;
    private javax.swing.JPanel changepanel;
    private javax.swing.JLabel changesign;
    private javax.swing.JPanel chgpasspanel;
    private javax.swing.JLabel con;
    private javax.swing.JPasswordField confirmpass;
    private javax.swing.JPasswordField cp;
    private javax.swing.JLabel createannew;
    private javax.swing.JButton databasehomebtn;
    private javax.swing.JLabel databasetabtotalstudent;
    private javax.swing.JButton dball;
    private javax.swing.JButton dbmo;
    private javax.swing.JButton dbshow;
    public static javax.swing.JTextField e1;
    private javax.swing.JButton everything;
    private javax.swing.JLabel forgotpass;
    private javax.swing.JLabel forgotpass2;
    private javax.swing.JLabel fr;
    private javax.swing.JLabel hmit;
    private javax.swing.JLabel in;
    private javax.swing.JLabel j;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    public static javax.swing.JPanel jPanel9;
    public static javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton key;
    private javax.swing.JLabel le;
    private javax.swing.JLabel lo;
    private javax.swing.JLabel loadinglabel;
    private javax.swing.JLabel loadinglabel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JButton loginbtn1;
    private javax.swing.JLabel loginicongreeen;
    private javax.swing.JLabel loginpageblue;
    private javax.swing.JLabel loginpageblue1;
    private javax.swing.JLabel loginpageblue2;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JLabel logintextstd;
    private javax.swing.JLabel logintextstd1;
    private javax.swing.JLabel modifytabtotalstudent;
    private javax.swing.JLabel newhere;
    private javax.swing.JLabel no;
    private javax.swing.JLabel of;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField passlogintextfield;
    private javax.swing.JButton printdatabase;
    private javax.swing.JButton printdatabasemodify3;
    private javax.swing.JLabel procons;
    private javax.swing.JLabel pros;
    private javax.swing.JButton regloginbtncreatenew;
    private javax.swing.JPasswordField regpasstextfield;
    public static javax.swing.JTextField regusrnamelogintextfield;
    private javax.swing.JTextField regusrnametextfield;
    private javax.swing.JLabel rightsign;
    private javax.swing.JButton sdsheet;
    private javax.swing.JButton signout;
    private javax.swing.JLabel so;
    private javax.swing.JLabel spus;
    public static javax.swing.JLabel sysuptime;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JCheckBox tac;
    private javax.swing.JTextField txtfbatch;
    private javax.swing.JTextField txtfbatch2;
    private javax.swing.JTextField txtfbatch3;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtfname2;
    private javax.swing.JTextField txtfname3;
    private javax.swing.JTextField txtfphone;
    private javax.swing.JTextField txtfphone2;
    private javax.swing.JTextField txtfphone3;
    private javax.swing.JTextField txtfroll;
    private javax.swing.JTextField txtfroll2;
    private javax.swing.JTextField txtfroll3;
    private javax.swing.JTextField txtfuni;
    private javax.swing.JTextField txtfuni2;
    private javax.swing.JTextField txtfuni3;
    private javax.swing.JTextField usremail;
    // End of variables declaration//GEN-END:variables

}
