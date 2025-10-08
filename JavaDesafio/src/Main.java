public class Main {
    public static void main() {
        StatusVeiculos[] listaVeiculos = new StatusVeiculos[3];

        listaVeiculos[0] = new StatusVeiculos("Spyder", "Ferrari", TipoCombustivel.ALCOOL, 5000.00);
        listaVeiculos[1] = new StatusVeiculos("Kicks", "Nissan", TipoCombustivel.GASOLINA, 1000.00);
        listaVeiculos[2] = new StatusVeiculos("Civic", "Honda", TipoCombustivel.ALCOOL, 3000.00);

        System.out.println(listaVeiculos[0]);

        System.out.println(listaVeiculos[0].Alugar());
        System.out.println(listaVeiculos[0].Alugar());
        System.out.println(listaVeiculos[0].Devolver());
        System.out.println(listaVeiculos[0].Alugar());
    }
}
