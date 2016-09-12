package Classes;

public class Controlador {
    private GamSys gamsys;

    public Controlador() {
        gamsys = new GamSys();
    }

    public boolean login(String email, String senha) {
        return gamsys.fazerLogin(email,senha);
    }
    
}
