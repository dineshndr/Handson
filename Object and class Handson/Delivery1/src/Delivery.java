class Delivery

{

              private long over,ball,runs;

              private String batsman;

              private String bowler;

              private String nonStriker;

             

              public Delivery(long over,long ball,long runs,String batsman,String bowler,String nonStriker)

              {

                             this.batsman=batsman;

                             this.bowler=bowler;

                             this.nonStriker=nonStriker;

                             this.over=over;

                             this.ball=ball;

                             this.runs=runs;

              }

             

              public void displayDeliveryDetails()

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
