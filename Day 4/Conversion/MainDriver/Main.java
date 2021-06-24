package MainDriver;
import currency.*;
import Distance.*;
import Time.*;
public class Main {

	public static void main(String[] args) {
		OthInr obj=new OthInr ();
		obj.eurtoinr(1);
		obj.doltoinr(1);
		obj.yentoinr(1);
		
		InrOth obj1=new  InrOth();
		obj1.eurtoinr(1);
		obj1.doltoinr(1);
		obj1.yentoinr(1);
		
        OthKm ref=new  OthKm();
        ref.kmtom(5);
        ref.kmtomiles(5);
        
        KmOth ref1=new KmOth();
        ref1.mtokm(1000);
        ref1.milestokm(2);
        
        OthMin tim=new OthMin();
        tim.hrtomin(3);
        tim.sectomin(60);
        
        MinOth tim1=new MinOth();
        tim1.mintohr(60);
        tim1.mintosec(1);
        
        	
	}

}
