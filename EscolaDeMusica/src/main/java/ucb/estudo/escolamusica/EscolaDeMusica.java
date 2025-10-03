// 1. Declaração do pacote onde a classe EscolaMusica está localizada.
package ucb.estudo.escolamusica;

// 2. Imports necessários para acessar as classes que estão no pacote de instrumentos.
import com.escola.instrumentos.Bateria;
import com.escola.instrumentos.Flauta;
import com.escola.instrumentos.InstrumentoMusical;
import com.escola.instrumentos.Saxofone;
import com.escola.instrumentos.Violao;

/**
 * Classe principal que gerencia e executa a apresentação da orquestra.
 */
public class EscolaMusica {

    /**
     * O ponto de entrada do programa (main).
     * Cria a banda e inicia a apresentação.
     */
    public static void main(String[] args) {
        
        // Cria um array para a banda com 4 posições
        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        // Cria e adiciona os instrumentos na banda
        banda[0] = new Violao("Violão Clássico", "Madeira", 6);
        banda[1] = new Flauta("Flauta Transversal", "Prata");
        banda[2] = new Bateria("Bateria Acústica", "Madeira e Metal", 5);
        banda[3] = new Saxofone("Saxofone Alto", "Latão", "Alto");

        // Cria uma instância da própria classe EscolaMusica
        EscolaMusica em = new EscolaMusica();

        // Chama o método 'apresentar' para iniciar o show
        em.apresentar(banda);
    }

    /**
     * Organiza e executa a apresentação de uma banda de instrumentos.
     * @param banda Um array de InstrumentoMusical.
     */
    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("====== A ORQUESTRA VAI COMEÇAR! ======\n");

        // Afinando todos os instrumentos primeiro
        System.out.println("---- Afinação dos Instrumentos ----");
        for (InstrumentoMusical instrumento : banda) {
            if (instrumento != null) {
                instrumento.afinar();
            }
        }
        System.out.println();

        // Apresentação dos Instrumentos em conjunto
        System.out.println("---- Instrumentos começaram a tocar ----");
        for (InstrumentoMusical instrumento : banda) {
            if (instrumento != null) {
                instrumento.tocar();
            }
        }
        System.out.println();

        // Tocando de forma individual e mostrando as informações
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