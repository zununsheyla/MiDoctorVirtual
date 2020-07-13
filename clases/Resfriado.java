import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Resfriado extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblTextoTitulo;
	JLabel lblTextoDato;
	JLabel lblTextoEnfermedad;
	JLabel lblTextoDiagnostico;
	JLabel lblTextoTratamiento;
	Font fuente = new Font("Calibri", 3, 25);
	Font fuenT = new Font("Calibri", 1, 18);
	JTextArea txtCampoTextoDatos;
	JTextArea txtCampoTextoInfo;
	JTextArea txtCampoTextoTratamiento;
	JButton btnFinalizar;
	ArrayList<String> contenido_1;
	
	public Resfriado()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(215,224,238));
		lblTextoTitulo = new JLabel("RESULTADO DEL ANALISIS");
		lblTextoTitulo.setBounds(70, 15, 400, 50);
		lblTextoTitulo.setFont(fuente);
		lblTextoTitulo.setForeground(new Color(25,25,112));
		lblTextoDato = new JLabel("Datos del paciente");
		lblTextoDato.setBounds(40,70,200,30);
		lblTextoDato.setForeground(new Color(25,25,112));
		txtCampoTextoDatos = new JTextArea();
		txtCampoTextoDatos.setBounds(40,100,350,100);
		contenido_1 = new ArrayList<String>();

		contenido_1 = MiArchivo.leerTodo("datos_paciente_1.txt");
		String cadena = "";
		for (int i=0; i<contenido_1.size(); i++) 
		{
			cadena = cadena + contenido_1.get(i) + "\n";
		}
		   
		txtCampoTextoDatos.setText(cadena);
		//txtCampoTextoDatos.setEditable(false);
		lblTextoDiagnostico = new JLabel("Paciente diagnosticado con: ");
		lblTextoDiagnostico.setBounds(40,220,200,30);
		lblTextoDiagnostico.setForeground(new Color(25,25,112));
		lblTextoEnfermedad = new JLabel("Resfriado comun");
		lblTextoEnfermedad.setBounds(230,220,200,30);
		lblTextoEnfermedad.setFont(fuenT);
		lblTextoEnfermedad.setForeground(Color.BLUE);
		
		txtCampoTextoInfo = new JTextArea("\n El resfriado comun es una infeccion contagiosa de origen\n  viral que afecta a las vias respiratorias superiores.");
		txtCampoTextoInfo.setBounds(40,250,350,80);
		txtCampoTextoInfo.setEditable(false);
		lblTextoTratamiento = new JLabel("Tratamiento");
		lblTextoTratamiento.setBounds(40,325,350,80);
		lblTextoTratamiento.setForeground(new Color(25,25,112));
		txtCampoTextoTratamiento = new JTextArea("\n  El tratamiento consiste en antiinflamatorios y descongestivos\n  La mayor\u00eda de las personas se recuperan por s\u00ed solas en \n  dos semanas. Los productos de venta libre y los remedios \n  caseros pueden ayudar a controlar los s\u00edntomas");
		txtCampoTextoTratamiento.setBounds(40,380,350,100);
		txtCampoTextoTratamiento.setEditable(false);
		btnFinalizar = new JButton("Finalizar consulta");
		btnFinalizar.setBounds(135,500,150,30);

		panel.add(lblTextoTitulo);
		panel.add(lblTextoDato);
		panel.add(lblTextoDiagnostico);
		panel.add(lblTextoEnfermedad);
		panel.add(txtCampoTextoDatos);
		panel.add(txtCampoTextoInfo);
		panel.add(lblTextoTratamiento);
		panel.add(txtCampoTextoTratamiento);
		panel.add(btnFinalizar);

		this.add(panel);
		this.setTitle("RESULTADO");
		this.setSize(450,600);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);	
		this.setVisible(true);

		btnFinalizar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == this.btnFinalizar)
	    {
	    	System.exit(0); 
	    }
	}
}
///////////////////////////////////////////////////////////////////////////////////////
class Covid19 extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblTextoTitulo;
	JLabel lblTextoDato;
	JLabel lblTextoEnfermedad;
	JLabel lblTextoDiagnostico;
	JLabel lblTextoTratamiento;
	Font fuente = new Font("Calibri", 3, 25);
	Font fuenT = new Font("Calibri", 1, 18);
	JTextArea txtCampoTextoDatos;
	JTextArea txtCampoTextoInfo;
	JTextArea txtCampoTextoTratamiento;
	JButton btnFinalizar;
	ArrayList<String> contenido_1;

	public Covid19()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(215,224,238));
		lblTextoTitulo = new JLabel("RESULTADO DEL ANALISIS");
		lblTextoTitulo.setBounds(70, 15, 400, 50);
		lblTextoTitulo.setFont(fuente);
		lblTextoTitulo.setForeground(new Color(25,25,112));
		lblTextoDato = new JLabel("Datos del paciente");
		lblTextoDato.setBounds(40,70,200,30);
		lblTextoDato.setForeground(new Color(25,25,112));
		txtCampoTextoDatos = new JTextArea();
		txtCampoTextoDatos.setBounds(40,100,350,100);
		contenido_1 = new ArrayList<String>();

		contenido_1 = MiArchivo.leerTodo("datos_paciente_1.txt");
		String cadena = "";
		for (int i=0; i<contenido_1.size(); i++) 
		{
			cadena = cadena + contenido_1.get(i) + "\n";
		}
		   
		txtCampoTextoDatos.setText(cadena);
		//txtCampoTextoDatos.setEditable(false);
		lblTextoDiagnostico = new JLabel("Paciente diagnosticado con: ");
		lblTextoDiagnostico.setBounds(40,220,200,30);
		lblTextoDiagnostico.setForeground(new Color(25,25,112));
		lblTextoEnfermedad = new JLabel("Covid-19");
		lblTextoEnfermedad.setBounds(230,220,200,30);
		lblTextoEnfermedad.setFont(fuenT);
		lblTextoEnfermedad.setForeground(Color.BLUE);
		
		txtCampoTextoInfo = new JTextArea("\n La enfermedad por coronavirus (COVID 19) es un enfermedad \n infecciosa causada por un coronavirus recientemente \n descubierto. ");
		txtCampoTextoInfo.setBounds(40,250,350,80);
		txtCampoTextoInfo.setEditable(false);
		lblTextoTratamiento = new JLabel("Tratamiento");
		lblTextoTratamiento.setBounds(40,325,350,80);
		lblTextoTratamiento.setForeground(new Color(25,25,112));
		txtCampoTextoTratamiento = new JTextArea("\n La mayor\u00eda de las personas que enferman de COVID 19 \n experimentan s\u00edntomas de leves a moderados y se recuperan \n sin tratamiento especial. \n Solicite atenci\u00f3n m\u00e9dica para mayor informaci\u00f3n.");
		txtCampoTextoTratamiento.setBounds(40,380,350,100);
		txtCampoTextoTratamiento.setEditable(false);
		btnFinalizar = new JButton("Finalizar consulta");
		btnFinalizar.setBounds(135,500,150,30);

		panel.add(lblTextoTitulo);
		panel.add(lblTextoDato);
		panel.add(lblTextoDiagnostico);
		panel.add(lblTextoEnfermedad);
		panel.add(txtCampoTextoDatos);
		panel.add(txtCampoTextoInfo);
		panel.add(lblTextoTratamiento);
		panel.add(txtCampoTextoTratamiento);
		panel.add(btnFinalizar);

		this.add(panel);
		this.setTitle("RESULTADO");
		this.setSize(450,600);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);	
		this.setVisible(true);

		btnFinalizar.addActionListener(this);

	}
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == this.btnFinalizar)
	    {
	    	System.exit(0); 
	    }
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////////
class Salmonela extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblTextoTitulo;
	JLabel lblTextoDato;
	JLabel lblTextoEnfermedad;
	JLabel lblTextoDiagnostico;
	JLabel lblTextoTratamiento;
	Font fuente = new Font("Calibri", 3, 25);
	Font fuenT = new Font("Calibri", 1, 18);
	JTextArea txtCampoTextoDatos;
	JTextArea txtCampoTextoInfo;
	JTextArea txtCampoTextoTratamiento;
	JButton btnFinalizar;
	ArrayList<String> contenido_1;

	public Salmonela()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(215,224,238));
		lblTextoTitulo = new JLabel("RESULTADO DEL ANALISIS");
		lblTextoTitulo.setBounds(70, 15, 400, 50);
		lblTextoTitulo.setFont(fuente);
		lblTextoTitulo.setForeground(new Color(25,25,112));
		lblTextoDato = new JLabel("Datos del paciente");
		lblTextoDato.setBounds(40,70,200,30);
		lblTextoDato.setForeground(new Color(25,25,112));
		txtCampoTextoDatos = new JTextArea();
		txtCampoTextoDatos.setBounds(40,100,350,100);
		contenido_1 = new ArrayList<String>();

		contenido_1 = MiArchivo.leerTodo("datos_paciente_1.txt");
		String cadena = "";
		for (int i=0; i<contenido_1.size(); i++) 
		{
			cadena = cadena + contenido_1.get(i) + "\n";
		}
		   
		txtCampoTextoDatos.setText(cadena);
		//txtCampoTextoDatos.setEditable(false);
		lblTextoDiagnostico = new JLabel("Paciente diagnosticado con: ");
		lblTextoDiagnostico.setBounds(40,220,200,30);
		lblTextoDiagnostico.setForeground(new Color(25,25,112));
		lblTextoEnfermedad = new JLabel("Salmonela");
		lblTextoEnfermedad.setBounds(230,220,200,30);
		lblTextoEnfermedad.setFont(fuenT);
		lblTextoEnfermedad.setForeground(Color.BLUE);
		
		txtCampoTextoInfo = new JTextArea("\n Es una infeccion de origen alimenticio causada por una \n bacteria llamada Salmonela. Puede ser transmitida al comer \n alimentos contaminados o al beber contaminada. ");
		txtCampoTextoInfo.setBounds(40,250,350,80);
		txtCampoTextoInfo.setEditable(false);
		lblTextoTratamiento = new JLabel("Tratamiento");
		lblTextoTratamiento.setBounds(40,325,350,80);
		lblTextoTratamiento.setForeground(new Color(25,25,112));
		txtCampoTextoTratamiento = new JTextArea("\n El tratamiento del Salmonela se dirige principalmente a \n restaurar la p\u00e9rdida de l\u00edquidos y electrolitos causada por \n los v\u00f3mitos y la diarrea. ");
		txtCampoTextoTratamiento.setBounds(40,380,350,100);
		txtCampoTextoTratamiento.setEditable(false);
		btnFinalizar = new JButton("Finalizar consulta");
		btnFinalizar.setBounds(135,500,150,30);

		panel.add(lblTextoTitulo);
		panel.add(lblTextoDato);
		panel.add(lblTextoDiagnostico);
		panel.add(lblTextoEnfermedad);
		panel.add(txtCampoTextoDatos);
		panel.add(txtCampoTextoInfo);
		panel.add(lblTextoTratamiento);
		panel.add(txtCampoTextoTratamiento);
		panel.add(btnFinalizar);

		this.add(panel);
		this.setTitle("RESULTADO");
		this.setSize(450,600);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);	
		this.setVisible(true);

		btnFinalizar.addActionListener(this);

	}
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == this.btnFinalizar)
	    {
	    	System.exit(0); 
	    }
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////////
class Conjuntivitis extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblTextoTitulo;
	JLabel lblTextoDato;
	JLabel lblTextoEnfermedad;
	JLabel lblTextoDiagnostico;
	JLabel lblTextoTratamiento;
	Font fuente = new Font("Calibri", 3, 25);
	Font fuenT = new Font("Calibri", 1, 18);
	JTextArea txtCampoTextoDatos;
	JTextArea txtCampoTextoInfo;
	JTextArea txtCampoTextoTratamiento;
	JButton btnFinalizar;
	ArrayList<String> contenido_1;

	public Conjuntivitis()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(215,224,238));
		lblTextoTitulo = new JLabel("RESULTADO DEL ANALISIS");
		lblTextoTitulo.setBounds(70, 15, 400, 50);
		lblTextoTitulo.setFont(fuente);
		lblTextoTitulo.setForeground(new Color(25,25,112));
		lblTextoDato = new JLabel("Datos del paciente");
		lblTextoDato.setBounds(40,70,200,30);
		lblTextoDato.setForeground(new Color(25,25,112));
		txtCampoTextoDatos = new JTextArea();
		txtCampoTextoDatos.setBounds(40,100,350,100);
		contenido_1 = new ArrayList<String>();

		contenido_1 = MiArchivo.leerTodo("datos_paciente_1.txt");
		String cadena = "";
		for (int i=0; i<contenido_1.size(); i++) 
		{
			cadena = cadena + contenido_1.get(i) + "\n";
		}
		   
		txtCampoTextoDatos.setText(cadena);
		//txtCampoTextoDatos.setEditable(false);
		lblTextoDiagnostico = new JLabel("Paciente diagnosticado con: ");
		lblTextoDiagnostico.setBounds(40,220,200,30);
		lblTextoDiagnostico.setForeground(new Color(25,25,112));
		lblTextoEnfermedad = new JLabel("Conjuntivitis");
		lblTextoEnfermedad.setBounds(230,220,200,30);
		lblTextoEnfermedad.setFont(fuenT);
		lblTextoEnfermedad.setForeground(Color.BLUE);
		
		txtCampoTextoInfo = new JTextArea(" La conjuntivitis es una inflamaci\u00f3n de la conjuntiva, una  \n membrana mucosa fina y transparente que cubre la superficie \n del ojo. Esta inflamaci\u00f3n hace m\u00e1s visibles los vasos \n sangu\u00edneos, dando al ojo un color rosado o rojizo. Es una de \n las afecciones oculares m\u00e1s frecuentes, tanto en ni\u00f1os \n como en adultos.");
		txtCampoTextoInfo.setBounds(40,250,350,100);
		txtCampoTextoInfo.setEditable(false);
		lblTextoTratamiento = new JLabel("Recomendaciones");
		lblTextoTratamiento.setBounds(40,325,350,80);
		lblTextoTratamiento.setForeground(new Color(25,25,112));
		txtCampoTextoTratamiento = new JTextArea("\n -Evita tocarte los ojos directamente. \n -Usa pa\u00f1uelos desechables. \n -Usa lentes. \n -Consultar a su m\u00e9dico a la brevedad posible");
		txtCampoTextoTratamiento.setBounds(40,380,350,100);
		txtCampoTextoTratamiento.setEditable(false);
		btnFinalizar = new JButton("Finalizar consulta");
		btnFinalizar.setBounds(135,500,150,30);

		panel.add(lblTextoTitulo);
		panel.add(lblTextoDato);
		panel.add(lblTextoDiagnostico);
		panel.add(lblTextoEnfermedad);
		panel.add(txtCampoTextoDatos);
		panel.add(txtCampoTextoInfo);
		panel.add(lblTextoTratamiento);
		panel.add(txtCampoTextoTratamiento);
		panel.add(btnFinalizar);

		this.add(panel);
		this.setTitle("RESULTADO");
		this.setSize(450,600);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);	
		this.setVisible(true);

		btnFinalizar.addActionListener(this);

	}
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == this.btnFinalizar)
	    {
	    	System.exit(0); 
	    }
	}
}
////////////////////////////////////////////////////////////////////////////////////////////
class Varicela extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel lblTextoTitulo;
	JLabel lblTextoDato;
	JLabel lblTextoEnfermedad;
	JLabel lblTextoDiagnostico;
	JLabel lblTextoTratamiento;
	Font fuente = new Font("Calibri", 3, 25);
	Font fuenT = new Font("Calibri", 1, 18);
	JTextArea txtCampoTextoDatos;
	JTextArea txtCampoTextoInfo;
	JTextArea txtCampoTextoTratamiento;
	JButton btnFinalizar;
	ArrayList<String> contenido_1;

	public Varicela()
	{
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(215,224,238));
		lblTextoTitulo = new JLabel("RESULTADO DEL ANALISIS");
		lblTextoTitulo.setBounds(70, 15, 400, 50);
		lblTextoTitulo.setFont(fuente);
		lblTextoTitulo.setForeground(new Color(25,25,112));
		lblTextoDato = new JLabel("Datos del paciente");
		lblTextoDato.setBounds(40,70,200,30);
		lblTextoDato.setForeground(new Color(25,25,112));
		txtCampoTextoDatos = new JTextArea();
		txtCampoTextoDatos.setBounds(40,100,350,100);
		contenido_1 = new ArrayList<String>();

		contenido_1 = MiArchivo.leerTodo("datos_paciente_1.txt");
		String cadena = "";
		for (int i=0; i<contenido_1.size(); i++) 
		{
			cadena = cadena + contenido_1.get(i) + "\n";
		}
		   
		txtCampoTextoDatos.setText(cadena);
		//txtCampoTextoDatos.setEditable(false);
		lblTextoDiagnostico = new JLabel("Paciente diagnosticado con: ");
		lblTextoDiagnostico.setBounds(40,220,200,30);
		lblTextoDiagnostico.setForeground(new Color(25,25,112));
		lblTextoEnfermedad = new JLabel("Varicela");
		lblTextoEnfermedad.setBounds(230,220,200,30);
		lblTextoEnfermedad.setFont(fuenT);
		lblTextoEnfermedad.setForeground(Color.BLUE);
		
		txtCampoTextoInfo = new JTextArea("\n La varicela se produce por la infecci\u00f3n del virus varicela z\u00f3ster, \n es muy contagiosa y se puede expandir por todo el cuerpo. \n Normalmente, aparece por fases: manchas, granitos, ves\u00edcu- \n las y costras.");
		txtCampoTextoInfo.setBounds(40,250,350,100);
		txtCampoTextoInfo.setEditable(false);
		lblTextoTratamiento = new JLabel("Recomendaciones");
		lblTextoTratamiento.setBounds(40,325,350,80);
		lblTextoTratamiento.setForeground(new Color(25,25,112));
		txtCampoTextoTratamiento = new JTextArea(" -Pa\u00f1os empapados para intentar disminuir la fiebre.\n -Minucioso cuidado de la piel. \n -Prendas sueltas para evitar que aumente el picor. \n -Reposo en cama. \n -No ba\u00f1arse. \n -No rascarse.");
		txtCampoTextoTratamiento.setBounds(40,380,350,100);
		txtCampoTextoTratamiento.setEditable(false);
		btnFinalizar = new JButton("Finalizar consulta");
		btnFinalizar.setBounds(135,500,150,30);

		panel.add(lblTextoTitulo);
		panel.add(lblTextoDato);
		panel.add(lblTextoDiagnostico);
		panel.add(lblTextoEnfermedad);
		panel.add(txtCampoTextoDatos);
		panel.add(txtCampoTextoInfo);
		panel.add(lblTextoTratamiento);
		panel.add(txtCampoTextoTratamiento);
		panel.add(btnFinalizar);

		this.add(panel);
		this.setTitle("RESULTADO");
		this.setSize(450,600);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);	
		this.setVisible(true);

		btnFinalizar.addActionListener(this);

	}
	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == this.btnFinalizar)
	    {
	    	System.exit(0); 
	    }
	}
}