public class Guerreiro extends Personagem {

    private int forca;
    private int armadura;

    public Guerreiro(String nome, int vida, int forca, int armadura) {
        super(nome, vida);

        this.forca = forca;
        this.armadura = armadura;
    }

    public void golpear() {
        System.out.println("O personagem realizou um golpe com forca " + forca);
    }
}