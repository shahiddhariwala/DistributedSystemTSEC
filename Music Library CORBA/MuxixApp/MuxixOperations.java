package MuxixApp;


/**
* MuxixApp/MuxixOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Muxix.idl
* Sunday, 4 February, 2018 9:15:05 PM IST
*/

public interface MuxixOperations 
{
  double[] show ();
  double[] getPrice ();
  double[] getItems ();
  String Borrow (double choice, double[] remaining);
  String ReturnMusic (double c1, double[] n1, double[] qty1);
  String[] orderDetails ();
  String[] getArtist ();
  String[] getAlbum ();
  String[] getCompany ();
  String[][] getSongs ();

  //public String[][] getSongs() throws RemoteException;
  void shutdown ();
} // interface MuxixOperations
