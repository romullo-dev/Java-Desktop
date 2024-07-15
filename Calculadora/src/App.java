import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
    static JTextField Box_Tela = new JTextField(40);
    static JButton Button = new JButton("AC");
    static JButton Button_Porcen = new JButton("%");
    static JButton Button_Div = new JButton("/");
    static JButton Button_Mult = new JButton("X");

    static JButton Button_Seven = new JButton("7");
    static JButton Button_Eight = new JButton("8");
    static JButton Button_Nine = new JButton("9");
    static JButton Button_Sub = new JButton("-");

    static JButton Button_Four = new JButton("4");
    static JButton Button_Five = new JButton("5");
    static JButton Button_Six = new JButton("6");
    static JButton Button_Adicao = new JButton("+");

    static JButton Button_One = new JButton("1");
    static JButton Button_Two = new JButton("2");
    static JButton Button_Three = new JButton("3");
    static JButton Button_Igual = new JButton("=");
    static JButton Button_Zero = new JButton("0");
    static JButton Button_P = new JButton(".");

    public static void main(String[] args) {
        App window = new App();
        window.setSize(400, 500);
        window.setTitle("Calculadora");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());
        
        JPanel panelTop = new JPanel(new BorderLayout());
        Box_Tela.setHorizontalAlignment(JTextField.RIGHT);
        Box_Tela.setPreferredSize(new Dimension(380, 50)); 
        panelTop.add(Box_Tela, BorderLayout.CENTER);
        window.add(panelTop, BorderLayout.NORTH);

        // Painel principal dos botões
        JPanel panelButtons = new JPanel(new GridLayout(5, 4, 5, 5));
        
        // Adicionar os botões ao painel de botões
        panelButtons.add(Button);
        panelButtons.add(Button_Porcen);
        panelButtons.add(Button_Div);
        panelButtons.add(Button_Mult);

        panelButtons.add(Button_Seven);
        panelButtons.add(Button_Eight);
        panelButtons.add(Button_Nine);
        panelButtons.add(Button_Sub);

        panelButtons.add(Button_Four);
        panelButtons.add(Button_Five);
        panelButtons.add(Button_Six);
        panelButtons.add(Button_Adicao);

        panelButtons.add(Button_One);
        panelButtons.add(Button_Two);
        panelButtons.add(Button_Three);
        panelButtons.add(Button_Igual);

        panelButtons.add(new JLabel()); // Espaço vazio para alinhar o zero
        panelButtons.add(Button_Zero);
        panelButtons.add(Button_P);
        panelButtons.add(new JLabel()); // Outro espaço vazio para alinhar

        window.add(panelButtons, BorderLayout.CENTER);

        window.setVisible(true);

        Button_One.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
              Button_action_1(e);
            }
      
          });

        Button_Two.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            Button_action_2(e);
        }
    
        });

        Button_Igual.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            Button_action_I(e);
        }
        
        });

    }

    public static void Button_action_1(ActionEvent e) {
        String N = "1";
        Box_Tela.setText(N);

        int N1 = Integer.parseInt(N);
        N1 = 1;
    }

    public static void Button_action_2(ActionEvent e) {
        String N = "2";
        Box_Tela.setText(N);

        int N2 = Integer.parseInt(N);
        N2 = 2;
    }

    public static void Button_action_I(ActionEvent e) {
        int r = Calculo.Calcular(WIDTH, WIDTH);
        Box_Tela.setText(String.valueOf(r));
    }
    
    
}
