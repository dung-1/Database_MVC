package pxu.edu.com.springmvc.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "product_tag")
public class ProductTag {

	public ProductTag() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "tag_name")
	private String tagName;

	@OneToMany(mappedBy = "Tag")
	private List<Products> products;

	public ProductTag(Long id, String tagName, List<Products> products) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.products = products;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTagName() {
		return tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

}
