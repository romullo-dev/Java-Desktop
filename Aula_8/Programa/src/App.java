import javax.swing.*;

public class App extends JFrame{
  //criando os componentes do form
  static JLabel L_Name = new JLabel("Nome");
  static JTextField B_Name = new JTextField(40);
  static JLabel L_CPF = new JLabel("Nome");
  static JTextField B_CPF = new JTextField(40);

  static JLabel L_tamanho = new JLabel("Tamanho: ");
  static JRadioButton R_P = new JRadioButton("Pequena");
  static JRadioButton R_M = new JRadioButton("Média");
  static JRadioButton R_G = new JRadioButton("Grande");



  public static void main (String[] args ) {
    App Window = new App();
    Window.setSize(600,200);
    Window.setLocation(400,400);
    Window.setVisible(true);
    Window.setTitle("Pizzaria Vai quem quer");

    //adicionando os componentes ao formulario window
    Window.getContentPane().add(L_Name);
    Window.getContentPane().add(B_Name);
    Window.getContentPane().add(L_CPF);
    Window.getContentPane().add(B_CPF);

    Window.getContentPane().add(L_tamanho);
    Window.getContentPane().add(R_P);
    Window.getContentPane().add(R_M);
    Window.getContentPane().add(R_G);

    //static ButtonGroup bg = new ButtonGroup();

    //adicionado ao grupo bg

    //Window.pack();
    //ação do botao

        }
    }
