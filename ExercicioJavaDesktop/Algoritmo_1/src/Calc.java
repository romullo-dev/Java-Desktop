
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Calc {
  public static void Calculo (float Note_1, float Note_2, float Note_3, int F, JRadioButton button_One, JRadioButton button_Two,JRadioButton button_Three) {
    float Media =  ((Note_1 + Note_2 + Note_3 )/3)- (F*0.25f);

    if (button_One.isSelected()) {
      float A = 5;
      Calc.Se(A, Media);
    } else if (button_Two.isSelected()) {
      float A = 8;
      Calc.Se(A, Media);
    } else if (button_Three.isSelected()) {
      float A = 7;
      Calc.Se(A, Media);
    }

  }

  public static void Se (float A, float Media) {
      if (Media < A) {
        JOptionPane.showMessageDialog(null, Media, "Aluno Reprovado" , JOptionPane.INFORMATION_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(null, Media, "Aluno Aprovado" , JOptionPane.INFORMATION_MESSAGE);
      }
  }
}

