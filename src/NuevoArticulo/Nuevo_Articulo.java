/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NuevoArticulo;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author José Carlos Manjón Carrasco
 */
public class Nuevo_Articulo {

    private String codigoArticulo, nombreArticulo, proveedor, descripcionDetallada;
    private String[] categoria = {"Ordenador", "Portátil", "Monitor", "Impresora", "Accesorio", "Componente interno", "Otro"};
    private String[] estadoArticulo = {"Nuevo", "Reacondicionado", "Oferta especial"};
    private String[] compatibilidad = {"Windows", "Ububtu", "Debian"};
    private int[] garantia = {12, 24, 0};
    private float precioUnitario;
    private int stockDisponible;
    private LocalDate fechaEntrada;

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

    public String[] getCategoria() {
        return categoria;
    }

    public void setCategoria(String[] categoria) {
        this.categoria = categoria;
    }

    public String[] getEstadoArticulo() {
        return estadoArticulo;
    }

    public void setEstadoArticulo(String[] estadoArticulo) {
        this.estadoArticulo = estadoArticulo;
    }

    public String[] getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String[] compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    public int[] getGarantia() {
        return garantia;
    }

    public void setGarantia(int[] garantia) {
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

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Nuevo_Articulo(String codigoArticulo, String nombreArticulo, String proveedor, String descripcionDetallada, float precioUnitario, int stockDisponible, LocalDate fechaEntrada) {
        this.codigoArticulo = codigoArticulo;
        this.nombreArticulo = nombreArticulo;
        this.proveedor = proveedor;
        this.descripcionDetallada = descripcionDetallada;
        this.precioUnitario = precioUnitario;
        this.stockDisponible = stockDisponible;
        this.fechaEntrada = fechaEntrada;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Detalles del artículo:\n"
                + "Código: " + codigoArticulo + "\n"
                + "Nombre: " + nombreArticulo + "\n"
                + "Proveedor: " + proveedor + "\n"
                + "Descripción: " + descripcionDetallada + "\n"
                + "Categoría: " + categoria + "\n"
                + "Estado: " + estadoArticulo + "\n"
                + "Compatibilidad: " + compatibilidad + "\n"
                + "Garantía: " + garantia + "\n"
                + String.format("🔹 Precio unitario: %.2f €\n", precioUnitario)
                + "Stock disponible: " + stockDisponible + " unidades\n"
                + "Fecha de entrada: " + fechaEntrada.format(formatoFecha);
    }

}
