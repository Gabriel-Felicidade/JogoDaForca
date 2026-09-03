# 🎮 Jogo da Forca em Java (Console)

Um jogo da forca clássico para console desenvolvido em Java, com foco em fundamentos da linguagem, estruturas de repetição, manipulação de texto/arrays e boas práticas de fluxo de controle.

---

## 📌 Sobre o Projeto

O projeto simula a clássica partida de jogo da forca via terminal interativo. O usuário visualiza o estado oculto da palavra, suas vidas restantes e a representação visual da forca em arte ASCII, inserindo palpites de letras rodada a rodada até descobrir o termo secreto ou esgotar suas chances.

### ✨ Funcionalidades
* **Renderização Dinâmica em ASCII:** Desenho da forca atualizado a cada vida perdida.
* **Histórico de Letras Chutadas:** Rastreamento de palpites anteriores para evitar chutes repetidos sem penalidade de vidas.
* **Validação de Entrada:** Tratamento para ignorar números e caracteres especiais, aceitando exclusivamente letras do alfabeto.
* **Espaçamento e Legibilidade:** Visualização amigável das letras descobertas (`_ E _ _ _`).
* **Tratamento de Maiúsculas/Minúsculas:** Conversão automática de entradas para garantir consistência.

---

## 🛠️ Conceitos de Java Aplicados

Este projeto foi construído para consolidar os seguintes pilares da programação em Java:

* **Tipos de Dados e Arrays:**
    * Uso de vetores primitivos (`char[]`) para manipular e revelar letras descobertas de forma mutável.
    * Compreensão da imutabilidade de `String` e conversões entre texto e vetores (`String.valueOf()`, `toCharArray()`).
* **Estruturas de Repetição e Controle de Fluxo:**
    * Loop `while` com condições compostas (`vidas > 0 && !jogoGanho`) para o ciclo de vida da partida.
    * Loops `for` aninhados para varredura de strings e arrays.
    * Cláusulas de guarda com `continue` para desvio e repetição limpa em entradas inválidas ou repetidas.
    * Estrutura `switch / case` para desenhar os estados da forca em arte ASCII.
* **Manipulação de Texto e I/O:**
    * Uso da classe `java.util.Scanner` para captura de fluxo no console (`System.in`).
    * Encadeamento de métodos de texto (`scanner.next().toUpperCase().charAt(0)`).
    * Métodos utilitários da classe `Character` (`Character.isLetter()`).
* **Modularização e Clean Code:**
    * Separação de responsabilidades em métodos estáticos auxiliares (`private static`) para validação de vitória, exibição formatada e desenho da forca.

---

## 🚀 Como Executar

### Pré-requisitos
* **Java Development Kit (JDK):** Versão 17 ou superior instalada.
* **IDE (Opcional):** IntelliJ IDEA, Eclipse, VS Code ou execução direta via terminal.

### Passo a Passo no IntelliJ IDEA
1. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git](https://github.com/SEU-USUARIO/SEU-REPOSITORIO.git)](https://github.com/Gabriel-Felicidade/JogoDaForca.git)](https://github.com/Gabriel-Felicidade/JogoDaForca.git)
2. Abra o IntelliJ IDEA e selecione Open (ou File > Open). 
3. Selecione a pasta raiz do projeto clonado.
4. Aguarde o IntelliJ indexar o projeto e configurar o JDK.
5. Localize o arquivo Main.java dentro da pasta src/. 
6. Clique com o botão direito no arquivo ou no ícone verde de Run (▶) ao lado do método main. 
7. O jogo será iniciado na aba Run / Terminal inferior da IDE.

## 👤 Autor

* GitHub: https://github.com/Gabriel-Felicidade
* LinkedIn: www.linkedin.com/in/gabrielfelicidade