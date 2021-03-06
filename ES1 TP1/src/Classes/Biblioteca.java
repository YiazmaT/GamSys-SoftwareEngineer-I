package Classes;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Software> softwares;
    private Usuario usuariologado;
    
    public Biblioteca() {
        softwares = new ArrayList<Software>(); 
    }
    
    public int getItemId(int posi){
        if(posi<softwares.size()){
            return softwares.get(posi).getIdSoftware();
        }
        else return -1;
    }
    
    public void baixarAtualizacao(int idSoftware){
        int posiSoftware;
        for(int i =0 ;i<softwares.size();i++){
            Software a = softwares.get(i);
            if(a.getIdSoftware() == idSoftware){
                if(a.possuiUpdate() == true){
                    a.baixarUpdate();
                    return;
                }              
            }
        }
    }
    public void atualizarBiblioteca(int idNovoItem){
    
    }

    void fazerDownloadSoftware(int idSoftware) {
        for(Software a : softwares){
            if(a.getIdSoftware() == idSoftware){
                a.fazerDownloadSoftware();
                a.marcarBaixado();
            }
        }
    }
}
