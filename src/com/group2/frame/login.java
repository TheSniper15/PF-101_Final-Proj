package com.group2.frame;

import com.group2.myClass.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

	public login() {
		initComponents();
		HidePassword.setVisible(false);
		db.Connect();
	}
	
	databaseCon db = new databaseCon();
	
	private void logincom()
	{
		String usr = InputUsername.getText();
		String pswd = new String(InputPassword.getPassword());
		String stat;
		
		try
		{
			db.pst = db.con.prepareStatement("SELECT * FROM librarians where username = ? and password = ?");
			db.pst.setString(1, usr);
			db.pst.setString(2,pswd);
			db.rs = db.pst.executeQuery();
			
			if(db.rs.next())
			{
				new dashboard().setVisible(true);
				this.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Username or Password is Incorrect!!");
			}
		}
		catch(SQLException ex)
		{
			Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                LoginButton = new javax.swing.JLabel();
                ShowPassword = new javax.swing.JLabel();
                HidePassword = new javax.swing.JLabel();
                InputUsername = new javax.swing.JTextField();
                InputPassword = new javax.swing.JPasswordField();
                ExirtButton1 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

                ShowPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/show.png"))); // NOI18N
                ShowPassword.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ShowPasswordMouseClicked(evt);
                        }
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                ShowPasswordMousePressed(evt);
                        }
                });
                jPanel1.add(ShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 620, -1, -1));

                HidePassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/Hide.png"))); // NOI18N
                HidePassword.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                HidePasswordMouseClicked(evt);
                        }
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                HidePasswordMousePressed(evt);
                        }
                });
                jPanel1.add(HidePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 620, -1, -1));

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
                InputPassword.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
                InputPassword.setForeground(new java.awt.Color(255, 255, 255));
                InputPassword.setBorder(null);
                InputPassword.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                InputPasswordActionPerformed(evt);
                        }
                });
                jPanel1.add(InputPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 620, 420, 60));

                ExirtButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/logout (2).png"))); // NOI18N
                ExirtButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ExirtButton1MouseClicked(evt);
                        }
                });
                jPanel1.add(ExirtButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1830, 980, 70, 80));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/background/LOG.jpg"))); // NOI18N
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        logincom();
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void InputUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputUsernameActionPerformed

    private void InputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputPasswordActionPerformed

    private void ShowPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPasswordMouseClicked
       
        
    }//GEN-LAST:event_ShowPasswordMouseClicked

    private void ExirtButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExirtButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExirtButton1MouseClicked

    private void HidePasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HidePasswordMouseClicked
        
       
    }//GEN-LAST:event_HidePasswordMouseClicked

    private void ShowPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowPasswordMousePressed
         HidePassword.setVisible(true);
        ShowPassword.setVisible(false);
        InputPassword.setEchoChar((char)0);
    }//GEN-LAST:event_ShowPasswordMousePressed

    private void HidePasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HidePasswordMousePressed
         ShowPassword.setVisible(true);
        HidePassword.setVisible(false);
        InputPassword.setEchoChar('*');
    }//GEN-LAST:event_HidePasswordMousePressed

	/**
	 * @param args the command line arguments
	 */


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel ExirtButton1;
        private javax.swing.JLabel HidePassword;
        private javax.swing.JPasswordField InputPassword;
        private javax.swing.JTextField InputUsername;
        private javax.swing.JLabel LoginButton;
        private javax.swing.JLabel ShowPassword;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        // End of variables declaration//GEN-END:variables
}
