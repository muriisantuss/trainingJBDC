package beans;

public class Clientes {
    public enum EnumSexo {
        M, F
    }

    private int ClienteID;
    private String Cliente;
    private String Estado;
    private EnumSexo Sexo;
    private String Status;

    public int getClienteID() {
        return ClienteID;
    }

    public void setClienteID(int ClienteID) {
        this.ClienteID = ClienteID;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public EnumSexo getSexo() {
        return Sexo;
    }

    public void setSexo(EnumSexo Sexo) {
        this.Sexo = Sexo;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}