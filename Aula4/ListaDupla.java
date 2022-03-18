package Aula4;

public class ListaDupla<T> {

    private NoListaDupla<T> primeiro;

    public ListaDupla(NoListaDupla<T> primeiro) {
        this.primeiro = primeiro;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T valor) {

        NoListaDupla<T> novo = new NoListaDupla<>();

        novo.setInfo(valor);
        novo.setProximo(primeiro);
        novo.setAnterior(null);

        if (primeiro == null) {
            primeiro.setAnterior(novo);
        }
        primeiro = novo;

    }

    public NoListaDupla<T> buscar(T valor) {

        NoListaDupla<T> p = this.primeiro;
        while (p != null) {
            if (p.getInfo().equals(valor)) {
                return p;
            }
            p = p.getProximo();

        }
        return null;
    }

    public void retirar(T valor) {

        NoListaDupla<T> p = buscar(valor);
        if (p == null) {
            if (primeiro == p) {
                primeiro = p.getProximo();
            } else {
                p.getAnterior().setProximo(p.getProximo());
            }
        }

        if (p.getProximo() == null) {
            p.getProximo().setAnterior(p.getAnterior());
        }
    }

    public void exibirOrdemInversa() {

    }

    public void liberar() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

}
