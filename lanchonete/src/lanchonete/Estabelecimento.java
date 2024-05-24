package lanchonete;

import lanchonete.atendimento.cozinha.Cozinheiro;
import lanchonete.atendimento.Atendente;
import lanchonete.area.cliente.Cliente;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não deveriam estar disponiveis para toda a aplicação
        //cozinheiro.lavarIngredientes();
        //cozinheiro.baterVitaminaLiquidificador();
        //cozinheiro.selecionarIngredientesVitamina();
        //cozinheiro.prepararLanche();
       // cozinheiro.prepararVitamina();
        //cozinheiro.prepararVitamina();

        //ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estar visiveis para toda a aplicação
        //almoxarife.controlarEntrada();
        //almoxarife.controlarSaida();
        //ações que somente o pacote cozinha precisa conhecer (default)
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        //atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ação que somente o pacote cozinha precisa conhecer (default)

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //Não deveria, mas o estabelecimento ainda não
        //definiu as normas de atendimento
        //cliente.pegarPedidoBalcao();

        //esta ação é sigilosa.. poderia ser privada..
        //cliente.consultarSaldoAplicativo();

        //IHH, o gás acabou meu povoooo
        //imagina os clientes ouvindo isso? poderia ser privado
        //cozinheiro.pedirParaTrocarGas(atendente);
        //cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}
