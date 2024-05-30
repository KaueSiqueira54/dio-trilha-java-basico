package exercicios.ordenacaonumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    List<Numero> listNumero;

    public OrdenacaoNumeros() {
        this.listNumero = new ArrayList();
    }

    public void adicionarNumero(int numero) {
        List<Numero> adicionarNumero = new ArrayList();
        if (!listNumero.isEmpty()) {
            listNumero.add(new Numero(numero));
        }
    }
    public List<Numero> ordenarAscendente() {
        List<Numero> ordenarAscencendia = new ArrayList<>();
            Collections.sort(listNumero);
            return listNumero;
    }
    public List<Numero> ordenarDescendencia() {
        List<Numero> ordenarDescendencia = new ArrayList();
        Collections.reverse(listNumero);
        return listNumero;
    }
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(6);
        
    }
}
