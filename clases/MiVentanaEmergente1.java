import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MiVentanaEmergente1 extends JFrame implements ActionListener
{	
	JPanel panel1;
	ImageIcon imagenfondo = new ImageIcon("C:/Users/TI031/Desktop/POO/Imagenes/informacion.png");
	JLabel fondo;
	JButton aceptar;

	public MiVentanaEmergente1()
	{
		panel1 = new JPanel();
		panel1.setLayout(null);

		fondo = new JLabel(imagenfondo,JLabel.CENTER);
		fondo.setBounds(0,0,666,459);

		aceptar = new JButton ("Aceptar");
		aceptar.setBounds(120,380,150,30);


		panel1.add(aceptar);
		
		this.add(fondo);
  		this.add(panel1);
		this.setTitle("Acerca de nosostros");
		this.setSize(666,485);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);

		aceptar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent event)
	{	
		if (event.getSource() == this.aceptar) 
		{
			dispose();
		}	
	}
}
///////////////////////////////////////////////////////////////////////////

class MiVentanaEmergente2 extends JFrame implements ActionListener
{
	JPanel panel1;
	ImageIcon imagenfondo = new ImageIcon("C:/Users/TI031/Desktop/POO/Imagenes/terminos.png");
	JLabel fondo;
    JButton aceptar;

	public MiVentanaEmergente2()
	{
		panel1 = new JPanel();
		panel1.setLayout(null);

		fondo = new JLabel(imagenfondo,JLabel.CENTER);
		fondo.setBounds(0,0,575,418);

		aceptar = new JButton ("Aceptar");
		aceptar.setBounds(100,350,150,30);

		panel1.add(aceptar);
		
		this.add(fondo);
		this.add(panel1);
		this.setTitle("Leer terminos");
		this.setSize(575,450);
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setVisible(true);

		aceptar.addActionListener(this);
		
	}
    public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == this.aceptar) 
		{
			dispose();
		}	
	}
	
}
/////////////////////////////////////////////////////////////////////////////////