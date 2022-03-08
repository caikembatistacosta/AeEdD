public class ListaEstatica {

    private int tamanho;
    private ClasseParametrizada[] info;

    public ListaEstatica() {

        this.tamanho = 0;
        this.info = (ClasseParametrizada[]) new Object[10];

    }

    public void redimensionar() {

        ClasseParametrizada novo[];
        int novoTamanho = info.length + 10;
        novo = new ClasseParametrizada[novoTamanho];
        for (int i = 0; i < tamanho - 1; i++) {
            novo[i] = info[i];
        }
        info = novo;
    }

    public void inserir(ClasseParametrizada valor) {

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

    public int buscar(ClasseParametrizada valor) {
        for (int i = 0; i < info.length; i++) {
            if (valor == info[i]) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(ClasseParametrizada valor) {
        ClasseParametrizada novoArray[] = new ClasseParametrizada[info.length];
        for (int posicao = 0; posicao < info.length; posicao++) {
            if (valor != info[posicao]) {
                novoArray[posicao] = info[posicao];
            }
        }
        tamanho = novoArray.length;
    }

    public void liberar() {
        info = new ClasseParametrizada[10];
    }

    public ClasseParametrizada obterElemento(int posicao) {
        for (int i = 0; i < info.length; i++) {
            if (posicao == i) {
                return info[i];
            }
        }
        throw new IndexOutOfBoundsException("Posição(" + posicao + ") é maior que o array");

    }

    public boolean estaVazio() {
        if (tamanho == 0) {
            return true;
        } else
            return false;
        // [11,22,33,44] == 0
    }

    public int getTamanho() {
        return tamanho;
    }



    public void inverter() {
        for (int i = info.length - 1; i >= 0; i--) {
            System.out.println(info[i]);
        }

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
