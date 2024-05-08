
/**
 * Modela o cálculo de Pitagoras
 * 
 * @author marceloakira 
 * @version 0.01
 */
import java.lang.Math;
public class Pitagoras
{
    double oposto;
    double adjacente;
    
    public Pitagoras() {
        this.oposto = 0;
        this.adjacente = 0;
    }
    
    
    public Pitagoras(double oposto, double adjacente)
    {
        this.oposto = oposto;  
        this.adjacente = adjacente;
    }

    
    public double calcular()
    {
        if (this.oposto <= 0 || this.adjacente <= 0)
            return 0;
        return Math.sqrt(Math.pow(this.oposto,2.0) + Math.pow(this.adjacente,2.0));
    }
    
    
    public String interpretar()
    {
        String resultado = "";
        double hipotenusa = this.calcular();
        resultado = Double.toString(hipotenusa);
        return resultado;
    }
}
