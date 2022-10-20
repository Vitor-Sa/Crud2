public class ModeloTenis {
    private String modelo;
    private byte numeracao;
    private String cor;
    private String marca;
    private String SKU;

    public ModeloTenis() {
    }

    public ModeloTenis(String modelo, byte numeracao, String cor, String marca, String SKU) {
        this.modelo = modelo;
        this.numeracao = numeracao;
        this.cor = cor;
        this.marca = marca;
        this.SKU = SKU;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public byte getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(byte numeracao) {
        this.numeracao = numeracao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }
}
