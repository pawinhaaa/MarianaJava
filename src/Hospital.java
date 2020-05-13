import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
   	private String codigoHospital;
	private String nomeHospital;
	private String localidadeHospital;
    private HashMap<String,Medico> listaMedicos;
    private HashMap<String,Enfermeiro> listaEnfermeiros;
    private HashMap<Integer,Equipamento> listaEquipamentos;
    private HashMap<String,Doente> listaDoentes;
    private HashMap<Integer,Enfermaria> listaEnfermarias;


    public Hospital(){
        this.codigoHospital ="";
        this.nomeHospital = "";
        this.localidadeHospital = "";
        this.listaMedicos = new HashMap<>();
        this.listaEquipamentos = new HashMap<>();
        this.listaEnfermarias = new HashMap<>();
        this.listaDoentes = new HashMap<>();
        this.listaEnfermeiros = new HashMap<>();
    }
        
    public Hospital(String codigoHospital, String nomeHospital, String localidadeHospital, HashMap<String,Medico> medicos, HashMap<String,Enfermeiro>enfermeiros,HashMap<Integer,Equipamento> equipamentos, HashMap<String,Doente> doentes, HashMap<Integer,Enfermaria> enfermarias) {
        this.codigoHospital = codigoHospital;
        this.nomeHospital = nomeHospital;
        this.localidadeHospital = localidadeHospital;
        this.listaMedicos = medicos;
        this.listaEnfermeiros = enfermeiros;
        this.listaDoentes = doentes;
        this.listaEnfermarias = enfermarias;
        this.listaEquipamentos = equipamentos;
    }

    public String getCodigoHospital() {
        return codigoHospital;
    }

    public String getNomeHospital() {
        return nomeHospital;
    }

    public String getLocalidadeHospital() {
        return localidadeHospital;
    }

    public HashMap<String,Medico> getListaMedicos() {
        return new HashMap<String, Medico>(this.listaMedicos);
    }

    public HashMap<String,Enfermeiro> getListaEnfermeiros() {
        return new HashMap<String,Enfermeiro>(this.listaEnfermeiros);
    }

    public HashMap<String,Doente> getListaDoentesHospital() {
        return new HashMap<String,Doente>(this.listaDoentes);
    }

    public HashMap<Integer,Enfermaria> getListaEnfermarias() {
        return new HashMap<Integer, Enfermaria>(this.listaEnfermarias);
    }

    public HashMap<Integer,Equipamento> getListaEquipamentos() {
        return new HashMap<Integer, Equipamento>(this.listaEquipamentos);
    }

    public void setCodigoHospital(String codigoHospital) {
        this.codigoHospital = codigoHospital;
    }

    public void setNomeHospital(String nomeHospital) {
        this.nomeHospital = nomeHospital;
    }

    public void setLocalidadeHospital(String localidadeHospital) {
        this.localidadeHospital = localidadeHospital;
    }

    public void setListaMedicos(HashMap<String,Medico> listaMedicos) {
        this.listaMedicos = new HashMap<String, Medico>(listaMedicos);
    }

    public void setListaEnfermeiros(HashMap<String,Enfermeiro> listaEnfermeiros) {
        this.listaEnfermeiros = new HashMap<String, Enfermeiro>(listaEnfermeiros);
    }

    public void setListaDoentesHospital(HashMap<String,Doente> listaDoentesHospital) {
        this.listaDoentes = new HashMap<String,Doente>(listaDoentesHospital);
    }

    public void setListaEnfermarias(HashMap<Integer,Enfermaria> listaEnfermarias) {
        this.listaEnfermarias = new HashMap<Integer, Enfermaria>(listaEnfermarias);
    }
    public void setListaEquipamentos(HashMap<Integer,Equipamento> listaEquipamentos) {
        this.listaEquipamentos = new HashMap<Integer, Equipamento>(listaEquipamentos);
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "codigoHospital='" + codigoHospital + '\'' +
                ", nomeHospital='" + nomeHospital + '\'' +
                ", localidadeHospital='" + localidadeHospital + '\'' +
                ", listaMedicos=" + listaMedicos +
                ", listaEnfermeiros=" + listaEnfermeiros +
                ", listaEquipamentos=" + listaEquipamentos +
                ", listaDoentes=" + listaDoentes +
                ", listaEnfermarias=" + listaEnfermarias +
                '}';
    }
}
