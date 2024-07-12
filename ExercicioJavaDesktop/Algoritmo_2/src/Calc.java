public class Calc {
  public static float Total (int I, float S_Bruto , float INSS, float FGTS, float IR, float D_F) {
     float Total = S_Bruto - INSS - FGTS - IR + D_F;
    if (I > 39) {
      Total = Total + 500;
    }
    return Total;
  }
  public static float INSS (float S_Bruto) {
    float INSS = (S_Bruto * 8 /100);
    return INSS;
  }
  public static float FGTS (float S_Bruto) {
    float FGTS = (S_Bruto * 10 /100);
    return FGTS;
  }
  public static float IR (float S_Bruto) {
    float IR = (S_Bruto * 27.5f /100);
    return IR;
  }
  public static float D_F (float S_Bruto) {
    float D_F = (S_Bruto/30);
    return D_F;
  }
}
