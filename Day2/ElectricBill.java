class ElectricBill {
int cno;
String cname;
float PrevRead;
float CurRead;
String type;

void setData(int no,String name,float prevread,float currread,char Type) {
	cno=no;
	cname=name;
	PrevRead=prevread;
	CurRead=currread;
	if(Type=='d'||Type=='D')
	type="Domestic";
	else
	type="Commercial";
	
	double Bill=BillCalc(PrevRead,CurRead,type);
	System.out.println("Your Bill Amount is Rs "+Bill);
}
double BillCalc(float pre,float curr,String typ) {
	double diff= curr-pre;
	double bill=0;
	if(typ=="Domestic") {
		if (diff<=100)
			bill=diff;
		if(diff<=200)
			bill=(diff-100)*2.5+100*1;
		if(diff<=500)
			bill=(diff-200)*4+100*2.5+100*1;
		else
			bill=(diff-500)*6+300*4+100*2.5+100*1;
		
			
	}
	if(typ=="Commercial") {
		if (diff<=100)
			bill=diff*2;
		if(diff<=200)
			bill=(diff-100)*4.5+100*2;
		if(diff<=500)
			bill=(diff-200)*6+100*4.5+100*2;
		else
			bill=(diff-500)*7+300*6+100*4.5+100*2;
	}
	return bill;
}


public static void main(String args[]){  
	  ElectricBill obj=new ElectricBill();  
	    
	  obj.setData(42354,"Rahul",400,900,'C');  
	   
	    
	 }  

}