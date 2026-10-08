public class Personagem {

    private String nome;
    private int vidaAtual;
    private int vidaMaxima;
    private int nivel;
    private int moedas;

    public Personagem(String nome, int vidaMaxima) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.nivel = 1;
        this.moedas = 100;
    }

    public void receberDano(int dano) {
        vidaAtual -= dano;

        if (vidaAtual < 0) {
            vidaAtual = 0;
        }
    }

    public void recuperarVida(int quantidade) {
        vidaAtual += quantidade;

        if (vidaAtual > vidaMaxima) {
            vidaAtual = vidaMaxima;
        }
    }

    public void receberMoedas(int quantidade) {
        moedas += quantidade;
    }

    public void gastarMoedas(int quantidade) {
        if (moedas >= quantidade) {
            moedas -= quantidade;
        }
    }

    public void subirNivel() {
        nivel++;
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vidaAtual + "/" + vidaMaxima);
        System.out.println("Nivel: " + nivel);
        System.out.println("Moedas: " + moedas);
    }
}