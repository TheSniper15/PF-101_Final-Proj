package com.group2.panel;

import java.awt.Color;

import com.group2.swing.*;

public class historyTable extends javax.swing.JPanel {

	public historyTable() {
		initComponents();
		tbl();
	}
	
	public void tbl()
	{
		spHistoryTbl.setVerticalScrollBar(new ScrollBar());
		spHistoryTbl.getVerticalScrollBar().setBackground(Color.WHITE);
		spHistoryTbl.getViewport().setBackground(Color.WHITE);
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spHistoryTbl = new javax.swing.JScrollPane();
        historyTbl = new javax.swing.JTable();

        setBackground(new java.awt.Color(0,0,0,1));
        setForeground(new java.awt.Color(0,0,0,1));
        setMaximumSize(new java.awt.Dimension(1000, 1000));
        setMinimumSize(new java.awt.Dimension(1000, 1000));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1000, 1000));

        historyTbl.setAutoCreateRowSorter(true);
        historyTbl.setBackground(new java.awt.Color(185, 147, 104));
        historyTbl.setFont(new java.awt.Font("MS UI Gothic", 1, 15)); // NOI18N
        historyTbl.setForeground(new java.awt.Color(255, 255, 255));
        historyTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Jhamella Ann S. De Guzman", "BS Civil engineering", "2nd Year", "Ang alamat ng Saging", "Barrowed", null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NAME", "COURSE", "YEAR", "BOOK", "STATUS", "DATE"
            }
        ));
        historyTbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        historyTbl.setGridColor(new java.awt.Color(89, 74, 71));
        historyTbl.setMaximumSize(new java.awt.Dimension(1000, 1000));
        historyTbl.setMinimumSize(new java.awt.Dimension(1000, 1000));
        historyTbl.setPreferredSize(new java.awt.Dimension(1000, 1000));
        historyTbl.setRowHeight(25);
        historyTbl.setSelectionBackground(new java.awt.Color(255, 250, 227));
        historyTbl.setSelectionForeground(new java.awt.Color(89, 74, 71));
        historyTbl.setShowGrid(true);
        historyTbl.setVerifyInputWhenFocusTarget(false);
        spHistoryTbl.setViewportView(historyTbl);
        if (historyTbl.getColumnModel().getColumnCount() > 0) {
            historyTbl.getColumnModel().getColumn(0).setPreferredWidth(400);
            historyTbl.getColumnModel().getColumn(1).setPreferredWidth(250);
            historyTbl.getColumnModel().getColumn(2).setPreferredWidth(150);
            historyTbl.getColumnModel().getColumn(3).setPreferredWidth(400);
            historyTbl.getColumnModel().getColumn(4).setPreferredWidth(125);
            historyTbl.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spHistoryTbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spHistoryTbl, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable historyTbl;
    private javax.swing.JScrollPane spHistoryTbl;
    // End of variables declaration//GEN-END:variables
}
