import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
class MiVentanaPrincipal extends JFrame implements ActionListener
{
	JPanel panel;
	ImageIcon imagenfondo = new ImageIcon("C:/Users/TI031/Desktop/POO/Imagenes/fondo_principal.png");
	JLabel fondo;
	JMenuBar menuBar;
 	JMenu menu;
 	JMenuItem menuItem;
 	JMenu menu2;
 	JMenuItem menuItem2;
 	JButton comenzarConsulta;

	public MiVentanaPrincipal()
	{
		panel = new JPanel();
		panel.setLayout(null);

		fondo = new JLabel(imagenfondo,JLabel.CENTER);
		fondo.setBounds(0,0,874,491);

		menuBar = new JMenuBar();
	    menu = new JMenu("Informacion");
	    menuItem = new JMenuItem("Como usarlo");
	    menu.add(menuItem);
	    menuBar.add(menu);

	    menu2 = new JMenu("Terminos de servicio");
	    menuItem2 = new JMenuItem("Leer");
	    menu2.add(menuItem2);
	    menuBar.add(menu2);

	    comenzarConsulta = new JButton("Comenzar consulta");
	    comenzarConsulta.setBounds(355,340,150,30);

	    panel.add(comenzarConsulta);

		this.add(fondo);
	    this.setJMenuBar(menuBar);
		
		this.add(panel);
		this.setTitle("MI DOCTOR VIRTUAL");
		this.setSize(890,550);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);

		menuItem.addActionListener(this);
		menuItem2.addActionListener(this);
		comenzarConsulta.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event)
	{ 
		if (event.getSource() == this.menuItem )
		{
			MiVentanaEmergente1 mve1 = new MiVentanaEmergente1();
		}
		else if (event.getSource() == this.menuItem2)
		{
			MiVentanaEmergente2 mve2 = new MiVentanaEmergente2();
		}
		else if (event.getSource() == this.comenzarConsulta)
		{
			Datos datos = new Datos();
		}

	}	
}