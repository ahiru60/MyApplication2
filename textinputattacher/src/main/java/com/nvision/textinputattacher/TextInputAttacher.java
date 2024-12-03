package com.nvision.textinputattacher;

import android.content.Context;
import android.widget.TextView;

public class TextInputAttacher {
    
    public TextView attach(Context context,String text){
        TextView textView = new TextView(context);
        textView.setText(text);
        return textView;
    }
}
