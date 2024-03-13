package Hospital;

public class Internacao {
    Medico objMedico;
    Paciente objPaciente;
    Enfermeiro objEnfermeiro;
    private static int idInternacao;
    private String motivo;
    private Double valorDia;
    private Integer cont;
    private Integer total;

    public Medico getObjMedico() {
        return objMedico;
    }

    public void setObjMedico(Medico objMedico) {
        this.objMedico = objMedico;
    }

    public Paciente getObjPaciente() {
        return objPaciente;
    }

    public void setObjPaciente(Paciente objPaciente) {
        this.objPaciente = objPaciente;
    }

    public Enfermeiro getObjEnfermeiro() {
        return objEnfermeiro;
    }

    public void setObjEnfermeiro(Enfermeiro objEnfermeiro) {
        this.objEnfermeiro = objEnfermeiro;
    }

    public static int getIdInternacao() {
        return idInternacao;
    }

    public static void setIdInternacao(int idInternacao) {
        Internacao.idInternacao = idInternacao;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Double getValorDia() {
        return valorDia;
    }

    public void setValorDia(Double valorDia) {
        this.valorDia = valorDia;
    }

    public Integer getCont() {
        return cont;
    }

    public void setCont(Integer cont) {
        this.cont = cont;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Internacao(Medico objMedico, Paciente objPaciente, Enfermeiro objEnfermeiro, String motivo, Double valorDia, Integer cont, Integer total) {
        this.objMedico = objMedico;
        this.objPaciente = objPaciente;
        this.objEnfermeiro = objEnfermeiro;
        this.motivo = motivo;
        this.valorDia = valorDia;
        this.cont = cont;
        this.total = total;
    }
    
}
