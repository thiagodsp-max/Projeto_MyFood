package MyFood.Models;

import MyFood.Exceptions.*;

public class Dono extends Usuario {
    private String endereco;
    private String cpf;

    //Construtor de Classe
    public Dono(int us, String name, String mail, String pass, String adress, String cpf){
        super(us,name, mail,pass);
        this.endereco=adress;
        this.cpf=cpf;
    }

    public String getEndereco() {
        return this.endereco;
    }
    public String getCpf() {
        return this.cpf;
    }

}
