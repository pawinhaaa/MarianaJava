import java.util.HashMap;

public abstract class Utilizador  {
	protected String login;
	protected String password;
    private final HashMap<String, Hospital> listaHospital;

    public Utilizador (){
        this.login = "";
        this.password= "";
        this.listaHospital = new HashMap<String, Hospital>();
    }


    public Utilizador(String login, String password, HashMap<String, Hospital> listaHospital) {
        this.login = login;
        this.password = password;
        this.listaHospital = listaHospital;
    }

    public Utilizador(Utilizador u, HashMap<String, Hospital> listaHospital){
        this.login=u.getLogin();
        this.password=u.getPassword();
        this.listaHospital = listaHospital;
    }

    public abstract String getLogin() ;

    public abstract String getPassword() ;

    public abstract void setLogin(String login);

    public abstract void setPassword(String password);

    @Override
    public String toString() {
        return "Utilizador{" + "login=" + login + ", password=" + password + '}';
    }

    public boolean autenticacao (String password, String login){
        return this.login.equals(login) && this.password.equals(password);
    }

    public void changepassword(String newpassword){
        this.setPassword(newpassword);
    }


    public void adicionarHospital (Hospital hospital) {
        if(existeHospital (hospital.getCodigoHospital())) {
            throw new RuntimeException ("O hospital "+ hospital.getCodigoHospital() + "ja existe.");
        }
        listaHospital.put (hospital.getCodigoHospital(),hospital);
    }
    public boolean existeHospital (String codigoHospital) {
        return listaHospital.containsKey(codigoHospital);
    }
    public void removerHospital (String codigoHospital) {
        listaHospital.remove (codigoHospital);
    }

    public void changeHospitalInfo (String cod, Hospital hospital){
        this.listaHospital.put(cod,hospital);
    }

    public void changeEnfermarias(String cod, Enfermaria e){
        this.listaHospital.get(cod).getListaEnfermarias().put(e.getCodigoEnfermaria(),e);
    }
    public void changeMedicos (String cod, Medico m){
        this.listaHospital.get(cod).getListaMedicos().put(m.getCodigoMedico(),m);
    }
    public void changeEquipamentos (String cod, Equipamento e){
        this.listaHospital.get(cod).getListaEquipamentos().put(e.getCodigoEquipamento(),e);
    }
    public void changeDoentes (String cod, Doente d){
        this.listaHospital.get(cod).getListaDoentesHospital().put(d.getCodigoDoente(),d);
    }
    public void changeEnfermeiros(String cod, Enfermeiro e){
        this.listaHospital.get(cod).getListaEnfermeiros().put(e.getCodigoEnfermeiro(),e);
    }

    public void addMedico (String codH ,String cod,String nome,String especialidade,HashMap<String,Doente> doentes){
        Medico m = new Medico();
        m.setCodigoMedico(cod);
        m.setEspecialidadeMedico(especialidade);
        m.setNomeMedico(nome);
        m.setListaDoentesMedico(doentes);
        this.listaHospital.get(codH).getListaMedicos().put(cod,m);
    }

    public void addEnfermeiro (String codH ,String cod,String nome,Enfermaria enf){
        Enfermeiro e = new Enfermeiro();
        e.setCodigoEnfermeiro(cod);
        e.setOndeEnfermeiro(enf);
        e.setNomeEnfermeiro(nome);
        this.listaHospital.get(codH).getListaEnfermeiros().put(cod,e);
    }
}
