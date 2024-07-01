import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame{
    //CRIANDO COMPONETES DO FORM
    static JLabel lbl1 = new JLabel ("Sushi hoje?");
    static JTextField txt1 = new JTextField (40);
    static JButton btnok = new JButton ("SIM"); 
    static JButton BtnNao = new JButton ("NAO");
    static JButton Btnok = new JButton ("OK");

    public static void main(String[] args) throws Exception {
        
    App Window = new App();
    Window.setSize(500,500);
    Window.setVisible(true);
    Window.setTitle("MINHA TELA");
    Window.setLayout(new FlowLayout());

    //ADICIOANR OS COMPONETES AO FORMULARIO WINDOW 

    Window.getContentPane().add(lbl1);
    Window.getContentPane().add(txt1);

    Window.getContentPane().add(btnok);
    Window.getContentPane().add(BtnNao);
    Window.getContentPane().add(Btnok);
    Window.pack();

    //  AÇAO DO BOTÃO
    btnok.addActionListener(new ActionListener (){
        public void actionPerformed (ActionEvent e) {
            ButttonClick(e);   
        }
    });

    //  AÇAO DO BOTÃO 2
    BtnNao.addActionListener(new ActionListener (){
        public void actionPerformed (ActionEvent e) {
            ButttonClickNao(e);   
        }
    });

    Btnok.addActionListener(new ActionListener (){
        public void actionPerformed (ActionEvent e) {
            ButttonClickok(e);   
        }
    });

    } //  FIM DO MAIN

    public static void ButttonClick(ActionEvent e) {
        float r = 0;
        r = Float.parseFloat(txt1.getText());

        r *= 2;

        
        JOptionPane.showConfirmDialog(null, r , " SIM " , JOptionPane.ERROR_MESSAGE );

    }

    public static void ButttonClickNao(ActionEvent e) {
        JOptionPane.showConfirmDialog(null, " Uma pena!! 😒", "NAO" , JOptionPane.ERROR_MESSAGE );
    }

    public static void ButttonClickok(ActionEvent e) {
        String n = "";
        n = txt1.getText();
        JOptionPane.showConfirmDialog(null,n + " Uma pena!! 😒", "NAO" , JOptionPane.ERROR_MESSAGE );
    }
} //  FIM DO PROGRAMA
