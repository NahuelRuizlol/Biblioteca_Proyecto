package biblioteca;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class vtnPrestamosEchos extends JFrame {

    gestor ge = new gestor();

    public vtnPrestamosEchos() {

        this.setTitle("Biblioteca - Préstamos Hechos");
        this.setSize(550, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        JLabel lblTitulo = new JLabel("Lista de Préstamos Hechos", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));

        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("NOMBRE DE ESTUDIANTE/PROFE");
        modelo.addColumn("CEDULA");
        modelo.addColumn("FECHA ENTREGA");
        modelo.addColumn("QUIEN LO AUTORIZÓ");
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        JPanel panelTabla = new JPanel(new BorderLayout());
        tabla.getTableHeader().setReorderingAllowed(false);
        TableColumnModel modeloColumnas = tabla.getColumnModel();
        for (int i = 0; i < modeloColumnas.getColumnCount(); i++) {
            modeloColumnas.getColumn(i).setResizable(false);
        }
    
        JButton btnCerrar = new JButton("Cerrar");
        btnCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCerrar.setFocusPainted(false);
        btnCerrar.setFont(new Font("Arial", Font.BOLD, 12));
        btnCerrar.setBackground(new Color(255,51,51));
        btnCerrar.setBorderPainted(false);

        
        JPanel panelBoton = new JPanel();
        panelBoton.add(btnCerrar);

       
        this.add(lblTitulo, BorderLayout.NORTH);
        this.add(scroll, BorderLayout.CENTER);
        this.add(panelBoton, BorderLayout.SOUTH);

        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vtnPrestamosEchos.this.dispose();
                ge.mostrarOpcionesPrestamos();
            }
        });
    }
}
