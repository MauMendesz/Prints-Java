import java.util.*;
public class Avalia02 {
    public static void main(String[] args) {
        Scanner tecLado = new Scanner(System.in);
        DadosProcessado dados = new DadosProcessado();
        System.out.println("Digite uma palavra/frase: ");
        dados.palavra = tecLado.nextLine().toUpperCase();
        System.out.println("Digite uma letra: ");
        dados.letra = tecLado.next().toUpperCase().charAt(0);
        System.out.println("Digite primeiro número: ");
        dados.numer1 = tecLado.nextInt();
        System.out.println("Digite segundo número: ");
        dados.numer2 = tecLado.nextInt();
        System.out.println("Digite terceiro número: ");
        dados.numer3 = tecLado.nextInt();
        System.out.println("Digite quarto número: ");
        dados.numer4 = tecLado.nextInt();
        dados.MostraTudo();

    }
}
