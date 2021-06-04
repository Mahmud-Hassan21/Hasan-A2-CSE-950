package integer.divisions;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class Int_Division_Normal_Form extends Frame implements ActionListener {

    int _1st, _2nd;
    Label L1, L2, L3;
    TextField T1, T2, T3;
    Button B1;

    Int_Division_Normal_Form() {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        L1 = new Label("Enter the First Number:");
        add(L1);
        T1 = new TextField(10);
        add(T1);
        L2 = new Label("Enter the Second Number:");
        add(L2);
        T2 = new TextField(10);
        add(T2);
        L3 = new Label("Division of two no.s:");
        add(L3);
        T3 = new TextField(30);
        add(T3);
        B1 = new Button("Compute");
        add(B1);
        B1.addActionListener(this);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == B1) {
           
            try {

                    _1st = Integer.parseInt(T1.getText());
                    _2nd = Integer.parseInt(T2.getText());
                    double Result = (double) _1st / _2nd;
                    String answer = String.format("%.2f", Result);

                    T3.setText(answer);
                } catch (NumberFormatException n) {

                    //If Num1 or Num2 were not an integer
                    JOptionPane.showMessageDialog(null, "NumberFormateException", "Warnning", 2);

                } finally {

                    if (_1st != 0 && _2nd == 0) {
                        JOptionPane.showMessageDialog(null, "ArithmeticException", "Warnning", 2);

                    } else {

                    
                }
            }
        }
    }


    public static void main(String args[]) {
        Int_Division_Normal_Form ob = new Int_Division_Normal_Form();
        ob.setTitle("Ex_Division_Frame");
        ob.setSize(600, 200);
        ob.setVisible(true);
        ob.setLocationRelativeTo(null);
    }
}
