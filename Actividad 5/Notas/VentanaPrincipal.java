package Notas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
    
    private Container contenedor;
    private JLabel nota1, nota2, nota3, nota4, nota5, promedio, desviación, mayor, menor;
    private JTextField campo_nota1, campo_nota2, campo_nota3, campo_nota4, campo_nota5;
    private JButton calcular, limpiar;
 
    public VentanaPrincipal(){
        inicio();

        setTitle("Notas"); 
        setSize(280,380); 
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 

    }


    private void inicio() {
        contenedor = getContentPane(); 
        contenedor.setLayout(null); 
        nota1 = new JLabel();
        nota1.setText("Nota 1:");
        nota1.setBounds(20, 20, 135, 23); 

        campo_nota1 = new JTextField();
        campo_nota1.setBounds(105, 20, 135, 23);
    
        nota2 = new JLabel();
        nota2.setText("Nota 2:");
        nota2.setBounds(20, 50, 135, 23); 

        campo_nota2 = new JTextField();  
        campo_nota2.setBounds(105, 50, 135, 23);
    
        nota3 = new JLabel();
        nota3.setText("Nota 3:");
        nota3.setBounds(20, 80, 135, 23); 

        campo_nota3 = new JTextField();
        campo_nota3.setBounds(105, 80, 135, 23);

        nota4 = new JLabel();
        nota4.setText("Nota 4:");
        nota4.setBounds(20, 110, 135, 23); 

        campo_nota4 = new JTextField();
        campo_nota4.setBounds(105, 110, 135, 23);

        nota5 = new JLabel();
        nota5.setText("Nota 5:");
        nota5.setBounds(20, 140, 135, 23); 
        campo_nota5 = new JTextField();

        campo_nota5.setBounds(105, 140, 135, 23);

        calcular = new JButton();
        calcular.setText("Calcular");
        calcular.setBounds(20, 170, 100, 23); 
        calcular.addActionListener(this);

        limpiar = new JButton();
        limpiar.setText("Limpiar");
        limpiar.setBounds(125, 170, 80, 23); 
        limpiar.addActionListener(this);
    
        promedio = new JLabel();
        promedio.setText("Promedio = ");
        promedio.setBounds(20, 210, 135, 23); 

        desviación = new JLabel();
        desviación.setText("Desviación = ");
        desviación.setBounds(20, 240, 200, 23); 

        mayor = new JLabel();
        mayor.setText("Nota mayor = ");
        mayor.setBounds(20, 270, 120, 23); 

        menor = new JLabel();
        menor.setText("Nota menor = ");
        menor.setBounds(20, 300, 120, 23); 

        contenedor.add(nota1);
        contenedor.add(campo_nota1);

        contenedor.add(nota2);
        contenedor.add(campo_nota2);

        contenedor.add(nota3);
        contenedor.add(campo_nota3);

        contenedor.add(nota4);
        contenedor.add(campo_nota4);

        contenedor.add(nota5);
        contenedor.add(campo_nota5);

        contenedor.add(calcular);
        contenedor.add(limpiar);
        contenedor.add(promedio);
        contenedor.add(desviación);
        contenedor.add(mayor);
        contenedor.add(menor);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        if (evento.getSource() == calcular) { 

            Notas notas = new Notas(); 
            notas.lista_notas[0] = Double.parseDouble(campo_nota1.getText());
        
            notas.lista_notas[1] = Double.parseDouble(campo_nota2.getText());
        
            notas.lista_notas[2] = Double.parseDouble(campo_nota3.getText());
        
            notas.lista_notas[3] = Double.parseDouble(campo_nota4.getText());
        
            notas.lista_notas[4] = Double.parseDouble(campo_nota5.getText());

            notas.calc_promedio(); 
            notas.calc_desviacion(); 
    
            promedio.setText("Promedio = " + String.valueOf(String.format("%.2f",notas.calc_promedio())));
            double desv = notas.calc_desviacion();

            desviación.setText("Desviación estándar = " + String.format("%.2f", desv));
        
            mayor.setText("Valor mayor = " + String.valueOf(notas.calc_mayor()));
    
            menor.setText("Valor menor = " + String.valueOf(notas.calc_menor()));

        }

        if (evento.getSource() == limpiar) {

            campo_nota1.setText("");
            campo_nota2.setText("");
            campo_nota3.setText("");
            campo_nota4.setText("");
            campo_nota5.setText("");

        }
    }
}