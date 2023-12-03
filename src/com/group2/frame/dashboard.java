package com.group2.frame;

import com.group2.panel.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class dashboard extends javax.swing.JFrame {

	public dashboard() {
		initComponents();
		qrReader();
		hstorytble();
		hstbl.retrieveData();
	}

	qrReader qrrd = new qrReader();
	historyTable hstbl = new historyTable();
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                hstory = new javax.swing.JPanel();
                ExirtButton1 = new javax.swing.JLabel();
                qrReaderPanel = new javax.swing.JPanel();
                bgPic = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setMaximumSize(new java.awt.Dimension(1920, 1080));
                setMinimumSize(new java.awt.Dimension(1920, 1080));
                setUndecorated(true);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
                jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
                jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                hstory.setBackground(new java.awt.Color (0,0,0,1));
                hstory.setForeground(new java.awt.Color (0,0,0,1));
                hstory.setMaximumSize(new java.awt.Dimension(1000, 1000));
                hstory.setMinimumSize(new java.awt.Dimension(1000, 1000));
                hstory.setPreferredSize(new java.awt.Dimension(1000, 1000));
                hstory.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                hstoryMouseClicked(evt);
                        }
                });
                jPanel1.add(hstory, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

                ExirtButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/logout (2).png"))); // NOI18N
                ExirtButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ExirtButton1MouseClicked(evt);
                        }
                });
                jPanel1.add(ExirtButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1840, 990, -1, -1));

                qrReaderPanel.setPreferredSize(new java.awt.Dimension(800, 1080));
                qrReaderPanel.setLayout(new java.awt.BorderLayout());
                jPanel1.add(qrReaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 0, -1, -1));

                bgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/background/DASHBOARD_1.jpg"))); // NOI18N
                bgPic.setAlignmentX(0.5F);
                jPanel1.add(bgPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void ExirtButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExirtButton1MouseClicked
        JFrame frame = new JFrame("Exit");
		if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Sign Out?", "Library System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
		{
			qrrd.webcam.close();
			new login().setVisible(true);
			this.dispose();
		}
    }//GEN-LAST:event_ExirtButton1MouseClicked

        private void hstoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hstoryMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_hstoryMouseClicked

	public void qrReader()
	{
		qrReaderPanel.add(qrrd);
	}
	
	public void hstorytble()
	{
		hstbl.retrieveData();
		hstory.add(hstbl);
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel ExirtButton1;
        private javax.swing.JLabel bgPic;
        private javax.swing.JPanel hstory;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel qrReaderPanel;
        // End of variables declaration//GEN-END:variables
}
