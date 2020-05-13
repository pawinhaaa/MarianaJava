import java.util.HashMap;

public class ProfissionalSaude extends Utilizador{
    private String codigo;
    private String nome;

    public ProfissionalSaude(){
        codigo="";
        nome =  "";
    }

    public ProfissionalSaude(String codigo, String nome, String login, String password, HashMap<String,Hospital> listaHospital) {
        super(login, password, listaHospital);
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "codigo=" + codigo + ", nome=" + nome + '}';
    }
    
    
    
}
