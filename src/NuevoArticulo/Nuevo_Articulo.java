/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevoArticulo;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author José Carlos Manjón Carrasco
 */
public class Nuevo_Articulo {

    private String codigoArticulo, nombreArticulo, proveedor, descripcionDetallada, categoria, estadoArticulo, compatibilidad;
    /*private String[] categoria = {"Ordenador", "Portátil", "Monitor", "Impresora", "Accesorio", "Componente interno", "Otro"};
     private String[] estadoArticulo = {"Nuevo", "Reacondicionado", "Oferta especial"};
     private String[] compatibilidad = {"Windows", "Ububtu", "Debian"};*/
    private String garantia;
    private float precioUnitario;
    private int stockDisponible;
    private Date fechaEntrada;

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcionDetallada() {
        return descripcionDetallada;
    }

    public void setDescripcionDetallada(String descripcionDetallada) {
        this.descripcionDetallada = descripcionDetallada;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstadoArticulo() {
        return estadoArticulo;
    }

    public void setEstadoArticulo(String estadoArticulo) {
        this.estadoArticulo = estadoArticulo;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Nuevo_Articulo(String codigoArticulo, String nombreArticulo, String categoria, float precioUnitario, int stockDisponible, String proveedor, Date fechaEntrada, String garantia, String estadoArticulo, String compatibilidad, String descripcionDetallada) {
        this.codigoArticulo = codigoArticulo;
        this.nombreArticulo = nombreArticulo;
        this.garantia = garantia;
        this.proveedor = proveedor;
        this.descripcionDetallada = descripcionDetallada;
        this.precioUnitario = precioUnitario;
        this.stockDisponible = stockDisponible;
        this.fechaEntrada = fechaEntrada;
        this.compatibilidad = compatibilidad;
        this.categoria = categoria;
        this.estadoArticulo = estadoArticulo;

    }

    @Override
    public String toString() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return "Detalles del artículo:\n"
                + "Código: " + codigoArticulo + "\n"
                + "Nombre: " + nombreArticulo + "\n"
                + "Categoría: " + categoria + "\n"
                + "Precio unitario: " + String.format("%.2f €", precioUnitario) + "\n"
                + "Stock disponible: " + stockDisponible + " unidades\n"
                + "Proveedor: " + proveedor + "\n"
                + "Fecha de entrada: " + formatoFecha.format(fechaEntrada) + "\n"
                + "Garantía: " + garantia + "\n"
                + "Estado: " + estadoArticulo + "\n"
                + "Compatibilidad: " + compatibilidad + "\n"
                + "Descripción: " + descripcionDetallada;
    }

}
