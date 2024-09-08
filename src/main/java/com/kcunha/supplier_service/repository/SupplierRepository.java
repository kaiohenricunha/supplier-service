package com.kcunha.supplier_service.repository;

import com.kcunha.supplier_service.model.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {
    // Additional custom queries
}
