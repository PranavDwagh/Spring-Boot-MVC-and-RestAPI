package study.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import study.MyRepository;
import study.Entity.ProductEntity;

@Service
public class ProductDAO {

	@Autowired
	MyRepository rs;

	public void addProduct(ProductEntity productEntity) {
		rs.save(productEntity);
	}
	
	public Optional<ProductEntity> showProduct(int id)
	{
		 return rs.findById(id);
	}

	public List<ProductEntity> showall() {
		
		return rs.findAll();
	}

	public void deleteProduct(int id) {

		rs.deleteById(id);
		
	}
	
	  public void update(int id, String name) {
	  
	  Optional<ProductEntity> obj = rs.findById(id);
	  
	  ProductEntity obj2 = obj.get();
	  
	  obj2.setName(name);
	  rs.save(obj2);
	// orElse can be used 
	  // ifpresentOrElse can be used 
	  
	  //===================or
	  
	  //ProductEntity pobj = rs.getById(id);    this will also work
	  
	  
	  
	  
	  }
	
}
