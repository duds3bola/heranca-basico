public class Arqueiro extends Personagem {

    private int quantidadeFlechas;
    private int precisao;

    public Arqueiro(String nome, int vida, int quantidadeFlechas, int precisao) {
        super(nome, vida);

        this.quantidadeFlechas = quantidadeFlechas;
        this.precisao = precisao;
    }

    public void atirar() {
        if (quantidadeFlechas > 0) {
            quantidadeFlechas--;

            System.out.println(
                    "O arqueiro realizou um ataque com precisao " + precisao
            );

            System.out.println(
                    "Flechas restantes: " + quantidadeFlechas
            );
        } else {
            System.out.println("O arqueiro esta sem flechas.");
        }
    }
}