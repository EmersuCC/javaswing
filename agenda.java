package agenda;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class agenda implements ActionListener {
	private String[] dias = {"Segunda", "Terça", "Quarta", 
			"Quinta", "Sexta", "Sábado", "Domingo"};
	private JFrame frame = new JFrame();
	private	JPanel panel = new JPanel();
	private	JLabel label = new JLabel();
	private	JButton button = new JButton("Próximo Culto");
	public Random r = new Random();
	
	public agenda(){
		
		panel.add(button);
		panel.add(label);
		panel.setBackground(Color.ORANGE);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));
		panel.setLayout(new GridLayout(2,3));
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setTitle("Programação Semanal");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(this);
		button.setForeground(Color.RED);
		button.setBackground(Color.BLACK);
	
	}
	
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, dias[r.nextInt(7)]);
	}
	public static void main(String[] args) {
		new agenda();
		
	}
	
}
