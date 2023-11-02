package com.group2.model;

import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.StyledDocument;


public class getLineModel {
	
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
}
