package Postit;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PostitIHM extends JFrame implements ActionListener {

	/**
	 * Champs "nom" 100*30
	 * 
	 * @param title
	 */
	protected JLabel nameLabel;
	protected JTextField nameField;

	/**
	 * Champs "description" 300*100
	 * 
	 * @param title
	 */
	protected JLabel descriptionLabel;
	protected JTextArea descriptionField;

	/**
	 * Champs "priority"
	 * 
	 * @param title
	 */
	protected JLabel priorityLabel;
	protected JComboBox<Priority> priorityField;

	/**
	 * Boutons
	 * 
	 * @param title
	 */
	protected JButton btnOk = new JButton("Valider");
	protected JButton btnKo = new JButton("Annuler");

	/**
	 * Error label
	 * 
	 * @param title
	 */
	protected JLabel errorLabel = new JLabel();

	public PostitIHM(String title) {
		this.setTitle(title);
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		JPanel container = new JPanel(new BorderLayout());

		JPanel top = new JPanel();
		top.add(new JLabel("Postit"));

		JPanel nameRow = new JPanel();
		nameRow.setLayout(new BoxLayout(nameRow, BoxLayout.X_AXIS));
		this.nameLabel = new JLabel("Name* :");
		this.nameField = new JTextField();
		this.nameField.setBounds(10, 231, 370, 22);
		nameRow.add(this.nameLabel);
		nameRow.add(this.nameField);

		JPanel descriptionRow = new JPanel();
		descriptionRow.setLayout(new BoxLayout(descriptionRow, BoxLayout.LINE_AXIS));
		this.descriptionLabel = new JLabel("Description :");
		this.descriptionField = new JTextArea(5, 20);
		JScrollPane scrollPane = new JScrollPane(this.descriptionField);
		descriptionRow.add(this.descriptionLabel);
		descriptionRow.add(scrollPane);

		JPanel priorityRow = new JPanel();
		priorityRow.setLayout(new BoxLayout(priorityRow, BoxLayout.LINE_AXIS));
		this.priorityLabel = new JLabel("Priorité :");
		this.priorityField = new JComboBox<Priority>(Priority.values());
		priorityRow.add(priorityLabel);
		priorityRow.add(priorityField);

		JPanel content = new JPanel();
		content.setLayout(new BoxLayout(content, BoxLayout.PAGE_AXIS));
		content.add(nameRow);
		content.add(descriptionRow);
		content.add(priorityRow);

		JPanel bottom = new JPanel();
		this.btnOk.addActionListener(this);
		bottom.add(this.btnOk);
		bottom.add(this.btnKo);

		container.add(top, BorderLayout.NORTH);
		container.add(content, BorderLayout.CENTER);
		container.add(bottom, BorderLayout.SOUTH);

		this.setBackground(Color.DARK_GRAY);

		this.setContentPane(container);
		this.pack();
		this.setVisible(true);
		
	}
	

	public void addActionListener(ActionEvent e){
		this.actionPerformed(e);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(this.nameField.getText().equals("")){
			JOptionPane dialog = new JOptionPane();
			dialog.showMessageDialog(null, "Nom requis", "Erreur", JOptionPane.ERROR_MESSAGE);
		} else {
			this.errorLabel.setText("");
			this.errorLabel.setForeground(null);
			
			String name = this.nameField.getText();
			String description = this.descriptionField.getText();
			
			String priority = this.priorityField.getSelectedItem().toString();
			
			Postit newPostit = new Postit(name, description, priority);
			JOptionPane dialog = new JOptionPane();
			dialog.showMessageDialog(null, newPostit.getInfo(), "Succès", JOptionPane.INFORMATION_MESSAGE);
		}		
	}
	
}
