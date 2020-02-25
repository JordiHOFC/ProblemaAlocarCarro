package provatecnica;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
public class leituraArquivo {
	public String nomeArquivo;
	
	public leituraArquivo(String nomeArq) {
		nomeArquivo=nomeArq;
	}
	
	public leituraArquivo() {
		
	}
	
	
	public int contaQtsLinhasArquivo() {
		int qtd=0;
		String nextLine = null;

		try {
			FileInputStream arquivo = new FileInputStream(nomeArquivo);
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br= new BufferedReader(input);
			LineNumberReader lineCounter = new LineNumberReader(br);
			
			while ((nextLine = lineCounter.readLine()) != null) {
				if (nextLine == null) {
					break;
				}else {
					qtd++;
				}
				
			}
			
		} catch (IOException done) {
			System.out.println(done.getMessage());
		}
		
		return qtd;
	}
	
	
	
	public dadosParaAlocação[] Leitura() {
		String linha;
		String [] palavras;
		int qtdPessoas;
		String tipoCarro;
		String datas[];
		int contador=0,qtdentradas=contaQtsLinhasArquivo();
		dadosParaAlocação[] novo;
		novo= new dadosParaAlocação[qtdentradas];
		
		try {
			FileInputStream arquivo = new FileInputStream(nomeArquivo);
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br= new BufferedReader(input);
			do{
				linha=br.readLine();
				if(linha!=null) {
					palavras=linha.split(":");
					novo[contador]=new dadosParaAlocação();
					for(int i=0;i<palavras.length;i++) {
						switch(i) {
							case 0:
								tipoCarro=palavras[i];
								novo[contador].setTipo(tipoCarro);
								break;
							case 1:
								qtdPessoas=Integer.parseInt(palavras[i].trim());
								novo[contador].setQtdPessoas(qtdPessoas);
								break;
							case 2:
								datas=palavras[i].split(",");
								novo[contador].setDatas(datas);
								break;
						}
					}
					contador++;
				}
			}while(linha!=null && contador<=qtdentradas);
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
		return novo;
	}
	
}
