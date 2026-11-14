# Escola de Música

Exercício de **Programação Orientada a Objetos** em **Java 21**: uma escola de música monta uma banda com instrumentos diferentes e faz uma apresentação. O foco é herança, classe abstrata e polimorfismo.

## Classes

| Classe | Papel |
|--------|-------|
| `InstrumentoMusical` | Classe abstrata com `nome`, `material`, `afinar()`, `mostrarInformacoes()` e o método abstrato `tocar()` |
| `ViolaoExercicio` | Violão, com número de cordas |
| `PianoExercicio` | Piano, com número de teclas |
| `BateriaExercicio` | Bateria, com número de peças |
| `EscolaDeMusica` | Classe principal: cria a banda e chama `apresentar()` |

Cada instrumento sobrescreve `tocar()` e `afinar()` do seu jeito. `apresentar()` trata todos como `InstrumentoMusical`, e o Java escolhe a implementação certa em tempo de execução.

## Como executar

Pré-requisitos: JDK 21 e Maven.

```bash
cd EscolaDeMusica
mvn compile exec:java
```

## Autor

[Iago Cordeiro Felix](https://github.com/IagoFel1x)
