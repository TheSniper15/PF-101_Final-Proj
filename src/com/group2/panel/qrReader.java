package com.group2.panel;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.StyledDocument;

public class qrReader extends javax.swing.JPanel implements Runnable,ThreadFactory{

	private WebcamPanel panel;
	private Webcam webcam;
	private Executor executor = Executors.newSingleThreadExecutor(this);
	
	public qrReader() {
		initComponents();
		initWebcam();
	}
	
	public static String getSpecificLine(JTextPane textPane, int lineNumber) {
		StyledDocument doc = textPane.getStyledDocument();

		Element root = doc.getDefaultRootElement();
		Element lineElement = root.getElement(lineNumber);

		int startOffset = lineElement.getStartOffset();
		int endOffset = lineElement.getEndOffset();

		try 
		{
			return doc.getText(startOffset, endOffset - startOffset);
		} 
		catch (BadLocationException e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                result_field = new javax.swing.JTextPane();
                wbcmPanel = new javax.swing.JPanel();
                CardButton = new javax.swing.JLabel();
                BookButton = new javax.swing.JLabel();
                jTextField2 = new javax.swing.JTextField();
                SaveButton = new javax.swing.JLabel();
                CancelButton = new javax.swing.JLabel();

                jScrollPane1.setViewportView(result_field);

                setBackground(new java.awt.Color(0,0,0,1));
                setForeground(new java.awt.Color(0,0,0,1));

                wbcmPanel.setMaximumSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setMinimumSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setPreferredSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                CardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/card.png"))); // NOI18N
                CardButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                CardButtonMouseClicked(evt);
                        }
                });

                BookButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/open-book.png"))); // NOI18N
                BookButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                BookButtonMouseClicked(evt);
                        }
                });

                jTextField2.setFont(new java.awt.Font("MS UI Gothic", 1, 48)); // NOI18N
                jTextField2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField2ActionPerformed(evt);
                        }
                });

                SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/save (1).png"))); // NOI18N
                SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                SaveButtonMouseClicked(evt);
                        }
                });

                CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/cancel (1).png"))); // NOI18N
                CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                CancelButtonMouseClicked(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(CardButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(CancelButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(wbcmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(BookButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(SaveButton)))
                                .addGap(10, 10, 10))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(560, 560, 560)
                                                .addComponent(CardButton)
                                                .addGap(16, 16, 16)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(170, 170, 170)
                                                .addComponent(CancelButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(wbcmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(560, 560, 560)
                                                .addComponent(BookButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(860, 860, 860)
                                                .addComponent(SaveButton)))
                                .addGap(156, 156, 156))
                );
        }// </editor-fold>//GEN-END:initComponents

	public void initWebcam()
	{
		Dimension size = WebcamResolution.QVGA.getSize();
		
		webcam = Webcam.getWebcams().get(0);
		webcam.setViewSize(size);
		
		panel = new WebcamPanel(webcam);
		panel.setPreferredSize(size);
		panel.setFPSDisplayed(true);
		
		wbcmPanel.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800,500));
		
		executor.execute(this);	
	}
	
	@Override
	public void run()
	{
		do
		{
			try 
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException ex) 
			{
				Logger.getLogger(qrReader.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			Result result = null;
			BufferedImage image = null;
			
			if(webcam.isOpen())
			{
				if((image = webcam.getImage()) == null)
				{
					continue;
				}
			}
			
			LuminanceSource source = new BufferedImageLuminanceSource(image);
			BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
			
			try 
			{
				result = new MultiFormatReader().decode(bitmap);
			} 
			catch (NotFoundException ex) 
			{
				Logger.getLogger(qrReader.class.getName()).log(Level.SEVERE, null, ex);
			}
			
			if(result != null)
			{
				result_field.setText(result.getText());	
			}
		}
		while(true);
	}
	
	@Override
	public Thread newThread(Runnable r)
	{
		Thread t = new Thread(r, "My Thread");
		t.setDaemon(true);
		return t;
	}
	
        private void CardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CardButtonMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_CardButtonMouseClicked

        private void BookButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookButtonMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_BookButtonMouseClicked

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_jTextField2ActionPerformed

        private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_SaveButtonMouseClicked

        private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_CancelButtonMouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel BookButton;
        private javax.swing.JLabel CancelButton;
        private javax.swing.JLabel CardButton;
        private javax.swing.JLabel SaveButton;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextField jTextField2;
        private javax.swing.JTextPane result_field;
        private javax.swing.JPanel wbcmPanel;
        // End of variables declaration//GEN-END:variables
}
