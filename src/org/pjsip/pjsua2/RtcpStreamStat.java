/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class RtcpStreamStat {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RtcpStreamStat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RtcpStreamStat obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_RtcpStreamStat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUpdate(TimeVal value) {
    pjsua2JNI.RtcpStreamStat_update_set(swigCPtr, this, TimeVal.getCPtr(value), value);
  }

  public TimeVal getUpdate() {
    long cPtr = pjsua2JNI.RtcpStreamStat_update_get(swigCPtr, this);
    return (cPtr == 0) ? null : new TimeVal(cPtr, false);
  }

  public void setUpdateCount(long value) {
    pjsua2JNI.RtcpStreamStat_updateCount_set(swigCPtr, this, value);
  }

  public long getUpdateCount() {
    return pjsua2JNI.RtcpStreamStat_updateCount_get(swigCPtr, this);
  }

  public void setPkt(long value) {
    pjsua2JNI.RtcpStreamStat_pkt_set(swigCPtr, this, value);
  }

  public long getPkt() {
    return pjsua2JNI.RtcpStreamStat_pkt_get(swigCPtr, this);
  }

  public void setBytes(long value) {
    pjsua2JNI.RtcpStreamStat_bytes_set(swigCPtr, this, value);
  }

  public long getBytes() {
    return pjsua2JNI.RtcpStreamStat_bytes_get(swigCPtr, this);
  }

  public void setDiscard(long value) {
    pjsua2JNI.RtcpStreamStat_discard_set(swigCPtr, this, value);
  }

  public long getDiscard() {
    return pjsua2JNI.RtcpStreamStat_discard_get(swigCPtr, this);
  }

  public void setLoss(long value) {
    pjsua2JNI.RtcpStreamStat_loss_set(swigCPtr, this, value);
  }

  public long getLoss() {
    return pjsua2JNI.RtcpStreamStat_loss_get(swigCPtr, this);
  }

  public void setReorder(long value) {
    pjsua2JNI.RtcpStreamStat_reorder_set(swigCPtr, this, value);
  }

  public long getReorder() {
    return pjsua2JNI.RtcpStreamStat_reorder_get(swigCPtr, this);
  }

  public void setDup(long value) {
    pjsua2JNI.RtcpStreamStat_dup_set(swigCPtr, this, value);
  }

  public long getDup() {
    return pjsua2JNI.RtcpStreamStat_dup_get(swigCPtr, this);
  }

  public void setLossPeriodUsec(MathStat value) {
    pjsua2JNI.RtcpStreamStat_lossPeriodUsec_set(swigCPtr, this, MathStat.getCPtr(value), value);
  }

  public MathStat getLossPeriodUsec() {
    long cPtr = pjsua2JNI.RtcpStreamStat_lossPeriodUsec_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MathStat(cPtr, false);
  }

  public void setLossType(LossType value) {
    pjsua2JNI.RtcpStreamStat_lossType_set(swigCPtr, this, LossType.getCPtr(value), value);
  }

  public LossType getLossType() {
    long cPtr = pjsua2JNI.RtcpStreamStat_lossType_get(swigCPtr, this);
    return (cPtr == 0) ? null : new LossType(cPtr, false);
  }

  public void setJitterUsec(MathStat value) {
    pjsua2JNI.RtcpStreamStat_jitterUsec_set(swigCPtr, this, MathStat.getCPtr(value), value);
  }

  public MathStat getJitterUsec() {
    long cPtr = pjsua2JNI.RtcpStreamStat_jitterUsec_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MathStat(cPtr, false);
  }

  public RtcpStreamStat() {
    this(pjsua2JNI.new_RtcpStreamStat(), true);
  }

}
