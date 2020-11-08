package pe.edu.unsch.entities;
// Generated 8 Nov 2020, 01:58:22 by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CuponDescuento generated by hbm2java
 */
@Entity
@Table(name = "cupon_descuento", catalog = "marketplacebd_test")
public class CuponDescuento implements java.io.Serializable {

	private Integer idcupon;
	private Producto producto;
	private BigDecimal valorDescuento;
	private Set<Carrito> carritos = new HashSet<Carrito>(0);

	public CuponDescuento() {
	}

	public CuponDescuento(Producto producto, BigDecimal valorDescuento) {
		this.producto = producto;
		this.valorDescuento = valorDescuento;
	}

	public CuponDescuento(Producto producto, BigDecimal valorDescuento, Set<Carrito> carritos) {
		this.producto = producto;
		this.valorDescuento = valorDescuento;
		this.carritos = carritos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idcupon", unique = true, nullable = false)
	public Integer getIdcupon() {
		return this.idcupon;
	}

	public void setIdcupon(Integer idcupon) {
		this.idcupon = idcupon;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto", nullable = false)
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "valor_descuento", nullable = false, precision = 6)
	public BigDecimal getValorDescuento() {
		return this.valorDescuento;
	}

	public void setValorDescuento(BigDecimal valorDescuento) {
		this.valorDescuento = valorDescuento;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cuponDescuento")
	public Set<Carrito> getCarritos() {
		return this.carritos;
	}

	public void setCarritos(Set<Carrito> carritos) {
		this.carritos = carritos;
	}

}
