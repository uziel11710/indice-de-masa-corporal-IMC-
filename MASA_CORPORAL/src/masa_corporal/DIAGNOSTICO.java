
package masa_corporal;

/**
 *
 * @author Uziel
 */
public class DIAGNOSTICO {
    
    public static float IMC(float A, float P)
    {
        
        float imc= (float) (P/(Math.pow(A,2)));
        
        return imc;
    }
    
    public static void mostrar(String N, int E, float A, float P, float imc)
    {
        
       IMC_Interfaz.jTextArea1.setText("Hola "+N+" SU EDAD ES DE "+E+" AÑOS \nSU PESO ES DE "+P+"kg \nSU ALTURA ES DE "+A+"m\n POR LO TANTO SU INDICE DE MASA CORPORAL\n ES: "+imc);
        
        if(imc<16)
        {
          IMC_Interfaz.jTextField4.setText(N+" tu tienes Delgadez severa");
        }
        else if(imc>16 && imc<17)
        {
         IMC_Interfaz.jTextField4.setText(N+" tu tienes Delgadez moderada");
        }
        else if(imc>17 && imc<18.50)
        {
         IMC_Interfaz.jTextField4.setText(N+" tu tienes Delgadez aceptable");
        }
        else if(imc>18.50 && imc<25)
        {
         IMC_Interfaz.jTextField4.setText(N+" tu tienes Peso normal");
        }
        else if(imc>25 && imc<30)
        {
        IMC_Interfaz.jTextField4.setText(N+" tu tienes Sobre peso");
        }
        else if(imc>30 && imc<35)
        {
        IMC_Interfaz.jTextField4.setText(N+" tu tienes Obesidad tipo 1");
        }
        else if(imc>35 && imc<41)
        {
        IMC_Interfaz.jTextField4.setText(N+" tu tienes Obesidad tipo 2");
        }
         else if(imc>40 && imc<50)
        {
        IMC_Interfaz.jTextField4.setText(N+" tu tienes Obesidad tipo 3 (obesidad mórbida)");
        }
         else if(imc>50)
        {
        IMC_Interfaz.jTextField4.setText(N+" tu tienes Obesidad tipo 4 (obesidad extrema)");
        }
    }
    
}
