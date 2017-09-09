LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE    := openh
LOCAL_SRC_FILES := libopenh264.so

include $(PREBUILT_SHARED_LIBRARY)

