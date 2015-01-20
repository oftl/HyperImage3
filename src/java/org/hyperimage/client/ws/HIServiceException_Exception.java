
package org.hyperimage.client.ws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "HIServiceException", targetNamespace = "http://ws.service.hyperimage.org/")
public class HIServiceException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private HIServiceException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public HIServiceException_Exception(String message, HIServiceException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public HIServiceException_Exception(String message, HIServiceException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.hyperimage.client.ws.HIServiceException
     */
    public HIServiceException getFaultInfo() {
        return faultInfo;
    }

}