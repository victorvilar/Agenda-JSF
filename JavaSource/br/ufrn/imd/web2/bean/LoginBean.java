package br.ufrn.imd.web2.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import br.ufrn.imd.web2.model.Login;

public class LoginBean {

	private List<Login> loginList;
	private String dbUsername;
	private String dbPassword;
	private Integer dbIdUser;
	
	public LoginBean() {
		loginList = new ArrayList<Login>();
		
		Login l1 = new Login();
		l1.setId(1);
		l1.setUser("Vilar");
		l1.setPassword("Vilar");
		loginList.add(l1);
		
		l1 = new Login();
		l1.setId(2);
		l1.setUser("Teste");
		l1.setPassword("123");
		loginList.add(l1);
		
		l1 = new Login();
		l1.setId(3);
		l1.setUser("Piao");
		l1.setPassword("123");
		loginList.add(l1);
		
	}
	
	public List<Login> getLoginList() {
		return loginList;
	}

	public void setLoginList(List<Login> loginList) {
		this.loginList = loginList;
	}

	public String getDbUsername() {
		return dbUsername;
	}

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}

	public String authenticate(){
    	
		for(Login elemento: loginList){
			// Successful login
	    	if (dbUsername.equals(elemento.getUser()) && dbPassword.equals(elemento.getPassword())) {
	    		dbIdUser = elemento.getId();
	    		return "contactList";
	    	}	
		}
		// Set login ERROR
    	FacesMessage msg = new FacesMessage("Login error!", "ERROR MSG");
    	msg.setSeverity(FacesMessage.SEVERITY_ERROR);
    	FacesContext.getCurrentInstance().addMessage(null, msg);
		return "loginError";
	}

	public Integer getDbIdUser() {
		return dbIdUser;
	}

	public void setDbIdUser(Integer dbIdUser) {
		this.dbIdUser = dbIdUser;
	}
	
	public String logout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "index";
	}
}
