package entities;

public class pessoaFisica extends Contribuinte {
	
	
	private Double gastoSaude;
	
	public pessoaFisica() {
		
	}

	public pessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}


	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		if (getRendaAnual() < 20000.00) {
			return getRendaAnual() * 0.15 - gastoSaude * 0.5 ;
		}
		else {
			return getRendaAnual() * 0.25 - gastoSaude * 0.5;
		}
	}
	
	
	
	

}
