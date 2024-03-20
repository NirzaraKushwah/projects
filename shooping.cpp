#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
	
	char startvalue;
	char choiceagain;
	float onlineshooping(void);
	startlevel:
	cout<<"press s to start"<<endl;
	start:
	cin>>startvalue;
	if(startvalue=='s'|| startvalue=='S')
	{
		float totalAmount=onlineshooping();
		cout<<"total billamount is"<<endl;
		shopagain:
		cout<<"do you want shooping again, y or n"<<endl;
		cin>>choiceagain;
		char y ,n;
		if(choiceagain='y')
		{
		   goto	startlevel;
		}
		else if(choiceagain=n)
		{
			cout<<"thanks for shooping"<<endl;
		}
		else
		{
			cout<<"you have enter wrong option,please s"<<endl;
			goto shopagain;
		}
	}
	
	else
	{
		cout<<"you have entered wrong option,please s"<<endl;
		goto start;
}
float onlineshooping();
{
	char choice;
    char item;
	int quantity;
	float billamount;
	itemlevel:
	cout<<"------welcome to online shooping-------"<<endl;
	cout<<"please follow the instructions"<<endl;
	cout<<"(1) enter m for mobil phones"<<endl;
	cout<<"(2) enter k for kids clothes"<<endl;
	cout<<"(3) enter t for toys"<<endl;
	cout<<"(4) enter w for womens wear"<<endl;
	cout<<"(5) enter c for cousmetics"<<endl;
	cout<<"(6) enter l for laptops"<<endl;
	cout<<"(7) enter e for electronics"<<endl;
	cout<<"(8) enter j for jwellry"<<endl;
	cin>>choice;
	
	//mobile phone	
	if(choice=='M'||choice=='m')
	{ mobilelevel:
		cout<<"mobile details"<<endl;
		cout<<"(1)Apple => price: 60000"<<endl;
		cout<<"(2)redmi => price: 10000"<<endl;
		cout<<"(3)vivo => price: 55000"<<endl;
		cout<<"(4)one plus => price: 40000"<<endl;
		cout<<"please enter your choice";
		cin>>item;
		 if(item=='1')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*60000;
		 }
		 else if(item=='2')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*10000;
		 }
		 else if(item=='3')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*55000;
		 	
		 }
		 else if(item=='4')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*40000;
		 }
		 else{
		 	cout<<"you entered wrong item please enter right item"<<endl;
		 	goto mobilelevel;
		 }	
	}
	


	//kids cloths
	 
	else if(choice=='k' || choice=='K')
	{   kidslevel:
		cout<<"kids cloths"<<endl;
		cout<<"(1)T-shirts => price: 600"<<endl;
		cout<<"(2)pents=> price: 1000"<<endl;
		cout<<"(3)shots => price: 550"<<endl;
		cout<<"(4)caps => price: 40"<<endl;
		cout<<"please enter your choice";
		cin>>item;
		 if(item=='1')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*600;
		 }
		 else if(item=='2')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*1000;
		 }
		 else if(item=='3')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*550;
		 	
		 }
		 else if(item=='4')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*40;
		 }
		 else{
		 	cout<<"you entered wrong item please enter right item"<<endl;
		 	goto kidslevel;
		 }
	}
	
	//toys
	else if(choice=='t'||choice=='T')
{
	
        toylevel:
		
		cout<<"(1)tedys => price: 600"<<endl;
		cout<<"(2)cars => price: 1000"<<endl;
		cout<<"(3)puzzel => price: 550"<<endl;
		cout<<"(4)ludo => price : 400"<<endl;
		cout<<"please enter your choice";
		cin>>item;
		 if(item=='1')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*600;
		 	
		 }
		 else if(item=='2')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*1000;
		 }
		 else if(item=='3')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*550;
		 	
		 }
		 else if(item=='4')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*400;
		 }
		 else{
		 	cout<<"you entered wrong item please enter right item"<<endl;
		 	goto toylevel;
		 }
		}
		//womens weAR
		

 else if(choice=='w'||choice=='W')
	{
         womenlevel:
		
		cout<<"(1)tops => price: 600"<<endl;
		cout<<"(2)kurti => price: 300"<<endl;
		cout<<"(3)sare => price: 550"<<endl;
		cout<<"(4)jeans => price : 500"<<endl;
		cout<<"please enter your choice";
		cin>>item;
		 if(item=='1')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*600;
		 	
		 }
		 else if(item=='2')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*300;
		 }
		 else if(item=='3')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*550;
		 	
		 }
		 else if(item=='4')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*500;
		 }
		 else{
		 	cout<<"you entered wrong item please enter right item"<<endl;
		 	goto womenlevel;
		 }
		}
			//cousmetics
			if(choice=='c'||choice=='C')
{
         cousmeticlevel:
		
		cout<<"(1)facepack => price: 60"<<endl;
		cout<<"(2)eyeshade => price: 100"<<endl;
		cout<<"(3)blush => price: 500"<<endl;
		cout<<"(4)linear=> price : 400"<<endl;
		cout<<"please enter your choice";
		cin>>item;
		 if(item=='1')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*60;
		 	
		 }
		 else if(item=='2')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*100;
		 }
		 else if(item=='3')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*500;
		 	
		 }
		 else if(item=='4')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*400;
		 }
		 else{
		 	cout<<"you entered wrong item please enter right item"<<endl;
		 goto cousmeticlevel;
		 }
		}
		
		//laptops 
	else if(choice=='l'||choice=='L')
		{
         laptoplevel:
		
		cout<<"(1)dell => price: 60000"<<endl;
		cout<<"(2)hp => price: 40000"<<endl;
		cout<<"(3)lenova=> price: 50000"<<endl;
		cout<<"(4)ipad => price : 1000000"<<endl;
		cout<<"please enter your choice";
		cin>>item;
		 if(item=='1')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*60000;
		 	
		 }
		 else if(item=='2')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*40000;
		 }
		 else if(item=='3')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*50000;
		 	
		 }
		 else if(item=='4')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*1000000;
		 }
		 else{
		 	cout<<"you entered wrong item please enter right item"<<endl;
		 	goto laptoplevel;
		 }
		}
		//electroics 
	else if(choice=='e'||choice=='E')
		{
			electroniclevel:
		
		cout<<"(1)tv => price: 20000"<<endl;
		cout<<"(2)washing machine => price: 10000"<<endl;
		cout<<"(3)refrigerater=> price: 20000"<<endl;
		cout<<"(4)coller => price : 5000"<<endl;
		cout<<"please enter your choice";
		cin>>item;
		 if(item=='1')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*20000;
		 	
		 }
		 else if(item=='2')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*10000;
		 }
		 else if(item=='3')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*20000;
		 	
		 }
		 else if(item=='4')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*5000;
		 }
		 else{
		 	cout<<"you entered wrong item please enter right item"<<endl;
		 	goto electroniclevel;

		 }
		}
		//jwellry
	else if(choice=='j'||choice=='J')
	{	
         jwellrylevel:
		
		cout<<"(1)gold neckless => price:90000"<<endl;
		cout<<"(2)gold bangals => price: 3000000"<<endl;
		cout<<"(3) gold earrings => price: 50000"<<endl;
		cout<<"(4)gold ring => price : 40000"<<endl;
		cout<<"please enter your choice";
		cin>>item;
		 if(item=='1')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*90000;
		 	
		 }
		 else if(item=='2')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount+quantity*3000000;
		 }
		 else if(item=='3')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*50000;
		 	
		 }
		 else if(item=='4')
		 {
		 	cout<<"enter quantity"<<endl;
		 	cin>>quantity;
		 	billamount=billamount*40000;
		 }
		 else{
		 	cout<<"you entered wrong item please enter right item"<<endl;
		  goto jwellrylevel;
		 }
	}
		else
		{
			cout<<"you are not interested to shoping"<<endl;
			goto itemlevel;

	}

return billamount;
}

	

	

	

	

