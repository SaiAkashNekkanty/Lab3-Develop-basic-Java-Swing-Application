/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package infolab03;

import data.User;
import javax.swing.JOptionPane;

/**
 *
 * @author Akash
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    User inputUser;
    public MainJFrame() {
        initComponents();
        inputUser = new User();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        TopPanel = new javax.swing.JPanel();
        Viewbutton = new javax.swing.JButton();
        BottomPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        Firstnamefield = new javax.swing.JTextField();
        LastnameLabel = new javax.swing.JLabel();
        Lastnamefield = new javax.swing.JTextField();
        AgeLabel = new javax.swing.JLabel();
        Agefield = new javax.swing.JTextField();
        TelephneLabel = new javax.swing.JLabel();
        Telephonefield = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        Emailfield = new javax.swing.JTextField();
        AddressLabel = new javax.swing.JLabel();
        Addressfield = new javax.swing.JTextField();
        CityLabel = new javax.swing.JLabel();
        Cityfield = new javax.swing.JTextField();
        Country = new javax.swing.JLabel();
        Countryfield = new javax.swing.JTextField();
        majorLabel = new javax.swing.JLabel();
        majorfield = new javax.swing.JTextField();
        Uploadphotobutton = new javax.swing.JButton();
        Savebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        Viewbutton.setText("View User Profile");
        Viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(288, Short.MAX_VALUE)
                .addComponent(Viewbutton)
                .addGap(277, 277, 277))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(Viewbutton)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        SplitPane.setTopComponent(TopPanel);

        titleLabel.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Create User Profile");

        FirstNameLabel.setText("First Name");

        LastnameLabel.setText("Last Name");

        Lastnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnamefieldActionPerformed(evt);
            }
        });

        AgeLabel.setText("Age");

        TelephneLabel.setText("Telephone Number");

        EmailLabel.setText("Email");

        AddressLabel.setText("Address");

        CityLabel.setText("City");

        Country.setText("Country");

        majorLabel.setText("Major");

        Uploadphotobutton.setText("Upload Photo");
        Uploadphotobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadphotobuttonActionPerformed(evt);
            }
        });

        Savebutton.setText("SAVE");
        Savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BottomPanelLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BottomPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(majorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Country, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LastnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(FirstNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TelephneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(EmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(120, 120, 120)
                        .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Telephonefield)
                            .addComponent(Agefield)
                            .addComponent(Addressfield)
                            .addComponent(Cityfield)
                            .addComponent(Countryfield)
                            .addComponent(majorfield)
                            .addComponent(Firstnamefield)
                            .addComponent(Lastnamefield)
                            .addGroup(BottomPanelLayout.createSequentialGroup()
                                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Savebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Uploadphotobutton)
                                    .addComponent(Emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(86, 86, 86))
        );
        BottomPanelLayout.setVerticalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleLabel)
                .addGap(51, 51, 51)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameLabel)
                    .addComponent(Firstnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastnameLabel)
                    .addComponent(Lastnamefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgeLabel)
                    .addComponent(Agefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelephneLabel)
                    .addComponent(Telephonefield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailLabel)
                    .addComponent(Emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddressLabel)
                    .addComponent(Addressfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CityLabel)
                    .addComponent(Cityfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Country)
                    .addComponent(Countryfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(majorLabel)
                    .addComponent(majorfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Uploadphotobutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Savebutton)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        SplitPane.setRightComponent(BottomPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SplitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LastnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnamefieldActionPerformed

    private void UploadphotobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadphotobuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UploadphotobuttonActionPerformed

    private void SavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebuttonActionPerformed
        // TODO add your handling code here:
        inputUser = new User();
        inputUser.setFirstName(Firstnamefield.getText());
        inputUser.setLastName(Lastnamefield.getText());
        inputUser.setAge(Agefield.getText());
        inputUser.setTelephoneNumber(Telephonefield.getText());
        inputUser.setEmail(Emailfield.getText());
        inputUser.setAddress(Addressfield.getText());
        inputUser.setCity(Cityfield.getText());
        inputUser.setCountry(Countryfield.getText());
        inputUser.setMajor(majorfield.getText());
        
        JOptionPane.showMessageDialog(this, "User Saved Successfully", "Success", HEIGHT);
        
    }//GEN-LAST:event_SavebuttonActionPerformed

    private void ViewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbuttonActionPerformed
        // TODO add your handling code here:
        if(inputUser.getFirstName()==null || inputUser.getLastName()==null || inputUser.getAge()==null || inputUser.getTelephoneNumber()==null || inputUser.getEmail()==null || inputUser.getAddress()==null || inputUser.getCity()==null || inputUser.getCountry()==null || inputUser.getMajor()==null) {
            JOptionPane.showMessageDialog(this, "Please enter user details", "Error", HEIGHT);
        } else {
            
            ViewDetailsPanel viewPanel = new ViewDetailsPanel(inputUser);
            SplitPane.setBottomComponent(viewPanel);
        }
        
    }//GEN-LAST:event_ViewbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel;
    private javax.swing.JTextField Addressfield;
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JTextField Agefield;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JLabel CityLabel;
    private javax.swing.JTextField Cityfield;
    private javax.swing.JLabel Country;
    private javax.swing.JTextField Countryfield;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField Emailfield;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField Firstnamefield;
    private javax.swing.JLabel LastnameLabel;
    private javax.swing.JTextField Lastnamefield;
    private javax.swing.JButton Savebutton;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JLabel TelephneLabel;
    private javax.swing.JTextField Telephonefield;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton Uploadphotobutton;
    private javax.swing.JButton Viewbutton;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JTextField majorfield;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
