/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_call_hold_type {
  public final static pjsua_call_hold_type PJSUA_CALL_HOLD_TYPE_RFC3264 = new pjsua_call_hold_type("PJSUA_CALL_HOLD_TYPE_RFC3264");
  public final static pjsua_call_hold_type PJSUA_CALL_HOLD_TYPE_RFC2543 = new pjsua_call_hold_type("PJSUA_CALL_HOLD_TYPE_RFC2543");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsua_call_hold_type swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsua_call_hold_type.class + " with value " + swigValue);
  }

  private pjsua_call_hold_type(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsua_call_hold_type(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsua_call_hold_type(String swigName, pjsua_call_hold_type swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsua_call_hold_type[] swigValues = { PJSUA_CALL_HOLD_TYPE_RFC3264, PJSUA_CALL_HOLD_TYPE_RFC2543 };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

