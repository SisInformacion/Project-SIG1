package pe.edu.unsch.entities;
// Generated 8 Nov 2020, 01:58:22 by Hibernate Tools 5.1.10.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ProductoDemandado generated by hbm2java
 */
@Entity
@Table(name = "producto_demandado", catalog = "marketplacebd_test")
public class ProductoDemandado implements java.io.Serializable {

	private int idproductoDemandado;
	private Date fechaVencimiento;
	private long idproducto;
	private int idcategoria;

	public ProductoDemandado() {
	}

	public ProductoDemandado(int idproductoDemandado, long idproducto, int idcategoria) {
		this.idproductoDemandado = idproductoDemandado;
		this.idproducto = idproducto;
		this.idcategoria = idcategoria;
	}

	public ProductoDemandado(int idproductoDemandado, Date fechaVencimiento, long idproducto, int idcategoria) {
		this.idproductoDemandado = idproductoDemandado;
		this.fechaVencimiento = fechaVencimiento;
		this.idproducto = idproducto;
		this.idcategoria = idcategoria;
	}

	@Id

	@Column(name = "idproducto_demandado", unique = true, nullable = false)
	public int getIdproductoDemandado() {
		return this.idproductoDemandado;
	}

	public void setIdproductoDemandado(int idproductoDemandado) {
		this.idproductoDemandado = idproductoDemandado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_vencimiento", length = 19)
	public Date getFechaVencimiento() {
		return this.fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	@Column(name = "idproducto", nullable = false)
	public long getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}

	@Column(name = "idcategoria", nullable = false)
	public int getIdcategoria() {
		return this.idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

}
