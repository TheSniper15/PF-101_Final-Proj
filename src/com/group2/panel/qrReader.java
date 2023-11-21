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
import com.group2.model.getLineModel;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;

public class qrReader extends javax.swing.JPanel implements Runnable,ThreadFactory{

	private WebcamPanel panel;
	private Webcam webcam;
	private Executor executor = Executors.newSingleThreadExecutor(this);
	
	public qrReader() {
		initComponents();
		initWebcam();
	}
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                result_field = new javax.swing.JTextPane();
                wbcmPanel = new javax.swing.JPanel();
                CardButton = new javax.swing.JLabel();
                fullName_TextField = new javax.swing.JTextField();
                SaveButton = new javax.swing.JLabel();
                CancelButton = new javax.swing.JLabel();
                course_TextField = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                title_TextField = new javax.swing.JTextField();
                year_TextField = new javax.swing.JTextField();
                timeDateYear_TextField = new javax.swing.JTextField();
                ExirtButton1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();

                jScrollPane1.setViewportView(result_field);

                setBackground(new java.awt.Color(0,0,0,1));
                setForeground(new java.awt.Color(0,0,0,1));

                wbcmPanel.setMaximumSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setMinimumSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setPreferredSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                CardButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/PSAU_I.D 2.png"))); // NOI18N
                CardButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                CardButtonMouseClicked(evt);
                        }
                });

                fullName_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                fullName_TextField.setText("FullName:");
                fullName_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fullName_TextFieldActionPerformed(evt);
                        }
                });

                SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/SaveButton.png"))); // NOI18N
                SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                SaveButtonMouseClicked(evt);
                        }
                });

                CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/TrashButton.png"))); // NOI18N
                CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                CancelButtonMouseClicked(evt);
                        }
                });

                course_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                course_TextField.setText("Course: ");
                course_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                course_TextFieldActionPerformed(evt);
                        }
                });

                jLabel1.setBackground(new java.awt.Color(255, 255, 255));
                jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));

                title_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                title_TextField.setText("Book: ");
                title_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                title_TextFieldMouseClicked(evt);
                        }
                        public void mouseExited(java.awt.event.MouseEvent evt) {
                                title_TextFieldMouseExited(evt);
                        }
                });
                title_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                title_TextFieldActionPerformed(evt);
                        }
                });

                year_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                year_TextField.setText("Year:");
                year_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                year_TextFieldActionPerformed(evt);
                        }
                });

                timeDateYear_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                timeDateYear_TextField.setText("[Y/M/D]-TIME");
                timeDateYear_TextField.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                timeDateYear_TextFieldMouseClicked(evt);
                        }
                });
                timeDateYear_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                timeDateYear_TextFieldActionPerformed(evt);
                        }
                });

                ExirtButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/logout (2).png"))); // NOI18N
                ExirtButton1.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                ExirtButton1MouseClicked(evt);
                        }
                });

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/group2/icon/Book.png"))); // NOI18N

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(17, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(title_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(wbcmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(CardButton)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(jLabel1))
                                                                        .addComponent(fullName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(course_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(year_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jLabel2)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(SaveButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(CancelButton)
                                                                .addGap(562, 562, 562)
                                                                .addComponent(ExirtButton1))
                                                        .addComponent(timeDateYear_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(17, 17, 17))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(wbcmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CardButton)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fullName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(course_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(year_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(title_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeDateYear_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ExirtButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(42, 42, 42))
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
	
	public void currentTimeDate()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		timeDateYear_TextField.setText(dtf.format(now));
	}
        
        getLineModel gl = new getLineModel();
        public String name, fname, lname, mi, ay, course, condi;
	
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
                                
                                lname = gl.getSpecificLine(result_field, 2);
                                fname = gl.getSpecificLine(result_field, 0);
                                mi = gl.getSpecificLine(result_field, 1);
                                course = gl.getSpecificLine(result_field, 3);
                                ay = gl.getSpecificLine(result_field, 4);
                                
                                name = lname + fname + mi;
                                
                                fullName_TextField.setText(name);
                                course_TextField.setText(course);
                                year_TextField.setText(ay);
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

        private void fullName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullName_TextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_fullName_TextFieldActionPerformed

        private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
                // TODO add your handling code here:
        }//GEN-LAST:event_SaveButtonMouseClicked

        private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
                // TODO add your handling code here:
		course_TextField.setText("Course: ");
		title_TextField.setText("Book: ");
		fullName_TextField.setText("FullName:");
		year_TextField.setText("Year:");
		timeDateYear_TextField.setText("[Y/M/D]-TIME");
		result_field.setText("");
        }//GEN-LAST:event_CancelButtonMouseClicked

    private void course_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_course_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_course_TextFieldActionPerformed

    private void title_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_title_TextFieldActionPerformed
        // TODO add your handling code here:
        title_TextField.setText("");
    }//GEN-LAST:event_title_TextFieldActionPerformed

    private void year_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_year_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_year_TextFieldActionPerformed

    private void timeDateYear_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeDateYear_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeDateYear_TextFieldActionPerformed

    private void title_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_TextFieldMouseClicked
        // TODO add your handling code here:
	title_TextField.setText("");
    }//GEN-LAST:event_title_TextFieldMouseClicked

    private void title_TextFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_title_TextFieldMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_title_TextFieldMouseExited

    private void ExirtButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExirtButton1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExirtButton1MouseClicked

        private void timeDateYear_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeDateYear_TextFieldMouseClicked
                // TODO add your handling code here:
		currentTimeDate();
        }//GEN-LAST:event_timeDateYear_TextFieldMouseClicked


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel CancelButton;
        private javax.swing.JLabel CardButton;
        private javax.swing.JLabel ExirtButton1;
        private javax.swing.JLabel SaveButton;
        private javax.swing.JTextField course_TextField;
        private javax.swing.JTextField fullName_TextField;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextPane result_field;
        private javax.swing.JTextField timeDateYear_TextField;
        private javax.swing.JTextField title_TextField;
        private javax.swing.JPanel wbcmPanel;
        private javax.swing.JTextField year_TextField;
        // End of variables declaration//GEN-END:variables
}
