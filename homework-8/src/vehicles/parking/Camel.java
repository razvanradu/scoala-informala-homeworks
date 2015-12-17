package vehicles.parking;


public class Camel {

		private String name;
		private double distanceRan;
		private boolean camelRunning;

		public Camel(String name){
			this.name=name;
			this.camelRunning = false;
		}

		public void start() {
			this.distanceRan = 0;
			this.camelRunning = true;
		}
		
		public void stop() {
			this.camelRunning = false;
		}
		
		public void drive(double kilometers){
			this.distanceRan += kilometers;
		}
	}
	

