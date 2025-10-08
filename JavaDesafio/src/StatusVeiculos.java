public class StatusVeiculos extends Veiculo{

    private boolean disponivel;

    public boolean isDisponivel() {return disponivel;}
    public void setDisponivel(boolean disponivel) {this.disponivel = disponivel;}

    public StatusVeiculos() {}
    public StatusVeiculos(String modelo, String marca, TipoCombustivel tipoCombustivel, double valorDiaria){
        super(modelo, marca, tipoCombustivel, valorDiaria);
        setDisponivel(true);
    }

    @Override
    public String toString() {
            String status = disponivel ? "Disponível" : "Indisponível";
            return "------------------------------" +
                    "\nModelo: " + getModelo() +
                    "\nMarca: " + getMarca() +
                    "\nTipo de Combustível: " + getTipoCombustivel() +
                    "\nValor da Diária: R$" + getValorDiaria() +
                    "\nStatus: " + status +
                    "\n------------------------------";

    }
}
