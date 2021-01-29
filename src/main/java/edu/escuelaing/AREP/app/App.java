package edu.escuelaing.AREP.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {

        calcular();
    }
    private static void calcular(){
        Calculardora ans=new Calculardora(new String[]{"1","2","3","4","5","6","7","8","9","10","11","12","13","14"});
        ans.media();
    }
}
