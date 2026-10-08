public class Mago extends Personagem {

    private int mana;
    private int poderMagico;

    public Mago(String nome, int vida, int mana, int poderMagico) {
        super(nome, vida);

        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lancarMagia() {
        if (mana >= 10) {
            mana -= 10;

            System.out.println(
                    "O mago lancou uma magia com poder magico " + poderMagico
            );

            System.out.println("Mana restante: " + mana);
        } else {
            System.out.println("Mana insuficiente.");
        }
    }
}