/**
 * DNIService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public interface DNIService extends javax.xml.rpc.Service {
    public java.lang.String getDNIAddress();

    public DefaultNamespace.DNI getDNI() throws javax.xml.rpc.ServiceException;

    public DefaultNamespace.DNI getDNI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
