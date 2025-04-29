
package br.fastfood.facade;
import br.fastfood.model.Bebida;
import br.fastfood.model.Burger;
import br.fastfood.model.Combo;
import br.fastfood.model.ItemCombo;
import br.fastfood.model.Sobremesa;

public class ComboFacade {
   private Combo combo;

    public void criarCombo(int escolha){
        switch (escolha) {
            case 1:
                ItemCombo burguer = new Burger("Big Mac", 13.99);
                ItemCombo bebida = new Bebida("Coca Cola", 6.99);
                ItemCombo sobremesa = new Sobremesa("Casquinha", 3.99);
                combo = new Combo(burguer, bebida, sobremesa);
                break;
            case 2:
                ItemCombo burger2 = new Burger("Quarteirao", 13.99);
                ItemCombo bebida2 = new Bebida("Fanta Uva", 6.99);
                ItemCombo sobremesa2 = new Sobremesa("Milk Shake", 9.99);
                combo = new Combo(burger2, bebida2, sobremesa2);
                break;
            default:
                throw new AssertionError();
        }
    }

    public double getPrecoTotal(){
        return combo.getPrecoTotal();
    }

    public void exibirItens(){
        for (ItemCombo item : combo.getItens()) {
            System.out.println(item.getNome() + "\n" + item.getPreco());
        }
        

    }
    

}
