package equipamentos.estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        //interface atribui caracteristicas relacionados a utilidade de uma classe, quando uma classe precisa ter mais de um papel, usamos interfaces
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

   
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
