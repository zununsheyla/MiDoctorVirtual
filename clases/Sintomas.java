import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class Sintomas extends JFrame implements ActionListener
{
	JPanel panel1;
	JLabel lblTextoTitulo;
	Font fuente = new Font("Calibri", 3, 25);
	Font f = new Font("Calibri", 1, 20);
	JLabel lblTexto1;
	JRadioButton radio1,radio2,radio3,radio4,radio5,radio6,radio7,radio8,radio9,radio10;
	JRadioButton radio11,radio12,radio13,radio14,radio15,radio16,radio17,radio18,radio19,radio20;
	JRadioButton radio21,radio22,radio23,radio24,radio25,radio26,radio27,radio28,radio29,radio30;
	JRadioButton radio31,radio32,radio33,radio34,radio35,radio36;
	JButton btnAnalizar;

	public Sintomas()
	{
		panel1 = new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(new Color(215,224,238));
		lblTextoTitulo = new JLabel("SINTOMAS DEL PACIENTE");
		lblTextoTitulo.setBounds(300, 20, 400, 50);
		lblTextoTitulo.setFont(fuente);
		lblTextoTitulo.setForeground(new Color(25,25,112));
		lblTexto1 = new JLabel("Seleccione sus sintomas");
		lblTexto1.setBounds(325,60,200,30);
		lblTexto1.setFont(f);

		radio1 = new JRadioButton("Diarrea");
		radio1.setBounds(30,110,250,30);
		radio2 = new JRadioButton("Dificultad respiratoria");
		radio2.setBounds(30,150,250,30);
		radio3 = new JRadioButton("Dificultad para o\u00edr");
		radio3.setBounds(30,190,250,30);
		radio4 = new JRadioButton("Dolor de pecho");
		radio4.setBounds(30,230,250,30);
		radio5 = new JRadioButton("Dolor de cabeza");
		radio5.setBounds(30,270,250,30);
		radio6 = new JRadioButton("Aumento de las ganas de orinar");
		radio6.setBounds(30,310,250,30);
		radio7 = new JRadioButton("Fiebre");
		radio7.setBounds(30,350,250,30);
		radio8 = new JRadioButton("N\u00e1useas y v\u00f3mito");
		radio8.setBounds(30,390,250,30);
		radio9 = new JRadioButton("Irritaci\u00f3n ocular");
		radio9.setBounds(30,430,250,30);
		radio10 = new JRadioButton("Aumento de la sed");
		radio10.setBounds(30,470,250,30);
		radio11 = new JRadioButton("Sangrado en las heces");
		radio11.setBounds(30,510,250,30);
		radio12 = new JRadioButton("Perdida de olfato y gusto");
		radio12.setBounds(295,110,250,30);
		radio13 = new JRadioButton("Cansancio y debilidad corporal");
		radio13.setBounds(295,150,250,30);
		radio14 = new JRadioButton("Escurrimiento nasal");
		radio14.setBounds(295,190,250,30);
		radio15 = new JRadioButton("Dolor de garganta");
		radio15.setBounds(295,230,250,30);
		radio16 = new JRadioButton("Tos con flemas");
		radio16.setBounds(295,270,250,30);
		radio17 = new JRadioButton("Picaz\u00f3n y ardor de la vulva");
		radio17.setBounds(295,310,250,30);
		radio18 = new JRadioButton("Retraso menstrual");
		radio18.setBounds(295,350,250,30);
		radio19 = new JRadioButton("Sensibilidad e hinchazon de los pechos");
		radio19.setBounds(295,390,250,30);
		radio20 = new JRadioButton("Calambres abdominales");
		radio20.setBounds(295,430,250,30);
		radio21 = new JRadioButton("Perdida de peso");
		radio21.setBounds(295,470,250,30);
		radio22 = new JRadioButton("Erupci\u00f3n cut\u00e1nea y comezon");
		radio22.setBounds(295,510,250,30);
		radio23 = new JRadioButton("Secreci\u00f3n ocular ");
		radio23.setBounds(560,110,250,30);
		radio24 = new JRadioButton("Secreci\u00f3n de l\u00edquido del o\u00eddo");
		radio24.setBounds(560,150,250,30);
		radio25 = new JRadioButton("Laga\u00f1as en p\u00e1rpados y pesta\u00f1as");
		radio25.setBounds(560,190,250,30);
		radio26 = new JRadioButton("Problemas del ciclo menstrual");
		radio26.setBounds(560,230,250,30);
		radio27 = new JRadioButton("Dolor abdominal");
		radio27.setBounds(560,270,250,30);
		radio28 = new JRadioButton("Dolor de o\u00eddo");
		radio28.setBounds(560,310,250,30);
		radio29 = new JRadioButton("Incomodidad vaginal");
		radio29.setBounds(560,350,250,30);
		radio30 = new JRadioButton("Tos seca");
		radio30.setBounds(560,390,250,30);
		radio31 = new JRadioButton("Dolor durante el acto sexual");
		radio31.setBounds(560,430,250,30);
		radio32 = new JRadioButton("Sensacion de ganas de orinar");
		radio32.setBounds(560,470,250,30);
		radio33 = new JRadioButton("Congesti\u00f3n nasal");
		radio33.setBounds(560,510,250,30);
		radio34 = new JRadioButton("Escalofr\u00edos");
		radio34.setBounds(30,550,250,30);
		radio35 = new JRadioButton("Cuerpo cortado");
		radio35.setBounds(295,550,250,30);
		radio36 = new JRadioButton("Estornudos");
		radio36.setBounds(560,550,250,30);
		

		btnAnalizar = new JButton("Analizar sintomas");
        btnAnalizar.setBounds(330,600,150,30);

		panel1.add(lblTextoTitulo);
		panel1.add(lblTexto1);
		panel1.add(radio1);panel1.add(radio2);panel1.add(radio3);panel1.add(radio4);panel1.add(radio5);panel1.add(radio6);
		panel1.add(radio7);panel1.add(radio8);panel1.add(radio9);panel1.add(radio10);panel1.add(radio11);panel1.add(radio12);
		panel1.add(radio13);panel1.add(radio14);panel1.add(radio15);panel1.add(radio16);panel1.add(radio17);panel1.add(radio18);
		panel1.add(radio19);panel1.add(radio20);panel1.add(radio21);panel1.add(radio22);panel1.add(radio23);panel1.add(radio24);
		panel1.add(radio25);panel1.add(radio26);panel1.add(radio27);panel1.add(radio28);panel1.add(radio29);panel1.add(radio30);
		panel1.add(radio31);panel1.add(radio32);panel1.add(radio33);panel1.add(radio34);panel1.add(radio35);panel1.add(radio36);
		panel1.add(btnAnalizar);
		this.add(panel1);
		this.setTitle("MI VENTANA EMERGENTE EN JAVA");
		this.setSize(860,700);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);
		
		btnAnalizar.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == this.btnAnalizar) 
		{
			analizarDatos();
		}
	}
	public void analizarDatos()
	{
		if(radio14.isSelected()==true)
		{
			if(radio15.isSelected()==true)
			{
				if(radio16.isSelected()==true)
				{
					if(radio33.isSelected()==true)
					{
						if(radio34.isSelected()==true)
						{
							if(radio35.isSelected()==true)
							{
								if(radio36.isSelected()==true)
								{
									Resfriado resfriado = new Resfriado();
								}
							}
						}
					}
				}
			}
		}
		else if(radio5.isSelected()==true)
		{
			if(radio7.isSelected()==true)
			{
				if(radio12.isSelected()==true)
				{
					if(radio13.isSelected()==true)
					{
						if(radio15.isSelected()==true)
						{
							if(radio30.isSelected()==true)
							{
								Covid19 covid = new Covid19();
							}
						}
					}
				}
			}
		}

	    if(radio1.isSelected()==true)
	    {
		  	if(radio5.isSelected()==true)
		  	{
		  		if(radio7.isSelected()==true)
		  		{
		  			if(radio8.isSelected()==true)
		  			{
		  				if(radio11.isSelected()==true)
		  				{
		  					if(radio20.isSelected()==true)
		  					{
		  						if(radio34.isSelected()==true)
		  						{
		  							Salmonela salmonela = new Salmonela();
		  							JOptionPane.showMessageDialog(null,"Te recomendamos visitar a tu m\u00e9dico");	
		  						}
		  					}
		  				}
		  			}
		  		}
		  	}
	    }
	    else if(radio9.isSelected()==true)
	    {
	    	if(radio23.isSelected()==true)
	    	{
	    		if(radio25.isSelected()==true)
	    		{
	    			Conjuntivitis conjuntivitis = new Conjuntivitis();
	    			JOptionPane.showMessageDialog(null, "Te recomendamos visitar a tu m\u00e9dico");
	    		}
	    	}
	    }
	    if(radio5.isSelected()==true)
	    {
	    	if(radio7.isSelected()==true)
	    	{
	    		if(radio13.isSelected()==true)
	    		{
	    			if(radio22.isSelected()==true)
	    			{
	    				Varicela varicela = new Varicela();
	    			}
	    		}
	    	}
	    }
	}
}