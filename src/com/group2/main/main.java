package com.group2.main;

import com.group2.frame.login;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main extends javax.swing.JFrame {


	public main() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Loading = new javax.swing.JProgressBar();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Loading.setPreferredSize(new java.awt.Dimension(146, 3));
        jPanel1.add(Loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1050, 1920, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/background/LOADING.jpg"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 1080));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
			java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the Loading form */
		main m = new main();
		login login = new login();
		
		m.setVisible(true);
		
		try 
		{
			for(int i = 0; i < 100; i++)
			{
				Thread.sleep(20);
				m.Loading.setValue(i);
			}
				
		} 
		catch (InterruptedException ex) 
		{
				Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		m.setVisible(false);
		login.setVisible(true);
		m.dispose(); 
	}
        
	
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Loading;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
