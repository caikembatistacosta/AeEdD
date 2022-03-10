package Aula2;

public class App {
    public static void main(String[] args) throws Exception {

        ListaEstaticaGenerica<Integer> lista = new ListaEstaticaGenerica<>();

        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);
        //lista.inverter();
        lista.exibir();
        System.out.println(lista.buscar(15));




        

    }
}