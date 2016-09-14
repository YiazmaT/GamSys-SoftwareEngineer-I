package Classes;

import java.util.ArrayList;

public class Carrinho {
    private float total;
    private ArrayList<Software> itens;
    public Carrinho() {
        itens = new ArrayList<Software>();
    }
    
    public void adicionarProdutoCarrinho(Software produto){
        if(!itens.contains(produto)){
            itens.add(produto);
            calcularTotal();
        }
    }
    public void calcularTotal(){
        total += itens.get(itens.size()-1).getPreco();
    }
    
    public boolean possuiItens(){
        return itens.size() > 0;
    }
    
    public int getIdCarrinho(){
        if(itens.size() == 0)return -1;
        return itens.remove(itens.size()-1).getIdSoftware();
    }
}
