import java.rmi.*;
public interface Inter extends Remote
{
	public int[] show() throws RemoteException;
	public String Borrow(int choice,int remaining[]) throws RemoteException; //purchase tha Borrow kiya
	public String ReturnMusic(int c1,int n1[],int qty1[]) throws RemoteException; //cancelitem tha ReturnBook kiya
	public String[] orderDetails() throws RemoteException;
	public String[] getArtist() throws RemoteException;
	public String[] getAlbum() throws RemoteException;
	public String[] getCompany() throws RemoteException;
	public int[] getItems() throws RemoteException;
	public int[] getPrice() throws RemoteException;
	public String[][] getSongs() throws RemoteException;
	
}
