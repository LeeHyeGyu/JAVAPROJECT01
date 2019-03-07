package com.sist.hd.vo;

import java.util.List;

import javax.swing.JTable;

public class PayVO extends DTO{
	private String launName; //세탁소 이름
	private String userId; //사용자Id
	private String payId; //결제 Id (key값)
	private String launList; //세탁물 리스트
	private String userAddress; //사용자 주소
	private String totalPrice; //결제할 금액
	private String pickupTime; //픽업 시간
	private String deliveryTime; //배달시간
	
	public PayVO(){	}
	
	public PayVO(String launName, String userId, String payId,String launList, String userAddress,String totalPrice,String pickupTime,String deliveryTime ){
		super();
		this.launName = launName;
		this.userId = userId;
		this.payId= payId;
		this.launList = launList;
		this.userAddress= userAddress; 
		this.totalPrice = totalPrice; 
		this.pickupTime = pickupTime; 
		this.deliveryTime = deliveryTime;	
	}
	
	public String getLaunName() {
		return launName;
	}

	public void setLaunName(String launName) {
		this.launName = launName;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLaunList() {
		return launList;
	}


	public void setLaunList(String launList) {
		this.launList = launList;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}
	
	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPickupTime() {
		return pickupTime;
	}

	public void setPickupTime(String pickupTime) {
		this.pickupTime = pickupTime;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((deliveryTime == null) ? 0 : deliveryTime.hashCode());
		result = prime * result + ((launList == null) ? 0 : launList.hashCode());
		result = prime * result + ((launName == null) ? 0 : launName.hashCode());
		result = prime * result + ((payId == null) ? 0 : payId.hashCode());
		result = prime * result + ((pickupTime == null) ? 0 : pickupTime.hashCode());
		result = prime * result + ((totalPrice == null) ? 0 : totalPrice.hashCode());
		result = prime * result + ((userAddress == null) ? 0 : userAddress.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PayVO other = (PayVO) obj;
		if (deliveryTime == null) {
			if (other.deliveryTime != null)
				return false;
		} else if (!deliveryTime.equals(other.deliveryTime))
			return false;
		if (launList == null) {
			if (other.launList != null)
				return false;
		} else if (!launList.equals(other.launList))
			return false;
		if (launName == null) {
			if (other.launName != null)
				return false;
		} else if (!launName.equals(other.launName))
			return false;
		if (payId == null) {
			if (other.payId != null)
				return false;
		} else if (!payId.equals(other.payId))
			return false;
		if (pickupTime == null) {
			if (other.pickupTime != null)
				return false;
		} else if (!pickupTime.equals(other.pickupTime))
			return false;
		if (totalPrice == null) {
			if (other.totalPrice != null)
				return false;
		} else if (!totalPrice.equals(other.totalPrice))
			return false;
		if (userAddress == null) {
			if (other.userAddress != null)
				return false;
		} else if (!userAddress.equals(other.userAddress))
			return false;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PayVO [launName=" + launName + ", userId=" + userId + ", payId=" + payId + ", launList=" + launList
				+ ", userAddress=" + userAddress + ", totalPrice=" + totalPrice + ", pickupTime=" + pickupTime
				+ ", deliveryTime=" + deliveryTime + "]";
	}




		
	
}