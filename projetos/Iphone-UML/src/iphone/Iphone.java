package iphone;

public class Iphone {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        System.out.println("REPRODUTOR MUSICAL");
        reprodutor.selecionarMusica();
        reprodutor.pausar();
        reprodutor.tocar();

        NavegadorInternet navegador = new NavegadorInternet();
        System.out.println("NAVEGADOR DE INTERNET");
        navegador.exibirPagina();
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();

        AparelhoTelefonico aparelho = new AparelhoTelefonico();
        System.out.println("APARELHO TELEFÔNICO");
        aparelho.ligar();
        aparelho.atender();
        aparelho.inicarCorreioVoz();
    }
}
