package pxu.edu.com.springmvc.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "product_type")
public class ProductType {
	
	
	public ProductType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "type_name")
	private String typeName;

	@OneToMany(mappedBy = "productType")
	private List<Products> products;

	public ProductType(Long id, String typeName, List<Products> products) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

}
