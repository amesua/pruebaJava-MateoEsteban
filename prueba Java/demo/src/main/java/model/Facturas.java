package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Facturas")
public class Facturas {
	
	@Id
	@Column(name="idFactura")
	private int idFactura;
	@Column(name="NumeroFactura")
	private int numeroFactura;
	@Column(name="Fecha")
	private LocalDate fecha;
	@Column(name="TipoPago")
	private String tipoDePago;
	@Column(name="DocumentoCliente")
	private int documentoCliente;
	@Column(name="NombreCliente")
	private String nombreCliente;
	@Column(name="SubTotal")
	private int subTotal;
	@Column(name="Descuento")
	private int descuento;
	@Column(name="IVA")
	private int iva;
	@Column(name="TotalDescuento")
	private float totalDescuento;
	@Column(name="TotalImpuesto")
	private float totalImpuesto;
	@Column(name="Total")
	private float total;
	public LocalDateTime actual = LocalDateTime.now();
	
	//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	//actual = LocalDateTime.parse(actual, formatter);
	
	
	public Facturas(int idFactura, int numeroFactura, LocalDate fecha, String tipoDePago, int documentoCliente,
			String nombreCliente, int subTotal, int descuento, int iva, float totalDescuento, float totalImpuesto,
			float total) {
		super();
		this.idFactura = idFactura;
		this.numeroFactura = numeroFactura;
		this.fecha = fecha;
		this.tipoDePago = tipoDePago;
		this.documentoCliente = documentoCliente;
		this.nombreCliente = nombreCliente;
		this.subTotal = subTotal;
		this.descuento = descuento;
		this.iva = iva;
		this.totalDescuento = totalDescuento;
		this.totalImpuesto = totalImpuesto;
		this.total = total;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTipoDePago() {
		return tipoDePago;
	}
	public void setTipoDePago(String tipoDePago) {
		this.tipoDePago = tipoDePago;
	}
	public int getDocumentoCliente() {
		return documentoCliente;
	}
	public void setDocumentoCliente(int documentoCliente) {
		this.documentoCliente = documentoCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(int subTotal) {
		this.subTotal = subTotal;
	}
	public int getDescuento() {
		return descuento;
	}
	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public float getTotalDescuento() {
		return totalDescuento;
	}
	public void setTotalDescuento(float totalDescuento) {
		this.totalDescuento = totalDescuento;
	}
	public float getTotalImpuesto() {
		return totalImpuesto;
	}
	public void setTotalImpuesto(float totalImpuesto) {
		this.totalImpuesto = totalImpuesto;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	

}
