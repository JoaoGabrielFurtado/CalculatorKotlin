# Calculadora Android (Kotlin) 📱

Este repositório contém o projeto de uma aplicação de Calculadora desenvolvida nativamente para Android. O projeto foi realizado como parte das atividades avaliativas da **Faculdade**, na disciplina de Desenvolvimento de Dispositivos Móveis (DDM).

## 📝 Sobre o Projeto

O objetivo deste trabalho foi consolidar os conhecimentos em desenvolvimento Android, focando na construção de interfaces de utilizador (UI) através de XML e na implementação de lógica de programação em **Kotlin**. A aplicação replica as funcionalidades de uma calculadora padrão, respeitando as regras matemáticas de precedência e oferecendo uma experiência de utilizador fluida.

## ⚙️ Especificações Técnicas e Funcionalidades

O projeto foi desenvolvido seguindo as seguintes especificações:

* **Linguagem:** Kotlin.
* **IDE:** Android Studio.
* **Interface (UI):**
    * Uso de `ConstraintLayout` para a estrutura principal.
    * Implementação de `GridLayout` para a organização simétrica dos botões.
    * Estilização personalizada de botões (bordas arredondadas, cores de estado e feedback visual).
    * Visor (`TextView`) dinâmico com ajuste de scroll/tamanho.
* **Lógica de Negócio:**
    * **Operações Básicas:** Adição, Subtração, Multiplicação e Divisão.
    * **Precedência de Operadores:** Implementação de algoritmo para respeitar a ordem matemática (multiplicação e divisão são calculadas antes de soma e subtração).
    * **Manipulação de Strings:** Lógica para tratamento de entradas (ex: evitar múltiplos pontos decimais, impedir operadores duplicados).
    * **Funcionalidade "Apagar" (Backspace):** Remoção do último caractere digitado (`dropLast`).
    * **Funcionalidade "Limpar" (Clear):** Reinicialização completa do estado da calculadora.

## 🛠️ Como Executar

1.  Clone este repositório.
2.  Abra o projeto no **Android Studio**.
3.  Aguarde a sincronização do Gradle.
4.  Execute a aplicação num Emulador Android ou num dispositivo físico conectado.

## 📺 Demonstração

Confira o funcionamento da aplicação e a explicação do código no vídeo abaixo:

[**Assista à Demonstração no YouTube**](https://youtu.be/-XMnW8cEZSw)