import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class Implement extends UnicastRemoteObject implements Inter
{
	private static int items[]={20,40,60,10,100,200};
	private static int price[]={2000,6000,8500,2500,1500,5000};

	private static String artist[]= new String[] {"Atif Aslam","Momina","Darshan Raval","Scooby Doo","Tyson ZX","Shahid"};
	private static String album[]= new String[] {"Tiger Zinda Hai","CS Season 4","Single","Scooby Mux","TZX","Shah Mux"};
	private static String company[]= new String[] {"Zee Music","Coke Studio","RedMusic","HRX Music","Tom Mux","Leee Power Music"};
	private static String songs[][] = new String[][] {{"Swag Se Swagat","Zinda Hai","Daata Tu","Tera Noor","Dil Diyan Gallan Unplug"},
	{"Shape of You","Cold Nights","PowerFull","Romania","Blah Blah"},
	{"Power Man","Night Night","Good Life","Amnsesia","Gucci Gang"},
	{"Perfect","How Long","How Short","How WE SUrvived","Thousand Attacks"},
	{"na Na Na","shalala","Do Re Me","So la ","tam tam"},
	{"Exorcist","Magus","Shini Gami","Oni Chan","Senpai"}
};
	//private int k=0;
public Implement() throws RemoteException
{
}
public String Borrow(int choice,int quant[])
{
	int flag,m;
	int y[]=new int [10];
	flag=choice; y=quant;
	for(m=0;m<items.length;m++)
	{
		if(m==flag && items[m]>=y[m]){
			items[m]-=y[m];
			break;
		}
	}
	if(m==items.length)
		return "Not Enough stock of the Music Album";
	return "";
}
public int[] show()
{
	return items;
}
public String ReturnMusic(int c1,int n1[],int qty1[])
{
	int flag1,m;
	int can[]=new int [10];
	int quant[]=new int [10];
	flag1=c1;can=n1;quant=qty1;
	for(m=0;m<items.length;m++)
	{
		if(m==flag1 && quant[m]!=0 && can[m]<=quant[m]){
			items[m]+=can[m];			
			break;
		}
	}
	if(m==items.length)
		return "You Have Not Borrowed/Bought that Music Album";
	return "";
}
public String[] orderDetails()
{
	String shop[]= new String[] {"Tiger Zinda Hai","CS Season 4","Single","Scooby Mux","TZX","Shah Mux"};
	return shop;
}
public int[] getItems()
{
	return items;
}
public String[][] getSongs()
{
	return songs;
}
public String[] getArtist()
{
	return artist;
}
public int[] getPrice()
{
	return price;
}
public String[] getAlbum()
{
	return album;
}
public String[] getCompany()
{
	return company;
}


}
