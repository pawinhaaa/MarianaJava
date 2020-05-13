import java.util.ArrayList;

public class Enfermaria {
    private int codigoEnfermaria;
	private String tipoEnfermaria;
	private int totalCamas;		//designação da cama

    public Enfermaria(){
        this.codigoEnfermaria =-1;
        this.tipoEnfermaria = "";
        this.totalCamas = -1;
    }

    public Enfermaria(int codigoEnfermaria, String tipoEnfermaria, int totalCamas) {
        this.codigoEnfermaria = codigoEnfermaria;
        this.tipoEnfermaria = tipoEnfermaria;
        this.totalCamas = totalCamas;
    }

    public int getCodigoEnfermaria() {
        return codigoEnfermaria;
    }

    public String getTipoEnfermaria() {
        return tipoEnfermaria;
    }

    public int getTotalCamas() {
        return totalCamas;
    }

    public void setCodigoEnfermaria(int codigoEnfermaria) {
        this.codigoEnfermaria = codigoEnfermaria;
    }

    public void setTipoEnfermaria(String tipoEnfermaria) {
        this.tipoEnfermaria = tipoEnfermaria;
    }

    public void setTotalCamas(int totalCamas) {
        this.totalCamas = totalCamas;
    }

    @Override
    public String toString() {
        return "Enfermaria{" + "codigoEnfermaria=" + codigoEnfermaria + ", tipoEnfermaria=" + tipoEnfermaria + ", totalCamas=" + totalCamas + '}';
    }
        
        
}
