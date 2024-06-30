import java.awt.GridBagLayout;
import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame form = new JFrame("Exemplo de Formulário");
        form.setSize(500,250);
        
        form.setLayout(new GridBagLayout());
        
        JLabel legenda_1 = new JLabel();

        legenda_1.setText("aaaaaaa");
        form.add(legenda_1);

        JTextArea caixa = new JTextArea(5,20);
        form.add(caixa);

        //LENGENDA 2

        JLabel legenda_2 = new JLabel();
        legenda_2.setText("bbbbbbbbbbbbbbb");
        form.add(legenda_2);

        form.setVisible(true);


    }
}
