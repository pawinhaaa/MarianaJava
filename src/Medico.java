import java.util.HashMap;

public class Medico extends ProfissionalSaude {
	private String codigoMedico;
	private String nomeMedico;
	private String especialidadeMedico;
	private HashMap<String,Doente> listaDoentesMedico; 	//lista de doentes atribuidos a cada medico


    public Medico(){
        this.login = "";
        this.password = "";
        this.codigoMedico = "";
        this.nomeMedico = "";
        this.especialidadeMedico = "";
        this.listaDoentesMedico = new HashMap<String, Doente>();
    }

    public Medico(String codigoMedico, String nomeMedico, String especialidadeMedico, HashMap<String,Doente> listaDoentesMedico, String codigo, String nome, String login, String password) {
        this.login = login;
        this.password = password;
        this.codigoMedico = codigoMedico;
        this.nomeMedico = nomeMedico;
        this.especialidadeMedico = especialidadeMedico;
        this.listaDoentesMedico = listaDoentesMedico;
    }

    public Medico(Medico m){
        this.login = m.getLogin();
        this.password = m.getPassword();
        this.codigoMedico = m.getCodigoMedico();
        this.nomeMedico = m.getNomeMedico();
        this.especialidadeMedico = m.getEspecialidadeMedico();
        this.listaDoentesMedico = m.getListaDoentesMedico();
    }

    public String getCodigoMedico() {
        return codigoMedico;
    }

    public void setCodigoMedico(String codigoMedico) {
        this.codigoMedico = codigoMedico;
    }

    public String getNomeMedico() {
        return nomeMedico;
    }

    public void setNomeMedico(String nomeMedico) {
        this.nomeMedico = nomeMedico;
    }

    public String getEspecialidadeMedico() {
        return especialidadeMedico;
    }

    public void setEspecialidadeMedico(String especialidadeMedico) {
        this.especialidadeMedico = especialidadeMedico;
    }

    public HashMap<String, Doente> getListaDoentesMedico() {
        return new HashMap<String, Doente>(this.listaDoentesMedico);
    }

    public void setListaDoentesMedico(HashMap<String,Doente> listaDoentesMedico) {
        this.listaDoentesMedico = new HashMap<String, Doente>(listaDoentesMedico);
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
        return "Medico{" + "codigoMedico=" + codigoMedico + ", nomeMedico=" + nomeMedico + ", especialidadeMedico=" + especialidadeMedico + ", listaDoentesMedico=" + listaDoentesMedico + '}';
    }

   


}
