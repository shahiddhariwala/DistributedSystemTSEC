package MuxixApp;


/**
* MuxixApp/stringalbumHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Muxix.idl
* Sunday, 4 February, 2018 9:15:04 PM IST
*/

public final class stringalbumHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public stringalbumHolder ()
  {
  }

  public stringalbumHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MuxixApp.stringalbumHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MuxixApp.stringalbumHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MuxixApp.stringalbumHelper.type ();
  }

}