import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SwingEventDemo{
	JLabel jlab;
	SwingEventDemo(){
		JFrame jfrm = new JFrame(" An Event Example ");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(220,90);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton jbtnAlpha = new JButton("Alpha");
		JButton jbtnBeta = new JButton("Beta");

		jbtnAlpha.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				jlab.setText("Alpha Was Pressed. ");
			}
		});

		jbtnBeta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae){
				jlab.setText("Beta Was Pressed.");
			}
		});

		jfrm.add(jbtnAlpha);
		jfrm.add(jbtnBeta);

		jlab = new JLabel("Press A Button. ");
		jfrm.add(jlab);

		jfrm.setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new SwingEventDemo();
			}
		});
	}
}