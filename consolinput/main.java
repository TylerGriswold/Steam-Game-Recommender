package consolinput;

import java.util.Scanner;

import practice.MysqlDemo.posRev;
import practice.MysqlDemo.priceCheckG;

public class main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Functions function = new Functions();
		function.Connection();
		String GameInfo = "GameInfo";
		String posRev = "PosRev";
		String DevSearch = "DevSearch";
		String PriceE = "PriceCheckE";
		String PriceG = "PriceCheckG";
		String PriceL = "PriceCheckL";
		String LowP = "LowP";
		String TopAvg = "TopAvg";
		String DevPub = "DevPub";
		String LikeGame = "LikeGame";
		String BadGame = "BadGame";
		
		
		System.out.println("----Steam Game Info----");
		System.out.println("----Choose How To Search---- \n");
		System.out.println("Enter The Corresponding Number To Choose Search Method: "
									+ " \n Enter 0 to find information on a game "
									+ "	\n Enter 1 to see games with more positive reviews that X "
									+ " \n Enter 2 to see games that are produced by a certain developer "
									+ " \n Enter 3 to see games that have X median playtime sorted by lowest price"
									+ " \n Enter 4 to see games by price criteria"
									+ " \n Enter 5 to see games with the same developer and publisher "
									+ " \n Enter 6 to see X number of games sorted by highest playtime "
									+ " \n Enter 7 to leave a positive review of a game"
									+ " \n Enter 8 to leave a negative review of a game \n\n");
		
		System.out.println("Enter your choice: ");
		int c = sc.nextInt();
		
		if(c == 0) {
			System.out.println("Enter Your Game: ");
			String name = sc.nextLine();
			function.GameInfoProcedure(GameInfo, name);
			
		}else if(c == 1) {
			System.out.println("Enter Your minimum positive reviews: ");
			int pos = sc.nextInt();
			function.posRevProcedure(posRev, pos);
		}else if(c == 2) {
			System.out.println("Enter a Developer: ");
			String name = sc.nextLine();
			function.searchByDevProcedure(DevSearch, name);
		}else if(c == 3) {
			System.out.println("Enter average playtime: ");
			int playtime = sc.nextInt();
			function.LowestPriceAvgPlaytimeProcedure(LowP,playtime);
		}else if(c == 4) {
			System.out.println("Enter The Corresponding Number: "
								+ " \n 0 = (>=) "
								+ "	\n 1 = (=) "
								+ " \n 2 = (<=)");
			int x = sc.nextInt();
			if(x == 0) {
				System.out.println("Enter Your Price: ");
				double price = sc.nextDouble();
				function.priceCheckGProcedure(PriceG, price);
			}else if(x == 1 ) {
				System.out.println("Enter Your Price: ");
				double price = sc.nextDouble();
				function.priceCheckEProcedure(PriceE, price);
			}else if(x == 2) {
				System.out.println("Enter Your Price: ");
				double price = sc.nextDouble();
				function.priceCheckLProcedure(PriceL, price);
			}else {
				System.out.println("You did not enter a correct input");
			}
		}else if(c == 5) {
			System.out.println("Enter a Developer or Publisher Name: ");
			String name = sc.nextLine();
			function.devPubProcedure(DevPub, name);
		}else if(c == 6) {			
			System.out.println("Enter how many you'd like to see: ");
			int playtime = sc.nextInt();
			function.topAVGProcedure(TopAvg,playtime);
		}else if(c == 7) {
			System.out.println("Enter your games ID: ");
			int id = sc.nextInt();
			function.LikeGameProcedure(LikeGame, id);
		}else if(c == 8){
			System.out.println("Enter your games ID: ");
			int id = sc.nextInt();
			function.BadGameProcedure(BadGame, id);
		}else {
			System.out.println("You did not enter a correct input");
		}

	}
	
}
