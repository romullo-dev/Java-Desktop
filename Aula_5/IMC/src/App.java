import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class App extends JFrame {

    //criando componentes do form
    static JLabel Name = new JLabel("NOME");
    static JTextField NamePerson = new JTextField("Fulano");
    static JLabel IPerson  = new JLabel("IDADE");
    static JTextField I = new JTextField("Anos");

    static JLabel Altura = new JLabel("ALTURA");
    static JTextField H = new JTextField("1.60");
    static JLabel Peso = new JLabel("PESO");
    static JTextField P = new JTextField("60");

    static JButton B = new JButton("=");

    public static void main(String[] args) {
        App window = new App();
        
        window.setVisible(true);
        window.setTitle("MMC");
        window.setLayout(new FlowLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

    //adicionando os componentes ao formulario window

    window.getContentPane().add(Name);
    window.getContentPane().add(NamePerson);
    window.getContentPane().add(IPerson);
    window.getContentPane().add(I);
    window.getContentPane().add(Altura);
    window.getContentPane().add(H);
    window.getContentPane().add(Peso);
    window.getContentPane().add(P);
    window.getContentPane().add(B);
    window.pack();
    window.setSize(500,300);

    //AÇÃO DO BOTÃO 

    B.addActionListener(App::ButtonSomar);

    } //FIM DO MAIN

    //SOMAR 
    public static void ButtonSomar(ActionEvent e) {

        float H1 = Float.parseFloat(H.getText());
        float P1 = Float.parseFloat(P.getText());
        float R =   P1/ (H1 * H1);
        Se(R);

    }
    public static void Se (float R) {
        if (R <= 18.5 ) {
            JOptionPane.showMessageDialog(null, "Magreza : " + R , "RESULTADO" , JOptionPane.INFORMATION_MESSAGE);
        } else if (R <= 24.9 ) {
            JOptionPane.showMessageDialog(null, "Normal : " + R , "RESULTADO" , JOptionPane.INFORMATION_MESSAGE);
        } else if (R <= 29.9 ) {
            JOptionPane.showMessageDialog(null, "Sobrepeso : " + R , "RESULTADO" , JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Obesidade : " + R , "RESULTADO" , JOptionPane.INFORMATION_MESSAGE);
        }
    }
}