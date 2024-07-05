import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class App extends JFrame {
    // Criando componentes do form
    static JLabel EmaiLabel = new JLabel("Login");
    static JTextField C_Login = new JTextField(20); 
    static JLabel SenhLabel = new JLabel("SENHA");
    static JPasswordField Senha = new JPasswordField(20);
    static JButton B_Ok = new JButton("OK");
    static JButton B = new JButton("Cancelar");

    public App() {
        // Configurações da janela principal
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Login");

        // Painel principal com GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10); // Margens para os componentes

        // Adicionando componentes ao painel
        panel.add(EmaiLabel, gbc);
        panel.add(C_Login, gbc);
        panel.add(SenhLabel, gbc);
        panel.add(Senha, gbc);

        // Botões alinhados à direita
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(B_Ok);
        buttonPanel.add(B);

        // Adicionando painéis à janela principal
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);

        // Configurações adicionais da janela
        pack();
        
        setLocationRelativeTo(null); 
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new App().setVisible(true);
        });


        B_Ok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                buttonOk(e);
            }
        });

        
    } //Fim do main

    public static void buttonOk(ActionEvent e){
        String L = (C_Login.getText());
        String S = (Senha.getText());


        if (L.equals("Romulo") && S.equals("123456")) {
            JOptionPane.showMessageDialog(null, "Entrando " , "Login" , JOptionPane.INFORMATION_MESSAGE);    
        } else {
            JOptionPane.showMessageDialog(null, "Email ou Senha Incorretos" , "Incorreto" , JOptionPane.INFORMATION_MESSAGE);    
        }



    }

}
