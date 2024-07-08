import java.awt.*;
import javax.swing.*;

public class App extends JFrame {
  // criando os componentes do formulário
  static JLabel L_Name = new JLabel("Nome");
  static JTextField B_Name = new JTextField(40);
  static JLabel L_CPF = new JLabel("CPF");
  static JTextField B_CPF = new JTextField(40);

  static ButtonGroup L_tamanho = new ButtonGroup();
  static JLabel L_Tamanhos = new JLabel("Tamanho: ");
  static JRadioButton R_P = new JRadioButton("Pequena");
  static JRadioButton R_M = new JRadioButton("Média");
  static JRadioButton R_G = new JRadioButton("Grande");

  static JLabel L_Quant = new JLabel("Quantidade");
  static JTextField B_Quant = new JTextField(40);

  static JLabel L_Sabor = new JLabel("Sabores: ");
  static JRadioButton Opcao_1 = new JRadioButton("Calabresa");
  static JRadioButton Opcao_2 = new JRadioButton("Portuguesa");
  static JRadioButton Opcao_3 = new JRadioButton("4 queijos");

  static JLabel L_bebidas = new JLabel("Bebidas: ");
  static JCheckBox Op_1 = new JCheckBox("Refri 600 ml");
  static JCheckBox Op_2 = new JCheckBox("Refri 1L");
  static JCheckBox Op_3 = new JCheckBox("Refri Lata");
  static JCheckBox Op_4 = new JCheckBox("Refri 2L");

  static JLabel L_NMesa = new JLabel("Mesa");
  static JTextField B_NMesa = new JTextField(40);

  static JButton Botao = new JButton("Comprar");

  public App() {
    // configurando o gerenciador de layout
    setLayout(new GridBagLayout());
    GridBagConstraints gbc = new GridBagConstraints();

    // configurando constraints do GridBag para cada componente
    gbc.insets = new Insets(5, 5, 5, 5);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.anchor = GridBagConstraints.WEST;

    // adicionando componentes ao formulário com constraints do layout
    gbc.gridx = 0;
    gbc.gridy = 0;
    add(L_Name, gbc);

    gbc.gridx = 1;
    gbc.gridy = 0;
    add(B_Name, gbc);

    gbc.gridx = 0;
    gbc.gridy = 1;
    add(L_CPF, gbc);

    gbc.gridx = 1;
    gbc.gridy = 1;
    add(B_CPF, gbc);

    gbc.gridx = 0;
    gbc.gridy = 2;
    add(L_Tamanhos, gbc);

    gbc.gridx = 1;
    gbc.gridy = 2;
    L_tamanho.add(R_P);
    L_tamanho.add(R_M);
    L_tamanho.add(R_G);
    JPanel panelTamanhos = new JPanel();
    panelTamanhos.add(R_P);
    panelTamanhos.add(R_M);
    panelTamanhos.add(R_G);
    add(panelTamanhos, gbc);

    gbc.gridx = 0;
    gbc.gridy = 3;
    add(L_Quant, gbc);

    gbc.gridx = 1;
    gbc.gridy = 3;
    add(B_Quant, gbc);

    gbc.gridx = 0;
    gbc.gridy = 4;
    add(L_Sabor, gbc);

    gbc.gridx = 1;
    gbc.gridy = 4;
    JPanel panelSabores = new JPanel();
    panelSabores.add(Opcao_1);
    panelSabores.add(Opcao_2);
    panelSabores.add(Opcao_3);
    add(panelSabores, gbc);

    gbc.gridx = 0;
    gbc.gridy = 5;
    add(L_bebidas, gbc);

    gbc.gridx = 1;
    gbc.gridy = 5;
    JPanel panelBebidas = new JPanel();
    panelBebidas.add(Op_1);
    panelBebidas.add(Op_2);
    panelBebidas.add(Op_3);
    panelBebidas.add(Op_4);
    add(panelBebidas, gbc);

    gbc.gridx = 0;
    gbc.gridy = 6;
    add(L_NMesa, gbc);

    gbc.gridx = 1;
    gbc.gridy = 6;
    add(B_NMesa, gbc);

    gbc.gridx = 1;
    gbc.gridy = 7;
    add(Botao, gbc);
  }

  public static void main(String[] args) {
    App Window = new App();
    Window.setSize(600, 500);
    Window.setLocation(400, 400);
    Window.setVisible(true);
    Window.setTitle("Pizzaria Vai quem quer");
    Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
