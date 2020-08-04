package com.edu.dev.springbootDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edu.dev.springbootDemo.repositories.ProductoRepository;

@SpringBootTest
class SpringbootDemoApplicationTests {

	@Autowired
    private ProductoRepository productoRepository;
	
	/*@Test
	void contextLoads() {
	}*/

}
