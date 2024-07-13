import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
    // CRIANDO COMPONENTES
    static JLabel Label_Name = new JLabel("Nome:");
    static JTextField Name = new JTextField(20);
    static JLabel Label_Class = new JLabel("Turma:");
    static JRadioButton button_One = new JRadioButton("Java");
    static JRadioButton button_Two = new JRadioButton("PHP");
    static JRadioButton button_Three = new JRadioButton("C#");

    static JLabel Label_N1 = new JLabel("Nota 1:");
    static JTextField N1 = new JTextField(40);
    static JLabel Label_N2 = new JLabel("Nota 2:");
    static JTextField N2 = new JTextField(40);
    static JLabel Label_N3 = new JLabel("Nota 3:");
    static JTextField N3 = new JTextField(20);

    static JLabel Label_lack = new JLabel("Número de Faltas:");
    static JTextField lack = new JTextField(20);

    static JButton Button_Calc = new JButton("Calcular");

    public static void main(String[] args) {
        App Window = new App();
        Window.setTitle("Escola SENAC");
        Window.setSize(600, 500);
        Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Window.setLayout(new BorderLayout());

        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 3.0;

        // Agrupando os botões de rádio
        ButtonGroup classGroup = new ButtonGroup();
        classGroup.add(button_One);
        classGroup.add(button_Two);
        classGroup.add(button_Three);

        // Linha 1 - Nome e Turma
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        mainPanel.add(Label_Name, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 2;
        mainPanel.add(Name, gbc);

        gbc.gridx = 3;
        gbc.gridwidth = 1;
        mainPanel.add(Label_Class, gbc);

        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        radioPanel.add(button_One);
        radioPanel.add(button_Two);
        radioPanel.add(button_Three);

        gbc.gridx = 4;
        gbc.gridwidth = 2;
        mainPanel.add(radioPanel, gbc);

        // Linha 2 - Nota 1
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        mainPanel.add(Label_N1, gbc);


        gbc.gridx = 1;
        gbc.gridwidth = 5;
        mainPanel.add(N1, gbc);

        // Linha 3 - Nota 2
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        mainPanel.add(Label_N2, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 5;
        mainPanel.add(N2, gbc);

        // Linha 4 - Nota 3
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 1;
        mainPanel.add(Label_N3, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 5;
        mainPanel.add(N3, gbc);

        // Linha 5 - Número de Faltas
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 1;
        mainPanel.add(Label_lack, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 5;
        mainPanel.add(lack, gbc);

        // Botão Calcular
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(Button_Calc);

        Window.add(mainPanel, BorderLayout.CENTER);
        Window.add(buttonPanel, BorderLayout.SOUTH);

        Button_Calc.setBackground(Color.GREEN);

        Window.setVisible(true);

        Button_Calc.addActionListener(new ActionListener (){
          public void  actionPerformed (ActionEvent e) {
            Button_action (e);
          }
        }

        );

    }

    public static void Button_action (ActionEvent e) {
      float Note_1 = Float.parseFloat(N1.getText());
      float Note_2 = Float.parseFloat(N2.getText());
      float Note_3 = Float.parseFloat(N3.getText());
      int F = Integer.parseInt(lack.getText());

      Calc.Calculo(Note_1, Note_2, Note_3, F, button_One, button_Two, button_Three);

    }
}
