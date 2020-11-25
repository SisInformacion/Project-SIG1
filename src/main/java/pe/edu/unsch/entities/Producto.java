package pe.edu.unsch.entities;
// Generated 19-nov-2020 18:08:16 by Hibernate Tools 5.1.10.Final

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Producto generated by hbm2java
 */
@Entity
@Table(name = "producto", catalog = "marketplacebd_test", uniqueConstraints = @UniqueConstraint(columnNames = "codigo"))
public class Producto implements java.io.Serializable {

	private Long idproducto;
	private GarantiaProducto garantiaProducto;
	private LibroReclamacion libroReclamacion;
	private Persona persona;
	private String codigo;
	private String nombre;
	private String descripcion;
	private BigDecimal precioUnitario;
	private byte cantidad;
	private boolean estadoseleccionoferta;
	private Boolean destacado;
	private String marca;
	private int cantidadventas;
	private Set<Carrito> carritos = new HashSet<Carrito>(0);
	private Set<CuponDescuento> cuponDescuentos = new HashSet<CuponDescuento>(0);
	private Set<ImagenProducto> imagenProductos = new HashSet<ImagenProducto>(0);
	private Set<CategoriaProducto> categoriaProductos = new HashSet<CategoriaProducto>(0);
	private Set<Productosjuntos> productosjuntosesForProducto2 = new HashSet<Productosjuntos>(0);
	private Set<HistorialPedido> historialPedidos = new HashSet<HistorialPedido>(0);
	private Set<OfertaEspecial> ofertaEspecials = new HashSet<OfertaEspecial>(0);
	private Set<Productosjuntos> productosjuntosesForProducto1 = new HashSet<Productosjuntos>(0);
	private Set<Sugerenciahistorial> sugerenciahistorials = new HashSet<Sugerenciahistorial>(0);
	private Set<ProductoValorado> productoValorados = new HashSet<ProductoValorado>(0);
	private Set<ProductoMasVisto> productoMasVistos = new HashSet<ProductoMasVisto>(0);
	private Set<ProductoDeseado> productoDeseados = new HashSet<ProductoDeseado>(0);
	private Set<OfertaEspecial> ofertaEspecials_1 = new HashSet<OfertaEspecial>(0);
	private Set<OfertaProducto> ofertaProductos = new HashSet<OfertaProducto>(0);
	private Set<ProductoFavorito> productoFavoritos = new HashSet<ProductoFavorito>(0);

	public Producto(String nombre) {
		this.nombre = nombre;
	}

	public Producto() {
	}

	public Producto(Long idproducto, String nombre, BigDecimal precioUnitario, byte cantidad) {
		this.idproducto = idproducto;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
	}

	public Producto(GarantiaProducto garantiaProducto, LibroReclamacion libroReclamacion, String codigo, String nombre,
			String descripcion, BigDecimal precioUnitario, byte cantidad, boolean estadoseleccionoferta, String marca,
			int cantidadventas) {
		this.garantiaProducto = garantiaProducto;
		this.libroReclamacion = libroReclamacion;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.estadoseleccionoferta = estadoseleccionoferta;
		this.marca = marca;
		this.cantidadventas = cantidadventas;

	}

	public Producto(GarantiaProducto garantiaProducto, LibroReclamacion libroReclamacion, Persona persona,
			String codigo, String nombre, String descripcion, BigDecimal precioUnitario, byte cantidad,
			boolean estadoseleccionoferta, Boolean destacado, String marca, int cantidadventas, Set<Carrito> carritos,
			Set<CuponDescuento> cuponDescuentos, Set<ImagenProducto> imagenProductos,
			Set<CategoriaProducto> categoriaProductos, Set<Productosjuntos> productosjuntosesForProducto2,
			Set<HistorialPedido> historialPedidos, Set<OfertaEspecial> ofertaEspecials,
			Set<Productosjuntos> productosjuntosesForProducto1, Set<Sugerenciahistorial> sugerenciahistorials,
			Set<ProductoValorado> productoValorados, Set<ProductoMasVisto> productoMasVistos,
			Set<ProductoDeseado> productoDeseados, Set<OfertaEspecial> ofertaEspecials_1,
			Set<OfertaProducto> ofertaProductos, Set<ProductoFavorito> productoFavoritos) {
		this.garantiaProducto = garantiaProducto;
		this.libroReclamacion = libroReclamacion;
		this.persona = persona;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.estadoseleccionoferta = estadoseleccionoferta;
		this.destacado = destacado;
		this.marca = marca;
		this.cantidadventas = cantidadventas;
		this.carritos = carritos;
		this.cuponDescuentos = cuponDescuentos;
		this.imagenProductos = imagenProductos;
		this.categoriaProductos = categoriaProductos;
		this.productosjuntosesForProducto2 = productosjuntosesForProducto2;
		this.historialPedidos = historialPedidos;
		this.ofertaEspecials = ofertaEspecials;
		this.productosjuntosesForProducto1 = productosjuntosesForProducto1;
		this.sugerenciahistorials = sugerenciahistorials;
		this.productoValorados = productoValorados;
		this.productoMasVistos = productoMasVistos;
		this.productoDeseados = productoDeseados;
		this.ofertaEspecials_1 = ofertaEspecials_1;
		this.ofertaProductos = ofertaProductos;
		this.productoFavoritos = productoFavoritos;
	}

	public Producto(String codigo, String nombre, String descripcion, byte cantidad, BigDecimal precioUnitario,
			String marca, Persona persona) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidad = cantidad;
		this.marca = marca;
		this.persona = persona;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idproducto", unique = true, nullable = false)
	public Long getIdproducto() {
		return this.idproducto;
	}

