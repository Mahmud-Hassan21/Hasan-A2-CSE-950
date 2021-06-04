package integer.divisions;

import javax.swing.JOptionPane;

/**
 *
 * @author mahmud
 */
public class Int_Div_Applet extends java.applet.Applet {
    
    
    int _1st, _2nd;

    public void init() {
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {

                public void run() {

                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        txtf2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtf1 = new javax.swing.JTextField();
        txtfr = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Divide");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 70, 30));
        add(txtf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 150, 30));

        jLabel1.setText("1st Number");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, 30));

        jLabel2.setText("2nd Number");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 150, 30));
        add(txtf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 150, 30));
        add(txtfr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, 30));

        jLabel3.setText("Result");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, 30));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 70, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (txtf1.getText().length() > 0) {

            if (txtf2.getText().length() > 0) {

                try {

                    _1st = Integer.parseInt(txtf1.getText());
                    _2nd = Integer.parseInt(txtf2.getText());
                    double Result = (double) _1st / _2nd;
                    String answer = String.format("%.2f", Result);

                    txtfr.setText(answer);
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtf1.setText(null);
        txtf2.setText(null);
        txtfr.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtf1;
    private javax.swing.JTextField txtf2;
    private javax.swing.JTextField txtfr;
    // End of variables declaration//GEN-END:variables
}
