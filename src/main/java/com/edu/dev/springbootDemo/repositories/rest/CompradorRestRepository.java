package com.edu.dev.springbootDemo.repositories.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.edu.dev.springbootDemo.entities.jpa.Comprador;


@RepositoryRestResource(collectionResourceRel = "compradores", path = "compradores")
public interface  CompradorRestRepository   extends PagingAndSortingRepository<Comprador, Long> {

}
