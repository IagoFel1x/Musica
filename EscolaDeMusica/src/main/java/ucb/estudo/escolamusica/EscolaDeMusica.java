package ucb.estudo.escolamusica;

/**
 * Classe principal: monta uma banda com instrumentos diferentes e executa a
 * apresentação, demonstrando herança e polimorfismo.
 */
public class EscolaDeMusica {

    public static void main(String[] args) {
        InstrumentoMusical[] banda = {
            new ViolaoExercicio("Violão Clássico", "Madeira", 6),
            new PianoExercicio("Piano de Cauda", "Madeira e aço", 88),
            new BateriaExercicio("Bateria Acústica", "Madeira e metal", 5)
        };

        new EscolaDeMusica().apresentar(banda);
    }

    /**
     * Afina todos os instrumentos, toca em conjunto e depois apresenta cada um.
     *
     * @param banda instrumentos que participam da apresentação
     */
    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("====== A ORQUESTRA VAI COMEÇAR! ======\n");

        System.out.println("---- Afinação dos Instrumentos ----");
        for (InstrumentoMusical instrumento : banda) {
            if (instrumento != null) {
                instrumento.afinar();
            }
        }
        System.out.println();

        System.out.println("---- Instrumentos começaram a tocar ----");
        for (InstrumentoMusical instrumento : banda) {
            if (instrumento != null) {
                instrumento.tocar();
            }
        }
        System.out.println();

        for (int i = 0; i < banda.length; i++) {
            if (banda[i] != null) {
                System.out.println("---- Instrumento musical " + (i + 1) + " ----");
                banda[i].mostrarInformacoes();
                banda[i].tocar();
                System.out.println();
            }
        }
    }
}
