public class DadosProcessado {
    public String palavra;
    public char letra;
    public int numer1,numer2,numer3,numer4;

    public void REVERSE(){
        String frase = palavra;
        String inverte = "";
        String palnew = "";
        int qtd = 0;
        char letra1;
        int tam = frase.length();
        frase = frase.toUpperCase();

        for (int i = tam -1; i >= 0; i--){
        letra1 = frase.charAt(i);
        inverte += letra1;
            if (letra1 == letra){
                palnew += "";
                qtd += 1;
            }else{
                palnew += letra1;
            }
        }
        System.out.println("Nova palavra gerada: " + palnew);
        System.out.println("A letra " + letra + " Apareceu " + qtd);
    }
    public void SomaDivisão(){
        int truth;
        int soma = numer1 + numer2 + numer3 + numer4;
        if (soma % 3 == 0 & soma % 4 == 0){
            System.out.println(soma + " - é divisível por 3 e 4 ao mesmo tempo");
        }else{
            System.out.println(soma + " - não é divisível por 3 e 4 ao mesmo tempo");
        }
    }
    public void MostraTudo(){
        REVERSE();
        SomaDivisão();
    }
}
