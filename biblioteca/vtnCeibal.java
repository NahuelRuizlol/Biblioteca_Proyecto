package biblioteca;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vtnCeibal extends JFrame {
    JFrame aviso = new JFrame();
    gestor ge = new gestor();

    public vtnCeibal() {
        this.setTitle("Biblioteca - Registrar Préstamo");
        this.setSize(600, 500); 
        this.setLocationRelativeTo(null); 
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(new Color(230, 230, 220)); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        
        ImageIcon logoIcon = new ImageIcon("C:/Users/nahue/OneDrive/Desktop/OIP.jpeg");
        Image img = logoIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        JLabel lblLogo = new JLabel(new ImageIcon(img));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(lblLogo, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.CENTER;

        
        JLabel jlbNom = new JLabel("Cédula Estudiante:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(jlbNom, gbc);

        JTextField tfNOM = new JTextField(15);
        gbc.gridx = 1;
        panel.add(tfNOM, gbc);

        JLabel jlbNum = new JLabel("Departamento Estudiante:");
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(jlbNum, gbc);

        JTextField tfNum = new JTextField(15);
        gbc.gridx = 1;
        panel.add(tfNum, gbc);

        JLabel jlbDispositivo = new JLabel("Seleccione el préstamo:");
        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(jlbDispositivo, gbc);

        String[] recursos = {"Libro", "Laptop"};
        JComboBox<String> comboDis = new JComboBox<>(recursos);
        gbc.gridx = 1;
        panel.add(comboDis, gbc);

       
        JButton btnPrestamo = new JButton("Registrar Préstamo");
        btnPrestamo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPrestamo.setFocusPainted(false);
        btnPrestamo.setFont(new Font("Arial", Font.BOLD, 12));
        btnPrestamo.setBackground(new Color(160, 152, 128));
        btnPrestamo.setBorderPainted(false);

        JButton btnCerrar = new JButton("Volver");
        btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new Font("Arial", Font.BOLD, 12));
        btnCerrar.setBackground(new Color(255, 51, 51));
        btnCerrar.setBorderPainted(false);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(btnPrestamo, gbc);
        gbc.gridx = 1;
        panel.add(btnCerrar, gbc);

        this.add(panel);

        
        btnPrestamo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String seleccion = (String) comboDis.getSelectedItem();
                if (tfNOM.getText().isEmpty() || tfNum.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(aviso, "Complete todos los campos");
                } else {
                    JOptionPane.showMessageDialog(aviso, "Préstamo registrado: " + seleccion);
                }
            }
        });

        
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnCeibal.this.dispose();
                ge.mostrarOpcionesPrestamos();
            }
        });
    }
}
