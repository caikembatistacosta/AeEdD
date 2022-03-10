package Aula2;

public class ListaEstaticaGenerica<ClasseParametrizada> {

    private int tamanho;
    private ClasseParametrizada[] info;

    public ListaEstaticaGenerica() {

        this.tamanho = 0;
        this.info = (ClasseParametrizada[]) new Object[10];

    }

    public void inserir(ClasseParametrizada valor) {
        if (tamanho == info.length) {
            redimensionar();
        }
        info[tamanho] = valor;
        tamanho = tamanho + 1;
    }

    public void redimensionar() {
        ClasseParametrizada[] novo = (ClasseParametrizada[]) new Object[info.length + 10];
        for (int i = 0; i < tamanho - 1; i++) {
            novo[i] = info[i];
        }
        info = novo;
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
        int posicao = buscar(valor);
        if (posicao > -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public void liberar() {
		info = (ClasseParametrizada[]) new Object[10];
		tamanho = 0;
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

   /* public void inverter() {
        if (info[i] != 0) {
            for (int i = info.length - 1; i >= 0; i--) {
                System.out.println(info[i]);
            }
        }

    }*/

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
