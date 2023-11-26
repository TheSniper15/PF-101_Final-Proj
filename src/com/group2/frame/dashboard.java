package com.group2.frame;

import com.group2.panel.*;

public class dashboard extends javax.swing.JFrame {

	public dashboard() {
		initComponents();
		qrReader();
		hstorytble();
	}

	qrReader qrrd = new qrReader();
	historyTable hstbl = new historyTable();
	
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        qrReaderPanel = new javax.swing.JPanel();
        hstory = new javax.swing.JPanel();
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

        qrReaderPanel.setPreferredSize(new java.awt.Dimension(800, 1080));
        qrReaderPanel.setLayout(new java.awt.BorderLayout());
        jPanel1.add(qrReaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 0, -1, -1));

        hstory.setMaximumSize(new java.awt.Dimension(800, 1080));
        hstory.setMinimumSize(new java.awt.Dimension(800, 1080));
        hstory.setPreferredSize(new java.awt.Dimension(800, 1080));
        jPanel1.add(hstory, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        bgPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/background/DASH.jpg"))); // NOI18N
        bgPic.setAlignmentX(0.5F);
        jPanel1.add(bgPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

	public void qrReader()
	{
		qrReaderPanel.add(qrrd);
	}
	
	public void hstorytble()
	{
		hstory.add(hstbl);
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgPic;
    private javax.swing.JPanel hstory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel qrReaderPanel;
    // End of variables declaration//GEN-END:variables
}
