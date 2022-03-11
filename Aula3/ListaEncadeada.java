package Aula3;

public class ListaEncadeada<T> {

    private NoLista<T> primeiro;

    public ListaEncadeada() {

        this.primeiro = null;

    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {

        NoLista novo = new NoLista();
        novo.info = (int) info;
        novo.proximo = primeiro;
        this.primeiro = novo;

    }

    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        } else {
            return false;

        }
    }

    public NoLista<T> buscar(T info) {

        NoLista<T> p = primeiro;
        while (p != null) {
            if (p.info.equals(info)) {
                return p;
            }
            p = p.proximo;

        }
        return null;

    }

    public void retirar(T info) {

        NoLista anterior = null;
        NoLista p = primeiro;

        while ((p != null) && (!p.info.equals(info))) {
            anterior = p;
            p = p.proximo;

        }
        if (p != null) {
            if (anterior == null) {
                this.primeiro = p.getProximo();
            } else {
                anterior.proximo = p.getProximo();
            }
        }
    }

    public int obterElemento() {

        return 0;
    }

    /*public NoLista<T> obterNo(int idx) {

    }*/

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
