package Aula3;

public class App {
    
    public static void main(String[] args) {
        
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        //System.out.println(lista.estaVazia());

        lista.inserir(5);
        System.out.println(lista.estaVazia());

    }

}
