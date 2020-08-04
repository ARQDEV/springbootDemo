package com.edu.dev.springbootDemo.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.dev.springbootDemo.entities.mongoDb.Producto;

@Repository
public interface ProductoRepository extends CrudRepository <Producto,Long> {


	
}
