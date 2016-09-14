package Classes;

import java.util.ArrayList;

public class ListaDeAmigos {
    private ArrayList<Usuario> amigos;
    
    public ListaDeAmigos() {
        amigos = new ArrayList<Usuario>();
    }
    
    public int getAmigo(int i){
        if(i < amigos.size()){
            return amigos.get(i).getIdUsuario();
        }else return -1;
    }
    
    public void adicionarNovoAmigo(int idNovoAmigo){
        //
    }
}