	public void setIdproducto(Long idproducto) {
		this.idproducto = idproducto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idgarantiaproducto", nullable = false)
	public GarantiaProducto getGarantiaProducto() {
		return this.garantiaProducto;
	}

	public void setGarantiaProducto(GarantiaProducto garantiaProducto) {
		this.garantiaProducto = garantiaProducto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idlibroreclamaciones", nullable = false)
	public LibroReclamacion getLibroReclamacion() {
		return this.libroReclamacion;
	}

	public void setLibroReclamacion(LibroReclamacion libroReclamacion) {
		this.libroReclamacion = libroReclamacion;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idpersona")
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Column(name = "codigo", unique = true, nullable = false, length = 20)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "nombre", nullable = false)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "descripcion", nullable = false, length = 65535)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "precio_unitario", nullable = false, precision = 10)
	public BigDecimal getPrecioUnitario() {
		return this.precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	@Column(name = "cantidad", nullable = false)
	public byte getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(byte cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "estadoseleccionoferta", nullable = false)
	public boolean isEstadoseleccionoferta() {
		return this.estadoseleccionoferta;
	}

	public void setEstadoseleccionoferta(boolean estadoseleccionoferta) {
		this.estadoseleccionoferta = estadoseleccionoferta;
	}

	@Column(name = "destacado")
	public Boolean getDestacado() {
		return this.destacado;
	}

	public void setDestacado(Boolean destacado) {
		this.destacado = destacado;
	}

	@Column(name = "marca", nullable = false, length = 45)
	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Column(name = "cantidadventas", nullable = false)
	public int getCantidadventas() {
		return this.cantidadventas;
	}

	public void setCantidadventas(int cantidadventas) {
		this.cantidadventas = cantidadventas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<Carrito> getCarritos() {
		return this.carritos;
	}

	public void setCarritos(Set<Carrito> carritos) {
		this.carritos = carritos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<CuponDescuento> getCuponDescuentos() {
		return this.cuponDescuentos;
	}

	public void setCuponDescuentos(Set<CuponDescuento> cuponDescuentos) {
		this.cuponDescuentos = cuponDescuentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<ImagenProducto> getImagenProductos() {
		return this.imagenProductos;
	}

	public void setImagenProductos(Set<ImagenProducto> imagenProductos) {
		this.imagenProductos = imagenProductos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<CategoriaProducto> getCategoriaProductos() {
		return this.categoriaProductos;
	}

	public void setCategoriaProductos(Set<CategoriaProducto> categoriaProductos) {
		this.categoriaProductos = categoriaProductos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productoByProducto2")
	public Set<Productosjuntos> getProductosjuntosesForProducto2() {
		return this.productosjuntosesForProducto2;
	}

	public void setProductosjuntosesForProducto2(Set<Productosjuntos> productosjuntosesForProducto2) {
		this.productosjuntosesForProducto2 = productosjuntosesForProducto2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<HistorialPedido> getHistorialPedidos() {
		return this.historialPedidos;
	}

	public void setHistorialPedidos(Set<HistorialPedido> historialPedidos) {
		this.historialPedidos = historialPedidos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<OfertaEspecial> getOfertaEspecials() {
		return this.ofertaEspecials;
	}

	public void setOfertaEspecials(Set<OfertaEspecial> ofertaEspecials) {
		this.ofertaEspecials = ofertaEspecials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productoByProducto1")
	public Set<Productosjuntos> getProductosjuntosesForProducto1() {
		return this.productosjuntosesForProducto1;
	}

	public void setProductosjuntosesForProducto1(Set<Productosjuntos> productosjuntosesForProducto1) {
		this.productosjuntosesForProducto1 = productosjuntosesForProducto1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<Sugerenciahistorial> getSugerenciahistorials() {
		return this.sugerenciahistorials;
	}

	public void setSugerenciahistorials(Set<Sugerenciahistorial> sugerenciahistorials) {
		this.sugerenciahistorials = sugerenciahistorials;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<ProductoValorado> getProductoValorados() {
		return this.productoValorados;
	}

	public void setProductoValorados(Set<ProductoValorado> productoValorados) {
		this.productoValorados = productoValorados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<ProductoMasVisto> getProductoMasVistos() {
		return this.productoMasVistos;
	}

	public void setProductoMasVistos(Set<ProductoMasVisto> productoMasVistos) {
		this.productoMasVistos = productoMasVistos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<ProductoDeseado> getProductoDeseados() {
		return this.productoDeseados;
	}

	public void setProductoDeseados(Set<ProductoDeseado> productoDeseados) {
		this.productoDeseados = productoDeseados;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "oferta_especial_has_producto", catalog = "marketplacebd_test", joinColumns = {
			@JoinColumn(name = "producto_idproducto", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "oferta_especial_idoferta_especial", nullable = false, updatable = false) })
	public Set<OfertaEspecial> getOfertaEspecials_1() {
		return this.ofertaEspecials_1;
	}

	public void setOfertaEspecials_1(Set<OfertaEspecial> ofertaEspecials_1) {
		this.ofertaEspecials_1 = ofertaEspecials_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<OfertaProducto> getOfertaProductos() {
		return this.ofertaProductos;
	}

	public void setOfertaProductos(Set<OfertaProducto> ofertaProductos) {
		this.ofertaProductos = ofertaProductos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "producto")
	public Set<ProductoFavorito> getProductoFavoritos() {
		return this.productoFavoritos;
	}

	public void setProductoFavoritos(Set<ProductoFavorito> productoFavoritos) {
		this.productoFavoritos = productoFavoritos;
	}

}
