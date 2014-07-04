package com.blogspot.father2sisters.scale_videoview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;

public class VodView extends VideoView {

	public VodView(Context context) {
		super(context);
	}

	public VodView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public VodView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}


	/**
	 * Resize video view by using SurfaceHolder.setFixedSize(...). See {@link android.view.SurfaceHolder#setFixedSize}
	 * @param width
	 * @param height
	 */
	public void setFixedVideoSize(int width, int height)
    {
        getHolder().setFixedSize(width, height); 
    } 
}
