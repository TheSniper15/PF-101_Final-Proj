package com.group2.form;

import com.group2.form.*;

public class log_in extends javax.swing.JFrame {


	public log_in() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoginButton = new javax.swing.JLabel();
        InputUsername = new javax.swing.JTextField();
        InputPassword = new javax.swing.JPasswordField();
        ExirtButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginButton.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(0, 0, 0));
        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setText("LOGIN");
        LoginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });
        jPanel1.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 790, 400, 80));

        InputUsername.setBackground(new java.awt.Color(0,0,0,1));
        InputUsername.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        InputUsername.setForeground(new java.awt.Color(255, 255, 255));
        InputUsername.setBorder(null);
        InputUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(InputUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 420, 60));

        InputPassword.setBackground(new java.awt.Color(0,0,0,1));
        InputPassword.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        InputPassword.setForeground(new java.awt.Color(255, 255, 255));
        InputPassword.setBorder(null);
        InputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(InputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, 420, 60));

        ExirtButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/logout (2).png"))); // NOI18N
        ExirtButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExirtButtonMouseClicked(evt);
            }
        });
        jPanel1.add(ExirtButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 1000, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/background/LOGIN.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        new dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void InputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsernameActionPerformed

    private void InputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPasswordActionPerformed

    private void ExirtButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExirtButtonMouseClicked
       System.exit(0);
    }//GEN-LAST:event_ExirtButtonMouseClicked

	/**
	 * @param args the command line arguments
	 */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ExirtButton;
    private javax.swing.JPasswordField InputPassword;
    private javax.swing.JTextField InputUsername;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
