/**
 * DNIServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package DefaultNamespace;

public class DNIServiceLocator extends org.apache.axis.client.Service implements DefaultNamespace.DNIService {

    public DNIServiceLocator() {
    }


    public DNIServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DNIServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DNI
    private java.lang.String DNI_address = "http://localhost:8080/ProyectoServidor/services/DNI";

    public java.lang.String getDNIAddress() {
        return DNI_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DNIWSDDServiceName = "DNI";

    public java.lang.String getDNIWSDDServiceName() {
        return DNIWSDDServiceName;
    }

    public void setDNIWSDDServiceName(java.lang.String name) {
        DNIWSDDServiceName = name;
    }

    public DefaultNamespace.DNI getDNI() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DNI_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDNI(endpoint);
    }

    public DefaultNamespace.DNI getDNI(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            DefaultNamespace.DNISoapBindingStub _stub = new DefaultNamespace.DNISoapBindingStub(portAddress, this);
            _stub.setPortName(getDNIWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDNIEndpointAddress(java.lang.String address) {
        DNI_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (DefaultNamespace.DNI.class.isAssignableFrom(serviceEndpointInterface)) {
                DefaultNamespace.DNISoapBindingStub _stub = new DefaultNamespace.DNISoapBindingStub(new java.net.URL(DNI_address), this);
                _stub.setPortName(getDNIWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DNI".equals(inputPortName)) {
            return getDNI();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://DefaultNamespace", "DNIService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://DefaultNamespace", "DNI"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DNI".equals(portName)) {
            setDNIEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
