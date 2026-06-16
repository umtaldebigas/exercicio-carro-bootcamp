import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Você entrou dentro de seu carro.");

        Carro carro = new Carro();

        while (true) {
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar o carro");
            System.out.println("4. Desacelerar o carro");
            System.out.println("5. Virar para esquerda/direita");
            System.out.println("6. Verificar velocidade");
            System.out.println("7. Trocar Marcha");
            System.out.println("8. Sair");
            System.out.println("O que deseja fazer?(Digite sua opção em inteiro): ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (carro.getLigado() == true) {
                        System.out.println("O carro já está ligado!");
                    } else {
                        carro.ligar();
                        System.out.println("Ligando o carro...");
                    }
                break;

                case 2:
                    if (carro.getLigado() == false) {
                        System.out.println("O carro está desligado!");
                    } else if (carro.getVelocidadeAtual() > 0) {
                        System.out.println("Impossível desligar o carro em movimento!");
                    } else {
                        carro.desligar();
                        System.out.println("Desligando o carro...");
                    }
                break;

                case 3:
                    if (carro.getLigado() == false) {
                        System.out.println("Impóssivel acelerar com o carro desligado...");
                    } else  {
                        carro.acelerar();
                    }
                break;

                case 4:
                    if (carro.getLigado() == false) {
                        System.out.println("Impóssivel desacelerar com o carro desligado...");
                    } else {
                        carro.desacelerar();
                    }
                break;

                case 5:
                    if (carro.getLigado() == false) {
                        System.out.println("Impossível mudar a direção de um carro desligado...");
                    } else {
                        System.out.println("Qual direção deseja que o carro vire?");
                        System.out.println("1. Esquerda");
                        System.out.println("2. Direita");
                        int dir = sc.nextInt();
                        sc.nextLine();

                        switch (dir) {
                            case 1:
                                System.out.println("Virando para esquerda...");
                                carro.mudarEsquerdaDirecao();
                            break;

                            case 2:
                                System.out.println("Virando para direita...");
                                carro.mudarDireitaDirecao();
                            break;
                        }
                    }
                break;

                case 6:
                    if (carro.getLigado() == false) {
                        System.out.println("Impossível verificar o carro desligado...");
                    } else {
                        System.out.println("Velocidade atual do veículo: " + carro.getVelocidadeAtual() + "KM/H");
                    }
                break;

                case 7:
                    if (carro.getLigado() == false) {
                        System.out.println("Impossível trocar a marcha de um carro desligado...");
                    }
            }
        }
    }
}