package test;
import java.util.*;
class CompetitionLog{
			 int playerNumber;
			 String completeSets;
			 String incompleteSets;
			 int piecesBuilt;
			
			CompetitionLog(){
				
			}
			
		 
			public CompetitionLog(int playerNumber, String completeSets, String incompleteSets, int piecesBuilt) {
				// TODO Auto-generated constructor stub
			}
			
			public void setPlayerNumber(int n) {
				 this.playerNumber =n;// takes no parameters and returns player number corresponding
			}
			
			public int getPlayerNumber() {
				return this.playerNumber;// takes no parameters and returns player number corresponding
			}
			
			public String getCompleteSets() {
				return this.getCompleteSets();// Takes no parameters and returns sets completed by the player
			}
			
			public String getIncompleteSets() {
				return this.incompleteSets;	//:Takes no parameters and returns sets not completed by the player
			}

			public int getPiecesBuilt() {
				return this.piecesBuilt;//  take no parameters and returns pieces built by the player
			}
			public void setCompleteSets(String completeSets) {
				this.completeSets = completeSets; //: Updates completedSets field with input parameter
			}
			public void setIncompletesets(String incompleteSets){
				this.incompleteSets = incompleteSets;// : Updates incomplete sets field with input parameter
			}
			public void setPiecesBuilt(int piecesBuilt) {
				this.piecesBuilt = piecesBuilt; //Updates piecesBuilt held with input parameter
			}
			public String toString() {
				return "Player "+this.playerNumber+" completed the following sets: "+this.completeSets+"\n"
						+"Player "+this.playerNumber+" did not complete the following sets: "+this.incompleteSets+"\n"
						+"Player "+this.playerNumber+" built total of "+this.piecesBuilt+" pieces";
			}
			
			
			
			
		}

		class LegoSet{
			String legoSetName;
			int legoSize=0;
			int rem=0;
			
			public LegoSet(String legoSetName,int legoSize) {
				// TODO Auto-generated constructor stub
				this.legoSetName = legoSetName;
				this.legoSize = legoSize;
			}
			
			public String getLegoSetName() {
				return legoSetName;
			}
			public void setLegoSetName(String legoSetName) {
				this.legoSetName = legoSetName;
			}
			public int getLegoSize() {
				return legoSize;
			}
			public void setLegoSize(int legoSize) {
				this.legoSize = legoSize;
			}
			public int getRem() {
				return rem;
			}
			public void setRem(int rem) {
				this.rem = rem;
			}
			
			public boolean isFinished() {
				return (this.rem==0);
				
			}
		}
			
			
			
		//class Game{
		//	
//			int count=0;
//			CompetitionLog player;
//			LegoSet legoset1;
//			LegoSet legoset2;
//			LegoSet legoset3;
//			int piecesUsed=0;
//			static int setsLeft=3;
		//	
		//
//			Game(LegoSet l1, LegoSet l2, LegoSet l3,int piecesUsed){
//				legoset1=l1;
//				legoset2=l2;
//				legoset3=l3;	
//				this.piecesUsed=piecesUsed;
//				
//			}
		//	
//			public int getPiecesUsed() {
//				return piecesUsed;
//			}
		//
//			public void setPiecesUsed(int piecesUsed) {
//				this.piecesUsed = piecesUsed;
//			}
		//
//			Game(CompetitionLog player,LegoSet l1, LegoSet l2, LegoSet l3){ //initial constructor
//				legoset1=l1;
//				legoset2=l2;
//				legoset3=l3;	
//				this.player=player;
//				
//				
//			}
		//
		//
		//
