package Programa;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Interfaz extends JFrame implements ActionListener {

    private ListaEntrelazada list = new ListaEntrelazada();

    private JLabel enunciado;
    private JLabel enunciado2;
    private JLabel warning;
    private JLabel warning2;
    private JLabel warning3;
    private JLabel warning4;
    
    private JTextField input;
    private JTextField input2;
    private JTextField input3;
    private JButton agregar;
    private JButton iniciar;
    private JButton limpiar;
    private JButton eliminar;

    private JButton posicion;

    private JLabel lista;
    private JTextArea resultadoLista;
    private JScrollPane scroll1;

    private JLabel menorMayor;
    private JTextArea resultadoMenorMayor;
    private JScrollPane scroll2;

    private JLabel mayorMenor;
    private JTextArea resultadoMayorMenor;
    private JScrollPane scroll3; 
    
    public Interfaz(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Evaluación 3 de Algoritmos y Estructuras I");
        
        enunciado = new JLabel("Agregue un nuevo número a la lista:");
        enunciado.setBounds(40,30,500,30);
        enunciado.setFont(new Font("Verdana", Font.BOLD, 24));
        add(enunciado);

        enunciado2 = new JLabel("Encuentre la posicion del número:");
        enunciado2.setBounds(40,160,500,30);
        enunciado2.setFont(new Font("Verdana", Font.BOLD, 24));
        add(enunciado2);
        
        input = new JTextField();
        input.setBounds(40,85,55,40);
        input.setFont(new Font("Verdana", Font.BOLD, 24));
        
        input.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                inputKeyTyped(e);
            }
        });
        
        add(input);

        input2 = new JTextField();
        input2.setBounds(40,210,55,40);
        input2.setFont(new Font("Verdana", Font.BOLD, 24));
        input2.setEditable(false);
        
        input2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                inputKeyTyped(e);
            }
        });
        
        add(input2);

        input3 = new JTextField();
        input3.setBounds(265,210,55,40);
        input3.setFont(new Font("Verdana", Font.BOLD, 24));
        input3.setEditable(false);
        add(input3);
        
        
        warning = new JLabel("Por favor solo ingrese caracteres numericos...");
        warning.setBounds(40,120,600,30);
        warning.setFont(new Font("Verdana", Font.BOLD, 18));
        warning.setForeground(Color.red);
        warning.setVisible(false);
        
        add(warning);
        
        warning2 = new JLabel("El indice supera el tamaño de la lista...");
        warning2.setBounds(40,120,600,30);
        warning2.setFont(new Font("Verdana", Font.BOLD, 18));
        warning2.setForeground(Color.red);
        warning2.setVisible(false);
        
        add(warning2);
        
        warning3 = new JLabel("El numero ingresado ya esta en la lista...");
        warning3.setBounds(40,120,600,30);
        warning3.setFont(new Font("Verdana", Font.BOLD, 18));
        warning3.setForeground(Color.red);
        warning3.setVisible(false);
        
        add(warning3);
        
        warning4 = new JLabel("El indice supera el tamaño de la lista...");
        warning4.setBounds(40,250,600,30);
        warning4.setFont(new Font("Verdana", Font.BOLD, 18));
        warning4.setForeground(Color.red);
        warning4.setVisible(false);
        
        add(warning4);
        

        agregar = new JButton("Agregar");
        agregar.setBounds(105,85,150,40);
        agregar.setFont(new Font("Verdana", Font.BOLD, 18));
        add(agregar);
        agregar.addActionListener(this);

        eliminar = new JButton("Eliminar");
        eliminar.setBounds(270,85,150,40);
        eliminar.setFont(new Font("Verdana", Font.BOLD, 18));
        eliminar.setEnabled(false);
        add(eliminar);
        eliminar.addActionListener(this);

        iniciar = new JButton("Iniciar");
        iniciar.setBounds(760,85,150,40);
        iniciar.setFont(new Font("Verdana", Font.BOLD, 18));
        iniciar.setEnabled(false);
        add(iniciar);
        iniciar.addActionListener(this);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBounds(920,85,150,40);
        limpiar.setFont(new Font("Verdana", Font.BOLD, 18));
        limpiar.setEnabled(false);
        add(limpiar);
        limpiar.addActionListener(this);
        
        posicion = new JButton("Posicion");
        posicion.setBounds(105,210,150,40);
        posicion.setFont(new Font("Verdana", Font.BOLD, 18));
        posicion.setEnabled(false);
        add(posicion);
        posicion.addActionListener(this);


        lista = new JLabel("Lista:");
        lista.setBounds(40,280,480,30);
        lista.setFont(new Font("Verdana", Font.BOLD, 20));
        add(lista);
        
        resultadoLista = new JTextArea();
        resultadoLista.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 28));
        resultadoLista.setEditable(false);
        add(resultadoLista);
        scroll1 = new JScrollPane(resultadoLista);
        scroll1.setBounds(40,320,1032,60);
        add(scroll1);

        menorMayor = new JLabel("Menor a Mayor:");
        menorMayor.setBounds(40,405,480,30);
        menorMayor.setFont(new Font("Verdana", Font.BOLD, 20));
        add(menorMayor);
        
        resultadoMenorMayor = new JTextArea();
        resultadoMenorMayor.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 28));
        resultadoMenorMayor.setEditable(false);
        add(resultadoMenorMayor);
        scroll2 = new JScrollPane(resultadoMenorMayor);
        scroll2.setBounds(40,445,1032,60);
        add(scroll2);
              
        mayorMenor = new JLabel("Mayor a Menor:");
        mayorMenor.setBounds(40,530,480,30);
        mayorMenor.setFont(new Font("Verdana", Font.BOLD, 20));
        add(mayorMenor);
        
        resultadoMayorMenor = new JTextArea();
        resultadoMayorMenor.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 28));
        resultadoMayorMenor.setEditable(false);
        add(resultadoMayorMenor);
        scroll3 = new JScrollPane(resultadoMayorMenor);
        scroll3.setBounds(40,570,1032,60);
        add(scroll3);
          
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        try{
            if(e.getSource() == agregar){
                if(!(isNumeric(input.getText()))){
                warning.setVisible(true);
                warning3.setVisible(false);
                }else if(list.listaValores(list).contains(Integer.valueOf(input.getText()))){
                    warning.setVisible(false);
                    warning3.setVisible(true);
                }else{
                    String text1 = input.getText();
                    int m = Integer.parseInt(text1);
                    
                    warning.setVisible(false);
                    warning3.setVisible(false);
                    
                    limpiar.setEnabled(true);
                    iniciar.setEnabled(true);
                    eliminar.setEnabled(true);
                    agregar.setEnabled(true);
                    posicion.setEnabled(false);
                    input.setEditable(true);
                    input.setText(null);
                    list.enlazar(m);

                    resultadoLista.setText(list.mostrarLista(list));
                  
                    }
                }
            } catch(NumberFormatException err){
        
            }

            try{
                if(e.getSource() == eliminar){
                    if(!(isNumeric(input.getText()))){
                    warning.setVisible(true);
                    warning3.setVisible(false);
                    }else{
                        String text1 = input.getText();
                        int m = Integer.parseInt(text1);
                        
                        if (m>list.getSize()-1){
                            warning2.setVisible(true);
                            warning3.setVisible(false);
                        }else{

                            if(list.getSize()-1 == 0){
                                warning.setVisible(false);
                                warning2.setVisible(false);
                                warning3.setVisible(false);
                                
                                limpiar.setEnabled(true);
                                iniciar.setEnabled(true);
                                eliminar.setEnabled(true);
                                agregar.setEnabled(true);
                                posicion.setEnabled(false);
                                input.setEditable(true);
                                input.setText(null);
                                resultadoLista.setText("");
                                list = new ListaEntrelazada();

                            } else{ 
                            warning.setVisible(false);
                            warning2.setVisible(false);
                            warning3.setVisible(false);
                            
                            limpiar.setEnabled(true);
                            iniciar.setEnabled(true);
                            eliminar.setEnabled(true);
                            agregar.setEnabled(true);
                            posicion.setEnabled(false);
                            input.setEditable(true);
                            input.setText(null);
                            list.eliminar(m);

                            resultadoLista.setText(list.mostrarLista(list));
                            }
                        }
                        }
                    }
                } catch(NumberFormatException err){
            
                }
        
                if(e.getSource() == posicion){
                    if(Integer.valueOf(input2.getText())>list.getSize()-1){
                    warning4.setVisible(true);
                    }else{
                        String text2 = input2.getText();
                    int n = Integer.parseInt(text2);
                    limpiar.setEnabled(true);
                    iniciar.setEnabled(false);
                    eliminar.setEnabled(false);
                    agregar.setEnabled(false);
                    posicion.setEnabled(true);
                    input.setEditable(false);
                    input2.setEditable(true);
                    input.setText(null);

                    // FALTA AGREGAR AQUI LA LECTURA DE LA POSICION NADA MAS
                    input3.setText(String.valueOf(list.obtenerValor(n)));
                    }
                    
                }

            if(e.getSource() == iniciar){
                limpiar.setEnabled(true);
                iniciar.setEnabled(false);
                eliminar.setEnabled(false);
                agregar.setEnabled(false);
                posicion.setEnabled(true);
                input.setEditable(false);
                input2.setEditable(true);

                list.ordenarAscendente(list);
                resultadoMenorMayor.setText(list.mostrarLista(list));
                list.ordenarDescendente(list);
                resultadoMayorMenor.setText(list.mostrarLista(list));
            }
        
        if(e.getSource() == limpiar){
            limpiar.setEnabled(false);
            iniciar.setEnabled(false);
            eliminar.setEnabled(false);
            agregar.setEnabled(true);
            posicion.setEnabled(false);
            input.setEditable(true);
            input.setText(null);
            input2.setEditable(false);
            input2.setText(null);
            input3.setText(null);
            resultadoLista.setText("");
            resultadoMayorMenor.setText("");
            resultadoMenorMayor.setText("");
            list = new ListaEntrelazada();
        }
    }
    
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.setBounds(0,0,1115,700);
        interfaz.setResizable(false);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
    }
    
    private void inputKeyTyped(KeyEvent e){
        char tecla= e.getKeyChar();
        if((!(Character.isDigit(tecla)) && tecla != '-') || (tecla == KeyEvent.VK_BACK_SPACE) || (tecla == KeyEvent.VK_DELETE)){
            e.consume();
            }
    }
    
    public static boolean isNumeric(String strNum) {
    if (strNum == null) {
        return false;
    }
    try {
        double d = Double.parseDouble(strNum);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}

}
