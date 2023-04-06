// JColorChooser = A GUI mechanism that let's a user choose a color

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Color_Chooser {

	public static void main(String[] args) {
		new MyFrame();
	}

}
class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JLabel label;
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new  JButton("Pick a Color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setText("This is some Text :D");
		label.setFont(new Font("MV Boli",Font.PLAIN,75));
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a Color", Color.black);
			
			label.setForeground(color); //color text
			//label.setBackground(color);  //color background
		}
		
	}
	
}