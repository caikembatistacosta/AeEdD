public class ListaEstastica {

    private int tamanho;
    private int info[] = new int[10];

    public ListaEstastica() {
        this.info = new int[10];
        this.tamanho = 0;
    }
    // construtor da classe. Deve criar um vetor para guardar os dados e estabelecer
    // que a lista está vazia;

    public void redimensionar() {
        int[] novo;
        int novoTamanho = info.length + 10;
        novo = new int[novoTamanho];
        for (int i = 0; i < tamanho - 1; i++) {

            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(int valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho = tamanho + 1;
    }

    public void exibir() {
        for (int i = 0; i < info.length; i++) {
            System.out.println(info[i]);
        }
    }

    public void retirar(int valor) {
        int[] novo;
        novo = new int[info.length];
        int novoContador = 0;
        for (int i = 0; i < tamanho - 1; i++) {
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
        redimensionar();
    }

    public int obterElemento(int posicao) {
        if (info.length < posicao) {
            throw new IndexOutOfBoundsException("Posição(" + posicao + ") é maior que o array");
        }
        return info[posicao];
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

}
