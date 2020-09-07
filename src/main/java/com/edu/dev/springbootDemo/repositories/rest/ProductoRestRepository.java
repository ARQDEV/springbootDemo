package com.edu.dev.springbootDemo.repositories.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edu.dev.springbootDemo.entities.mongoDb.Producto;

@RepositoryRestResource(collectionResourceRel = "productos", path = "productos")
public interface ProductoRestRepository extends PagingAndSortingRepository<Producto, Long>  { 

	
	
	
}
