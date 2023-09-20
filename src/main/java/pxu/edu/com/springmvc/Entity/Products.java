package pxu.edu.com.springmvc.Entity;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private double price;

	@ManyToOne
	@JoinColumn(name = "product_type_id")
	private ProductType productType;

	@ManyToOne
	@JoinColumn(name = "product_tag_id")
	private ProductTag Tag;

	@OneToMany(mappedBy = "products")
	private List<CartDetail> cartDetail;

	@OneToMany(mappedBy = "products")
	private List<OrderDetail> orderDetail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public ProductTag getTag() {
		return Tag;
	}

	public void setTag(ProductTag tag) {
		Tag = tag;
	}

	public List<CartDetail> getCartDetail() {
		return cartDetail;
	}

	public void setCartDetail(List<CartDetail> cartDetail) {
		this.cartDetail = cartDetail;
	}

	public List<OrderDetail> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<OrderDetail> orderDetail) {
		this.orderDetail = orderDetail;
	}

	
}
