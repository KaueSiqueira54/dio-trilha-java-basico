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


        //Operadores relacionais

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        if (simNao == true){
            System.out.println("NumeroUm é igual a númeroDois");
        }
        if (numero1 >= 1){
            System.out.println("NumeroUm é maior que 1");
        }
        else{
            System.out.println("NumeroDois é diferente de numeroUm");
        }

        String nomeUm = "Kaue";
        String nomeDois = "Kaue";
        System.out.println(nomeUm == nomeDois);
        nomeDois = new String ("Siqueira");
        System.out.println(nomeUm == nomeDois);

        //equaals compara se o conteúdo de dois objetos é igual;
        System.out.println(nomeUm.equals(nomeDois));

        //Operadores lógicos

        //&& verifica de as duas condições são verdadeiras;
        //|| verifica se apenas uma das condições é verdadeira;

        boolean condicao1 = true;
        boolean condicao2 = true;
        if(condicao1 && (5 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");
        
    }
}
