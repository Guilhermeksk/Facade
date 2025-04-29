
package br.fastfood.model;

import java.util.Arrays;
import java.util.List;


public class Combo  {

    private ItemCombo burguer;
    private ItemCombo bebida;
    private ItemCombo sobremesa;

    public Combo(ItemCombo burguer, ItemCombo bebida, ItemCombo sobremesa){
        this.burguer = burguer;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public List<ItemCombo> getItens() {
        return Arrays.asList(burguer, bebida, sobremesa);
    }

    public double getPrecoTotal(){
        return burguer.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }

}
