public class Veiculo {

    private String modelo;
    private String marca;
    private TipoCombustivel tipoCombustivel;
    private double valorDiaria;

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public TipoCombustivel getTipoCombustivel() {return tipoCombustivel;}
    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {this.tipoCombustivel = tipoCombustivel;}

    public double getValorDiaria() {return valorDiaria;}
    public void setValorDiaria(double valorDiaria) {this.valorDiaria = valorDiaria;}

    public Veiculo() {}
    public Veiculo(String modelo, String marca, TipoCombustivel tipoCombustivel, double valorDiaria) {
        setModelo(modelo);
        setMarca(marca);
        setTipoCombustivel(tipoCombustivel);
        setValorDiaria(valorDiaria);
    }

}
