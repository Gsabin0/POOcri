package poocri;
public class Pessoa {
    //atributos
    private String nome;
    private int idade;
    private String sexo;
    private End endereço;
    //construtor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    
    //metodos 
    public void Status(){
        System.out.println("-------------");
        System.out.println("nome: "+this.getNome()+"\nidade: "+this.getIdade()+
                "\nsexo: "+this.getIdade()+"\nCEP: "+this.endereço.getCep()+"\nlougadouro: "+this.endereço.getLougador()+
                "\nnumero: "+this.endereço.getNumero());
    }
    //metodos ospeciais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public End getEndereço() {
        return endereço;
    }

    public void setEndereço(End endereço) {
        this.endereço = endereço;
    }
    
}
