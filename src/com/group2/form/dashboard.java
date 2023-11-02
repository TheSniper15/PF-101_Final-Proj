package com.group2.form;

import com.group2.form.*;

public class dashboard extends javax.swing.JFrame {

	public dashboard() {
		initComponents();
	}


	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CardButton = new javax.swing.JLabel();
        SaveButton = new javax.swing.JLabel();
        CancelButton = new javax.swing.JLabel();
        BookButton = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1080));
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, -1));

        jPanel2.setMaximumSize(new java.awt.Dimension(294, 150));
        jPanel2.setMinimumSize(new java.awt.Dimension(294, 150));
        jPanel2.setPreferredSize(new java.awt.Dimension(294, 150));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 760, 500));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 510, -1, -1));

        CardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/card.png"))); // NOI18N
        CardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CardButtonMouseClicked(evt);
            }
        });
        jPanel1.add(CardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 550, -1, -1));

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/save (1).png"))); // NOI18N
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
        });
        jPanel1.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 850, -1, -1));

        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/cancel (1).png"))); // NOI18N
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 850, -1, -1));

        BookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/open-book.png"))); // NOI18N
        BookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookButtonMouseClicked(evt);
            }
        });
        jPanel1.add(BookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 550, -1, -1));

        jTextField2.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 630, 760, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/background/BGMain.jpg"))); // NOI18N
        jLabel1.setAlignmentX(0.5F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonMouseClicked

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void CardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CardButtonMouseClicked

    private void BookButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BookButtonMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

	/**
	 * @param args the command line arguments
	 */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookButton;
    private javax.swing.JLabel CancelButton;
    private javax.swing.JLabel CardButton;
    private javax.swing.JLabel SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
