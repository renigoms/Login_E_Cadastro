package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import Controller.BDController;


@SuppressWarnings("serial")
public class TelaMenuView extends Controller.TelaController {
	JButton cadastrarButton, loginButton, sairButton;
	public TelaMenuView() {
		setTitle("Bem Vindo ao Aplicativo");
		setSize(400, 400);
		setLayout(null);
//		setLayout(new GridLayout(3,0));
//		setLayout(new FlowLayout());
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		BDController.abrirBase();
		
		cadastrarButton = new JButton("Cadastrar");
		cadastrarButton.setBounds(70, 30, 250, 70);
		cadastrarButton.addActionListener(new EventoAction());
		loginButton = new JButton("Login");
		loginButton.setBounds(70,140, 250,70);
		loginButton.addActionListener(new EventoAction());
		sairButton = new JButton("Sair");
		sairButton.setBounds(70,250, 250, 70);
		sairButton.addActionListener(new EventoAction());
		
		
		
		add(cadastrarButton);
		add(loginButton);
		add(sairButton);
		
		setVisible(true);
		
	}
	
	public class EventoAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cadastrarButton ) {
				new TelaDeCadastroView();
			}else if(e.getSource() == loginButton) {
				new TelaDeLoginView();
			}else if (e.getSource() == sairButton) {
				System.exit(0);
			}
			
		}}
}
