package com.edu.dev.springbootDemo;

import org.springframework.boot.SpringApplication;

//import java.util.List;

//import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.context.annotation.Bean;

//import com.edu.dev.springbootDemo.entities.mongoDb.Producto;
//import com.edu.dev.springbootDemo.repositories.ProductoRepository;

@SpringBootApplication

/*
@RestController
*/


public class SpringbootDemoApplication  extends SpringBootServletInitializer  {
	
/*	
	@RequestMapping("/")
	  public String home() {
	    return "Hello Docker World";
	  }
*/
	

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootDemoApplication.class);
    }
	

	 public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}
	
	
	/*
	@Bean
	public CommandLineRunner productoDemo(ProductoRepository productoRepository) {
		return (args) -> {
		Producto p1 = new Producto();
		p1.setNombre("Tennis");
		//p1.setIva(0.16);
		
		Producto p2 = new Producto();
		p2.setNombre("Zapatos");
		
		
		
		//productoRepository.save(p1);
		//productoRepository.save(p2);
		
		Iterable<Producto> productosLista = productoRepository.findAll(); 
		
		productosLista
		.forEach( System.out::println );
		

		};
		
	}*/

}
