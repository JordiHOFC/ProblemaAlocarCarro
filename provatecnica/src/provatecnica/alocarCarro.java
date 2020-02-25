package provatecnica;

import javax.swing.JOptionPane;

public class alocarCarro {
	public leituraArquivo entrada;
	public dadosParaAlocação [] dadosClientes;
	
	public String alocar(int qtdPessoas) {
		if(qtdPessoas >0 && qtdPessoas<=2) {
			JOptionPane.showMessageDialog(null, "FERRARI:WhestCar");
			return "FERRARI:WhestCar";
		}
		if(qtdPessoas>2 && qtdPessoas<=4) {
			JOptionPane.showMessageDialog(null, "MINI-COOPER:SouthCar");
			return "MINI-COOPER:SouthCar";
		}
		if(qtdPessoas>4 && qtdPessoas<=7) {
			JOptionPane.showMessageDialog(null, "NAVIGATOR:NorthCar");
			return "NAVIGATOR:NorthCar";
		}else {
			return null;
		}
		
		
	}
	
	public static void main(String args[]) {
		alocarCarro alocarCarros=new alocarCarro();
		alocarCarros.entrada=new leituraArquivo("entrada.txt");
		alocarCarros.dadosClientes=alocarCarros.entrada.Leitura();
		for(int i=0;i<alocarCarros.dadosClientes.length;i++) {
			alocarCarros.alocar(alocarCarros.dadosClientes[i].qtdPessoas);
		}
	}

}
