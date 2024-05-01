public class OperadoresJava {
    public static void main(String[] args){
        //Exemplos de concatenação

        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
            System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
            System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
            System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
            System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
            System.out.println(concatenacao);

        //Exemplos de operadores unários e operadores

        int numero = 5;
        numero = - numero;
            System.out.println(numero);
        numero = + numero;
            System.out.println(numero);
        
        numero = 5;
            //System.out.println(++numero);
            //System.out.println(numero++);
            //System.out.println(--numero);
            System.out.println(numero--);
            System.out.println(numero);

        boolean variavel = true;
            System.out.println(!variavel);
            System.out.println(variavel);
        variavel = !variavel;
            System.out.println(variavel);

        //Exemplos de condicional
        int a, b;
        a = 6;
        b = 6;
        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);

        //operador ternário

        String resultado1 = a==b ? "verdadeiro" : "falso";
            System.out.println(resultado1);

    }
}
