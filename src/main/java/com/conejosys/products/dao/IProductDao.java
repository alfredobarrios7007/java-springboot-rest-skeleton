/**
 * 
 */
package com.conejosys.products.dao;

import java.util.List;

import com.conejosys.products.models.Product;

/**
 * 
 */
public interface IProductDao {
	
	Product insert(Product product);
	Product update(Product product);
	boolean delete(int id);
	Product get(int id);
	List<Product> getAll();

}
