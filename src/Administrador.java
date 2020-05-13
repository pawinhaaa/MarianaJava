import java.util.HashMap;

public class Administrador extends Utilizador {

    public Administrador(){
        this.login = "";
        this.password = "";
    }

    public Administrador(String login, String password) {
        this.login=login;
        this.password=password;
    }

    public Administrador(Administrador a){
        this.login=a.getLogin();
        this.password=a.getPassword();
    }

    @Override
    public String getLogin() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void setLogin(String login) {

    }

    @Override
    public void setPassword(String password) {

    }

}
   
    
//só construtor, o resto só na variavel que nao tem
    
   
    
    

