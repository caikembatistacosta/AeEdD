public class ListaEstatica1 {

    private int tamanho;
    private int info[] = new int[10];

    public ListaEstatica1() {
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

    public int buscar(int valor) {
        for (int i = 0; i < info.length; i++) {
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

    }

    public int obterElemento(int posicao) {
        for (int i = 0; i < info.length; i++) {
            if (posicao == i) {
                return info[i];
            }
        }
        throw new IndexOutOfBoundsException("Posição(" + posicao + ") é maior que o array");
    }

    public boolean estaVazia() {
        if (tamanho == 0) {
            return false;
        } else {
            return true;
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

    public void inverter(){
        for (int i = info.length - 1; i >= 0; i--) {
            System.out.println(info[i]);
        }
    }

}
