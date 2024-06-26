/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.group2.panel;

import com.group2.frame.adminFrame;
import com.group2.frame.dashboard;
import com.group2.myClass.databaseCon;
import com.group2.swing.ScrollBar;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Arvy
 */
public class update extends javax.swing.JPanel {

    /**
     * Creates new form update
     */
    public update() {
        initComponents();
	tbl();
        db.Connect();
        retrieveData();
    }
    
        databaseCon db = new databaseCon();
	
	public void tbl() {
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        jScrollPane1.getVerticalScrollBar().setBackground(Color.WHITE);
        jScrollPane1.getViewport().setBackground(Color.WHITE);
    }
        
    public void retrieveData(){
        try {
            int q;
            db.pst = db.con.prepareStatement("SELECT * FROM librarians");
            db.rs = db.pst.executeQuery();
            java.sql.ResultSetMetaData rss = db.rs.getMetaData();
            q = rss.getColumnCount(); 
            
            DefaultTableModel df = (DefaultTableModel) userTable.getModel();
            df.setRowCount(0);
            
            while (db.rs.next()) {
                Vector v2 = new Vector();
                for (int a = 1; a  <= q ; a++) {
                    v2.add(db.rs.getString("ID"));
                    v2.add(db.rs.getString("USERNAME"));
                    v2.add(db.rs.getString("PASSWORD"));
                    v2.add(db.rs.getString("STATUS"));
               

                }
                df.addRow(v2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void search()
    {
	    DefaultTableModel tbModel = (DefaultTableModel)userTable.getModel();
        
	String usrid = tbModel.getValueAt(userTable.getSelectedRow(), 0).toString();
	String usr = tbModel.getValueAt(userTable.getSelectedRow(), 1).toString();
	String pss = tbModel.getValueAt(userTable.getSelectedRow(), 2).toString();
        
	usrnm.setText(usr);
	psswd.setText(pss);
	idTxt.setText(usrid);
    }
    
    public void ud()
    {
	    try 
		{
			String usr = usrnm.getText();
			String pswd = psswd.getText();
			String id = idTxt.getText();
			String sts = status_box.getSelectedItem().toString();
			
			db.pst = db.con.prepareStatement("UPDATE librarians SET username=?,password=?,Status=? WHERE ID=?");
			
			db.pst.setString(1,usr);
			db.pst.setString(2,pswd);
			db.pst.setString(3,sts);
			db.pst.setString(4,id);

			int k = db.pst.executeUpdate();
			if(k == 1)
			{
				JOptionPane.showMessageDialog(this,"Record Has Been Updated!!");
				usrnm.setText("");
				psswd.setText("");;
				usrnm.requestFocus();
				
				retrieveData();
			}
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
		}
    }
    
	public void del()
	{
		try 
		{
			String id = idTxt.getText();
			db.pst = db.con.prepareStatement("DELETE FROM librarians WHERE ID=? and Status=?");
			db.pst.setString(1,id);
			db.pst.setString(2,"Librarian");
			
			int k = db.pst.executeUpdate();
			if(k == 1)
			{
				JOptionPane.showMessageDialog(this,"Record Has Been Deleted!!");
				usrnm.setText("");
				psswd.setText("");;
				usrnm.requestFocus();
				
				retrieveData();
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Record Has Failed To Deleted!!");
			}
		} 
		catch (SQLException ex) 
		{
			Logger.getLogger(update.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	public void adduser()
	{	
		try
		{
			String usr = usrnm.getText();
			String pswd = psswd.getText();
			String sts = status_box.getSelectedItem().toString();

			
			db.pst = db.con.prepareStatement("INSERT INTO librarians (username,password,Status)VALUES(?,?,?)");
			
			db.pst.setString(1, usr);
			db.pst.setString(2, pswd);
			db.pst.setString(3, sts);
			
			int k = db.pst.executeUpdate();
			
			if(k == 1)
			{
				JOptionPane.showMessageDialog(this,"Record Added!!");	
				retrieveData();
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Record Failed To Save!!");
			}
		}
		catch(SQLException ex)
		{
			Logger.getLogger(qrReader.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                idTxt = new javax.swing.JTextField();
                jScrollPane1 = new javax.swing.JScrollPane();
                userTable = new javax.swing.JTable();
                status_box = new javax.swing.JComboBox<>();
                usrnm = new javax.swing.JTextField();
                psswd = new javax.swing.JTextField();
                Update = new javax.swing.JLabel();
                SaveBtn1 = new javax.swing.JLabel();
                Delete = new javax.swing.JLabel();
                dash = new javax.swing.JLabel();

                idTxt.setText("jTextField1");

                setBackground(new java.awt.Color (0,0,0,1));
                setForeground(new java.awt.Color (0,0,0,1));
                setMaximumSize(new java.awt.Dimension(710, 1000));
                setMinimumSize(new java.awt.Dimension(710, 1000));
                setPreferredSize(new java.awt.Dimension(710, 1000));

                userTable.setBackground(new java.awt.Color(89, 74, 71));
                userTable.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
                userTable.setForeground(new java.awt.Color(252, 231, 208));
                userTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "ID", "USERNAME", "PASSWORD", "STATUS"
                        }
                ));
                userTable.setGridColor(new java.awt.Color(255, 255, 255));
                userTable.setMaximumSize(new java.awt.Dimension(1000, 1000));
                userTable.setMinimumSize(new java.awt.Dimension(1000, 1000));
                userTable.setPreferredSize(new java.awt.Dimension(1000, 1000));
                userTable.setRowHeight(25);
                userTable.setSelectionBackground(new java.awt.Color(252, 231, 208));
                userTable.setSelectionForeground(new java.awt.Color(89, 74, 71));
                userTable.setShowGrid(true);
                userTable.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                userTableMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(userTable);
                if (userTable.getColumnModel().getColumnCount() > 0) {
                        userTable.getColumnModel().getColumn(1).setPreferredWidth(100);
                        userTable.getColumnModel().getColumn(2).setPreferredWidth(100);
                }

                status_box.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
                status_box.setForeground(new java.awt.Color(89, 74, 71));
                status_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Librarian", "Admin" }));
                status_box.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                status_boxActionPerformed(evt);
                        }
                });

                usrnm.setBackground(new java.awt.Color(89, 74, 71));
                usrnm.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
                usrnm.setForeground(new java.awt.Color(255, 255, 255));
                usrnm.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                usrnmActionPerformed(evt);
                        }
                });

                psswd.setBackground(new java.awt.Color(89, 74, 71));
                psswd.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
                psswd.setForeground(new java.awt.Color(255, 255, 255));
                psswd.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                psswdActionPerformed(evt);
                        }
                });

                Update.setBackground(new java.awt.Color(255, 255, 255));
                Update.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
                Update.setForeground(new java.awt.Color(255, 255, 255));
                Update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                Update.setText("UPDATE");
                Update.setToolTipText("");
                Update.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                UpdateMouseClicked(evt);
                        }
                });

                SaveBtn1.setBackground(new java.awt.Color(255, 255, 255));
                SaveBtn1.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
                SaveBtn1.setForeground(new java.awt.Color(255, 255, 255));
                SaveBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                SaveBtn1.setText("SAVE");
                SaveBtn1.setToolTipText("");
                SaveBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                SaveBtn1MouseClicked(evt);
                        }
                });

                Delete.setBackground(new java.awt.Color(255, 255, 255));
                Delete.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
                Delete.setForeground(new java.awt.Color(255, 255, 255));
                Delete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                Delete.setText("DELETE");
                Delete.setToolTipText("");
                Delete.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                DeleteMouseClicked(evt);
                        }
                });

                dash.setBackground(new java.awt.Color(255, 255, 255));
                dash.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
                dash.setForeground(new java.awt.Color(255, 255, 255));
                dash.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                dash.setText("DASH");
                dash.setToolTipText("");
                dash.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                dashMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(57, 57, 57)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                                                        .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(SaveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(dash, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap())
                                                        .addComponent(usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(psswd, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(status_box, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(status_box, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(usrnm, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(psswd, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(SaveBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(dash, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
                );

                getAccessibleContext().setAccessibleDescription("");
        }// </editor-fold>//GEN-END:initComponents

    private void status_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_boxActionPerformed

    private void usrnmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usrnmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usrnmActionPerformed

    private void psswdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psswdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psswdActionPerformed

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        // TODO add your handling code here:
       ud();
    }//GEN-LAST:event_UpdateMouseClicked

    private void SaveBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtn1MouseClicked
        // TODO add your handling code here:\
	adduser();
    }//GEN-LAST:event_SaveBtn1MouseClicked

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        // TODO add your handling code here:
	del();
    }//GEN-LAST:event_DeleteMouseClicked

    private void dashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseClicked
        // TODO add your handling code here:
	new dashboard().setVisible(true);
	new adminFrame().dispose();
    }//GEN-LAST:event_dashMouseClicked

        private void userTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTableMouseClicked
                // TODO add your handling code here:
		search();
        }//GEN-LAST:event_userTableMouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel Delete;
        private javax.swing.JLabel SaveBtn1;
        private javax.swing.JLabel Update;
        private javax.swing.JLabel dash;
        private javax.swing.JTextField idTxt;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField psswd;
        private javax.swing.JComboBox<String> status_box;
        private javax.swing.JTable userTable;
        private javax.swing.JTextField usrnm;
        // End of variables declaration//GEN-END:variables
}
