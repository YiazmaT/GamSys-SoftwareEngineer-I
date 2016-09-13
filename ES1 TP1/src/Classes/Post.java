package Classes;

public class Post {
    private String texto;
    private int idRemetente;

    public Post(String texto, int idRemetente) {
        this.texto = texto;
        this.idRemetente = idRemetente;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getIdRemetente() {
        return idRemetente;
    }

    public void setIdRemetente(int idRemetente) {
        this.idRemetente = idRemetente;
    }
    
    
}
