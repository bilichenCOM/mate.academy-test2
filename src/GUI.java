import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends AcidCalcInterface {
	Scanner scanner;
	JFrame frame;
	JTextArea compute_area;
	@Override
	public void run() {
		frame = new JFrame();
		JPanel central_pane = new JPanel();
		JPanel right_pane = new JPanel();
		JPanel top_pane = new JPanel();
		compute_area = new JTextArea(5, 100);
		JButton b = null;
		ClickListener clck = new ClickListener();
		
		central_pane.setLayout(new GridLayout(4,3));
		right_pane.setLayout(new GridLayout(4,1));
		
		for(int i = 1; i<=3; i++) {
			for(int j = 1; j<=3; j++) {
				b = new JButton(Integer.toString(9-3*i+j));
				b.addMouseListener(clck);
				central_pane.add(b);
			}
		}
		b = new JButton(".");
		b.addMouseListener(clck);
		central_pane.add(b);
		b = new JButton("0");
		b.addMouseListener(clck);
		central_pane.add(b);
		b = new JButton("=");
		b.addMouseListener(clck);
		central_pane.add(b);
		
		top_pane.add(compute_area);
		
		right_pane.add(new JButton("+"));
		right_pane.add(new JButton("-"));
		right_pane.add(new JButton("*"));
		right_pane.add(new JButton("/"));
		
		frame.add(BorderLayout.NORTH,top_pane);
		frame.add(BorderLayout.EAST,right_pane);
		frame.add(BorderLayout.CENTER,central_pane);
		frame.setSize(400, 600);
		frame.setTitle("AcidCalc");
		frame.setVisible(true);
	}
	class ClickListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			compute_area.setText(compute_area.getText()+"hello man ");
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}

	@Override
	public void stop() {
		frame.setVisible(false);
		scanner.close();
		
	}


}
