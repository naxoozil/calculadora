
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
    
}



















