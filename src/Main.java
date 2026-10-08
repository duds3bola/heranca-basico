public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro(
                "Aragorn",
                120,
                20,
                15
        );

        Mago mago = new Mago(
                "Gandalf",
                80,
                100,
                30
        );

        Arqueiro arqueiro = new Arqueiro(
                "Legolas",
                90,
                20,
                25
        );

        guerreiro.mostrarInfo();
        guerreiro.golpear();

        mago.mostrarInfo();

        for (int i = 0; i < 11; i++) {
            mago.lancarMagia();
        }

        arqueiro.mostrarInfo();

        for (int i = 0; i < 21; i++) {
            arqueiro.atirar();
        }

        guerreiro.receberDano(30);
        guerreiro.recuperarVida(10);
        guerreiro.receberMoedas(50);

        mago.receberDano(20);
        mago.recuperarVida(5);

        arqueiro.receberMoedas(30);

        guerreiro.mostrarInfo();
        mago.mostrarInfo();
        arqueiro.mostrarInfo();
    }
}