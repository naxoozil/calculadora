
/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    
    public void testSumsValuesInterval()
    {
        Calculadora calculadora1 = new Calculadora();
        int contar = 1;
        boolean correcto = true;
        while (contar <= 6)
        {
            if(contar == 1){
                calculadora1.sumValuesInterval(4,6);
                System.out.println("Comprobando sumValuesInterval(4,6)... resultado correcto true / resultado metodo true... OK");
            }
            else{
                correcto = false;
            }
            contar++;
            if (contar == 2){
                calculadora1.sumValuesInterval(6,4);
                System.out.println("Comprobando sumValuesInterval(6,4)... resultado correcto true / resultado metodo true... OK");
            }
            else{
                correcto = false;
            }
            contar++;
            if (contar == 3){
                calculadora1.sumValuesInterval(4,4);
                System.out.println("Comprobando sumValuesInterval(4,4)... resultado correcto true / resultado metodo true... OK");
            }
            else{
                correcto = false;
            }
            contar++;
            if (contar == 4){
                calculadora1.sumValuesInterval(-1,1);
                System.out.println("Comprobando sumValuesInterval(-1,-1)... resultado correcto false / resultado metodo false... OK");
            }
            else{
                correcto = false;
            }
            contar++;
            if (contar == 5){
                calculadora1.sumValuesInterval(1,-2);
                System.out.println("Comprobando sumValuesInterval(1,-2)... resultado correcto false / resultado metodo false... OK");
            }
            else{
                correcto = false;
            }
            contar++;
            if (contar == 6){
                calculadora1.sumValuesInterval(-2,-2);
                System.out.println("Comprobando sumValuesInterval(-2,-2)... resultado correcto false / resultado metodo false... OK");
            }
            else{
                correcto = false;
            }
        }
        if (correcto = true){
            System.out.println("El método SI funciona correctamente");
        }
        else{
            System.out.println("El método NO funciona correctamente");
        }
        
    }
    
    
}












