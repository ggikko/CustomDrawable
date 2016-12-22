package ggikko.me.customdrawable.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;

import ggikko.me.customdrawable.R;

public class CustomTextView extends TextView {
    public CustomTextView(Context context) {
        this(context, null);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setUpViews(context, attrs);
    }

    private void setUpViews(Context context, AttributeSet attrs) {

        final TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.AccountCircleView);
        int csBackgroundColor = context.getResources().getColor(attributes.getResourceId(R.styleable.AccountCircleView_csBackgroundColor, R.color.transparent));
        int csBorderColor = context.getResources().getColor(attributes.getResourceId(R.styleable.AccountCircleView_csBorderColor, R.color.transparent));

        int rectangle = GradientDrawable.RECTANGLE;
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(rectangle);
        shape.setCornerRadii(new float[] { 8, 8, 8, 8, 0, 0, 0, 0 });
        shape.setColor(csBackgroundColor);
        shape.setStroke(3, csBorderColor);

        setBackground(shape);
    }
}
