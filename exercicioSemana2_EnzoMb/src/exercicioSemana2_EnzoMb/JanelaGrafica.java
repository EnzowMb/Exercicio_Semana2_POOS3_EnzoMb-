package exercicioSemana2_EnzoMb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaGrafica extends JFrame implements ActionListener {
	
	private int num;
	private JPanel panel;
	private JTextField numeroTxt;
	private JTextField resultadoTxt;
	private JLabel labelNumero;
	private JLabel labelResultado;
	private JButton btnCalcular;
	
	public JanelaGrafica() {
		componentes();
		propriedadesJanela();
	}
	
	private void componentes() {
		panel = new JPanel();
		
		labelNumero = new JLabel("Insira o numero:");
		
		labelResultado = new JLabel("Fatorial:");
		
		numeroTxt = new JTextField(5);
		
		resultadoTxt = new JTextField(20);
		resultadoTxt.setEditable(false);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		
		addcomponentes();
		
	}
	
	private void addcomponentes() {
		panel.add(labelNumero);
		panel.add(numeroTxt);
		panel.add(btnCalcular);
		panel.add(labelResultado);
		panel.add(resultadoTxt);
		add(panel);
	}
	
	private void propriedadesJanela() {
		setVisible(true);
        setTitle("Calculo Fatorial");
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btnCalcular) {
			num = Integer.parseInt(numeroTxt.getText());
			
			Fatorial fat = new Fatorial(num);
			resultadoTxt.setText(fat.toString());
		}
		
	}
	
}
