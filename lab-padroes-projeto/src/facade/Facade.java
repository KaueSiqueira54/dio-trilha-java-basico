package facade;

import subsistema1_crm.CrmService;
import subsistema2_crm.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstdado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
