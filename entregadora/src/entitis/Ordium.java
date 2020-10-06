package entitis;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitis.Enum.Ordem;

public class Ordium {
	private List<OrdemS> itens = new ArrayList<>();
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date data = new Date();
	private Ordem or;
	private Cliente cli;
	
	public Ordium(Date data, Ordem or, Cliente cli) {
		this.data = data;
		this.or = or;
		this.cli = cli;
	}


	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Ordem getOr() {
		return or;
	}

	public void setOr(Ordem or) {
		this.or = or;
	}

	public Cliente getCli() {
		return cli;
	}

	public void setCli(Cliente cli) {
		this.cli = cli;
	}
	
	public List<OrdemS> getItens() {
		return itens;
	}

	public void removeProduct(OrdemS item) {
		itens.remove(item);
	}

	public void addProduct(OrdemS item) {
		itens.add(item);
	
	}
	
	public Double total () {
		double som = 0;
		
		for(OrdemS uf : itens) {
			som+= uf.subTotal();
		}
		
		return som;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Dados Do cliente: ");
		sb.append(cli);
		sb.append("\nDados do pedido");
		int i=0;
		for(OrdemS uf : itens) {
			sb.append(String.format("\nSub total do item #"+(i+1)+": "));
			sb.append(uf.subTotal());
			i++;
		}
		sb.append("\nData do pedido: "+sdf.format(data));
		sb.append(String.format("\nValor total: %.2f ",total()));
		
		return sb.toString();
	}
	
	






	
	
	
	


	
	
	
	
	
}
