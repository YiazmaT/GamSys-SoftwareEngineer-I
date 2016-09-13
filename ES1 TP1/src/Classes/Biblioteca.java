package Classes;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Software> softwares;
    private Usuario usuariologado;
    
    public Biblioteca() {
    }
    
    public int getItemId(int posi){
        return softwares.get(posi).getIdSoftware();
    }
    
    public void baixarAtualizacao(int idSoftware){
        int posiSoftware;
        for(int i =0 ;i<softwares.size();i++){
            Software a = softwares.get(i);
            if(a.getIdSoftware() == idSoftware){
                if(a.possuiUpdate() == true){
                    a.baixarUpdate();
                    a.marcarBaixado();
                    return;
                }              
            }
        }
    }
    public void atualizarBiblioteca(int idNovoItem){
        //
    }
}
