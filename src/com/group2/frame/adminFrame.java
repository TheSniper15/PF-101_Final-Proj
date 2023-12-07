package com.group2.frame;
import com.group2.panel.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class adminFrame extends javax.swing.JFrame {

	public adminFrame() {
		initComponents();
                historytble();
                updt();
	}
        historyTable hstbladmin = new historyTable();
        update up = new update();

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox<>();
        historyAdmin = new javax.swing.JPanel();
        SaveBtn = new javax.swing.JLabel();
        ExirtButton1 = new javax.swing.JLabel();
        userpanel = new javax.swing.JPanel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(89, 74, 71));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 40, 120, 50));

        historyAdmin.setBackground(new java.awt.Color (0,0,0,1));
        historyAdmin.setForeground(new java.awt.Color (0,0,0,1));
        historyAdmin.setMaximumSize(new java.awt.Dimension(1000, 1000));
        historyAdmin.setMinimumSize(new java.awt.Dimension(1000, 1000));
        historyAdmin.setName(""); // NOI18N
        historyAdmin.setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().add(historyAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        SaveBtn.setBackground(new java.awt.Color(255, 255, 255));
        SaveBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
        SaveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaveBtn.setText("DELETE");
        SaveBtn.setToolTipText("");
        SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveBtnMouseClicked(evt);
            }
        });
        getContentPane().add(SaveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 110, 100, 60));

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
   public void historytble()
	{
            historyAdmin.add(hstbladmin);
        }
    public void updt()
        {
            userpanel.add(up);
        }
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SaveBtnMouseClicked

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
    private javax.swing.JLabel SaveBtn;
    private javax.swing.JPanel historyAdmin;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel userpanel;
    // End of variables declaration//GEN-END:variables
}
