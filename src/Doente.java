


import java.time.LocalDateTime;

public class Doente {
    private String codigoDoente;
    private String nomeDoente;
    private String localidadeDoente;
    private String estadoDoente;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private Enfermaria enferOndeEstaODoente; 
    private int camaDoente;		//cama que o doente está a ultilizar
            //ver se é preciso cama/lista camas
            //data saida vai ser null no inicio, no construtor

    public Doente(){
        this.camaDoente = -1;
        this.codigoDoente="";
        this.nomeDoente="";
        this.localidadeDoente="";
        this.estadoDoente="";
        this.dataEntrada=null;
        this.dataSaida=null;
        this.enferOndeEstaODoente=new Enfermaria();
    }


    public Doente(String codigoDoente, String nomeDoente, String localidadeDoente, String estadoDoente,LocalDateTime dataSaida, LocalDateTime diaEntrada, LocalDateTime mesEntrada, LocalDateTime anoEntrada, LocalDateTime diaSaida, LocalDateTime mesSaida, LocalDateTime anoSaida, Enfermaria enferOndeEstaODoente , int camaDoente) {
        this.codigoDoente = codigoDoente;
        this.nomeDoente = nomeDoente;
        this.localidadeDoente = localidadeDoente;
        this.estadoDoente = estadoDoente;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.enferOndeEstaODoente = enferOndeEstaODoente;
        this.camaDoente = camaDoente;
    }

    public String getCodigoDoente() {
        return codigoDoente;
    }

    public String getNomeDoente() {
        return nomeDoente;
    }

    public String getLocalidadeDoente() {
        return localidadeDoente;
    }

    public String getEstadoDoente() {
        return estadoDoente;
    }

    public LocalDateTime getDataEntrada() {
        return dataEntrada;
    }

    public LocalDateTime getDataSaida() {
        return dataSaida;
    }

  
    public Enfermaria getEnferOndeEstaODoente() {
        return enferOndeEstaODoente;
    }

    public int getCamaDoente() {
        return camaDoente;
    }

    public void setCodigoDoente(String codigoDoente) {
        this.codigoDoente = codigoDoente;
    }

    public void setNomeDoente(String nomeDoente) {
        this.nomeDoente = nomeDoente;
    }

    public void setLocalidadeDoente(String localidadeDoente) {
        this.localidadeDoente = localidadeDoente;
    }

    public void setEstadoDoente(String estadoDoente) {
        this.estadoDoente = estadoDoente;
    }

    public void setDiaEntrada(LocalDateTime dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public void setMesEntrada(LocalDateTime dataSaida) {
        this.dataSaida = dataSaida;
    }

  
    public void setEnferOndeEstaODoente(Enfermaria enferOndeEstaODoente) {
        this.enferOndeEstaODoente = enferOndeEstaODoente;
    }

    public void setCamaDoente(int camaDoente) {
        this.camaDoente = camaDoente;
    }

    @Override
    public String toString() {
        return "Doente{" + "codigoDoente=" + codigoDoente + ", nomeDoente=" + nomeDoente + ", localidadeDoente=" + localidadeDoente + ", estadoDoente=" + estadoDoente + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", enferOndeEstaODoente=" + enferOndeEstaODoente + ", camaDoente=" + camaDoente + '}';
    }


    
    
}



