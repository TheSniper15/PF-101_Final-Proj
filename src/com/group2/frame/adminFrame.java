package com.group2.frame;
import com.group2.myClass.databaseCon;
import com.group2.panel.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class adminFrame extends javax.swing.JFrame {

	public adminFrame() {
		initComponents();
		db.Connect();
                pnl();
		loadId();
	}
	
        historyTable hstbladmin = new historyTable();
        update up = new update();
	databaseCon db = new databaseCon();

	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                idTxt = new javax.swing.JComboBox<>();
                historyAdmin = new javax.swing.JPanel();
                delbtn = new javax.swing.JLabel();
                ExirtButton1 = new javax.swing.JLabel();
                userpanel = new javax.swing.JPanel();
                BG = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                idTxt.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
                idTxt.setForeground(new java.awt.Color(89, 74, 71));
                idTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID" }));
                idTxt.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                idTxtActionPerformed(evt);
                        }
                });
                getContentPane().add(idTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 120, 50));

                historyAdmin.setBackground(new java.awt.Color (0,0,0,1));
                historyAdmin.setForeground(new java.awt.Color (0,0,0,1));
                historyAdmin.setMaximumSize(new java.awt.Dimension(1000, 1000));
                historyAdmin.setMinimumSize(new java.awt.Dimension(1000, 1000));
                historyAdmin.setName(""); // NOI18N
                historyAdmin.setPreferredSize(new java.awt.Dimension(1000, 1000));
                getContentPane().add(historyAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

                delbtn.setBackground(new java.awt.Color(255, 255, 255));
                delbtn.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
                delbtn.setForeground(new java.awt.Color(255, 255, 255));
                delbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                delbtn.setText("DELETE");
                delbtn.setToolTipText("");
                delbtn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                delbtnMouseClicked(evt);
                        }
                });
                getContentPane().add(delbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, 100, 60));

                ExirtButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/logout (2).png"))); // NOI18N
                ExirtButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ExirtButton1MouseClicked(evt);
                        }
                });
                getContentPane().add(ExirtButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 990, -1, -1));

                userpanel.setBackground(new java.awt.Color (0,0,0,1));
                userpanel.setForeground(new java.awt.Color (0,0,0,1));
                userpanel.setToolTipText("");
                userpanel.setMaximumSize(new java.awt.Dimension(710, 1000));
                userpanel.setMinimumSize(new java.awt.Dimension(710, 1000));
                userpanel.setPreferredSize(new java.awt.Dimension(710, 1000));
                userpanel.setRequestFocusEnabled(false);
                getContentPane().add(userpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 40, 720, -1));

                BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/background/Admin (2).jpg"))); // NOI18N
                getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

                pack();
        }// </editor-fold>//GEN-END:initComponents

    public void pnl()
        {
            userpanel.add(up);
	    historyAdmin.add(hstbladmin);
        }
    
    public void loadId()
	{
		try 
		{
			db.pst = db.con.prepareStatement("SELECT ID FROM history");
			db.rs = db.pst.executeQuery();
			
			idTxt.removeAllItems();
			idTxt.addItem("ID");
			
			while(db.rs.next())
			{
				idTxt.addItem(db.rs.getString(1));
			}
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(qrReader.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
    
	public void del()
	{
		try 
		{
			String id = idTxt.getSelectedItem().toString();
			db.pst = db.con.prepareStatement("DELETE FROM history WHERE ID=? and Status=?");
			db.pst.setString(1,id);
			db.pst.setString(2,"Returned");
			
			int k = db.pst.executeUpdate();
			if(k == 1)
			{
				JOptionPane.showMessageDialog(this,"Record Has Been Deleted!!");
				
				loadId();
				hstbladmin.retrieveData();
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Record Has Failed To Deleted!!");
			}
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(adminFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
    
    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTxtActionPerformed

    private void delbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delbtnMouseClicked
        // TODO add your handling code here:
        del();
    }//GEN-LAST:event_delbtnMouseClicked

    private void ExirtButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExirtButton1MouseClicked
        JFrame frame = new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Sign Out?", "Library System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{
			new login().setVisible(true);
			this.dispose();
		}
    }//GEN-LAST:event_ExirtButton1MouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel BG;
        private javax.swing.JLabel ExirtButton1;
        private javax.swing.JLabel delbtn;
        private javax.swing.JPanel historyAdmin;
        private javax.swing.JComboBox<String> idTxt;
        private javax.swing.JPanel userpanel;
        // End of variables declaration//GEN-END:variables
}
