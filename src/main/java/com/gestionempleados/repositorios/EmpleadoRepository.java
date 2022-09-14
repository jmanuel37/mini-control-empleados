package com.gestionempleados.repositorios;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.gestionempleados.entidades.Empleado;
public interface EmpleadoRepository extends PagingAndSortingRepository<Empleado, Long> {

}