//			boolean isGameFinished() {
//				int totalPiecesLeft = legoset1.getLegoSize()+legoset2.getLegoSize()+legoset3.getLegoSize();
//				return (totalPiecesLeft-piecesUsed==0);
//			}
		//	
		//	
		//}
			
			// method to check if the current lego set is done
					
			
			//method to check if all 3 sets are done




		public class leo{
			static int days=0;
			

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				String name1,name2,name3;
				int legoSize1,legoSize2,legoSize3;
				System.out.println("Welcome to the Lego set competition!");
				
				game: while(true) {
				System.out.println("Enter the name of Lego set 1");
				name1 = sc.next();
				System.out.println("Enter the number of pieces in Lego set 1");
				legoSize1 = sc.nextInt();
				LegoSet l1 = new LegoSet(name1, legoSize1);
				
				System.out.println("Enter the name of Lego set 2");
				name2 = sc.next();
				System.out.println("Enter the number of pieces in Lego set 2");
				legoSize2 = sc.nextInt();
				LegoSet l2 = new LegoSet(name2, legoSize2);
				
				System.out.println("Enter the name of Lego set 3");
				name3 = sc.next();
				System.out.println("Enter the number of pieces in Lego set 3");
				legoSize3 = sc.nextInt();
				LegoSet l3 = new LegoSet(name3, legoSize3);
				
				CompetitionLog p1  = new CompetitionLog();
				CompetitionLog p2  = new CompetitionLog();
				
				p1.setPlayerNumber(1);
				p2.setPlayerNumber(2);
				
				int totalLegoSize = legoSize1+legoSize2+legoSize3;
				int remLegos1=totalLegoSize; //remaining total legos for pl
				int remLegos2=totalLegoSize; //remaining total legos for p2
				int savedTotalLegoSize = totalLegoSize;
				int piecesUsed1=0;
				int piecesUsed2=0;
				
				System.out.println("Enter the number of pieces player "+p1.getPlayerNumber()+" used for building on day"+days);
				int pieces1 = sc.nextInt();
				remLegos1-=pieces1;
				piecesUsed1+=pieces1;
				
				
				System.out.println("Enter the number of pieces player "+p2.getPlayerNumber()+" used for building on day"+days);
				int pieces2 = sc.nextInt();
				remLegos2-=pieces2;
				piecesUsed2+=pieces2;

				days+=1;
				
				//is game finished?
				while(remLegos1>=0 && remLegos2>=0) {

				}
				
				
				if(remLegos1<=0 && remLegos2<=0) {
					System.out.println("tiebreaker game.. lets start all over again! \n");
					continue game;
				}
				
				if(remLegos1<=0) {
					System.out.println("player 1 has won.");
					p1.setCompleteSets(l1.getLegoSetName()+""+l2.getLegoSetName()+l3.getLegoSetName());
					p1.setIncompletesets("None");
					p1.setPiecesBuilt(piecesUsed1);
					

					String p2Done = "";
					String p2NotDone =l1.getLegoSetName()+l2.getLegoSetName()+l3.getLegoSetName();
					if(piecesUsed2>=l1.legoSize) {
						p2Done+=","+l1.getLegoSetName();
						p2NotDone=l2.getLegoSetName()+l3.getLegoSetName();
						piecesUsed2-=l1.legoSize;
						
						if(piecesUsed2>=l2.legoSize) {
							p2Done+=","+l2.getLegoSetName();
							p2NotDone=l3.getLegoSetName();
							piecesUsed2-=l2.legoSize;
							
							if(piecesUsed2>=l3.legoSize) {
								p2Done+=l3.getLegoSetName();
								p2NotDone="None";
								piecesUsed2-=l3.legoSize;	
							}
							}
						
						}
					
					if(p2Done=="")
						p2Done="None";
					
					
					p2.setCompleteSets(p2Done);
					p2.setIncompletesets(p2NotDone);
					p2.setPiecesBuilt(piecesUsed2);
					
				
				
					System.out.println(p1);
					System.out.println(p2);
					System.out.println("The competition lasted "+days+" days.");
					break;
					}
					
					
				
				
				if(remLegos2<=0) {
					System.out.println("player 2 has won. ");

					p2.setCompleteSets(l1.getLegoSetName()+""+l2.getLegoSetName()+l3.getLegoSetName());
					p2.setIncompletesets("None");
					p2.setPiecesBuilt(piecesUsed2);
					
					
					
					
					String p1Done = "";
					String p1NotDone =l1.getLegoSetName()+l2.getLegoSetName()+l3.getLegoSetName();
					if(piecesUsed1>=l1.legoSize) {
						p1Done+=","+l1.getLegoSetName();
						p1NotDone =l2.getLegoSetName()+l3.getLegoSetName();
						piecesUsed1-=l1.legoSize;
						
						if(piecesUsed1>=l2.legoSize) {
							p1Done+=l2.getLegoSetName();
							p1NotDone =l3.getLegoSetName();
							piecesUsed1-=l2.legoSize;
							
							if(piecesUsed1>=l3.legoSize) {
								p1Done+=l3.getLegoSetName();
								p1NotDone ="None";
								piecesUsed1-=l3.legoSize;	
							}
							}
						
						}
					if(p1Done=="")
						p1Done="None";
					
					p1.setCompleteSets(p1Done);
					p1.setIncompletesets(p1NotDone );
					p1.setPiecesBuilt(piecesUsed1);
					
					
					
					System.out.println(p1);
					System.out.println(p2);
					System.out.println("The competition lasted "+days+" days.");
					break;
				}
				}
				
				
				
				

				
				


			


	}

}
