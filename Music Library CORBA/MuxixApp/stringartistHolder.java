package MuxixApp;


/**
* MuxixApp/stringartistHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Muxix.idl
* Sunday, 4 February, 2018 9:15:04 PM IST
*/

public final class stringartistHolder implements org.omg.CORBA.portable.Streamable
{
  public String value[] = null;

  public stringartistHolder ()
  {
  }

  public stringartistHolder (String[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MuxixApp.stringartistHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MuxixApp.stringartistHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MuxixApp.stringartistHelper.type ();
  }

}