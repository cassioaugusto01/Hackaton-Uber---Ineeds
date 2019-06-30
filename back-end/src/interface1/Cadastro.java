package interface1;

public class Cadastro {

     
    private String nome;
    private int idade;
    private String sexo;
    private String tipo_cadeira;        
    private String cidade; 
    private String estado;
    private int telefone;

   

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

    public String getTipo_cadeira() {
        return tipo_cadeira;
    }

    public void setTipo_cadeira(String tipo_cadeira) {
        this.tipo_cadeira = tipo_cadeira;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
    
    
    
    
}
