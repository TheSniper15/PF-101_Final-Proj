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

        setMaximumSize(new java.awt.Dimension(800, 1080));
        setMinimumSize(new java.awt.Dimension(800, 1080));
        setPreferredSize(new java.awt.Dimension(800, 1080));

        historyTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spHistoryTbl.setViewportView(historyTbl);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spHistoryTbl, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spHistoryTbl, javax.swing.GroupLayout.PREFERRED_SIZE, 915, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable historyTbl;
    private javax.swing.JScrollPane spHistoryTbl;
    // End of variables declaration//GEN-END:variables
}
