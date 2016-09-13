package Classes;

import java.util.ArrayList;

public class Carrinho {
    private float total;
    private ArrayList<Integer> itens;
    public Carrinho() {
        //
    }
    
    public void adicionarProdutoCarrinho(int idProduto){
        itens.add(idProduto);
    }
    public void calcularTotal(){
        //
    }
    
    public boolean possuiItens(){
        return itens.size() > 0;
    }
    
    public int getIdCarrinho(){
        if(itens.size() == 0)return -1;
        return itens.remove(itens.size()-1);
    }
}
