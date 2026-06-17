# 🚗 Simulador de Carro

Projeto desenvolvido em Java como exercício de **Programação Orientada a Objetos (POO)** do Bootcamp DIO Java Spring AI, simulando as funções básicas de um carro via terminal.

## 📋 Sobre o Projeto

O simulador permite controlar um carro de forma interativa, respeitando regras reais de funcionamento como limites de velocidade por marcha, impedimento de ligar/desligar em movimento e validação de troca de marchas.

## ⚙️ Funcionalidades

- ✅ Ligar e desligar o carro
- ✅ Acelerar e desacelerar
- ✅ Virar para esquerda ou direita
- ✅ Verificar velocidade atual
- ✅ Trocar marcha (aumentar ou reduzir)
- ✅ Sair do carro com segurança

## 📏 Regras de Negócio

- O carro inicia **desligado**, na **marcha 1** e com **velocidade 0 km/h**
- Nenhuma ação pode ser realizada com o carro desligado
- O carro possui **6 marchas** e não é possível pular marchas
- Cada marcha possui um limite de velocidade:

| Marcha | Velocidade mínima | Velocidade máxima |
|--------|:-----------------:|:-----------------:|
| 0 (ponto morto) | — | não pode acelerar |
| 1ª | 0 km/h | 20 km/h |
| 2ª | 21 km/h | 40 km/h |
| 3ª | 41 km/h | 60 km/h |
| 4ª | 61 km/h | 80 km/h |
| 5ª | 81 km/h | 100 km/h |
| 6ª | 101 km/h | 120 km/h |

- O carro só pode ser desligado na **marcha 0** e com **velocidade 0 km/h**
- Só é possível sair do carro se ele estiver **desligado e parado**

## 🛠️ Tecnologias

- Java
- Orientação a Objetos (encapsulamento, atributos privados, getters/setters)

## 📂 Estrutura

```
├── Main.java    # Menu interativo e fluxo principal
└── Carro.java   # Classe com atributos e regras do carro
```

## ▶️ Como executar

```bash
javac Main.java Carro.java
java Main
```

## 📚 Conceitos praticados

- Encapsulamento
- Modificadores de acesso (`private`, `public`)
- Getters e métodos de ação
- Estruturas de controle (`while`, `switch`, `if/else`)
- Validações de estado e lógica de negócio
