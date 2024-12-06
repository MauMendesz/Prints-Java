import java.util.Scanner;

public class Avaliacao03 {
    public static void main(String[] args) {
        Scanner tecLado = new Scanner(System.in);
        Processador dados = new Processador();
        System.out.println("Digite palavra/frase: ");
        dados.frase = tecLado.nextLine().toUpperCase();
        System.out.println("Digite uma letra: ");
        dados.letra1 = tecLado.next().toUpperCase().charAt(0);
        System.out.println("Digite primeiro número: ");
        dados.numero1 = tecLado.nextInt();
        System.out.println("Digite primeiro número: ");
        dados.numero3 = tecLado.nextInt();
        System.out.println("Digite primeiro número: ");
        dados.numero2 = tecLado.nextInt();
        dados.mostraTudo();
    }
}
