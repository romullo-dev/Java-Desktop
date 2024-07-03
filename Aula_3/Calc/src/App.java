import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class App extends JFrame{
    //criando os componentes do form
     static JLabel lbl1 = new JLabel("Digite aqui:");
     static JTextField txt1 = new JTextField(40);
 
   
     static JButton btnola = new JButton("olá");
     static JButton btnmult = new JButton("Multiplicar");
     static JButton btnsomar = new JButton("Somar");
    //
 
public static void main (String[] args ) {
 App Window = new App();
 Window.setSize(500,500);
 Window.setVisible(true);
 Window.setTitle("Minha Tela");
 Window.setLayout(new FlowLayout());
 //adicionando os componentes ao formulario window
 Window.getContentPane().add(lbl1);
 Window.getContentPane().add(txt1);

 Window.getContentPane().add(btnola);
 Window.getContentPane().add(btnmult);
 Window.getContentPane().add(btnsomar);
 Window.pack();
 //ação do botao
  btnola.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        butttonClickola(e);
    }
 });
 //ação do botao SIM
 btnmult.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        butttonClickmult(e);
    }
 });
 //ação do botao Não
 btnsomar.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){
        butttonClicksomar(e);
    }
 });

}//fim do main

//Evento clique do botão
public static void butttonClickola(ActionEvent e) {
    String n = "";
    n = txt1.getText();
   
    JOptionPane.showMessageDialog(null," Olá " + n, "Tela", JOptionPane.INFORMATION_MESSAGE);
}//Fim do evento clique
public static void butttonClickmult(ActionEvent e) {
    float r = 0;
    r = Float.parseFloat(txt1.getText());
    r = r * 2;  
    JOptionPane.showMessageDialog(null, "O resultado é " + r, "Tela", JOptionPane.INFORMATION_MESSAGE);
}//Fim do evento clique
public static void butttonClicksomar(ActionEvent e) {
    float r = 0;
    r = Float.parseFloat(txt1.getText());
    r = r + 2;  
    JOptionPane.showMessageDialog(null, "O resultado é " + r, "Tela", JOptionPane.INFORMATION_MESSAGE);
}//Fim do evento clique
}//Fim do programa