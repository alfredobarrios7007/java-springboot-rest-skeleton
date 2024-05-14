/**
 * 
 */
package com.conejosys.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.conejosys.products.models.Product;

/**
 * 
 */
@Repository
public class ProductDaoImpl implements IProductDao {
	
	@Autowired
	IProductJpaSrping productJpa;

	@Override
	public Product insert(Product product) {
		var saved = productJpa.save(product);
		return saved;
	}

	@Override
	public Product update(Product product) {
		var saved = productJpa.save(product);
		return saved;
	}

	@Override
	public boolean delete(int id) {
		productJpa.deleteById(id);
		return true;
	}

	@Override
	public Product get(int id) {
		var result = productJpa.findById(id).orElse(null);
		return result;
	}

	@Override
	public List<Product> getAll() {
		var result = productJpa.findAll();
		return result;
	}

}
