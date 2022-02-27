public class Product
{
	ProductType productType;
	int quantity;
	double unitPrice;

	public Product(ProductType productType, int quantity, double unitPrice)
	{
		this.productType = productType;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public ProductType getProductType()
	{
		return productType;
	}

	public int getQuantity()
	{
		return quantity;
	}

	public double getUnitPrice()
	{
		return unitPrice;
	}

	@Override
	public String toString()
	{
		return "Product{" + "productType=" + productType + ", quantity=" + quantity + ", unitPrice=" + unitPrice + '}';
	}
}
