package com.alation.bean;

import java.util.Map;

public class Bean {
	private Map<String, Object> locator;
	private String productName;
	private String kindleCost;
	private String paperBackCostNew;
	private String paperBackCostUsed;

	public Map<String, Object> getLocator() {
		return locator;
	}

	public void setLocator(Map<String, Object> locator) {
		this.locator = locator;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getKindleCost() {
		return kindleCost;
	}

	public void setKindleCost(String kindleCost) {
		this.kindleCost = kindleCost;
	}

	public String getPaperBackCostNew() {
		return paperBackCostNew;
	}

	public void setPaperBackCostNew(String paperBackCostNew) {
		this.paperBackCostNew = paperBackCostNew;
	}

	public String getPaperBackCostUsed() {
		return paperBackCostUsed;
	}

	public void setPaperBackCostUsed(String paperBackCostUsed) {
		this.paperBackCostUsed = paperBackCostUsed;
	}

}
