


public class DiscoutRate {
	private final double serviceDiscountPremium = 0.2;
	private final double serviceDiscountGold = 0.15;
	private final double serviceDiscountSilver = 0.10;
	private final double productDiscountPremium = 0.1;
	private final double productDiscountGold = 0.1;
	private final double productDiscountSilver = 0.1;
	
	public double getServiceDiscountRate(CustomerRank rank) {
		if(rank == CustomerRank.Premium) {
			return serviceDiscountPremium;
		}
		
		if(rank == CustomerRank.Gold) {
			return serviceDiscountGold;
		}
		
		if(rank == CustomerRank.Silver) {
			return serviceDiscountSilver;
		}
		
		return 0;
	} 
	
	public double getproductDiscountRate(CustomerRank rank) {
		if(rank == CustomerRank.Premium) {
			return productDiscountPremium;
		}
		
		if(rank == CustomerRank.Gold) {
			return productDiscountGold;
		}
		
		if(rank == CustomerRank.Silver) {
			return productDiscountSilver;
		}
		
		return 0;
	}	
}
	
	
	
