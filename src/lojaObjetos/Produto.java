package lojaObjetos;

public class Produto {
	
	private String nome;
	private Double preco;
	private Integer quant;
	private Integer id;
	
	public Produto() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuant() {
		return quant;
	}

	public void setQuant(Integer quant) {
		this.quant = quant;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quant=" + quant + ", id=" + id + "]";
	}

	
	
	
	

}
