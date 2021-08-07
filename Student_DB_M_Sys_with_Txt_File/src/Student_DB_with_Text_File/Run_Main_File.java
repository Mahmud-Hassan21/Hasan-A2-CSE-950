package Student_DB_with_Text_File;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hasan
 */
public class Run_Main_File extends javax.swing.JFrame {

    int row;
    String name, Roll, Batch, Department, University, Phone;
    private DefaultTableModel memberTableModel;

    private final StudentFileOperations memberFileOperations;
    private ArrayList<Member> allMembers = new ArrayList<>();

    public Run_Main_File() {

        initComponents();
        memberFileOperations = new StudentFileOperations("Studentinfo.txt");
        allMembers = memberFileOperations.getMembers();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfuni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btndelete_ = new javax.swing.JButton();
        txtfbatch = new javax.swing.JTextField();
        txtfphone = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtfname = new javax.swing.JTextField();
        btnreset_ = new javax.swing.JButton();
        txtfroll = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnINSERT_ = new javax.swing.JButton();
        txtfdep = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtfuni.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtfuni.setForeground(new java.awt.Color(44, 62, 80));
        txtfuni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfuniKeyPressed(evt);
            }
        });
        getContentPane().add(txtfuni, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 200, 35));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 62, 80));
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(44, 62, 80));
        jLabel2.setText("Roll");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(44, 62, 80));
        jLabel5.setText("University");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 255));
        jLabel8.setText("Student Informations");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(44, 62, 80));
        jLabel3.setText("Batch");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(44, 62, 80));
        jLabel4.setText("Department");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        btndelete_.setBackground(new java.awt.Color(255, 51, 51));
        btndelete_.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btndelete_.setForeground(new java.awt.Color(255, 255, 255));
        btndelete_.setText("Delete");
        btndelete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndelete_ActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete_, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, 90, 35));

        txtfbatch.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtfbatch.setForeground(new java.awt.Color(44, 62, 80));
        txtfbatch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfbatchKeyPressed(evt);
            }
        });
        getContentPane().add(txtfbatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 35));

        txtfphone.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtfphone.setForeground(new java.awt.Color(44, 62, 80));
        txtfphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfphoneKeyPressed(evt);
            }
        });
        getContentPane().add(txtfphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 200, 35));

        table.setFont(new java.awt.Font("Segoe Print", 1, 16)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Roll", "Batch", "Depaertment", "University", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setHeaderValue("Name");
            table.getColumnModel().getColumn(1).setHeaderValue("Roll");
            table.getColumnModel().getColumn(2).setHeaderValue("Batch");
            table.getColumnModel().getColumn(3).setHeaderValue("Depaertment");
            table.getColumnModel().getColumn(4).setHeaderValue("University");
            table.getColumnModel().getColumn(5).setHeaderValue("Phone");
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 880, 170));

        txtfname.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtfname.setForeground(new java.awt.Color(44, 62, 80));
        txtfname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfnameKeyPressed(evt);
            }
        });
        getContentPane().add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, 35));

        btnreset_.setBackground(new java.awt.Color(0, 153, 153));
        btnreset_.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnreset_.setForeground(new java.awt.Color(255, 255, 255));
        btnreset_.setText("Reset");
        btnreset_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset_ActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset_, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, 90, 35));

        txtfroll.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtfroll.setForeground(new java.awt.Color(44, 62, 80));
        txtfroll.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfrollKeyPressed(evt);
            }
        });
        getContentPane().add(txtfroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 200, 35));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(44, 62, 80));
        jLabel6.setText("Phone");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        btnINSERT_.setBackground(new java.awt.Color(0, 153, 153));
        btnINSERT_.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        btnINSERT_.setForeground(new java.awt.Color(255, 255, 255));
        btnINSERT_.setText("Insert");
        btnINSERT_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINSERT_ActionPerformed(evt);
            }
        });
        getContentPane().add(btnINSERT_, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 90, 35));

        txtfdep.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        txtfdep.setForeground(new java.awt.Color(44, 62, 80));
        txtfdep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfdepKeyPressed(evt);
            }
        });
        getContentPane().add(txtfdep, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 200, 35));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndelete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndelete_ActionPerformed

        try {

            int choice = JOptionPane.showConfirmDialog(null, "Delete this data ?", "Delete", JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                int index = table.getSelectedRow();
                allMembers.remove(index);
                loadTable();
                writeMembersFile();
            }
        } catch (ArrayIndexOutOfBoundsException ex) {

            JOptionPane.showMessageDialog(this, "There is nothing to delete here", "Warnning", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_btndelete_ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        row = table.getSelectedRow();
        txtfname.setText(memberTableModel.getValueAt(row, 0).toString());
        txtfroll.setText(memberTableModel.getValueAt(row, 1).toString());
        txtfbatch.setText(memberTableModel.getValueAt(row, 2).toString());
        txtfdep.setText(memberTableModel.getValueAt(row, 3).toString());
        txtfuni.setText(memberTableModel.getValueAt(row, 4).toString());
        txtfphone.setText(memberTableModel.getValueAt(row, 5).toString());

    }//GEN-LAST:event_tableMouseClicked

    private void btnreset_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset_ActionPerformed
        txtfname.setText("");
        txtfroll.setText("");
        txtfbatch.setText("");
        txtfuni.setText("");
        txtfphone.setText("");
        txtfdep.setText("");
    }//GEN-LAST:event_btnreset_ActionPerformed

    private void btnINSERT_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINSERT_ActionPerformed

        if (txtfname.getText().isEmpty() || txtfroll.getText().isEmpty() || txtfbatch.getText().isEmpty() || txtfdep.getText().isEmpty() || txtfuni.getText().isEmpty() || txtfphone.getText().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Empty Text Fields", "Warnning", JOptionPane.WARNING_MESSAGE);

        } else {

            name = txtfname.getText();
            Roll = txtfroll.getText();
            Batch = txtfbatch.getText();
            Department = txtfdep.getText();
            University = txtfuni.getText();
            Phone = txtfphone.getText();

            txtfname.setText("");
            txtfroll.setText("");
            txtfbatch.setText("");
            txtfdep.setText("");
            txtfuni.setText("");
            txtfphone.setText("");

            saveMembersData(name, Roll, Batch, Department, University, Phone);
        }
    }//GEN-LAST:event_btnINSERT_ActionPerformed

    private void txtfnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfnameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtfroll.requestFocus();
        }
    }//GEN-LAST:event_txtfnameKeyPressed

    private void txtfrollKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfrollKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtfname.requestFocus();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtfbatch.requestFocus();
        }
    }//GEN-LAST:event_txtfrollKeyPressed

    private void txtfbatchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfbatchKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtfroll.requestFocus();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtfdep.requestFocus();
        }
    }//GEN-LAST:event_txtfbatchKeyPressed

    private void txtfuniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfuniKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtfdep.requestFocus();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtfphone.requestFocus();
        }
    }//GEN-LAST:event_txtfuniKeyPressed

    private void txtfphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfphoneKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtfuni.requestFocus();
        }
    }//GEN-LAST:event_txtfphoneKeyPressed

    private void txtfdepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfdepKeyPressed
 if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtfbatch.requestFocus();
        }

        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtfuni.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtfdepKeyPressed

    private void loadTable() {

        String heading[] = {"Name", "Roll", "Batch", "Department", "University", "Phone"};

        memberTableModel = new DefaultTableModel(heading, 0);

        for (Member employee : allMembers) {

            Object[] empData = {employee.getName(), employee.getRoll(), employee.getBatch(), employee.getDepartment(), employee.getUniversity(), employee.getPhone()};
            memberTableModel.addRow(empData);

        }

        table.setModel(memberTableModel);
    }

    private void writeMembersFile() {
        memberFileOperations.writeMembers(allMembers);

    }

    private void saveMembersData(String name, String roll, String batch, String department, String university, String phone) {

        Member member = new Member(name, roll, batch, department, university, phone);
        allMembers.add(member);
        memberFileOperations.addMembers(member);
        loadTable();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Run_Main_File.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Run_Main_File().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnINSERT_;
    private javax.swing.JButton btndelete_;
    private javax.swing.JButton btnreset_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtfbatch;
    private javax.swing.JTextField txtfdep;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtfphone;
    private javax.swing.JTextField txtfroll;
    private javax.swing.JTextField txtfuni;
    // End of variables declaration//GEN-END:variables
}
