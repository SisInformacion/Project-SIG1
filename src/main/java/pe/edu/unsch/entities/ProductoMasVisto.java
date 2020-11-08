package pe.edu.unsch.entities;
// Generated 8 Nov 2020, 01:58:22 by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductoMasVisto generated by hbm2java
 */
@Entity
@Table(name = "producto_mas_visto", catalog = "marketplacebd_test")
public class ProductoMasVisto implements java.io.Serializable {

	private int idproductovisto;
	private Persona persona;
	private Producto producto;

	public ProductoMasVisto() {
	}

	public ProductoMasVisto(int idproductovisto, Persona persona, Producto producto) {
		this.idproductovisto = idproductovisto;
		this.persona = persona;
		this.producto = producto;
	}

	@Id

	@Column(name = "idproductovisto", unique = true, nullable = false)
	public int getIdproductovisto() {
		return this.idproductovisto;
	}

	public void setIdproductovisto(int idproductovisto) {
		this.idproductovisto = idproductovisto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpersona", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
