package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Facturas;
import repository.FacturasRepository;

@RestController
@RequestMapping("/api/p1/")
public class FacturasController {
	
	@Autowired
	private FacturasRepository facturasRepository;
	
	@PostMapping("/facturas")
	public Facturas createFactura(@RequestBody Facturas factura) {
		factura.setTotalDescuento(calcularPorcentaje(factura.getDescuento(), factura.getSubTotal()));
		factura.setTotalImpuesto(calcularPorcentaje(factura.getIva(),factura.getSubTotal()));
		factura.setTotal(calcularPorcentaje(factura.getDescuento(), factura.getSubTotal())+calcularPorcentaje(factura.getIva(),factura.getSubTotal()));
		return facturasRepository.save(factura);
	}
	
	@PostMapping("/facturas/{id}")
	public Facturas updateFactura(@PathVariable long id, @RequestBody Facturas newFactura ) {
		Facturas facturadb = facturasRepository.findById(id).get();
		
		facturadb.setDocumentoCliente(newFactura.getDocumentoCliente());
		facturadb.setNombreCliente(newFactura.getNombreCliente());
		facturadb.setTipoDePago(newFactura.getTipoDePago());
		facturadb.setSubTotal(newFactura.getSubTotal());
		facturadb.setIva(newFactura.getIva());
		facturadb.setDescuento(newFactura.getDescuento());
		
		if(newFactura.getFecha().isEqual(facturadb.getFecha()) && newFactura.getFecha().isAfter(facturadb.getFecha())) {
			facturadb.setFecha(newFactura.getFecha());
		}else {
			System.out.print("fecha invalida");
		}
		
		return facturadb;
	}
	
	@DeleteMapping("/facturas/{id}")
	public Facturas deleteFactura(@PathVariable long id) {
		Facturas facturadb = facturasRepository.findById(id).get();
		facturasRepository.delete(facturadb);
		return facturadb;
	}
	
	public int calcularPorcentaje(int por, int total) {
		int res= (por * total)/100;
		return res;
	}

}
