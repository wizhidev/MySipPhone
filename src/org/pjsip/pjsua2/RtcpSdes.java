/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class RtcpSdes {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RtcpSdes(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RtcpSdes obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_RtcpSdes(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCname(String value) {
    pjsua2JNI.RtcpSdes_cname_set(swigCPtr, this, value);
  }

  public String getCname() {
    return pjsua2JNI.RtcpSdes_cname_get(swigCPtr, this);
  }

  public void setName(String value) {
    pjsua2JNI.RtcpSdes_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return pjsua2JNI.RtcpSdes_name_get(swigCPtr, this);
  }

  public void setEmail(String value) {
    pjsua2JNI.RtcpSdes_email_set(swigCPtr, this, value);
  }

  public String getEmail() {
    return pjsua2JNI.RtcpSdes_email_get(swigCPtr, this);
  }

  public void setPhone(String value) {
    pjsua2JNI.RtcpSdes_phone_set(swigCPtr, this, value);
  }

  public String getPhone() {
    return pjsua2JNI.RtcpSdes_phone_get(swigCPtr, this);
  }

  public void setLoc(String value) {
    pjsua2JNI.RtcpSdes_loc_set(swigCPtr, this, value);
  }

  public String getLoc() {
    return pjsua2JNI.RtcpSdes_loc_get(swigCPtr, this);
  }

  public void setTool(String value) {
    pjsua2JNI.RtcpSdes_tool_set(swigCPtr, this, value);
  }

  public String getTool() {
    return pjsua2JNI.RtcpSdes_tool_get(swigCPtr, this);
  }

  public void setNote(String value) {
    pjsua2JNI.RtcpSdes_note_set(swigCPtr, this, value);
  }

  public String getNote() {
    return pjsua2JNI.RtcpSdes_note_get(swigCPtr, this);
  }

  public RtcpSdes() {
    this(pjsua2JNI.new_RtcpSdes(), true);
  }

}
