import java.rmi.Naming;
import java.util.*;
public class Client
{
	public static void main(String args[])
	{
		try
		{
			Inter ai=(Inter)Naming.lookup("//localhost/Implement");
			String name;
			String city;
			int rentflag[] = new int[20];
			String address;
			Scanner s= new Scanner(System.in);
			System.out.println("\n\nPlease provide your Details For Delivery ");
			System.out.println("\nEnter your name:");
			name=s.nextLine();
			System.out.println("\nEnter city:");
			city=s.nextLine();
			System.out.println("\nEnter your Address: ");
			address=s.nextLine();
			System.out.println("\nYou have successfully Registered In !! Enjoy Music Library Services ::\n");			
			//ArrayList<String> products=new ArrayList<String>();
			//products.add("Shirts");products.add("Iphone");products.add("HPLaptops");products.add("LEECopper");products.add("Jeans");products.add("Watches");
			String products[]=new String[7];
			String albums[]=new String[7];
			String artist[]=new String[7];
			String company[]=new String[7];
			String song[][]=new String[7][7];
			int items[]=new int[10];
			int prices[]=new int[10];
			String msg1,msg2;
			products=ai.orderDetails();
			albums=ai.getAlbum();
			artist=ai.getArtist();
			company=ai.getCompany();
			items=ai.getItems();
			prices=ai.getPrice();
			song=ai.getSongs();
			
			int ch,c=0,l=0;
			int qty[]=new int[10];
			for(l=0;l<products.length;l++){
				qty[l]=0;
			}
			for(l=0;l<products.length;l++){
				rentflag[l]=0;
			}
			int n[]=new int[10];
			for(l=0;l<6;l++){
				n[l]=0;
			}
			int x[]=new int[10];
			do
			{
				System.out.println("\n1.Show List of Music Album Available:");
				System.out.println("2.Purchase Music Album");
				System.out.println("3.Rent Music Album");
				System.out.println("4.Return Music Album");
				System.out.println("5.Show Details");
				System.out.println("6.Log Out\n");
				System.out.println("\nEnter your choice");
				ch=s.nextInt();
				switch(ch)
				{
					case 1: x=ai.show();
					for(l=0;l<products.length;l++){
						System.out.println(l+"\tMusic Album =>"+products[l]);
						
					}
					System.out.println("Enter the Album Number for More Details");
					int opty = s.nextInt();
					switch(opty)
					{
						case 0:
						System.out.println("Artist =>"+artist[opty]+"\tCompany =>"+company[opty]+"\tPrice =>"+prices[opty]+"\tAlbums Available=> "+x[opty]);
						System.out.println("Songs Available In Album ::\n");
						for(int sd=0;sd<5;sd++)
						{
							System.out.println(sd+"\t"+song[opty][sd]);
						}
						break;
						case 1:
						System.out.println("Artist =>"+artist[opty]+"\tCompany =>"+company[opty]+"\tPrice =>"+prices[opty]+"\tAlbums Available=> "+x[opty]);
						System.out.println("Songs Available In Album ::\n");
						for(int sd=0;sd<5;sd++)
						{
							System.out.println(sd+"\t"+song[opty][sd]);
						}
						break;
						case 2:
						System.out.println("Artist =>"+artist[opty]+"\tCompany =>"+company[opty]+"\tPrice =>"+prices[opty]+"\tAlbums Available=> "+x[opty]);
						System.out.println("Songs Available In Album ::\n");
						for(int sd=0;sd<5;sd++)
						{
							System.out.println(sd+"\t"+song[opty][sd]);
						}
						break;
						case 3:
						System.out.println("Artist =>"+artist[opty]+"\tCompany =>"+company[opty]+"\tPrice =>"+prices[opty]+"\tAlbums Available=> "+x[opty]);
						System.out.println("Songs Available In Album ::\n");
						for(int sd=0;sd<5;sd++)
						{
							System.out.println(sd+"\t"+song[opty][sd]);
						}
						break;
						case 4:
						System.out.println("Artist =>"+artist[opty]+"\tCompany =>"+company[opty]+"\tPrice =>"+prices[opty]+"\tAlbums Available=> "+x[opty]);
						System.out.println("Songs Available In Album ::\n");
						for(int sd=0;sd<5;sd++)
						{
							System.out.println(sd+"\t"+song[opty][sd]);
						}
						break;
						case 5:
						System.out.println("Artist =>"+artist[opty]+"\tCompany =>"+company[opty]+"\tPrice =>"+prices[opty]+"\tAlbums Available=> "+x[opty]);
						System.out.println("Songs Available In Album ::\n");
						for(int sd=0;sd<5;sd++)
						{
							System.out.println(sd+"\t"+song[opty][sd]);
						}
						break;

					}
					break;
					case 2: System.out.println("\nEnter Album number to Buy::");
					c=s.nextInt();
					System.out.println("\nQuantity of Album::");
					qty[c]=s.nextInt();
					msg1=ai.Borrow(c,qty);
					System.out.println(msg1);
					break;
					case 3: System.out.println("\nEnter Album number to Rent::");
					c=s.nextInt();
					rentflag[c]=1;
					qty[c]=1;
					msg1=ai.Borrow(c,qty);
					System.out.println(msg1);
					break;
					case 4: System.out.println("\nEnter Album number to be Returned::");
					c=s.nextInt();						
					System.out.println("\nQuantity of Album::");
					n[c]=s.nextInt();
					msg2=ai.ReturnMusic(c,n,qty);
					System.out.println(msg2);
					break;
					case 5: 
					for(l=0;l<products.length;l++)
					{
						qty[l]=qty[l]-n[l];
					}
					System.out.println("Name: "+name);
					System.out.println("City: "+city);
					System.out.println("Address : "+address);
					for(l=0;l<products.length;l++)
					{
						if(qty[l]!=0 && qty[l]>=0)
						{
							if(rentflag[l]==0)
							{
								System.out.println("\nMusic Album: "+products[l]+"\tNumber of Music Album Purchased => "+qty[l]+"\tTotal Price :"+(prices[l]*qty[l]));
							}
							else
								System.out.println("\nMusic Album Taken On Rent: "+products[l]);
							
						}
					}
					break;
					case 6: System.out.println(name+" Thank You For Using Shahid Music Library Services\n");
					break;
				}
			}while(ch!=6);
		}
		catch(Exception e)
		{
			System.out.println("Client Exception: "+e);
		}
	}
}
