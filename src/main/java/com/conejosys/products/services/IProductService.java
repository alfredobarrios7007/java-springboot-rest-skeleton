/**
 * 
 */
package com.conejosys.products.services;

import java.util.List;

import com.conejosys.products.models.Product;

/**
 * 
 */
public interface IProductService {
	
	Product insert(Product product);
	Product update(Product product);
	boolean delete(int id);
	Product getById(int id);
	List<Product> getAll();

}
