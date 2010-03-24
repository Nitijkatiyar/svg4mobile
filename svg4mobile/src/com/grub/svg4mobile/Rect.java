package com.grub.svg4mobile;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;

public class Rect extends Figure{
	
	private float x1, x2, y1, y2;
	private Paint paint;
	private RectF rectElement;
	
	public Rect (float x, float y, float w, float h, String rgb){
				
		this.rectElement = new RectF(x, y, w, h);
		
		this.paint = new Paint();		
		this.paint.setColor(Color.parseColor(rgb));
		this.paint.setAntiAlias(true);
		
	}
	
	public void Draw (Canvas canvas){
		canvas.drawRect(this.rectElement, this.paint);
	}
	
}