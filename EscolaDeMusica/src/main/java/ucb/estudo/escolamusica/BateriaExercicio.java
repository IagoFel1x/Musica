package ucb.estudo.escolamusica;

public class BateriaExercicio extends InstrumentoMusical {

    private int numeroPecas;

    public BateriaExercicio(String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void tocar() {
        System.out.println("Marcando o ritmo na " + nome + " com " + this.getNumeroPecas() + " peças!");
        System.out.println("Boom! Tss! Boom! Tss!");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das peles dos tambores.");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de peças: " + getNumeroPecas());
    }

    public int getNumeroPecas() {
        return numeroPecas;
    }
}