import javax.swing.*;

public class App extends JFrame {
    //CRINDO COMPONENTES
    static JLabel text = new JLabel("SUSHI HOJE??");
    static JButton ButtonSim =  new JButton("SIM 😊");
    static JButton ButtonNao = new JButton("NÃO 😒");

    public static void main(String[] args) throws Exception {
        App window = new App();
        window.setSize(500,500);
        window.setVisible(true);


        JPanel Painel = new JPanel();
        window.add(Painel);

        Painel.add(text);

        Painel.add(ButtonSim);
        Painel.add(ButtonNao);



    }
}
