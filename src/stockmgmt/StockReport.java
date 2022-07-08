package stockmgmt;

import java.util.Scanner;

public class StockReport {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of stock");
		int numOfStock = scanner.nextInt();
		IsStockService isStockService=new StockService();
		for(int i=0;i<numOfStock;i++) {
			
			System.out.println("Please enter stock name");
			String stockName=scanner.next();		// reads string
			System.out.println("Please enter stock share");
			int share=scanner.nextInt();
			System.out.println("Please enter stock share price");
			long sharePrice=scanner.nextLong();
			
			isStockService.addstocks(stockName,share,sharePrice);
		}
		isStockService.printReport();
		isStockService.debit();
		
	}
	
}



