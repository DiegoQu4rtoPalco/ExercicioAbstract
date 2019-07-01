package entities;

public class pessoaJuridica extends Contribuinte {
	
	private Integer numeroFuncionario;
	
	public pessoaJuridica() {
		
	}

	public pessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionario) {
		super(name, rendaAnual);
		this.numeroFuncionario = numeroFuncionario;
	}

	public Integer getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(Integer numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	@Override
	public double imposto() {
		if (numeroFuncionario > 10) {
			return getRendaAnual() * 0.14;
		}
		else {
			return getRendaAnual() * 0.16;
		}
	}
	
	

}
