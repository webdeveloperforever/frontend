package eshop.homedecor.shopapi.vo.response;

import java.util.List;

import eshop.homedecor.shopapi.entity.ProductInfo;

public class ProductInfoResponse {
	
	private List<ProductInfo> productList;
	private List<ProductInfo> field;

	public List<ProductInfo> getProductList() {
		return productList;
	}

	public void setProductList(List<ProductInfo> productList) {
		this.productList = productList;
	}
	
	public void setProductListSortByField(List<ProductInfo> field) {
		this.field= field;
	}

}
