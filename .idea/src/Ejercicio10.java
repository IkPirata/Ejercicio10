import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        int count;
        int moda = 0;
        int freq = 0;
        final char[] LETRAS = {'B','A','B','C','A','C','D','C','C','D'};
        for (int i = 0; i <LETRAS.length; i++){
            count = 0;
            for (int j = 0; j < LETRAS.length; j++){
                if (LETRAS[j] == LETRAS[i]){
                    count++;
                }
            }
            if (count > moda){
                moda = i;
                freq = count;
            }
        }
        System.out.println(LETRAS[moda] + " aparece " + freq + " veces.");
    }
}