import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Datos extends JFrame implements ActionListener
{
	JPanel panel1;
	JLabel lblTextoTitulo;
	JLabel lblTexto1;
	JLabel lblTexto2;
	JLabel lblTextoAnos;
	JTextField txtCampoTexto2;
	Font fuente = new Font("Calibri", 3, 20);
	Font fuente2 = new Font("Calibri", 1, 15);
	JComboBox<String> comboGenero;
	JLabel lblTexto3;
	JLabel lblEmbarazo;
	JLabel lblObeso;
	JLabel lblFumo;
	JLabel lblLesion;
	JLabel lblColesterol;
	JLabel lblHipertension;
	JComboBox<String> comboEmbarazo;
	JComboBox<String> comboObeso;
	JComboBox<String> comboFumo;
	JComboBox<String> comboLesion;
	JComboBox<String> comboColesterol;
	JComboBox<String> comboHipertension;
	JButton btnContinuar;

	public Datos()
	{
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(new Color(215,224,238));
		lblTextoTitulo = new JLabel("DATOS DEL PACIENTE");
		lblTextoTitulo.setBounds(220, 20, 200, 50);
		lblTextoTitulo.setFont(fuente);
		lblTextoTitulo.setForeground(new Color(25,25,112));
		lblTexto1 = new JLabel("Seleccione su g\u00e9nero");
		lblTexto1.setBounds(150,60,200,30);
		comboGenero=new JComboBox<String>();
        comboGenero.setBounds(155,95,110,20);
        comboGenero.addItem("Femenino");
        comboGenero.addItem("Masculino");
        lblTexto2 = new JLabel("Ingrese su edad");
		lblTexto2.setBounds(330,60,200,30);
		txtCampoTexto2 = new JTextField();
		txtCampoTexto2.setBounds(335, 95, 30, 20);
		lblTextoAnos = new JLabel("a\u00f1os");
		lblTextoAnos.setBounds(370,95,100,20);
		lblTexto3 = new JLabel("Por favor, selecccione todas las afirmaciones que se apliquen a usted");
		lblTexto3.setBounds(95,135,800,30);
		lblTexto3.setFont(fuente2);
		lblEmbarazo = new JLabel("Estoy embarazada");
		lblEmbarazo.setBounds(95,170,200,30);
		lblObeso =new JLabel("Tengo sobrepeso o estoy obeso");
		lblObeso.setBounds(95,210,200,30);
		lblFumo = new JLabel("Fumo cigarrillos");
		lblFumo.setBounds(95,250,200,30);
		lblLesion = new JLabel("He sufrido una lesi\u00f3n recientemente");
		lblLesion.setBounds(95,290,400,30);
		lblColesterol = new JLabel("Tengo colesterol alto");
		lblColesterol.setBounds(95,330,200,30);
		lblHipertension = new JLabel("Tengo hisperteci\u00f3n");
		lblHipertension.setBounds(95,370,200,30);

		comboEmbarazo=new JComboBox<String>();
        comboEmbarazo.setBounds(410,170,110,20);
        comboEmbarazo.addItem("Si");
        comboEmbarazo.addItem("No");
        comboEmbarazo.addItem("No lo s\u00e9");

        comboObeso=new JComboBox<String>();
        comboObeso.setBounds(410,210,110,20);
        comboObeso.addItem("Si");
        comboObeso.addItem("No");
        comboObeso.addItem("No lo s\u00e9");

        comboFumo=new JComboBox<String>();
        comboFumo.setBounds(410,250,110,20);
        comboFumo.addItem("Si");
        comboFumo.addItem("No");
        comboFumo.addItem("No lo s\u00e9");

        comboLesion=new JComboBox<String>();
        comboLesion.setBounds(410,290,110,20);
        comboLesion.addItem("Si");
        comboLesion.addItem("No");
        comboLesion.addItem("No lo s\u00e9");

        comboColesterol=new JComboBox<String>();
        comboColesterol.setBounds(410,330,110,20);
        comboColesterol.addItem("Si");
        comboColesterol.addItem("No");
        comboColesterol.addItem("No lo s\u00e9");

        comboHipertension=new JComboBox<String>();
        comboHipertension.setBounds(410,370,110,20);
        comboHipertension.addItem("Si");
        comboHipertension.addItem("No");
        comboHipertension.addItem("No lo s\u00e9");

        btnContinuar = new JButton("Continuar");
        btnContinuar.setBounds(230,445,150,30);

		panel1.add(lblTextoTitulo);
		panel1.add(lblTexto1);
		panel1.add(comboGenero);
		panel1.add(lblTexto2);
		panel1.add(txtCampoTexto2);
		panel1.add(lblTextoAnos);
		panel1.add(lblTexto3);
		panel1.add(lblEmbarazo);
		panel1.add(lblObeso);
		panel1.add(lblFumo);
		panel1.add(lblLesion);
		panel1.add(lblColesterol);
		panel1.add(lblHipertension);
		panel1.add(comboEmbarazo);
		panel1.add(comboObeso);
		panel1.add(comboFumo);
		panel1.add(comboLesion);
		panel1.add(comboColesterol);
		panel1.add(comboHipertension);
		panel1.add(btnContinuar);

  		this.add(panel1);
		this.setTitle("INGRESAR DATOS DEL PACIENTE");
		this.setSize(650,550);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);

		btnContinuar.addActionListener(this);
		//comboGenero.addItemListener(this);
	}

	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == this.btnContinuar) 
		{
			String edad = txtCampoTexto2.getText();
			String sexo = comboGenero.getSelectedItem().toString();
			String embarazo = comboEmbarazo.getSelectedItem().toString();
			String obeso = comboObeso.getSelectedItem().toString();
			String fumo = comboFumo.getSelectedItem().toString();
			String lesion = comboLesion.getSelectedItem().toString();
			String colesterol = comboColesterol.getSelectedItem().toString();
			String hipertension = comboHipertension.getSelectedItem().toString();

			MiArchivo.guardarTodo(edad,sexo,embarazo,obeso,fumo,lesion,colesterol,hipertension);

			Sintomas sintomas = new Sintomas();
		}
	}

}
