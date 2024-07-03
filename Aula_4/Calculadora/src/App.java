import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class App extends JFrame {

    //criando componentes do form
    static JLabel N1 = new JLabel("Numero 1 : ");
    static JTextField txtnumero1 = new JTextField(11);
    static JLabel N2  = new JLabel("Numero 2:");
    static JTextField txtnumero2 = new JTextField(11);
    static JButton ButtonSomar = new JButton("+");
    static JButton ButtonSub = new JButton("-");
    static JButton ButtonMult = new JButton("x");
    static JButton ButtonDiv = new JButton("/");

    public static void main(String[] args) {
        App window = new App();
        window.setSize(500,500);
        window.setVisible(true);
        window.setTitle("Calc");
        window.setLayout(new FlowLayout());
    // adicionando os componentes ao formulario window

    window.getContentPane().add(N1);
    window.getContentPane().add(txtnumero1);
    window.getContentPane().add(N2);
    window.getContentPane().add(txtnumero2);
    window.getContentPane().add(ButtonSomar);
    window.getContentPane().add(ButtonSub);
    window.getContentPane().add(ButtonMult);
    window.getContentPane().add(ButtonDiv);
    window.pack();


    //AÇÃO DO BOTÃO (+)
    ButtonSomar.addActionListener( new ActionListener () {
            public void actionPerformed (ActionEvent e)  {
                ButtonSomar(e);
            }  
    });

    //AÇÃO DO BOTÃO (-)
    ButtonSub.addActionListener ( new ActionListener () {
        public void actionPerformed (ActionEvent e) {
            ButtonSub(e);
        }

    }); 

    //AÇÃO DO BOTÃO (*)
    ButtonMult.addActionListener( new ActionListener () {
        public void actionPerformed(ActionEvent e) {
            ButtonMult(e);          
        }
    });

    //AÇÃO DO BOTÃO (/)
    ButtonDiv.addActionListener( new ActionListener () {
        public void actionPerformed(ActionEvent e) {
            ButtonDiv(e);          
        }
    });

    } //FIM DO MAIN

    //SOMAR 
    public static void ButtonSomar(ActionEvent e) {
        float R = 0; 
        float N1 = Float.parseFloat(txtnumero1.getText());
        float N2 = Float.parseFloat(txtnumero1.getText());
        R = N1 + N2;
        JOptionPane.showMessageDialog(null, "SOMA : " + R , "RESPOSTA", JOptionPane.INFORMATION_MESSAGE);
    }

    //SUBTRAIR
    public static void ButtonSub (ActionEvent e) {
        float R = 0;
        float N1 = Float.parseFloat(txtnumero1.getText());
        float N2 = Float.parseFloat(txtnumero2.getText());
        R= N1 - N2;
        JOptionPane.showMessageDialog(null, "SUBTRAÇÃO : " + R , "RESPOSTA" , JOptionPane.INFORMATION_MESSAGE);
    }
    

    //MULT

    public static void ButtonMult (ActionEvent e) {
        float R = 0;
        float N1 = Float.parseFloat(txtnumero1.getText());
        float N2 = Float.parseFloat(txtnumero2.getText());
        
        R = N1 * N2;

        JOptionPane.showMessageDialog(null, "MULTIPLICAÇÃO : " + R , "RESPOSTA" , JOptionPane.INFORMATION_MESSAGE);
    }

    public static void ButtonDiv (ActionEvent e) {
        float R = 0;
        float N1 = Float.parseFloat(txtnumero1.getText());
        float N2 = Float.parseFloat(txtnumero2.getText());

        R = N1 /N2; 

        JOptionPane.showMessageDialog(null, "DIVISÃO : " + R , "RESPOSTA" , JOptionPane.INFORMATION_MESSAGE);
    }


}
