
package joptingpane;
import javax.swing.*;

public class Joptpane {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "THIS IS MY JOPTION", "TITTLE",JOptionPane.PLAIN_MESSAGE);
		//System.out.println(JOptionPane.showConfirmDialog(null, "NJABULO MDUNJANA", "TITLE", JOptionPane.YES_NO_CANCEL_OPTION));
		int num = JOptionPane.showConfirmDialog(null, "NJABULO MDUNJANA", "TITLE", JOptionPane.YES_NO_CANCEL_OPTION);
		
		System.out.println(JOptionPane.showInputDialog("WHAT IS YOUR NAME"+num));
		}

	}
