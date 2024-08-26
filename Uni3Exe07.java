package atividades;
import java.util.Scanner;

public class Uni3Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Quantas latinhas de 350ml voce deseja?");
        int latinhas = teclado.nextInt();
        System.out.println("Quantas garrafas de 600ml voce deseja?");
        int garrafas = teclado.nextInt();
        System.out.println("Quantas garrafas de 2 litros voce deseja?");
        int litroes = teclado.nextInt();
        float latinhasTotal = latinhas * 350;
        float garrafasTotal = garrafas * 600;
        float litroesTotal = litroes * 2;
        float transforma = latinhasTotal + garrafasTotal * 100;
        float totalLitros = latinhasTotal + garrafasTotal + litroesTotal;
        System.out.println("O total de litros que voce comprou é: " + totalLitros);
        teclado.close();

    }
    
}
