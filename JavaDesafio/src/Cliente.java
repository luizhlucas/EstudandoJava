public class Cliente {

    private String nome;
    private int id;
    private static int i = 0;
    private String his = "";
    private double valorTotal;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getHis() {return his;}
    public void setHis(String his) {this.his += his;}

    public double getValorTotal() {return valorTotal;}
    public void setValorTotal(double valorTotal) {this.valorTotal = valorTotal;}

    public Cliente(String nome){
        setNome(nome);
        setId(++i);
    }

    public String Alugar(StatusVeiculos[] lista, int x, int dias){
        if (lista[x].isDisponivel()){
            setValorTotal(lista[x].getValorDiaria() * dias);
            setHis( "\n-" + lista[x].getModelo() + " alugado por "+ dias + " dias." +
                    "\n Valor total do aluguel: R$" + valorTotal );
            lista[x].setDisponivel(false);
            return  lista[x].getModelo() + " alugado com sucesso, por " + getNome() + ".";
        }
        return "Erro! Sinto muito " + getNome() + ", mas " + lista[x].getModelo() + " ja foi alugado.";
    }
    public String Devolver(StatusVeiculos[] lista, int x){
        if (lista[x].isDisponivel()){
            return "Erro! o veículo ja foi devolvido.";
        }
        lista[x].setDisponivel(true);
        return "Véiculo devolvido com sucesso!";
    }

    @Override
    public String toString() {
        return  "------------------------------"+
                "\nNome: " + getNome() +
                "\nid: " + getId() +
                "\nHistórico de Alugueis: " + his +
                "\n------------------------------";
    }
}
