


public class Equipamento {
    private int codigoEquipamento;
	private String tipoEquipamento;
	private Enfermaria ondeEnfermeiro;   //temos de colocar o doente tambem??
	private Enfermaria ondeEquipamento;    
	private boolean disponivel; //se está a ser usado ou nao

    public Equipamento(int codigoEquipamento, String tipoEquipamento, Enfermaria ondeEnfermeiro, Enfermaria ondeEquipamento, boolean disponivel) {
        this.codigoEquipamento = codigoEquipamento;
        this.tipoEquipamento = tipoEquipamento;
        this.ondeEnfermeiro = ondeEnfermeiro;
        this.ondeEquipamento = ondeEquipamento;
        this.disponivel = disponivel; 
    }

    public int getCodigoEquipamento() {
        return codigoEquipamento;
    }

    public String getTipoEquipamento() {
        return tipoEquipamento;
    }

    public Enfermaria getOndeEnfermeiro() {
        return ondeEnfermeiro;
    }

    public Enfermaria getOndeEquipamento() {
        return ondeEquipamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setCodigoEquipamento(int codigoEquipamento) {
        this.codigoEquipamento = codigoEquipamento;
    }

    public void setTipoEquipamento(String tipoEquipamento) {
        this.tipoEquipamento = tipoEquipamento;
    }

    public void setOndeEnfermeiro(Enfermaria ondeEnfermeiro) {
        this.ondeEnfermeiro = ondeEnfermeiro;
    }

    public void setOndeEquipamento(Enfermaria ondeEquipamento) {
        this.ondeEquipamento = ondeEquipamento;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Equipamento{" + "codigoEquipamento=" + codigoEquipamento + ", tipoEquipamento=" + tipoEquipamento + ", ondeEnfermeiro=" + ondeEnfermeiro + ", ondeEquipamento=" + ondeEquipamento + ", disponivel=" + disponivel + '}';
    }
        
        
}
