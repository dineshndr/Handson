class Delivery

{

              private long over,ball,runs;

              private String batsman;

              private String bowler;

              private String nonStriker;

             

              Delivery(long over,long ball,long runs,String batsman,String bowler,String nonStriker)
              {
            	  
              }
              
              Delivery()
              {
            	  super();
              }

          

             

             
			public long getOver() {
				return over;
			}

			public void setOver(long over) {
				this.over = over;
			}

			public long getBall() {
				return ball;
			}

			public void setBall(long ball) {
				this.ball = ball;
			}

			public long getRuns() {
				return runs;
			}

			public void setRuns(long runs) {
				this.runs = runs;
			}

			public String getBatsman() {
				return batsman;
			}

			public void setBatsman(String batsman) {
				this.batsman = batsman;
			}

			public String getBowler() {
				return bowler;
			}

			public void setBowler(String bowler) {
				this.bowler = bowler;
			}

			public String getNonStriker() {
				return nonStriker;
			}

			public void setNonStriker(String nonStriker) {
				this.nonStriker = nonStriker;
			}

			void displayDeliveryDetails()

              {
            	  			System.out.println("Delivery details");

                             System.out.println("Over:"+over);

                             System.out.println("Ball:"+ball);

                             System.out.println("Runs:"+runs);

                             System.out.println("Batsman:"+batsman);

                             System.out.println("Bowler:"+bowler);

                             System.out.println("NonStriker:"+nonStriker);   

              }

             

 

}