package pe.edu.unsch.entities;
// Generated 19-nov-2020 18:08:16 by Hibernate Tools 5.1.10.Final

import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Pago generated by hbm2java
 */
@Entity
@Table(name = "pago", catalog = "marketplacebd_test")
public class Pago implements java.io.Serializable {

	private Integer idpago;
	private Tarjeta tarjeta;
	private String tipoPago;
	private Date fechaPago;
	private BigDecimal monto;
	private BigDecimal impuesto;
	private Set<DomiciliacionBancaria> domiciliacionBancarias = new HashSet<DomiciliacionBancaria>(0);
	private Set<TransferenciaBancaria> transferenciaBancarias = new HashSet<TransferenciaBancaria>(0);
	private Set<ContraReembolso> contraReembolsos = new HashSet<ContraReembolso>(0);
	private Set<Notificacion> notificacions = new HashSet<Notificacion>(0);
	private Set<Boleta> boletas = new HashSet<Boleta>(0);
	private Set<Venta> ventas = new HashSet<Venta>(0);
	private Set<Pedido> pedidos = new HashSet<Pedido>(0);
	private Set<PagoPaypal> pagoPaypals = new HashSet<PagoPaypal>(0);

	public Pago() {
	}

	public Pago(Tarjeta tarjeta, String tipoPago, Date fechaPago, BigDecimal monto, BigDecimal impuesto) {
		this.tarjeta = tarjeta;
		this.tipoPago = tipoPago;
		this.fechaPago = fechaPago;
		this.monto = monto;
		this.impuesto = impuesto;
	}

	public Pago(Tarjeta tarjeta, String tipoPago, Date fechaPago, BigDecimal monto, BigDecimal impuesto,
			Set<DomiciliacionBancaria> domiciliacionBancarias, Set<TransferenciaBancaria> transferenciaBancarias,
			Set<ContraReembolso> contraReembolsos, Set<Notificacion> notificacions, Set<Boleta> boletas,
			Set<Venta> ventas, Set<Pedido> pedidos, Set<PagoPaypal> pagoPaypals) {
		this.tarjeta = tarjeta;
		this.tipoPago = tipoPago;
		this.fechaPago = fechaPago;
		this.monto = monto;
		this.impuesto = impuesto;
		this.domiciliacionBancarias = domiciliacionBancarias;
		this.transferenciaBancarias = transferenciaBancarias;
		this.contraReembolsos = contraReembolsos;
		this.notificacions = notificacions;
		this.boletas = boletas;
		this.ventas = ventas;
		this.pedidos = pedidos;
		this.pagoPaypals = pagoPaypals;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idpago", unique = true, nullable = false)
	public Integer getIdpago() {
		return this.idpago;
	}

	public void setIdpago(Integer idpago) {
		this.idpago = idpago;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtarjeta", nullable = false)
	public Tarjeta getTarjeta() {
		return this.tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

	@Column(name = "tipo_pago", nullable = false, length = 45)
	public String getTipoPago() {
		return this.tipoPago;
	}

	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_pago", nullable = false, length = 19)
	public Date getFechaPago() {
		return this.fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	@Column(name = "monto", nullable = false, precision = 10)
	public BigDecimal getMonto() {
		return this.monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	@Column(name = "impuesto", nullable = false, precision = 10)
	public BigDecimal getImpuesto() {
		return this.impuesto;
	}

	public void setImpuesto(BigDecimal impuesto) {
		this.impuesto = impuesto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<DomiciliacionBancaria> getDomiciliacionBancarias() {
		return this.domiciliacionBancarias;
	}

	public void setDomiciliacionBancarias(Set<DomiciliacionBancaria> domiciliacionBancarias) {
		this.domiciliacionBancarias = domiciliacionBancarias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<TransferenciaBancaria> getTransferenciaBancarias() {
		return this.transferenciaBancarias;
	}

	public void setTransferenciaBancarias(Set<TransferenciaBancaria> transferenciaBancarias) {
		this.transferenciaBancarias = transferenciaBancarias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<ContraReembolso> getContraReembolsos() {
		return this.contraReembolsos;
	}

	public void setContraReembolsos(Set<ContraReembolso> contraReembolsos) {
		this.contraReembolsos = contraReembolsos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<Notificacion> getNotificacions() {
		return this.notificacions;
	}

	public void setNotificacions(Set<Notificacion> notificacions) {
		this.notificacions = notificacions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<Boleta> getBoletas() {
		return this.boletas;
	}

	public void setBoletas(Set<Boleta> boletas) {
		this.boletas = boletas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<Venta> getVentas() {
		return this.ventas;
	}

	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<Pedido> getPedidos() {
		return this.pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pago")
	public Set<PagoPaypal> getPagoPaypals() {
		return this.pagoPaypals;
	}

	public void setPagoPaypals(Set<PagoPaypal> pagoPaypals) {
		this.pagoPaypals = pagoPaypals;
	}

}
