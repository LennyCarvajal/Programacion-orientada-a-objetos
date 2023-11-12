package Figuras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPiramide extends JFrame implements ActionListener {

    private Container contenedor;
    private JLabel base, altura, apotema, volumen, superficie;
    private JTextField campo_base, campo_altura, campo_apotema;
    private JButton calcular;

    public VentanaPiramide() {
        inicio();
        setTitle("Pirámide"); 
        setSize(280,240);
        setLocationRelativeTo(null); 
        setResizable(false); 
    }
   
    private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null);

        base = new JLabel();
        base.setText("Base (cms):");     
        base.setBounds(20, 20, 135, 23);

        campo_base = new JTextField();   
        campo_base.setBounds(120, 20, 135, 23);
     
        altura = new JLabel();
        altura.setText("Altura (cms):");
        altura.setBounds(20, 50, 135, 23);

        campo_altura = new JTextField();
        campo_altura.setBounds(120, 50, 135, 23);
  
        apotema = new JLabel();
        apotema.setText("Apotema (cms):");
        apotema.setBounds(20, 80, 135, 23);
        
        campo_apotema = new JTextField();
        campo_apotema.setBounds(120, 80, 135, 23);

        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(120, 110, 135, 23); 
        calcular.addActionListener(this);

        volumen = new JLabel();
        volumen.setText("Volumen (cm3):");
        volumen.setBounds(20, 140, 135, 23);

        superficie = new JLabel();
        superficie.setText("Superficie (cm2):");
        superficie.setBounds(20, 170, 135, 23);

        contenedor.add(base);
        contenedor.add(campo_base);
        contenedor.add(altura);
        contenedor.add(campo_altura);
        contenedor.add(apotema);
        contenedor.add(campo_apotema);
        contenedor.add(calcular);
        contenedor.add(volumen);
        contenedor.add(superficie);
    }
    public void actionPerformed(ActionEvent event) {
        Piramide piramide;
        boolean error = false;
        double base = 0;
        double altura = 0;
        double apotema = 0;
        try {
            base = Double.parseDouble(campo_base.getText());
            altura = Double.parseDouble(campo_altura.getText());
            apotema = Double.parseDouble(campo_apotema.getText());
            piramide = new Piramide(base, altura, apotema);

            volumen.setText("Volumen (cm3): " + String.format("%.2f",
            piramide.calc_volumen()));
            superficie.setText("Superficie (cm2): " + String.format("%.2f",
            piramide.calc_superficie()));
        } 
        catch (Exception e) {
            error = true; // Si ocurre una excepción
        } 
        finally {
            if (error) { 
                JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
