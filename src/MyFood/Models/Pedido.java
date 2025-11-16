package MyFood.Models;

import MyFood.Exceptions.*;
import java.util.*;

public class Pedido {
    int numero;
    int idcliente;
    int idempresa;
    String cliente;
    String empresa;
    String status; //Aberto ou fechado
    //Lista de Produtos adicionados
    private List<Produto> buyed;

    public Pedido(int num, Usuario cliente,Restaurante empresa){
        this.numero=num;
        this.idcliente=cliente.getId();
        this.idempresa=empresa.getId();
        this.cliente=cliente.getNome();
        this.empresa=empresa.getNome();
        this.status="aberto";
        this.buyed=new ArrayList<>();
    }

    public int getNumero(){
        return this.numero;
    }
    public int getIdcliente(){
        return this.idcliente;
    }
    public int getIdempresa(){
        return this.idempresa;
    }
    public String getCliente(){
        return this.cliente;
    }
    public String getEmpresa(){
        return this.empresa;
    }
    public String getEstado(){
        return this.status;
    }
    //Retornar a Lista com os Nomes dos Produtos
    public List<Produto> getProduto(){
        return this.buyed;
    }
    //Fechar o Pedido
    public void close(){
        this.status="preparando";
    }
    //Pegar cada produto na lista, e somar o valor total a pagar
    public float calcular(){
        float total=0;
        for(Produto z: buyed){
            total+=z.getValor();
        }
        return total;
    }
}
