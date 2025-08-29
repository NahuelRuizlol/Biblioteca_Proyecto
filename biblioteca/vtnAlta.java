package biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vtnAlta extends JFrame {

    gestor ge = new gestor();
    JFrame aviso = new JFrame();

    public vtnAlta() {
        this.setTitle("Biblioteca - Registrar Libro");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setSize(600, 500); 
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        
        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBackground(new Color(60, 63, 65));
        this.setContentPane(mainPanel);

        
        ImageIcon imgOriginal = new ImageIcon("C:/Users/nahue/OneDrive/Desktop/OIP.jpeg");
        Image imgEscalada = imgOriginal.getImage().getScaledInstance(250, 150, Image.SCALE_SMOOTH);
        JLabel lblLogo = new JLabel(new ImageIcon(imgEscalada));
        lblLogo.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(lblLogo, BorderLayout.NORTH);

        
        JPanel panelCampos = new JPanel(new GridBagLayout());
        panelCampos.setBackground(new Color(0, 0, 0, 150));
        panelCampos.setPreferredSize(new Dimension(400, 300));
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 10, 10, 10);
        c.fill = GridBagConstraints.HORIZONTAL;

        
        JLabel jlbIsbn = new JLabel("ISBN:");
        jlbIsbn.setForeground(Color.WHITE);
        c.gridx = 0; c.gridy = 0;
        panelCampos.add(jlbIsbn, c);

        JTextField tfISBN = new JTextField(15);
        c.gridx = 1;
        panelCampos.add(tfISBN, c);

        JLabel jlbNom = new JLabel("Nombre:");
        jlbNom.setForeground(Color.WHITE);
        c.gridx = 0; c.gridy = 1;
        panelCampos.add(jlbNom, c);

        JTextField tfNOM = new JTextField(15);
        c.gridx = 1;
        panelCampos.add(tfNOM, c);

        JLabel jlbAutor = new JLabel("Autor:");
        jlbAutor.setForeground(Color.WHITE);
        c.gridx = 0; c.gridy = 2;
        panelCampos.add(jlbAutor, c);

        JTextField tfAutor = new JTextField(15);
        c.gridx = 1;
        panelCampos.add(tfAutor, c);

        JLabel jlbEdito = new JLabel("Editorial:");
        jlbEdito.setForeground(Color.WHITE);
        c.gridx = 0; c.gridy = 3;
        panelCampos.add(jlbEdito, c);

        JTextField tfEdito = new JTextField(15);
        c.gridx = 1;
        panelCampos.add(tfEdito, c);

        JLabel jlbNume = new JLabel("Número:");
        jlbNume.setForeground(Color.WHITE);
        c.gridx = 0; c.gridy = 4;
        panelCampos.add(jlbNume, c);

        JTextField tfNume = new JTextField(15);
        c.gridx = 1;
        panelCampos.add(tfNume, c);

       
        JButton btnAlta = new JButton("Registrar");
        btnAlta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAlta.setFocusPainted(false);
        btnAlta.setFont(new Font("Arial", Font.BOLD, 14));
        btnAlta.setBackground(new Color(160, 200, 160));
        btnAlta.setBorderPainted(false);
        c.gridx = 0; c.gridy = 5; c.gridwidth = 2;
        panelCampos.add(btnAlta, c);

       
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new Font("Arial", Font.BOLD, 14));
        btnCerrar.setBackground(new Color(255, 51, 51));
        btnCerrar.setBorderPainted(false);
        c.gridx = 0; c.gridy = 6; c.gridwidth = 2;
        panelCampos.add(btnCerrar, c);

        mainPanel.add(panelCampos, BorderLayout.CENTER);

        
        btnAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tfISBN.getText().isEmpty() || tfNOM.getText().isEmpty() || tfAutor.getText().isEmpty()|| tfEdito.getText().isEmpty() || tfNume.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(aviso, "Complete todos los campos");
                } else {
                    JOptionPane.showMessageDialog(aviso, "Libro registrado: " + tfNOM.getText());
                }
            }
        });

        
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnAlta.this.dispose();
                
            }
        });
    }
}
