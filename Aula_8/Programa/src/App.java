import java.awt.*;
import javax.swing.*;

public class App extends JFrame{
    //criando os componentes do form
    static JLabel lbl1 = new JLabel("Digite aqui:");
    static JTextField txt1 = new JTextField(40);
    static JButton btnok = new JButton("Ok");
    static JLabel lbl2 = new JLabel("                                                                                                                        Sexo:");
    static JLabel lbl3 = new JLabel("                                                                                                                        Opções:");
    static JRadioButton rdbM = new JRadioButton("Masculino");
    static JRadioButton rdbF = new JRadioButton("Feminino");
    static ButtonGroup bg = new ButtonGroup();
    static JCheckBox chk1 = new JCheckBox("Um");
    static JCheckBox chk2 = new JCheckBox("Dois");
 
        public static void main (String[] args ) {
            App Window = new App();
            Window.setSize(600,200);
            Window.setLocation(400,400);


            Window.setVisible(true);
            Window.setTitle("Pizzaria Vai quem quer");
            Window.setLayout(new FlowLayout());
            //adicionando os componentes ao formulario window
            Window.getContentPane().add(lbl1);
            Window.getContentPane().add(txt1);

            Window.getContentPane().add(btnok);
            //static ButtonGroup bg = new ButtonGroup();
            //adicionado ao grupo bg
            bg.add(rdbM);
            bg.add(rdbF);
            Window.getContentPane().add(lbl2);
            Window.add(rdbM);
            Window.getContentPane().add(rdbF);
            Window.getContentPane().add(lbl3);
            Window.getContentPane().add(chk1);
            Window.getContentPane().add(chk2);
            //Window.pack();
            //ação do botao
            
        }
    }