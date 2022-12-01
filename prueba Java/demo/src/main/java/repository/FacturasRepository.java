package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Facturas;

public interface FacturasRepository extends JpaRepository<Facturas, Long> {

}
