package MyFood.Models;

import MyFood.Exceptions.*;

public class Produto {
    int id; //id do produto
    String nome;
    float valor;
    String categoria;
    int emp; //id da empresa

    public Produto(int id,String name,float valor,String categ,int emp){
        this.id=id;
        this.nome=name;
        this.valor=valor;
        this.categoria=categ;
        this.emp=emp;
    }

    //Métodos para chamar os Atributos do Produto
    public String getNome(){
        return this.nome;
    }
    public float getValor(){
        return this.valor;
    }
    public String getCateg(){
        return this.categoria;
    }
    //Métodos para a função de Editar Produto
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setValor(float valor){
        this.valor=valor;
    }
    public void setCateg(String categoria){
        this.categoria=categoria;
    }
    //Id do Produto e Id da Empresa respectivamente
    public int getId(){
        return this.id;
    }
    public int getEmp(){
        return this.emp;
    }

}
