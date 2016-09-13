package Classes;

public class Controlador {
    public GamSys gamsys;

    public Controlador() {
        gamsys = new GamSys();
    }

    public boolean login(String email, String senha) {
        return gamsys.fazerLogin(email,senha);
    }
    
}
