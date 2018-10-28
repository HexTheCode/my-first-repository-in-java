import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class window {

	private static int c;

	static void createAndShowGUI(String t, int w, int h) {

		// Create and set up the window.
		JFrame frame = new JFrame(t);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JButton b = new JButton();
		JButton bLess = new JButton();
		JLabel lLess = new JLabel();
		JButton bEquals = new JButton();
		JLabel lEquals = new JLabel();
		JLabel lTxt = new JLabel();
		JLabel l = new JLabel();
		JTextField txt = new JTextField(10);
		JButton bTxt = new JButton();
		b.setText("Pulsa aqui");
		bLess.setText("Pulsa aqui");
		bEquals.setText(" 0 ");
		bTxt.setText("Pulsa aqui");

		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c++;
				frame.setTitle(t + " " + c);
			}

		});
		bLess.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c--;
				frame.setTitle(t + " " + c);
			}

		});
		bEquals.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				c = 0;
				frame.setTitle(t + " " + c);
			}

		});
		bTxt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String value = txt.getText();
				frame.setTitle(t + " " + value);
			}

		});
		panel.setSize(new Dimension(frame.getWidth(), frame.getHeight()));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.add(l);
		panel.add(b);
		panel.add(lLess);
		panel.add(bLess);
		panel.add(lEquals);
		panel.add(bEquals);
		panel.add(lTxt);
		panel.add(txt);
		panel.add(bTxt);
		l.setText(t + " + ");
		lLess.setText(t + " - ");
		lEquals.setText(t + " = ");
		lTxt.setText(t + " = ");

		/*
		 * frame.setMinimumSize(new Dimension(w, h)); frame.setMaximumSize(new
		 * Dimension(w / 2, h / 2));
		 */

		// Display the window.
		frame.pack();
		frame.setVisible(true);
	}
}
