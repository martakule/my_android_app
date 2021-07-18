package marta.android.catmusic;

import android.content.Context;
        import android.util.AttributeSet;
        import android.widget.Button;

public class ResizeableButton extends androidx.appcompat.widget.AppCompatButton {

    public ResizeableButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int width = MeasureSpec.getSize(widthMeasureSpec);
        setMeasuredDimension(width, width);
    }
}