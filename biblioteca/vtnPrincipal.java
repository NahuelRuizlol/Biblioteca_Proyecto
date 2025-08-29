package biblioteca;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.awt.event.*;

public class vtnPrincipal extends JFrame {

    gestor ge = new gestor();

    public vtnPrincipal() {
        this.setTitle("Biblioteca - Menu principal");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setResizable(false);
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ISBN");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("AUTOR");
        modelo.addColumn("EDITORIAL");
        modelo.addColumn("NUMERO");

        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        JPanel panelTabla = new JPanel(new BorderLayout());
        tabla.getTableHeader().setReorderingAllowed(false);
        TableColumnModel modeloColumnas = tabla.getColumnModel();
        for (int i = 0; i < modeloColumnas.getColumnCount(); i++) {
            modeloColumnas.getColumn(i).setResizable(false);
        }

        
        
        JLabel lblTituloTabla = new JLabel("Prestamos totales registrados", SwingConstants.CENTER);
        lblTituloTabla.setFont(new Font("Arial", Font.BOLD, 14));
        lblTituloTabla.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 10));

        panelTabla.add(lblTituloTabla, BorderLayout.NORTH);
        panelTabla.add(scroll, BorderLayout.CENTER);
        

        JLabel lblLibro = new JLabel("Libros", SwingConstants.CENTER);
        lblLibro.setFont(new Font("Arial", Font.BOLD, 14));

        JButton btnBaja = new JButton("Baja libro");
        btnBaja.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBaja.setFocusPainted(false);
        btnBaja.setFont(new Font("Arial", Font.BOLD, 12));
        btnBaja.setBackground(new Color(255,51,51));
        btnBaja.setBorderPainted(false);

        JButton btnAlta = new JButton("Alta libro");
        btnAlta.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAlta.setFocusPainted(false);
        btnAlta.setFont(new Font("Arial", Font.BOLD, 12));
        btnAlta.setBackground(new Color(0,204,0));
        btnAlta.setBorderPainted(false);

        JButton btnAct = new JButton("Actualizar lista");
        btnAct.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAct.setFocusPainted(false);
        btnAct.setFont(new Font("Arial", Font.BOLD, 12));
        btnAct.setBackground(new Color(102, 102, 255));
        btnAct.setBorderPainted(false);

        JButton btnEdit = new JButton("Editar libro");
        btnEdit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnEdit.setFocusPainted(false);
        btnEdit.setFont(new Font("Arial", Font.BOLD, 12));
        btnEdit.setBackground(new Color(160, 152, 128));
        btnEdit.setBorderPainted(false);

        JButton btnInstrucciones = new JButton("Instrucciones de uso");
        btnInstrucciones.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnInstrucciones.setFocusPainted(false);
        btnInstrucciones.setFont(new Font("Arial", Font.BOLD, 12));
        btnInstrucciones.setBackground(new Color(160, 152, 128));
        btnInstrucciones.setBorderPainted(false);

        JButton btnPrestamo = new JButton("Hacer prestamo");
        btnPrestamo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnPrestamo.setFocusPainted(false);
        btnPrestamo.setFont(new Font("Arial", Font.BOLD, 12));
        btnPrestamo.setBackground(new Color(160, 152, 128));
        btnPrestamo.setBorderPainted(false);

        JButton btnCerrar = new JButton("Cerrar sesión");
        btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new Font("Arial", Font.BOLD, 12));
        btnCerrar.setBackground(new Color(255,51,51));
        btnCerrar.setBorderPainted(false);

        JPanel panelBotones = new JPanel(new GridLayout(8, 1, 0, 10));

        panelBotones.add(lblLibro);
        panelBotones.add(btnAlta);
        panelBotones.add(btnBaja);
        panelBotones.add(btnEdit);
        panelBotones.add(btnAct);
        panelBotones.add(btnPrestamo);
        panelBotones.add(btnInstrucciones);
        panelBotones.add(btnCerrar);
        this.add(panelBotones, BorderLayout.WEST);
        this.add(panelTabla, BorderLayout.CENTER);

        btnAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            	ge.mostrarAlta();
            	
            	
            }
        });

        btnBaja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ge.mostrarBaja();
                
            }
        });

        btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ge.mostrarEditar();
                
            }
        });

        btnInstrucciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ge.mostrarInstrucciones();
                
            }
        });

        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnPrincipal.this.dispose();
                vtnInicioSesion vt1 = new vtnInicioSesion();
        		    vt1.setVisible(true);
        		    
                
            }
        });

        btnPrestamo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ge.mostrarOpcionesPrestamos();
                
                
            }
        });
    }

    
}
