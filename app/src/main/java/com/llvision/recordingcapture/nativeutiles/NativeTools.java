package com.llvision.recordingcapture.nativeutiles;

/**
 * @Project: RecordingCapture
 * @Description:
 * @Author: haijianming
 * @Time: 2018/1/9 下午10:42
 */

public class NativeTools {
    static {
        System.loadLibrary("native-lib");
    }
    public native String stringFromJNI();
}
