public class testeTipos{
    public static void main(String[] args) {
        String nome = "Danton";
        String cidade = "Blumenau";
        System.out.println("O " + nome + " mora em " + cidade + " ha muito tempo");
        System.out.printf("O %s mora em %s ha muito tempo%n", nome, cidade);
        System.out.printf("O %-30s mora em %s ha muito tempo%n", nome, cidade);
        System.out.printf("O %30s mora em %s ha muito tempo%n", nome, cidade);
        int inteiro = 1000;
        System.out.printf("Numero de loteria %d, valeu%n", inteiro);
        System.out.printf("Numero de loteria %07d, valeu%n", inteiro);
        double numero = 123456.7891112;
        System.out.printf("O numero é %f legal%n", numero);
        System.out.printf("O numero é %.2f legal%n", numero);
        System.out.printf("O numero é %015.2f legal%n", numero);
        char caractere = 'A';
        System.out.printf("um caractere %c esta ali%n", caractere);
        System.out.printf("um caractere %C esta ali%n", caractere);

        System.out.printf("um nome %s, um numero %d, um valor %.2f, uma cidade %s", nome, numero, inteiro,cidade);



    }
} 

//  /n -- %n diferença = /n no linux - %n no windows quebra a linha, le ela inteira.
// %s para substituir digitos, %d para substituir inteiros
//%c para caracteres