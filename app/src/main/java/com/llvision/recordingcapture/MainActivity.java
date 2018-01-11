package com.llvision.recordingcapture;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.opengl.GLSurfaceView;
import android.service.media.CameraPrewarmService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MainActivity extends AppCompatActivity implements SurfaceTexture.OnFrameAvailableListener {

    private GLSurfaceView glSurface;
    private Camera mCamera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        glSurface=findViewById(R.id.surface);

    }

    private void openCamera(int width,int height){
        Camera.CameraInfo cameraInfor = new Camera.CameraInfo();
       int code= Camera.getNumberOfCameras();
        for (int i = 0; i < code; i++) {
            Camera.getCameraInfo(i,cameraInfor);
            if (cameraInfor.facing==Camera.CameraInfo.CAMERA_FACING_FRONT){
                mCamera=Camera.open(i);
                break;
            }
        }
        if (mCamera==null){
          mCamera=Camera.open();
        }
        if (mCamera==null){
            throw new RuntimeException("the camera not open");
        }
        mCamera.getParameters();
    }

    @Override
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
    private class CameraSurfaceRenderer implements GLSurfaceView.Renderer{

        @Override
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {

        }

        @Override
        public void onSurfaceChanged(GL10 gl, int width, int height) {

        }

        @Override
        public void onDrawFrame(GL10 gl) {

        }
    }
}
