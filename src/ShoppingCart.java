import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
	List<Product> productList;
	String shippingAddress;
	double totalAmount;
	double discountPrice;
	String coupon;
	boolean isCouponApplied;

	public ShoppingCart()
	{
		this.productList = new ArrayList<>();
		this.shippingAddress = "";
		this.totalAmount = 0;
		this.discountPrice = 0;
		this.coupon = "";
		this.isCouponApplied = false;
	}

	public List<Product> getProduct()
	{
		return this.productList;
	}

	public String getShippingAddress()
	{
		return this.shippingAddress;
	}

	public double getTotalAmount()
	{
		return this.totalAmount;
	}

	public double getDiscountPrice()
	{
		return this.discountPrice;
	}

	public String getCoupon()
	{
		return this.coupon;
	}

	public boolean isCouponApplied()
	{
		return this.isCouponApplied;
	}

	public void addToCart(Product product)
	{
		productList.add(product);
		this.totalAmount += (product.quantity * product.unitPrice);
	}

	public void removeFromCart(Product product)
	{
		productList.remove(product);
		this.totalAmount -= (product.quantity * product.unitPrice);
	}

	public void setShippingAddress(String address)
	{
		this.shippingAddress = address;
	}

	public void applyCoupon(String coupon)
	{
		if (coupon == "SALE50")
		{
			this.discountPrice = this.totalAmount / 2;
			this.isCouponApplied = true;
		}
		else if (coupon == "SALE25")
		{
			this.discountPrice = this.totalAmount / 4;
			this.isCouponApplied = true;
		}
		this.totalAmount -= this.discountPrice;
	}

	@Override
	public String toString()
	{
		return "ShoppingCart{" + "product=" + this.productList + ", shippingAddress='" + this.shippingAddress + '\'' + ", totalAmount=" + this.totalAmount + ", discountPrice=" + this.discountPrice + ", coupon='" + this.coupon + '\'' + '}';
	}
}
