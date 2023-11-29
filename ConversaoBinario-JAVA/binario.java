import java.util.Scanner;
import java.lang.Math;

public class binario{
    public static void main (String arg[]){
        Scanner scn = new Scanner(System.in);
        System.out.print("Digite o numero em binario para ser convertido em decimal: ");
        
        String num = scn.nextLine();

        for(int i = 0; i<num.length(); i++){
            char elemento = num.charAt(i);
            int elemen = Character.getNumericValue(elemento);
            if (elemen != 0 && elemen != 1){
                System.out.println("O numero não é binario");
            } 
        }

        System.out.println("A conversao de "+num+ " para decimal resulta em: " + conversao(num));
    
        scn.close();
    }

    public static int conversao(String num){
        int soma = 0;
        int expoente = num.length()-1;

        for(int i = 0; i<num.length(); i++){
            
            double pot = Math.pow(2, expoente);
            int potencia = (int) pot;
            char bit = num.charAt(i);
            int numBin = Character.getNumericValue(bit);
            int Byte = numBin*potencia;
            soma += Byte;
            expoente--;
    
        }
        return soma;
    }
}