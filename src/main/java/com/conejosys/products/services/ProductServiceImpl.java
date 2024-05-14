/**
 * 
 */
package com.conejosys.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conejosys.products.dao.IProductDao;
import com.conejosys.products.models.Product;

/**
 * 
 */
@Service 
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	IProductDao dao;

	@Override
	public Product insert(Product product) {
		var result = dao.insert(product);
		return result;
	}

	@Override
	public Product update(Product product) {
		var result = dao.update(product);
		return result;
	}

	@Override
	public boolean delete(int id) {
		var result = dao.delete(id);
		return result;
	}

	@Override
	public Product getById(int id) {
		var result = dao.get(id);
		return result;
	}

	@Override
	public List<Product> getAll() {
		var result = dao.getAll();
		return result;
	}

}
