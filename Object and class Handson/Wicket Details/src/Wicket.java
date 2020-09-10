class Wicket {
		private long over,ball;
		
		private String wicketType,playerName,bowlerName;
		
		Wicket( long over,long ball,String wicketType,String playerName,String bowlerName)
		{
			
		}
		Wicket()
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
		public String getWicketType() {
			return wicketType;
		}
		public void setWicketType(String wicketType) {
			this.wicketType = wicketType;
		}
		public String getPlayerName() {
			return playerName;
		}
		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}
		public String getBowlerName() {
			return bowlerName;
		}
		public void setBowlerName(String bowlerName) {
			this.bowlerName = bowlerName;
		}
		
		public void Display()
		{
			System.out.println("Wicket Details");
			
			System.out.println("Over: "+over);
			
			System.out.println("Ball: "+ball);
			
			System.out.println("Wicket Type: "+wicketType);
			
			System.out.println("Player Name: "+playerName);
			
			System.out.println("Bowler Name: "+bowlerName);
			
		}
		
}

