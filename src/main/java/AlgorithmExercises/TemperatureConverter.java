package AlgorithmExercises;

/**
 *
 * @author diana
 * Se necesita un algoritmo que dado una temperatura origen y una destino me diga la conversión.
 * Ejemplo:
 * "La temperatura 0 en CELCIUS, son 273.15 en KELVIN"
 * 
 * 
 * 
 * 
 */
public class TemperatureConverter {
    public static void main(String[] args) {
        // inicializamos las variables que vamos a usar en el main
        Double temperatura = 32.0;
        String temperaturaOrigen = "";
        String temperaturaDestino = "";
        calcularTemperatura(temperaturaOrigen,temperaturaDestino,temperatura);
    }
    
    public static void calcularTemperatura(Double temperatura, String temperaturaOrigen, String temperaturaDestino){
        if(temperaturaOrigen.equalsIgnoreCase("CELCIUS")){
            convertirDesdeCelcius(temperatura, temperaturaDestino);
        } else if(temperaturaOrigen.equalsIgnoreCase("KELVIN")){
            convertirDesdeKelvin(temperatura, temperaturaDestino);        
        } else if(temperaturaOrigen.equalsIgnoreCase("FAHRENHEIT")){
            convertirDesdeFahrenheit(temperatura, temperaturaDestino);        
        }
    }
    
    public static void convertirDesdeCelcius(Double temperatura, String temperaturaDestino){
        if(temperaturaDestino.equalsIgnoreCase("kelvin")){
            /* usar temperatura y hacer calculo de celcius a kelvin
            kelvin = celcius + 273.15
            **/
        } else {
            /*usar temp y convertir de celcius a fahrenheit
            fahrenheit = celcius * (9/5) + 32
            */        
        }
    }
    
    public static void convertirDesdeKelvin(Double temperatura, String temperaturaDestino){
        if(temperaturaDestino.equalsIgnoreCase("celcius")){
            /* usar temperatura y hacer calculo de kelvin a celcius
            celcius = kelvin - 273.15
            **/
        } else {
            /*usar temp y convertir de kelvin a fahrenheit
            fahrenheit = (kelvin - 273.15) * (9/5) + 32
            */        
        }
    }
    
    public static void convertirDesdeFahrenheit(Double temperatura, String temperaturaDestino){
        if(temperaturaDestino.equalsIgnoreCase("celcius")){
            /* usar temperatura y hacer calculo de fahrenheit a celcius
            celcius = (fahrenherit - 32) * (5/9)
            **/
        } else {
            /*usar temp y convertir de fahrenheit a kelvin
            kelvin = (fahrenheit - 32) * (5/9) + 273.15
            */        
        }
    }
}
