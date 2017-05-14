package com.tapitfast.mobiletechnology.tapitfast;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class OpenGLActivity extends AppCompatActivity
{
    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }

}
