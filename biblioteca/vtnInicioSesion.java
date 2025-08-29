package biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class vtnInicioSesion extends JFrame {
    gestor ge = new gestor();

    public vtnInicioSesion() {
        this.setTitle("Biblioteca - Inicio Sesion");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

       
        JPanel mainPanel = new JPanel();
        mainPanel.setBackground(new Color(50, 50, 50)); 
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints cMain = new GridBagConstraints();
        cMain.fill = GridBagConstraints.BOTH;
        cMain.weightx = 1;
        cMain.weighty = 1;

        
        JPanel panelCampos = new JPanel();
        panelCampos.setPreferredSize(new Dimension(400, 250));
        panelCampos.setBackground(new Color(0, 0, 0, 180));
        panelCampos.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        c.fill = GridBagConstraints.HORIZONTAL;

        JLabel jlbNom = new JLabel("Nombre:");
        jlbNom.setForeground(Color.WHITE);
        c.gridx = 0;
        c.gridy = 0;
        panelCampos.add(jlbNom, c);

        JTextField tfNom = new JTextField(15);
        c.gridx = 1;
        panelCampos.add(tfNom, c);

        JLabel jlbCon = new JLabel("Contraseña:");
        jlbCon.setForeground(Color.WHITE);
        c.gridx = 0;
        c.gridy = 1;
        panelCampos.add(jlbCon, c);

        JPasswordField tfCon = new JPasswordField(15);
        tfCon.setEchoChar('*');
        c.gridx = 1;
        panelCampos.add(tfCon, c);

        JButton btnInicio = new JButton("Iniciar Sesion");
        btnInicio.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnInicio.setFocusPainted(false);
        btnInicio.setFont(new Font("Arial", Font.BOLD, 14));
        btnInicio.setBackground(new Color(160, 152, 128));
        btnInicio.setBorderPainted(false);
        c.gridx = 0;
        c.gridy = 2;
        c.gridwidth = 2;
        panelCampos.add(btnInicio, c);

        ImageIcon imgOriginal = new ImageIcon("C:/Users/nahue/OneDrive/Desktop/OIP.jpeg");
        Image imgEscalada = imgOriginal.getImage().getScaledInstance(500, 400, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(imgEscalada));
        logo.setHorizontalAlignment(SwingConstants.CENTER);

      
        cMain.gridx = 0;
        cMain.gridy = 0;
        cMain.weightx = 0.4; 
        mainPanel.add(panelCampos, cMain);

        cMain.gridx = 1;
        cMain.weightx = 0.6; 
        mainPanel.add(logo, cMain);

        this.setContentPane(mainPanel);
       
        btnInicio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnInicioSesion.this.dispose();
                ge.mostrarPrincipal();
            }
        });

    }

    
}
