package biblioteca;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class vtnOpcionesPrestamos extends JFrame{

	gestor ge = new gestor();
	
	public vtnOpcionesPrestamos() {
		
		this.setTitle("Biblioteca - Opciones de los Prestamos");
        this.setSize(550, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
		
        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(240, 240, 255)); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(20, 20, 20, 20);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        
        ImageIcon logoIcon = new ImageIcon("C:/Users/nahue/OneDrive/Desktop/OIP.jpeg");
        Image img = logoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); 
        JLabel lblLogo = new JLabel(new ImageIcon(img));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        panel.add(lblLogo, gbc);
        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;

        
        JButton btnPonerCeib = new JButton("Hacer Préstamo");
        btnPonerCeib.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPonerCeib.setFocusPainted(false);
        btnPonerCeib.setFont(new Font("Arial", Font.BOLD, 14));
        btnPonerCeib.setBackground(new Color(160, 152, 128));
        btnPonerCeib.setBorderPainted(false);

        JButton btnVerPrestamos = new JButton("Ver préstamos hechos");
        btnVerPrestamos.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnVerPrestamos.setFocusPainted(false);
        btnVerPrestamos.setFont(new Font("Arial", Font.BOLD, 14));
        btnVerPrestamos.setBackground(new Color(160, 152, 128));
        btnVerPrestamos.setBorderPainted(false);

        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCerrar.setBackground(new Color(255,51,51));
        btnCerrar.setBorderPainted(false);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(btnPonerCeib, gbc);
        gbc.gridy = 2;
        panel.add(btnVerPrestamos, gbc);
        gbc.gridy = 3;
        panel.add(btnCerrar, gbc);

        this.add(panel);

       
        btnPonerCeib.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnOpcionesPrestamos.this.dispose();
                ge.mostrarPrestamo();
            }
        });

        btnVerPrestamos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnOpcionesPrestamos.this.dispose();
                ge.mostrarPrestamosEchos();
            }
        });

        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnOpcionesPrestamos.this.dispose();
                
            }
        });
	
	}
	
}
