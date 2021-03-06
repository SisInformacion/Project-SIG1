package pe.edu.unsch.service;

import java.util.List;

import pe.edu.unsch.entities.Producto;

public interface ProductoService {

	Producto traerProducto(long idproducto);

	List<Producto> listaProductoDestacados();

	// ProductosVendedor
	List<Producto> listaProductosVendedor(Integer idPersona);

}
