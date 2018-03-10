import MuxixApp.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import org.omg.PortableServer.*;
import org.omg.PortableServer.POA;
import java.util.Properties;
class MuxixImpl extends MuxixPOA {
	private ORB orb;
	public void setORB(ORB orb_val) {
		orb = orb_val;
	}
// implement sayMuxix() method this definition can be replaced with own method
/*public String sayMuxix()
{
return "\nMuxix world !!\n";
}*/

private static double items[]={13.0,12.0,60.0,10.0,100.0,200.0};
private static double price[]={12000.0,60000.0,500.0,2500.0,150.0,50.0};


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

public MuxixImpl()
{

}

public String Borrow(double choice,double quant[])
{
	double flag;
	int m;
	double y[]=new double [10];
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
public double[] show()
{
	return items;
}
public String ReturnMusic(double c1,double n1[],double qty1[])
{
	double flag1;
	int m;
	double can[]=new double [10];
	double quant[]=new double [10];
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
public double[] getItems()
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
public double[] getPrice()
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





// implement shutdown() method
public void shutdown()
{
	orb.shutdown(true);
}
}
public class MuxixServer
{public static void main(String args[])
	{
		try
		{
// create and initialize the ORB
			ORB orb = ORB.init(args, null);
// get reference to rootpoa & activate the POAManager
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();
// create servant and register it with the ORB
			MuxixImpl MuxixImpl = new MuxixImpl();
			MuxixImpl.setORB(orb);
// get object reference from the servant
			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(MuxixImpl);
			Muxix href = MuxixHelper.narrow(ref);
// get the root naming context
			org.omg.CORBA.Object objRef =
			orb.resolve_initial_references("NameService");
// Use NamingContextExt which is part of the Interoperable
// Naming Service (INS) specification.
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
// bind the Object Reference in Naming
			String name = "Muxix";
			NameComponent path[] = ncRef.to_name( name );
			ncRef.rebind(path, href);
			System.out.println("MuxixServer ready and waiting ...");
// wait for invocations from clients
			orb.run();
		}
		catch (Exception e) {
			System.err.println("ERROR: " + e);e.printStackTrace(System.out);
		}
		System.out.println("MuxixServer Exiting ...");
	}
}
