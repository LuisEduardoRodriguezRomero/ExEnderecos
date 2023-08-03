import java.util.List;

public class Pessoa {

    public String nome;
    public int idade;
    public List<Endereco> enderecos;



    public Pessoa(String nome, int idade,List<Endereco> enderecos){
        this.nome = nome;
        this.idade = idade;
        this.enderecos =enderecos;

    }



    public void setNome(String nome){
        nome = nome;
    }

    public void setIdade(int idade){
        idade = idade;
    }

    public String getNome(){

        return  nome;
    }

    public int getIdade(){

        return  idade;
    }

    public List<Endereco> getEnderecos(){

        return enderecos;
    }


    @Override
    public String toString() {
        return "Nome: " + getNome() + " " + "Idade: " + idade + " Enderecos: " + getEnderecos() +  "\n";
    }



}