package zzs.hello.openglrender;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.SurfaceTexture;
import android.os.Bundle;

import zzs.hello.openglrender.opengles.OpenGLPreviewView;
import zzs.hello.openglrender.opengles.PreviewRender;

public class MainActivity extends AppCompatActivity implements PreviewRender.SurfaceTextureListener {

    private OpenGLPreviewView mPreviewView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPreviewView = findViewById(R.id.mOpenGlSurface);
        mPreviewView.setSurfaceTextureListener(this);
    }

    @Override
    public void onSurfaceTextureCreate(SurfaceTexture surfaceTexture) {
        //数据渲染到这里
    }

}