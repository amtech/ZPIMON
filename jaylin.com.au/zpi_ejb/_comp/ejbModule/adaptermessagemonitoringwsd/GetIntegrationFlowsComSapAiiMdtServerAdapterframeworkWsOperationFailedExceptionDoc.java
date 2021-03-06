package adaptermessagemonitoringwsd;

/**
 * Exception class for service fault.
 */
@javax.xml.ws.WebFault(name = "getIntegrationFlows_com.sap.aii.mdt.server.adapterframework.ws.OperationFailedException", targetNamespace = "urn:AdapterMessageMonitoringWsd/AdapterMessageMonitoringVi", faultBean = "ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException")
public class GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc extends java.lang.Exception {

  private ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException _GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;

  public GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo){
    super(message);
    this._GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc(String message, ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException faultInfo, Throwable cause){
    super(message, cause);
    this._GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc = faultInfo;
  }

  public ws.adapterframework.server.mdt.aii.sap.com.OperationFailedException getFaultInfo(){
    return this._GetIntegrationFlowsComSapAiiMdtServerAdapterframeworkWsOperationFailedExceptionDoc;
  }

}
