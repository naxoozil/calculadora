
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Calculadora
{
    //guarda un numero
    private int numero;
    private int suma;
    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        numero = 0; 
        
    }
    
    /**
     * Muestra los multiplos de 5 desde el 10 hatsta el 95 sin contar los extremos
     */
    public void multiplesOfFive(){
        numero = 10; 
        while (numero >= 10 && numero < 90){
            numero = numero + 5;
            System.out.println(numero);
        
        }
    }
    
    public void sumValues(){
        numero = 0;
        while(numero >= 0 && numero <= 9){
            numero++;
            suma = suma + numero;
            System.out.println(suma);
        }
    }
    
    public int sumValuesInterval(int parametroA, int parametroB){
        suma = 0;
        numero = 0;
        if (parametroA > 0 && parametroB > 0){
            if (parametroA < parametroB){
                numero = parametroA;
                while ( numero <= parametroB){
                    suma = suma + numero;
                    numero++;
                }
            }
            if (parametroA > parametroB){
                numero = parametroB;
                while ( numero <= parametroA){
                    suma = suma + numero;
                    numero++;
                }
            }
            if (parametroA == parametroB){
                suma = parametroA;
            }
        }
        else{
            suma = -1;
        }
        return suma;
        
    }
}



















