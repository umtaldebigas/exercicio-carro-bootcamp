public class Carro {
    private int velocidadeAtual;
    private int marcha;
    private boolean ligado;
    private String direcao;


    public Carro() {
        this.velocidadeAtual = 0;
        this.marcha = 1;
        this.ligado = false;
    }

    public void ligar(){
        this.ligado = true;
    }

    public void desligar(){
        this.ligado = false;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void acelerar() {
        if (marcha == 0){
            System.out.println("Impossivel acelerar na marcha 0");
            return;
        } else if (marcha == 1 && velocidadeAtual >= 20) {
            System.out.println("Impossivel acelerar mais do que 20KM/H na primeira marcha");
            return;
        } else if (marcha == 2 && velocidadeAtual >= 40) {
            System.out.println("Impossivel acelerar mais do que 40KM/H na segunda marcha");
            return;
        } else if (marcha == 3 && velocidadeAtual >= 60) {
            System.out.println("Impossivel acelerar mais do que 60KM/H na terceira marcha");
            return;
        } else if (marcha == 4 && velocidadeAtual >= 80) {
            System.out.println("Impossivel acelerar mais do que 80KM/H na quarta marcha");
            return;
        } else if (marcha == 5 && velocidadeAtual >= 100) {
            System.out.println("Impossivel acelerar mais do que 100KM/H na quinta marcha");
            return;
        } else if (marcha == 6 && velocidadeAtual >= 120) {
            System.out.println("Impossivel acelerar mais do que 120KM/H na sexta marcha");
            return;
        }

        velocidadeAtual = velocidadeAtual + 5;
        System.out.println("Velocidade atual: " + getVelocidadeAtual() + "KM/H");
    }

    public void desacelerar() {
        if (marcha == 0){
            System.out.println("Impossivel desacelerar na marcha 0");
            return;
        } else if (marcha == 1 && velocidadeAtual == 0) {
            System.out.println("Impossivel desacelerar mais do que 0 KM/H");
            return;
        } else if (marcha == 2 && velocidadeAtual == 20) {
            System.out.println("Impossivel desacelerar mais do que 20 KM/H na segunda marcha");
            return;
        } else if (marcha == 3 && velocidadeAtual == 40) {
            System.out.println("Impossivel desacelerar mais do que 40 KM/H na terceira marcha");
            return;
        } else if (marcha == 4 && velocidadeAtual == 60) {
            System.out.println("Impossivel desacelerar mais do que 60 KM/H na quarta marcha");
            return;
        } else if (marcha == 5 && velocidadeAtual >= 80) {
            System.out.println("Impossivel desacelerar mais do que 80 KM/H na quinta marcha");
            return;
        } else if (marcha == 6 && velocidadeAtual >= 100) {
            System.out.println("Impossivel desacelerar mais do que 100 KM/H na sexta marcha");
            return;
        }

        velocidadeAtual = velocidadeAtual - 1;
        System.out.println("Velocidade atual: " + getVelocidadeAtual() + "KM/H");
    }

    public void aumentarMarcha() {
        this.marcha++;
    }

    public void desaumentarMarcha() {
        this.marcha--;
    }

    public void mudarEsquerdaDirecao() {
        this.direcao = "Esquerda";
    }

    public void mudarDireitaDirecao() {
        this.direcao = "Direita";
    }

    public boolean getLigado() {
        return ligado;
    }
}
