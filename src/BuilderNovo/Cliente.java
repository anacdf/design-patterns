package BuilderNovo;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    public static void main(String[] args) {

        //Pedido do Cliente:
        Sanduiche sanduiche = new Sanduiche("hamburguer");
        Batata batata = new Batata("media");
        Brinquedo brinquedo = new Brinquedo("boneca");
        Refri refri = new Refri("coca");

        //Atendente passa o pedido para o Funcionario, que monta o lanche
        FuncionarioBuilder funcionario = new FuncionarioConcreteBuilder(sanduiche, batata, brinquedo, refri);
        AtendenteDirector atendente = new AtendenteDirector(funcionario);

        //Funcionario monta o lanche e entrega o pedido
        funcionario.montarLanche();
        Set pedidoDentroDaCaixa = funcionario.dentroDaCaixa;
        Set pedidoForaDaCaixa = funcionario.foraDaCaixa;

    }
}
