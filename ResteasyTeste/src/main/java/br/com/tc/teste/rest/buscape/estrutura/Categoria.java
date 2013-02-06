package br.com.tc.teste.rest.buscape.estrutura;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;

public class Categoria {

	@XmlAttribute
	private boolean hasOffer;

	@XmlAttribute
	private boolean isFinal;

	@XmlAttribute
	private int parentCategoryId;

	@XmlAttribute
	@XmlID
	private int id;
	
	private String thumbnail;

	public boolean isHasOffer() {
		return hasOffer;
	}
	public void setHasOffer(boolean hasOffer) {
		this.hasOffer = hasOffer;
	}
	public boolean isFinal() {
		return isFinal;
	}
	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}
	public int getParentCategoryId() {
		return parentCategoryId;
	}
	public void setParentCategoryId(int parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


}
