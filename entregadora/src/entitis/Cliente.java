package entitis;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private Date birth;
	private String email;
	
	public Cliente(String name, String email, Date birth) {
		this.name = name;
		this.birth = birth;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nClient:\n name: " + name + "(" + sdf.format(birth) + ") - " + email + "";
	}
	
	
	
	

}
