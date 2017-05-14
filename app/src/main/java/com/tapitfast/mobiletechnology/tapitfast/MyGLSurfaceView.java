package com.tapitfast.mobiletechnology.tapitfast;

import android.content.Context;
import android.opengl.GLSurfaceView;

import com.tapitfast.mobiletechnology.tapitfast.MyGLRenderer;

/**
 * Created by Rafal-HP on 2017-05-14.
 */

class MyGLSurfaceView extends GLSurfaceView
{
    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context)
    {
        super(context);

        setEGLContextClientVersion(2);

        mRenderer = new MyGLRenderer();

        setRenderer(mRenderer);
    }
}