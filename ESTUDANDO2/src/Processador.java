public class Processador {
    public String frase;
    public char letra1;
    public int numero1,numero2,numero3;

public void SemLetra(){
    String palavra = frase;
    String palnew = "";
    char letra;
    int qtd = 0;
    int tam = palavra.length();

    for (int i = 0; i < tam; i++){
        letra = palavra.charAt(i);
        if (letra == ' '){
            palnew += "";
            qtd += 1;
        }else{
            palnew += letra;
        }
    }
    System.out.println("Nova palavra gerada: " + palnew);
    System.out.println("A palavra " + letra1 + " apareceu " + qtd + " vezes");
}
public void MenorNumero() {
    int numeroM;
    if (numero1 < numero2 & numero1 < numero3) {
        numeroM = numero1;
    } else if (numero2 < numero1 & numero2 < numero3){
        numeroM = numero2;
    }else{
        numeroM = numero3;
    }
    System.out.println("O menor número digitado foi: " + numeroM);
}
public void Impar(){
    int truth;
    int soma = numero1 + numero2 + numero3;
    if (soma % 2 == 0){
        System.out.println(soma + " A soma dos números não é impar");
    }else{
        System.out.println(soma + " A soma dos números é impar");
    }
}
public void mostraTudo(){
    SemLetra();
    MenorNumero();
    Impar();
}
}
