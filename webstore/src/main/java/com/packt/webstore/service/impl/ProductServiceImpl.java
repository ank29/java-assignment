package com.packt.webstore.service.impl;
import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.repository.ProductRepository;
import com.packt.webstore.domain.repository.impl.InMemoryProductRepository;
import com.packt.webstore.service.OrderService;
import com.packt.webstore.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductServiceImpl implements ProductService {
@Autowired
private ProductRepository productRepository;

@Override
public List<Product> getAllProducts() {
	return new InMemoryProductRepository().getAllProducts();
	
}

}
