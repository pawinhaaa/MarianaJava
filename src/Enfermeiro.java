
public class Enfermeiro extends Utilizador {
    private String codigoEnfermeiro;
	private String nomeEnfermeiro;			
	private Enfermaria ondeEnfermeiro;

	public Enfermeiro(){
	    this.password = "";
	    this.login = "";
	    this.codigoEnfermeiro = "";
	    this.nomeEnfermeiro = "";
	    this.ondeEnfermeiro = new Enfermaria();
    }

    public Enfermeiro(String codigoEnfermeiro, String nomeEnfermeiro, Enfermaria ondeEnfermeiro, String login, String password) {
        this.login=login;
        this.password=password;
        this.codigoEnfermeiro = codigoEnfermeiro;
        this.nomeEnfermeiro = nomeEnfermeiro;
        this.ondeEnfermeiro = ondeEnfermeiro;
    }

    public Enfermeiro(Enfermeiro e){
	    this.password=e.getPassword();
	    this.login=e.getLogin();
	    this.codigoEnfermeiro=e.getCodigoEnfermeiro();
	    this.ondeEnfermeiro=e.getOndeEnfermeiro();
	    this.nomeEnfermeiro=e.getNomeEnfermeiro();
    }


    public String getCodigoEnfermeiro() {
        return codigoEnfermeiro;
    }

    public void setCodigoEnfermeiro(String codigoEnfermeiro) {
        this.codigoEnfermeiro = codigoEnfermeiro;
    }

    public String getNomeEnfermeiro() {
        return nomeEnfermeiro;
    }

    public void setNomeEnfermeiro(String nomeEnfermeiro) {
        this.nomeEnfermeiro = nomeEnfermeiro;
    }

    public Enfermaria getOndeEnfermeiro() {
        return ondeEnfermeiro;
    }

    public void setOndeEnfermeiro(Enfermaria ondeEnfermeiro) {
        this.ondeEnfermeiro = ondeEnfermeiro;
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
        return "Enfermeiro{" + "codigoEnfermeiro=" + codigoEnfermeiro + ", nomeEnfermeiro=" + nomeEnfermeiro + ", ondeEnfermeiro=" + ondeEnfermeiro + '}';
    }

        
    
   
}
