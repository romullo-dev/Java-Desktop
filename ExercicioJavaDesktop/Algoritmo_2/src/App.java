import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
  static JLabel Name_Label = new JLabel("Nome:");
  static JTextField Name = new JTextField(20);

  static JLabel Sexo_Label = new JLabel("Sexo:");
  static JRadioButton Opcao_M = new JRadioButton("M");
  static JRadioButton Opcao_F = new JRadioButton("F");

  static JLabel Idade_Label = new JLabel("Idade:");
  static JTextField Idade = new JTextField(2);


  static JLabel Cargo_Label = new JLabel("Cargo:");
  static JTextField Cargo = new JTextField(20);

  static JLabel Filial_Label = new JLabel("Filial:");
  static JTextField Filial = new JTextField(20);


  static JLabel Bruto_Label = new JLabel ("Salário Bruto");
  static JTextField Bruto = new JTextField(20);

  static JLabel F_Label = new JLabel ("Faltas:");
  static JTextField F = new JTextField (20);

  static JLabel Vazio = new JLabel ("                                                      ");
  static JLabel Estrela = new JLabel ("**************************************************  SAIDA  ****************************************************");
  static JLabel INSS_JLabel =  new JLabel ("INSS: ");
  static JLabel INSS = new JLabel ();

  static JLabel FGTS_Label =  new JLabel ("FGTS: ");
  static JLabel FGTS = new JLabel ();

  static JLabel IR_Label =  new JLabel ("IR");
  static JLabel IR = new JLabel ();

  static JLabel DF_Label = new JLabel ("Desconto de Falta:");
  static JLabel D_F = new JLabel ();

  static JLabel Liqui_Label = new JLabel ("Salário Liquido");
  static JLabel Liqui = new JLabel ();



  static JButton Botao = new JButton ("Calcular");

  public static void main (String [] args) {
    App Window = new App ();
    Window.setSize(600, 500);
    Window.setTitle("Folha de Pagamento");
    Window.setLayout(new FlowLayout());

    JPanel Painel = new JPanel();
    Painel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10));

    //ADCIONAR COMPONENTE NA TELA

    Window.getContentPane().add(Name_Label);
    Window.getContentPane().add(Name);

    Window.getContentPane().add(Sexo_Label);
    Window.getContentPane().add(Opcao_M);
    Window.getContentPane().add(Opcao_F);

    Window.getContentPane().add(Idade_Label);
    Window.getContentPane().add(Idade);


    Window.getContentPane().add(Cargo_Label);
    Window.getContentPane().add(Cargo);

    Window.getContentPane().add(Filial_Label);
    Window.getContentPane().add(Filial);


    Window.getContentPane().add(Bruto_Label);
    Window.getContentPane().add(Bruto);

    Window.getContentPane().add(F_Label);
    Window.getContentPane().add(F);
    Window.getContentPane().add(Vazio);
    Window.getContentPane().add(Estrela);

    Window.getContentPane().add(INSS_JLabel);
    Window.getContentPane().add(INSS);

    Window.getContentPane().add(FGTS_Label);
    Window.getContentPane().add(FGTS);

    Window.getContentPane().add(IR_Label);
    Window.getContentPane().add(IR);

    Window.getContentPane().add(DF_Label);
    Window.getContentPane().add(D_F);

    Window.getContentPane().add(Liqui_Label);
    Window.getContentPane().add(Liqui);

    Window.getContentPane().add(Botao);

    Window.setVisible(true);

    Botao.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        Button_action(e);
      }

    });

  }

  public static void Button_action(ActionEvent e) {
    float S_Bruto = Float.parseFloat(Bruto.getText());
    int I = Integer.parseInt(Idade.getText());

    float Valor_INSS = Calc.INSS(S_Bruto);
    INSS.setText("Resultado :" + Valor_INSS);

    float Valor_FGTS = Calc.FGTS(S_Bruto);
    FGTS.setText("Resultado :" + Valor_FGTS);

    float Valor_IR = Calc.IR(S_Bruto);
    IR.setText("Resultado :" + Valor_IR);

    float Valor_DF = Calc.D_F(S_Bruto);
    D_F.setText("Resultado :" + Valor_DF);

    float Valor_Total = Calc.Total(I, S_Bruto, Valor_INSS, Valor_FGTS, Valor_IR, S_Bruto);

    Liqui.setText("Resultado :" + Valor_Total);
  }
}
