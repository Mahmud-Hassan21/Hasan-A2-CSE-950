
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class StudentPanel extends JPanel {

    private JTextField textFieldName;
    private JTextField textFieldRoll;
    private JTextField textFieldBatch;
    private JTextField textFieldDep;
    private JTextField textFieldUni;
    private JTextField textFieldPhone;

    private DefaultTableModel memberTableModel;

    private StudentFileOperations memberFileOperations;

    private ArrayList<Member> allMembers = new ArrayList<>();
    private JTable table;

    /**
     * Create the panel.
     */
    public StudentPanel() {
        setLayout(new BorderLayout(1, 1));

        JPanel panelButton = new JPanel();
        add(panelButton, BorderLayout.SOUTH);
        panelButton.setForeground(Color.yellow);

        JButton btnSave = new JButton("Insert");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                String name = textFieldName.getText();

                String Roll = textFieldRoll.getText();
                String Batch = textFieldBatch.getText();
                String Department = textFieldDep.getText();
                String University = textFieldUni.getText();
                String Phone = textFieldPhone.getText();

                textFieldName.setText("");
                textFieldPhone.setText("");
                textFieldBatch.setText("");
                textFieldDep.setText("");
                textFieldUni.setText("");
                textFieldRoll.setText("");

                saveMembersData(name, Roll, Batch, Department, University, Phone);

            }
        });
        panelButton.add(btnSave);

        JButton btnDelete = new JButton("Delete");

        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                int index = table.getSelectedRow();
                allMembers.remove(index);
                loadTable();
                writeMembersFile();
            }
        });
        panelButton.add(btnDelete);

        JPanel panelContet = new JPanel();
        add(panelContet, BorderLayout.CENTER);
        panelContet.setLayout(new GridLayout(1, 2, 10, 0));

        JPanel panelLeft = new JPanel();
        panelContet.add(panelLeft);
        panelLeft.setLayout(null);

        JLabel lblEmployeeName = new JLabel("Name");
        lblEmployeeName.setBounds(100, 10, 120, 27);
        panelLeft.add(lblEmployeeName);

        JLabel lblEmployeeRoll = new JLabel("Roll");
        lblEmployeeRoll.setBounds(100, 75, 128, 27);
        panelLeft.add(lblEmployeeRoll);

        JLabel lblEmployeeBatch = new JLabel("Batch");
        lblEmployeeBatch.setBounds(100, 138, 328, 27);
        panelLeft.add(lblEmployeeBatch);

        JLabel lblEmployeeDep = new JLabel("Department");
        lblEmployeeDep.setBounds(100, 200, 428, 27);
        panelLeft.add(lblEmployeeDep);

        JLabel lblEmployeeUni = new JLabel("University");
        lblEmployeeUni.setBounds(100, 260, 528, 27);
        panelLeft.add(lblEmployeeUni);

        JLabel lblEmployeeId = new JLabel("Phone");
        lblEmployeeId.setBounds(100, 330, 628, 27);
        panelLeft.add(lblEmployeeId);

        textFieldName = new JTextField();
        textFieldName.setBounds(100, 35, 200, 33);
        textFieldName.setToolTipText("Enter your name");
        panelLeft.add(textFieldName);
        textFieldName.setColumns(10);
        //
        textFieldRoll = new JTextField();
        textFieldRoll.setBounds(100, 100, 200, 33);
        textFieldRoll.setToolTipText("Enter Your roll number");
        panelLeft.add(textFieldRoll);
        textFieldRoll.setColumns(10);
        //
        textFieldBatch = new JTextField();
        textFieldBatch.setBounds(100, 165, 200, 33);
        textFieldBatch.setToolTipText("Enter Your Batch number");
        panelLeft.add(textFieldBatch);
        textFieldBatch.setColumns(10);
        //
        textFieldDep = new JTextField();
        textFieldDep.setBounds(100, 225, 200, 33);
        textFieldDep.setToolTipText("Enter Your Department");
        panelLeft.add(textFieldDep);
        textFieldDep.setColumns(10);
        //
        textFieldUni = new JTextField();
        textFieldUni.setBounds(100, 290, 200, 33);
        textFieldUni.setToolTipText("Enter Your University");
        panelLeft.add(textFieldUni);
        textFieldUni.setColumns(10);
        //
        textFieldPhone = new JTextField();
        textFieldPhone.setBounds(100, 360, 200, 33);
        textFieldPhone.setToolTipText("Enter Your phone number");
        panelLeft.add(textFieldPhone);
        textFieldPhone.setColumns(10);
        //
        JPanel panelRight = new JPanel();
        panelContet.add(panelRight);
        panelRight.setLayout(new BorderLayout(0, 0));

        JScrollPane scrollPane = new JScrollPane();
        panelRight.add(scrollPane, BorderLayout.CENTER);

        table = new JTable();

        scrollPane.setViewportView(table);

        memberFileOperations = new StudentFileOperations("Member.txt");

        allMembers = memberFileOperations.getMembers();

        loadTable();
    }

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
    //****************************************************

}
