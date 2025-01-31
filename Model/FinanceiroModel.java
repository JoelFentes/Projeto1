package Main.Model;

public abstract class FinanceiroModel {
    private String data;
    private String descricao;
    private float valor;
    private String salaNome;

    public FinanceiroModel(String data, String descricao, float valor, String salaNome) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
        this.salaNome = salaNome;
    }

    public String getData() {
        return data;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public String getSalaNome() {
        return salaNome;
    }

    @Override
    public String toString() {
        return String.format("Data: %s | Descrição: %s | Valor: %.2f | Sala: %s",
                data, descricao, valor, salaNome);
    }
}
