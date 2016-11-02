package DefaultNamespace;

public class DNIProxy implements DefaultNamespace.DNI {
  private String _endpoint = null;
  private DefaultNamespace.DNI dNI = null;
  
  public DNIProxy() {
    _initDNIProxy();
  }
  
  public DNIProxy(String endpoint) {
    _endpoint = endpoint;
    _initDNIProxy();
  }
  
  private void _initDNIProxy() {
    try {
      dNI = (new DefaultNamespace.DNIServiceLocator()).getDNI();
      if (dNI != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)dNI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)dNI)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (dNI != null)
      ((javax.xml.rpc.Stub)dNI)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public DefaultNamespace.DNI getDNI() {
    if (dNI == null)
      _initDNIProxy();
    return dNI;
  }
  
  public java.lang.String calculaLetraDNI(int dni) throws java.rmi.RemoteException{
    if (dNI == null)
      _initDNIProxy();
    return dNI.calculaLetraDNI(dni);
  }
  
  
}