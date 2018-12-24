
public class RealEstate {
	double downPayment=20000;
	double totalPrice=190000;
	int yearsOfMortgage = 30;
	double percentPerYear = 0.05;
	double taxProperty = 2000;
	double AverRentPrice = 1500;
	double AllPriceThirtyYears;
	double allSpendingforThirtyYears;
	//double condoFee;
	double priceAfterDownPayment;
	//in total price does not include bills for water, gas and etc.
	
	public RealEstate(){
		
	}
	
	public double MortgagePerc() {
		//percentPerYear = d;
		AllPriceThirtyYears = totalPrice+(totalPrice*percentPerYear*yearsOfMortgage) ;
		System.out.println("Total Price For $"  + totalPrice + "house during 30 years: $" + AllPriceThirtyYears + " With " + percentPerYear+"% per year" );
		return AllPriceThirtyYears;
		
	}
	public void TheWholePriceForThirtyYears() {
		//Total price - downPayment= priceAfterDown
		priceAfterDownPayment = totalPrice - downPayment;
		//80k *0.05 * 30 + (5000*30) 
		allSpendingforThirtyYears = priceAfterDownPayment * percentPerYear *  yearsOfMortgage + (taxProperty*  yearsOfMortgage) + priceAfterDownPayment + downPayment;
		
		//For the real house
		System.out.println("House with Total Price: $" + totalPrice+   " with downpayment: $" + downPayment + ", Mortgage %: "+ percentPerYear+", Taxes for property: $" + taxProperty + ", Years of mortgage: "+ yearsOfMortgage + ". FinalPice: $" + allSpendingforThirtyYears);
		
		
		
	}
	public void JustRentTheSameProperty() {
	
		//Total for the rent 	
	double PriceForRent = AverRentPrice * 12 * yearsOfMortgage;
	System.out.println("Rent the same house during the same term for the mortgage with average price for 30 years: $" + PriceForRent);
	}
	
	

	public static void main(String[] args) {
		
		RealEstate my = new RealEstate();
		//my.MortgagePerc();
		my.TheWholePriceForThirtyYears();
		my.JustRentTheSameProperty();
		
		
	}

}
