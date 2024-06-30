import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = JOptionPane.showInputDialog("Informe o seu nome");
        JOptionPane.showMessageDialog (null, "seu nome " + nome);
        System.exit(0);
    }
}
