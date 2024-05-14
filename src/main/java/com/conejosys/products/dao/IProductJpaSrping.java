/**
 * 
 */
package com.conejosys.products.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.conejosys.products.models.Product;

/**
 * 
 */
public interface IProductJpaSrping extends JpaRepository<Product, Integer> {

}
