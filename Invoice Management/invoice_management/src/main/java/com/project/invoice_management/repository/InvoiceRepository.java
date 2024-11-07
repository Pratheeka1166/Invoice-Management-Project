package com.project.invoice_management.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.invoice_management.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	List<Invoice> findByStatus(String status);
}
