package com.example.lab4.repository;

import com.example.lab4.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado,Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM employees where (first_name like %?% or last_name like %?%)")
    List<Empleado> buscarPorNombreCompania(String textoIngreso,String textoIngreso1);

    @Query(nativeQuery = true, value = "UPDATE shippers SET phone_number = ?1 WHERE salary = ?2")
    void actualizar(String phone, double shipperId);
}
