package MuxixApp;


/**
* MuxixApp/stringsongsHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Muxix.idl
* Sunday, 4 February, 2018 9:15:04 PM IST
*/

public final class stringsongsHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[][] = null;

  public stringsongsHolder ()
  {
  }

  public stringsongsHolder (String[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MuxixApp.stringsongsHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MuxixApp.stringsongsHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MuxixApp.stringsongsHelper.type ();
  }

}
