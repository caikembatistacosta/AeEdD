package Aula1;

public class ListaEstatica {

    private int tamanho;
    private int info[] = new int[10];

    public ListaEstatica() {
        this.info = new int[10];
        this.tamanho = 0;
    }
    // construtor da classe. Deve criar um vetor para guardar os dados e estabelecer
    // que a lista está vazia;

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho++;
    }

    public void redimensionar() {
        int[] novo;
        int novoTamanho = info.length + 10;
        novo = new int[novoTamanho];
        for (int i = 0; i < info.length; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(int valor) {
        for (int i = 0; i <tamanho; i++) {
            if (valor == info[i]) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor) {
        int[] novo;
        novo = new int[info.length];
        int novoContador = 0;
        for (int i = 0; i < tamanho; i++) {
            if (info[i] != valor) {
                novo[novoContador] = info[i];
                novoContador++;
            }
        }
        tamanho = novoContador;
        info = novo;
    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;

    }

    public int obterElemento(int posicao) {
		if (posicao >= 0 && (posicao < tamanho)) {
			return info[posicao];
		} else {
			throw new IndexOutOfBoundsException();
		}
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    /*
     * public void inverter(){
     * for (int i = info.length - 1; i >= 0; i--) {
     * System.out.println(info[i]);
     * }
     * }
     */

}
