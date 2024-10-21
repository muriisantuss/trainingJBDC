package beans;

public class ItensVendas {

    private int quantidade;
    private int valorUnitario;
    private int valorTotal;
    private int desconto;
    private int totalComDesconto;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }

    public int getTotalComDesconto() {
        return totalComDesconto;
    }

    public void setTotalComDesconto(int totalComDesconto) {
        this.totalComDesconto = totalComDesconto;
    }

}
