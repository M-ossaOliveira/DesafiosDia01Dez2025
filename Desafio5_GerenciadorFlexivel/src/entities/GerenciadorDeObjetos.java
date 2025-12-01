package entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeObjetos<T> {
    public List<T> listaDados=new ArrayList<>();

    public void adicionaObjeto(T novoObjeto){
        if(novoObjeto!=null){
            listaDados.add(novoObjeto);
            //System.out.println("Objeto adicionado"+novoObjeto.getClass().getSimpleName()+ "com sucesso");
        }else{
            System.err.println("Objeto nulo");
        }
    }

    public void listarDados() {
        for(T item: listaDados){
            System.out.println(item.toString());
        }
    }
}
