package MuxixApp;


/**
* MuxixApp/doubleremHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Muxix.idl
* Sunday, 4 February, 2018 9:15:04 PM IST
*/

public final class doubleremHolder implements org.omg.CORBA.portable.Streamable
{
  public double value[] = null;

  public doubleremHolder ()
  {
  }

  public doubleremHolder (double[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = MuxixApp.doubleremHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    MuxixApp.doubleremHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return MuxixApp.doubleremHelper.type ();
  }

}
