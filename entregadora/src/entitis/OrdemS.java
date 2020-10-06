package entitis;


public class OrdemS {
	
	private Product pord;
	private Double price;
	private Integer quanti;
	private String name;
	
	public OrdemS() {
	}
	
	public OrdemS( Double price, Integer quanti, Product pord, String name) {
		this.pord = pord;
		this.price = price;
		this.quanti = quanti;
		this.name = name;
	}
	


	public Product getPord() {
		return pord;
	}
	
	public void setPord(Product pord) {
		this.pord = pord;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuanti() {
		return quanti;
	}

	public void setQuanti(Integer quanti) {
		this.quanti = quanti;
	}
	
	public Double subTotal() {
		return price*quanti;
	}
	
	public String getName() {
		return name;
	}



	
	
	
	


	}


