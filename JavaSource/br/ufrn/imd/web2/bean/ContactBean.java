package br.ufrn.imd.web2.bean;

import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.web2.model.Contact;

public class ContactBean {

	private Contact newContact = new Contact();
	private List<Contact> contactList;
	private Integer contactBox;
	private List<Contact> userList;
	
	public ContactBean(){
		
		contactList = new ArrayList<Contact>();
		
		Contact c1 = new Contact();
		c1.setId(1);
		c1.setNome("Victor Vilar Rapozo");
		c1.setTelefone("1111111");
		c1.setCelular("84988013526");
		c1.setEmail("victor_vilar@hotmail.com");
		c1.setEndereco("Rua das Casas");
		c1.setIdUser(1);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(2);
		c1.setNome("Cephas Alves da Silveira Barreto");
		c1.setTelefone("2222222");
		c1.setCelular("2013023300");
		c1.setEmail("cephasax@hotmail.com");
		c1.setEndereco("Rua das Pontas");
		c1.setIdUser(1);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(3);
		c1.setNome("Ramon Santos Malaquias");
		c1.setTelefone("3333333");
		c1.setCelular("2013018258");
		c1.setEmail("rsanttos1@hotmail.com");
		c1.setEndereco("Rua das Nortes");
		c1.setIdUser(1);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(4);
		c1.setNome("Carlos Eduardo da Silva");
		c1.setTelefone("4444444");
		c1.setCelular("849xxxxxxx");
		c1.setEmail("kaduardo@imd.ufrn.br");
		c1.setEndereco("Rua das Arvores");
		c1.setIdUser(1);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(5);
		c1.setNome("Samanta Ferreira Aires");
		c1.setTelefone("5555555");
		c1.setCelular("2013023679");
		c1.setEmail("samantabti@gmail.com");
		c1.setEndereco("Rua dos Passaros");
		c1.setIdUser(1);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(6);
		c1.setNome("ANDREZA POLLYANA BERNARDINO LIMA");
		c1.setTelefone("6666666");
		c1.setCelular("2010048601");
		c1.setEmail("andrezapbl1@gmail.com");
		c1.setEndereco("Rua dos Bosques");
		c1.setIdUser(2);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(7);
		c1.setNome("HUGO ANDRÉ GOMES GALVAO");
		c1.setTelefone("7777777");
		c1.setCelular("2013022770");
		c1.setEmail("hugoandregg@gmail.com");
		c1.setEndereco("Rua dos Limoes");
		c1.setIdUser(2);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(8);
		c1.setNome("JEFFERSSON GALVÃO ARAUJO");
		c1.setTelefone("8888888");
		c1.setCelular("2013051065");
		c1.setEmail("jefferssondeveloper@gmail.com");
		c1.setEndereco("Rua dos Gothans");
		c1.setIdUser(2);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(9);
		c1.setNome("RAFAEL DUARTE DE OLIVEIRA");
		c1.setTelefone("9999999");
		c1.setCelular("2015002865");
		c1.setEmail("rafaelduarte100@gmail.com");
		c1.setEndereco("Rua dos Doces");
		c1.setIdUser(2);
		contactList.add(c1);
		
		c1 = new Contact();
		c1.setId(10);
		c1.setNome("WEKSLEY DAS CHAGAS CAVALCANTE");
		c1.setTelefone("1010101");
		c1.setCelular("2014074224");
		c1.setEmail("weksley.cavalcante@gmail.com");
		c1.setEndereco("Rua dos Casas");
		c1.setIdUser(3);
		contactList.add(c1);
	
	}

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		this.contactList = contactList;
	}

	public Integer getContactBox() {
		return contactBox;
	}

	public void setContactBox(Integer contactBox) {
		this.contactBox = contactBox;
	}
	
	public Contact searchContact(){
		for(Contact elemento: contactList){
			if (elemento.getId()==getContactBox()){
					return elemento;
			}
		}
		return null;
	}

	public Contact getNewContact() {
		return newContact;
	}

	public void setNewContact(Contact newContact) {
		this.newContact = newContact;
	}
	
	public String addContact() {
		contactList.add(newContact);
		return "contactList";
	}
	
	public List<Contact> makeUserList(int a){
		userList = new ArrayList<Contact>();
		for(Contact elemento: contactList){
			if(elemento.getIdUser()==a){
				userList.add(elemento);
			}
		}
		return userList;
	}

	public List<Contact> getUserList() {
		return userList;
	}

	public void setUserList(List<Contact> userList) {
		this.userList = userList;
	}	
	
	public String deleteContact(){
		for(Contact elemento: contactList){
			if(elemento.getId()==getContactBox()){
				contactList.remove(elemento);
				return null;
			}
		}
		return null;
	}
	
	public String editContact(){
		for(Contact elemento: contactList){
			if(elemento.getId()==getContactBox()){
				//Edite
				break;
			}
		}
		return "contactList";
	}
}
