/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.greenlab.view;

import com.greenlab.controller.CustomerController;
import com.greenlab.controller.InvoiceController;
import com.greenlab.controller.PaymentController;
import com.greenlab.controller.ResivedPaymentController;
import com.greenlab.images.Imagess;
import com.greenlab.model.Customer;
import com.greenlab.model.Invoice;
import com.greenlab.model.InvoiceItem;
import com.greenlab.model.Payment;
import com.greenlab.model.ResivedPayment;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.renderer.StringValue;

/**
 *
 * @author Zeon-IT
 */
public class PaynowForm extends javax.swing.JFrame {

    PaymentController paymentController;
    DefaultTableModel dtm;
    InvoiceController invoiceController;
    CustomerController customerController;
    ResivedPaymentController resivedPaymentController;

    /**
     * Creates new form PaynowForm
     */
    public PaynowForm() {
        initComponents();
        paymentidTxt.setEditable(false);
        CustomerTxt.setEditable(false);
        inoiceidTxt.setEditable(false);

    }

    PaynowForm(int inovoiceId, int cusid, double netTot, Date date) {
        initComponents();
        paymentidTxt.setEditable(false);
        CustomerTxt.setEditable(false);
        inoiceidTxt.setEditable(false);
        cashRadioButton.setSelected(true);
        cheqNotxt.setText("cash");
        cheqNotxt.setEditable(false);
        CustomerTxt.setText(String.valueOf(cusid));
        inoiceidTxt.setText(String.valueOf(inovoiceId));
        amountTxt.setText(String.valueOf(netTot));
        dateChoser.setDate(date);
        ImageIcon imageIcon = new ImageIcon(Imagess.class.getResource("icon.png"));
        this.setIconImage(imageIcon.getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cashRadioButton = new javax.swing.JRadioButton();
        cheqRadioButton = new javax.swing.JRadioButton();
        cheqNoLable = new javax.swing.JLabel();
        cheqNotxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        paymentidTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CustomerTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inoiceidTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        dateChoser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        paidmountTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        balanceTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        amountCopytxt = new javax.swing.JLabel();
        paidAmountCopytxt = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cashBalanceTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cashRadioButton.setText("Cash");
        cashRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashRadioButtonActionPerformed(evt);
            }
        });

        cheqRadioButton.setText("cheque");
        cheqRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheqRadioButtonActionPerformed(evt);
            }
        });

        cheqNoLable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cheqNoLable.setText("cheque No            :");

        cheqNotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheqNotxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Payment Id          :");

        paymentidTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentidTxtActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Customer Id         :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Invoice Id             :");

        inoiceidTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inoiceidTxtKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Date                       :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Amount                 :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Paid Amount        :");

        paidmountTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paidmountTxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Due Amount          :");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton1.setText("Okay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Balance                 :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(amountCopytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(paidAmountCopytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(paymentidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(0, 0, 0)
                                    .addComponent(CustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(inoiceidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(1, 1, 1)
                                    .addComponent(dateChoser, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(1, 1, 1)
                                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(1, 1, 1)
                                    .addComponent(paidmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cheqNoLable, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(cashRadioButton)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cheqRadioButton)
                                        .addComponent(cheqNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1)
                                    .addComponent(cashBalanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(114, 114, 114))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amountCopytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paidAmountCopytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cheqRadioButton)
                    .addComponent(cashRadioButton))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cheqNoLable, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cheqNotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CustomerTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inoiceidTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChoser, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paidmountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cashBalanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cashRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashRadioButtonActionPerformed
        if (cashRadioButton.isSelected()) {
            cheqRadioButton.setSelected(false);
            cheqNoLable.setEnabled(false);
            cheqNotxt.setEnabled(false);
            cheqNotxt.setText("cash");
        }
    }//GEN-LAST:event_cashRadioButtonActionPerformed

    private void cheqRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheqRadioButtonActionPerformed
        if (cheqRadioButton.isSelected()) {
            cashRadioButton.setSelected(false);
            cheqNoLable.setEnabled(true);
            cheqNotxt.setEnabled(true);
            cheqNotxt.setText("");
            cheqNotxt.setEditable(true);
        }
    }//GEN-LAST:event_cheqRadioButtonActionPerformed

    private void cheqNotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheqNotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cheqNotxtActionPerformed

    private void paymentidTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentidTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentidTxtActionPerformed

    private void inoiceidTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inoiceidTxtKeyPressed

    }//GEN-LAST:event_inoiceidTxtKeyPressed

    private void paidmountTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paidmountTxtActionPerformed
        Double amount = Double.parseDouble(amountTxt.getText());
        Double paidAmount = Double.parseDouble(paidmountTxt.getText());
        Double balance = amount - paidAmount;
        balanceTxt.setText(String.valueOf(balance));
        if (balance <= 0) {
            balance = (balance * -1);
            cashBalanceTxt.setText(String.valueOf(balance));
            balanceTxt.setText("0");
        } else {
            cashBalanceTxt.setText("0");
            balanceTxt.setText(String.valueOf(balance));
        }

    }//GEN-LAST:event_paidmountTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean isAdded = false;
        boolean isAdd = false;
        paymentController = new PaymentController();
        resivedPaymentController = new ResivedPaymentController();
        customerController = new CustomerController();
        invoiceController = new InvoiceController();

        Integer invoice_id = Integer.parseInt(inoiceidTxt.getText());
        // Invoice invoice = invoiceController.searchInvoice(invoice_id);
        String cheqNo = cheqNotxt.getText();
        Date date = dateChoser.getDate();
        Integer cusid = Integer.parseInt(CustomerTxt.getText());
        //Customer customer=customerController.searchCustomer(cusid);
        Double amount = Double.parseDouble(amountTxt.getText());
        Double paidAmount = Double.parseDouble(paidmountTxt.getText());
        Double balance = Double.parseDouble(balanceTxt.getText());
        Payment payment = new Payment(invoice_id, cheqNo, date, amount, paidAmount, balance);

        isAdded = paymentController.addPayment(payment);
        if (isAdded) {
            //JOptionPane.showMessageDialog(this , "payment add");
            //LoadPaymentTable();
        }

        Invoice invoice = invoiceController.searchInvoice(invoice_id);
        Customer customer = customerController.searchCustomer(cusid);

        ResivedPayment rp = new ResivedPayment(cusid, date, cheqNo, paidAmount, customer, invoice, balance);
        isAdd = resivedPaymentController.addResivedPayment(rp);
        if (isAdd) {
            JOptionPane.showMessageDialog(this, "payment added");
            //resivedPaymentTable();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaynowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaynowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaynowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaynowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaynowForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerTxt;
    private javax.swing.JLabel amountCopytxt;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JTextField balanceTxt;
    private javax.swing.JTextField cashBalanceTxt;
    private javax.swing.JRadioButton cashRadioButton;
    private javax.swing.JLabel cheqNoLable;
    private javax.swing.JTextField cheqNotxt;
    private javax.swing.JRadioButton cheqRadioButton;
    private com.toedter.calendar.JDateChooser dateChoser;
    private javax.swing.JTextField inoiceidTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel paidAmountCopytxt;
    private javax.swing.JTextField paidmountTxt;
    private javax.swing.JTextField paymentidTxt;
    // End of variables declaration//GEN-END:variables
}
