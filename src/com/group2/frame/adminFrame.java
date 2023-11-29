package com.group2.frame;

public class adminFrame extends javax.swing.JFrame {

	public adminFrame() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historyTable1 = new com.group2.panel.historyTable();
        update1 = new com.group2.panel.update();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(historyTable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, -1));
        getContentPane().add(update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/background/Libsys_Admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.group2.panel.historyTable historyTable1;
    private javax.swing.JLabel jLabel1;
    private com.group2.panel.update update1;
    // End of variables declaration//GEN-END:variables
}
