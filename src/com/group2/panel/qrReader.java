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
import com.group2.frame.dashboard;
import com.group2.model.getLineModel;
import com.group2.myClass.*;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class qrReader extends javax.swing.JPanel implements Runnable,ThreadFactory{

	public Webcam webcam;
	private WebcamPanel panel;
	private Executor executor = Executors.newSingleThreadExecutor(this);
	
	public qrReader() {
		initComponents();
		initWebcam();
		db.Connect();
		hstbl.retrieveData();
	}
	
	databaseCon db = new databaseCon();
	historyTable hstbl = new historyTable();
	
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                result_field = new javax.swing.JTextPane();
                wbcmPanel = new javax.swing.JPanel();
                fullName_TextField = new javax.swing.JTextField();
                course_TextField = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                title_TextField = new javax.swing.JTextField();
                year_TextField = new javax.swing.JTextField();
                timeDateYear_TextField = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                status_box = new javax.swing.JComboBox<>();
                UpdateBtn = new javax.swing.JLabel();
                SaveBtn = new javax.swing.JLabel();
                DeleteBtn = new javax.swing.JLabel();
                status_box1 = new javax.swing.JComboBox<>();

                jScrollPane1.setViewportView(result_field);

                setBackground(new java.awt.Color(0,0,0,1));
                setForeground(new java.awt.Color(0,0,0,1));

                wbcmPanel.setBackground(new java.awt.Color(185, 147, 104));
                wbcmPanel.setForeground(new java.awt.Color(255, 255, 255));
                wbcmPanel.setToolTipText("");
                wbcmPanel.setMaximumSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setMinimumSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setPreferredSize(new java.awt.Dimension(294, 150));
                wbcmPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                fullName_TextField.setBackground(new java.awt.Color(255, 255, 255));
                fullName_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                fullName_TextField.setForeground(new java.awt.Color(89, 74, 71));
                fullName_TextField.setBorder(null);
                fullName_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                fullName_TextFieldActionPerformed(evt);
                        }
                });

                course_TextField.setBackground(new java.awt.Color(255, 255, 255));
                course_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                course_TextField.setForeground(new java.awt.Color(89, 74, 71));
                course_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                course_TextFieldActionPerformed(evt);
                        }
                });

                jLabel1.setBackground(new java.awt.Color(255, 255, 255));
                jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(0, 0, 0));

                title_TextField.setBackground(new java.awt.Color(255, 255, 255));
                title_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                title_TextField.setForeground(new java.awt.Color(89, 74, 71));
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

                year_TextField.setBackground(new java.awt.Color(255, 255, 255));
                year_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                year_TextField.setForeground(new java.awt.Color(89, 74, 71));
                year_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                year_TextFieldActionPerformed(evt);
                        }
                });

                timeDateYear_TextField.setBackground(new java.awt.Color(255, 255, 255));
                timeDateYear_TextField.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                timeDateYear_TextField.setForeground(new java.awt.Color(89, 74, 71));
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

                jLabel2.setBackground(new java.awt.Color(255, 255, 255));
                jLabel2.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(89, 74, 71));
                jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel2.setText("Fullname:");

                jLabel3.setBackground(new java.awt.Color(255, 255, 255));
                jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(89, 74, 71));
                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel3.setText("Course  :");

                jLabel4.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(89, 74, 71));
                jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel4.setText("Year      :");

                jLabel5.setBackground(new java.awt.Color(255, 255, 255));
                jLabel5.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(89, 74, 71));
                jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel5.setText("Book     :");

                jLabel6.setBackground(new java.awt.Color(255, 255, 255));
                jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(89, 74, 71));
                jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel6.setText("Date      :");
                jLabel6.setToolTipText("");

                jLabel7.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(89, 74, 71));
                jLabel7.setText("Status: ");

                status_box.setBackground(new java.awt.Color(255, 255, 255));
                status_box.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                status_box.setForeground(new java.awt.Color(89, 74, 71));
                status_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Borrowed", "Returned" }));
                status_box.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                status_boxActionPerformed(evt);
                        }
                });

                UpdateBtn.setBackground(new java.awt.Color(255, 255, 255));
                UpdateBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 30)); // NOI18N
                UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
                UpdateBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                UpdateBtn.setText("UPDATE");
                UpdateBtn.setToolTipText("");

                SaveBtn.setBackground(new java.awt.Color(255, 255, 255));
                SaveBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 30)); // NOI18N
                SaveBtn.setForeground(new java.awt.Color(255, 255, 255));
                SaveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                SaveBtn.setText("SAVE");
                SaveBtn.setToolTipText("");
                SaveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                SaveBtnMouseClicked(evt);
                        }
                });

                DeleteBtn.setBackground(new java.awt.Color(255, 255, 255));
                DeleteBtn.setFont(new java.awt.Font("MS UI Gothic", 1, 30)); // NOI18N
                DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
                DeleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                DeleteBtn.setText("DELETE");
                DeleteBtn.setToolTipText("");

                status_box1.setBackground(new java.awt.Color(255, 255, 255));
                status_box1.setFont(new java.awt.Font("MS UI Gothic", 1, 36)); // NOI18N
                status_box1.setForeground(new java.awt.Color(89, 74, 71));
                status_box1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Borrowed", "Returned" }));
                status_box1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                status_box1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
                this.setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(17, 17, 17)
                                                                .addComponent(wbcmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(SaveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(status_box1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(76, 76, 76)
                                                                .addComponent(jLabel1))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(fullName_TextField)
                                                                        .addComponent(title_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(timeDateYear_TextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(course_TextField)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(year_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(status_box, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(wbcmPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(fullName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(course_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(year_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(status_box, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(64, 64, 64)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(title_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(timeDateYear_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(217, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(UpdateBtn)
                                                        .addComponent(DeleteBtn)
                                                        .addComponent(SaveBtn)
                                                        .addComponent(status_box1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(93, 93, 93))))
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
	
	public void saveact()
	{	
		try
		{
			String nm = fullName_TextField.getText();
			String crs = course_TextField.getText();
			String yr = year_TextField.getText();
			String bk = title_TextField.getText();
			String sts = status_box.getSelectedItem().toString();
			String dt = timeDateYear_TextField.getText();
			
			db.pst = db.con.prepareStatement("INSERT INTO history (Name,Course,Year,Book,Status,Date)VALUES(?,?,?,?,?,?)");
			
			db.pst.setString(1, nm);
			db.pst.setString(2, crs);
			db.pst.setString(3, yr);
			db.pst.setString(4, bk);
			db.pst.setString(5, sts);
			db.pst.setString(6, dt);
			
			int k = db.pst.executeUpdate();
			
			if(k == 1)
			{
				JOptionPane.showMessageDialog(this,"Record Added!!");
				dashboard dshbrd = new dashboard();	
				dshbrd.hstorytble();
				hstbl.retrieveData();
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
        
        getLineModel gl = new getLineModel();
        public String name, fname, lname, mi, ay, course;
	
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
                                
                                name = lname + ", " + fname + mi;
                                
                                fullName_TextField.setText(name);
                                course_TextField.setText(course);
                                year_TextField.setText(ay);
				
				currentTimeDate();
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
	
        private void fullName_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullName_TextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_fullName_TextFieldActionPerformed

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

        private void timeDateYear_TextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timeDateYear_TextFieldMouseClicked
                // TODO add your handling code here:
		currentTimeDate();
        }//GEN-LAST:event_timeDateYear_TextFieldMouseClicked

    private void status_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_boxActionPerformed

        private void SaveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveBtnMouseClicked
                // TODO add your handling code here:
		saveact();
        }//GEN-LAST:event_SaveBtnMouseClicked

    private void status_box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_box1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_box1ActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel DeleteBtn;
        public javax.swing.JLabel SaveBtn;
        private javax.swing.JLabel UpdateBtn;
        private javax.swing.JTextField course_TextField;
        private javax.swing.JTextField fullName_TextField;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextPane result_field;
        private javax.swing.JComboBox<String> status_box;
        private javax.swing.JComboBox<String> status_box1;
        private javax.swing.JTextField timeDateYear_TextField;
        private javax.swing.JTextField title_TextField;
        private javax.swing.JPanel wbcmPanel;
        private javax.swing.JTextField year_TextField;
        // End of variables declaration//GEN-END:variables
}
