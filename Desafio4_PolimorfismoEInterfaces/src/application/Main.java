package application;


import entities.Veiculo;
import entities.Moto;
import entities.Carro;
import entities.AcaoVeiculo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculos=new ArrayList<>();
        Veiculo v1= new Moto("Honda Bis","Frenagem rrrrrr","RamRaaammmmmm","Trum trum");
        Veiculo v2= new Carro("Gol", "RRRRRRRRRRRRR","RamRamRam","RamRamRam");
        Veiculo v3= new Moto("Harley","Arrasrrrrrr","RamRaaammmmmm","Trum trum");
        veiculos.add(v1);
        veiculos.add(v2);
        veiculos.add(v3);
        for (int i=0; i<veiculos.size();i++){
            System.out.println(veiculos.get(i).ligarVeiculo());
            System.out.println(veiculos.get(i).acelerarVeiculo());
            System.out.println(veiculos.get(i).frearVeiculo());
        }

    }
}
