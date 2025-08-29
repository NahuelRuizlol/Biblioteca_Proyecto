package biblioteca;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class vtnInstru extends JFrame{
	gestor ge = new gestor();
	public vtnInstru() {
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		
		Color colorPanelInfo = new Color(255, 198, 186);
		Color colorPanelCentral = new Color(105, 0, 90);
		Color colorBoton = new Color(242, 65, 65);
		
		Font fuenteTitulo = new Font("Arial", Font.BOLD , 20);
		Font fuenteBien = new Font("Arial", Font.BOLD , 25);
		Font fuenteOtra = new Font("Arial", Font.BOLD , 16);
		
		this.setTitle("Instrucciones"); 
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		
		
		
		
		JPanel panel1 = new JPanel() {
		    @Override
		    protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        Graphics2D g2 = (Graphics2D) g;
		        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		        int arc = 120; 
		        g2.setColor(getBackground());
		        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
		       
		        
		    }
		};
		
		JPanel panel11 = new JPanel();
		JPanel panel12 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1,BoxLayout.Y_AXIS));
		panel11.setOpaque(false);
		panel12.setOpaque(false);
		panel1.setBackground(colorPanelInfo);
		panel1.setOpaque(false);
		panel1.setPreferredSize(new Dimension(900, 160));
		
		
		
		JPanel panel2 = new JPanel(){
		    @Override
		    protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        Graphics2D g2 = (Graphics2D) g;
		        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		        int arc = 120; 
		        g2.setColor(getBackground());
		        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arc, arc);
		    }
		};
		JPanel panel21 = new JPanel();
		JPanel panel22 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2,BoxLayout.Y_AXIS));
		//panel2.setBorder(new LineBorder(java.awt.Color.BLACK, 2, true));
		panel21.setOpaque(false);
		panel22.setOpaque(false);
		panel2.setBackground(colorPanelInfo);
		panel2.setOpaque(false);
		panel2.setPreferredSize(new Dimension(900, 170));
		
		JLabel bienvenida = new JLabel("<html><p>Bienvenido a la opcion de \"Instrucciones</p><p> de uso del Programa\"</p> <html>");
		JLabel administrar = new JLabel("<html><p>¿Que hace la opcion de</p><p> \"Administrar libros\"? </p> <html>");
		JLabel baja = new JLabel("<html><p>¿Que hace la opcion</p><p> de \"Dar de baja un Libro\"?</p> <html>");
		JLabel ingresar = new JLabel("¿Que hace la opcion de \"Ingresar Libro\"?");
		JLabel modificar = new JLabel("¿Que hace la opcion de \"Modificar Libro\"?");
		bienvenida.setForeground(new Color(255, 255, 255) );
		
		JLabel administrar2 = new JLabel("<html><p>Lo que hace esta opcion, es que te muestra</p> <p>una tabla con la informacion de los libros que</p> <p>hay registrados y/o donados/prestados.</p></html>");
		JLabel baja2 = new JLabel("<html><p>Lo que hace esta opcion, es que al poner el ISBN</p> <p> dellibro que quieres eliminar, el programa buscara</p> <p>ese ISBN que pusiste y te mostrara</p> <p>el libro que coincide con tu busqueda.</p></html>");
		JLabel ingresar2 = new JLabel("<html><p>Esta opcion lo que hace es que te pide los </p> <p>datos (Nombre, ISBN, Autor, Editorial y Numero),</p> <p> el dato \"Numero\" es el numero de libro</p> <p> que es (ejemplo: primer libro, segundo libro, etc).</p></html> ");
		JLabel modificar2 = new JLabel("<html><p>Es igual que la opcion de \"Ingresar Libro\",</p> <p>buscaras el libro a modificar con el ISBN del</p> <p> mismo, despues te aparecera en la tabla de</p> <p> abajo. Despues tocaras ese libro que aparece en la</p> <p> tabla y a continuacion, podras editar ese libro.</p></html>");
		
		JLabel espacio1 = new JLabel("                      ");
		JLabel espacio2 = new JLabel("          ");
		JLabel espacio3 = new JLabel("          ");
		JLabel espacio4 = new JLabel("          ");
		
	
		
		bienvenida.setFont(fuenteBien);
		administrar.setFont(fuenteTitulo);
		baja.setFont(fuenteTitulo);
		ingresar.setFont(fuenteTitulo);
		modificar.setFont(fuenteTitulo);
		
		
		administrar2.setFont(fuenteOtra);
		baja2.setFont(fuenteOtra);
		ingresar2.setFont(fuenteOtra);
		modificar2.setFont(fuenteOtra);
		

		
		
		JPanel panelCentral = new JPanel();
		panelCentral.setBackground(colorPanelCentral);
		
		JLabel relleno2 = new JLabel("                                  ");
		
		JPanel relleno = new JPanel();
		relleno.setPreferredSize(new Dimension(100, 130));
		relleno.setBackground(colorPanelCentral);
		
		JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCerrar.setBackground(new Color(255,51,51));
        btnCerrar.setBorderPainted(false);
        
		this.add(panelCentral, BorderLayout.CENTER);
		this.add(relleno, BorderLayout.NORTH);
		
		panelCentral.add(bienvenida);
		panelCentral.add(relleno2);
		panelCentral.add(btnCerrar);
		
		panelCentral.add(panel1);
		panelCentral.add(panel2);
		
		panel1.add(panel11);
		panel1.add(panel12);
		panel11.add(administrar);
		panel12.add(administrar2);
		panel11.add(espacio1);
		panel12.add(espacio2);
		panel11.add(baja);
		panel12.add(baja2);
		
		panel2.add(panel21);
		panel2.add(panel22);
		panel21.add(ingresar);
		panel21.add(espacio3);
		panel21.add(modificar);
		panel22.add(ingresar2);
		panel22.add(espacio4);
		panel22.add(modificar2);
		
		btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnInstru.this.dispose();
                
            }
        });
    }

		
		
	}

