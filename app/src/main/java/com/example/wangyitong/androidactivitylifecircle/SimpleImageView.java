package com.example.wangyitong.androidactivitylifecircle;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import com.example.wangyitong.androidactivitylifecircle.Utils.BitmapUtil;

/**
 * Created by wangyitong on 2016/7/21.
 */
public class SimpleImageView extends View {
    private Drawable mDrawable;
    private Paint mBitmapPaint;

    private int mHeight;
    private int mWidth;

    public SimpleImageView(Context context) {
        this(context, null);
    }

    public SimpleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(attrs);

        mBitmapPaint = new Paint();
        mBitmapPaint.setAntiAlias(true);
    }

    private void initAttrs(AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArray = null;
            try {
                typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.SimpleImageView);
                mDrawable = typedArray.getDrawable(R.styleable.SimpleImageView_src);
                measureDrawable();
            } finally {
                if (typedArray != null) {
                    typedArray.recycle();
                }
            }
        }
    }

    private void measureDrawable() {
        if (mDrawable == null) {
            throw new RuntimeException("drawable is null");
        }
        mWidth = mDrawable.getIntrinsicWidth();
        mHeight = mDrawable.getIntrinsicHeight();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        if (mDrawable == null) {
            return;
        }
        canvas.drawBitmap(BitmapUtil.drawableToBitmap(mDrawable), getLeft(), getTop(), mBitmapPaint);
//        mDrawable.draw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(mWidth, mHeight);
    }

    public Drawable getDrawable() {
        return mDrawable;
    }
}
