import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUI extends AcidCalcInterface {
	JTextArea compute_area;
	@Override
	public void run() {
		JFrame frame = new JFrame("AcidCalc");
		JPanel top_pane = new JPanel();
		JPanel central_pane = new JPanel();
		JPanel right_pane = new JPanel();
		JPanel left_pane = new JPanel();
		
		compute_area = new JTextArea(2,50);
		
		JButton zero = new JButton("0");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton point = new JButton(".");
		JButton equal = new JButton("=");
		
		JButton mult = new JButton("*");
		JButton div = new JButton("/");
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton fact = new JButton("!");
		
		JButton par_o = new JButton("(");
		JButton par_c = new JButton(")");
		
		top_pane.setLayout(new GridLayout(1,3));
		top_pane.add(new JPanel());
		top_pane.add(compute_area);
		top_pane.add(new JPanel());
		
		zero.addActionListener(new ZeroListener());
		one.addActionListener(new OneListener());
		two.addActionListener(new TwoListener());
		three.addActionListener(new ThreeListener());
		four.addActionListener(new FourListener());
		five.addActionListener(new FiveListener());
		six.addActionListener(new SixListener());
		seven.addActionListener(new SevenListener());
		eight.addActionListener(new EightListener());
		nine.addActionListener(new NineListener());
		point.addActionListener(new PointListener());
		equal.addActionListener(new EqualListener());
		
		central_pane.setLayout(new GridLayout(4,3));
		central_pane.add(seven);
		central_pane.add(eight);
		central_pane.add(nine);
		central_pane.add(four);
		central_pane.add(five);
		central_pane.add(six);
		central_pane.add(one);
		central_pane.add(two);
		central_pane.add(three);
		central_pane.add(point);
		central_pane.add(zero);
		central_pane.add(equal);
		
		right_pane.setLayout(new GridLayout(4,1));
		right_pane.add(plus);
		right_pane.add(minus);
		right_pane.add(mult);
		right_pane.add(div);
		
		left_pane.setLayout(new GridLayout(3,1));
		left_pane.add(par_o);
		left_pane.add(par_c);
		left_pane.add(fact);
		
		frame.getContentPane().add(BorderLayout.NORTH, top_pane);
		frame.getContentPane().add(BorderLayout.CENTER, central_pane);
		frame.getContentPane().add(BorderLayout.EAST, right_pane);
		frame.getContentPane().add(BorderLayout.WEST, left_pane);
		frame.setSize(400,600);
		frame.setVisible(true);
		
		
		
		
	}
	class ZeroListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			compute_area.setText(compute_area.getText()+"0");
		}
	}
	class OneListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class TwoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class ThreeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class FourListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class FiveListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class SixListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class SevenListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class EightListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class NineListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class PointListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	class EqualListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			
		}
	}
	
	@Override
	public void stop() {
		
	}


}
