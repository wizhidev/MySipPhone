/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class TransportInfo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected TransportInfo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(TransportInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_TransportInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(int value) {
    pjsua2JNI.TransportInfo_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return pjsua2JNI.TransportInfo_id_get(swigCPtr, this);
  }

  public void setType(pjsip_transport_type_e value) {
    pjsua2JNI.TransportInfo_type_set(swigCPtr, this, value.swigValue());
  }

  public pjsip_transport_type_e getType() {
    return pjsip_transport_type_e.swigToEnum(pjsua2JNI.TransportInfo_type_get(swigCPtr, this));
  }

  public void setTypeName(String value) {
    pjsua2JNI.TransportInfo_typeName_set(swigCPtr, this, value);
  }

  public String getTypeName() {
    return pjsua2JNI.TransportInfo_typeName_get(swigCPtr, this);
  }

  public void setInfo(String value) {
    pjsua2JNI.TransportInfo_info_set(swigCPtr, this, value);
  }

  public String getInfo() {
    return pjsua2JNI.TransportInfo_info_get(swigCPtr, this);
  }

  public void setFlags(long value) {
    pjsua2JNI.TransportInfo_flags_set(swigCPtr, this, value);
  }

  public long getFlags() {
    return pjsua2JNI.TransportInfo_flags_get(swigCPtr, this);
  }

  public void setLocalAddress(String value) {
    pjsua2JNI.TransportInfo_localAddress_set(swigCPtr, this, value);
  }

  public String getLocalAddress() {
    return pjsua2JNI.TransportInfo_localAddress_get(swigCPtr, this);
  }

  public void setLocalName(String value) {
    pjsua2JNI.TransportInfo_localName_set(swigCPtr, this, value);
  }

  public String getLocalName() {
    return pjsua2JNI.TransportInfo_localName_get(swigCPtr, this);
  }

  public void setUsageCount(long value) {
    pjsua2JNI.TransportInfo_usageCount_set(swigCPtr, this, value);
  }

  public long getUsageCount() {
    return pjsua2JNI.TransportInfo_usageCount_get(swigCPtr, this);
  }

  public TransportInfo() {
    this(pjsua2JNI.new_TransportInfo(), true);
  }

}
