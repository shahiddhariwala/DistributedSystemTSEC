package MuxixApp;


/**
* MuxixApp/stringcompanyHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Muxix.idl
* Sunday, 4 February, 2018 9:15:04 PM IST
*/

public final class stringcompanyHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public stringcompanyHolder ()
  {
  }

  public stringcompanyHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MuxixApp.stringcompanyHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MuxixApp.stringcompanyHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MuxixApp.stringcompanyHelper.type ();
  }

}