# Invoice Management API

## Overview
This API provides a basic invoice management system that supports creating invoices, paying invoices, and processing overdue invoices with added late fees.

### Features
- Create new invoices
- List all invoices
- Pay an invoice partially or fully
- Process overdue invoices with configurable late fees and overdue periods
- Deleting  invoices

### Assumptions
1. Invoices are considered overdue based on their due date and specified overdue days.
2. Partially paid invoices, upon processing for overdue, generate a new invoice for the remaining amount with added late fees.
3. Completely unpaid overdue invoices are voided, and a new invoice is created with the original amount plus the late fee.

## API Endpoints
1. POST /invoices: Create a new invoice.
2. GET /invoices: Retrieve all invoices.
3. POST /invoices/{id}/payments: Pay an existing invoice.
4. POST /invoices/process-overdue: Process overdue invoices and apply late fees as needed.
5. DELETE /invoices/{id} -delete invoice


### Run with Docker
1. Build and run using `docker-compose up`.
2. Access the API at `http://localhost:8080`.

### Future Improvements
- Add durable persistence using a relational database MySQL.

