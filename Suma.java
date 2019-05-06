package suma;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Suma extends JFrame implements ActionListener{
    private JLabel mensaje;
    private JButton boton;
    private JTextField caja,caja2;
    
    public Suma(){
        super();
        configurarVentana();
        crearComponentes();
    }
    private void configurarVentana(){
        this.setTitle("Sumatoria");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    private void crearComponentes(){
        mensaje = new JLabel();
        mensaje.setText("Suma"); 
        mensaje.setBounds(50,50,130,30);
        this.add(mensaje);
        caja = new JTextField();
        caja.setBounds(50,80,100,20);
        this.add(caja);
        caja2 = new JTextField();
        caja2.setBounds(50,110,100,20);
        this.add(caja2);
        boton = new JButton();
        boton.setText("Resultado");
        boton.setBounds(50, 130, 100, 30);
        boton.addActionListener(this);
        this.add(boton);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String alerta = caja.getText();
        String alerta2 = caja2.getText();
        int numEntero = Integer.parseInt(alerta);
        int numEntero2 = Integer.parseInt(alerta2);
        int resultado=numEntero+numEntero2;
        JOptionPane.showMessageDialog(this,"El valor es: "+resultado);
        
    }
    public static void main(String[] args){
        Suma ventana = new Suma();
        ventana.setVisible(true);
    }
}
