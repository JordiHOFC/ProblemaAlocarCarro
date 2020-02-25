package provatecnica;

public class dadosParaAlocação {
	public String tipo;
	public int qtdPessoas;
	public String datas[];
	
	
	public dadosParaAlocação(String tipo, int qtdPessoas, String[] datas) {
		super();
		this.tipo = tipo;
		this.qtdPessoas = qtdPessoas;
		this.datas = datas;
	}
	public dadosParaAlocação() {}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQtdPessoas() {
		return qtdPessoas;
	}
	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public String[] getDatas() {
		return datas;
	}
	public void setDatas(String[] datas) {
		this.datas = datas;
	}
	
}
