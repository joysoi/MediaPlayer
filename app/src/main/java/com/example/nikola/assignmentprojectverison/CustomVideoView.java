package com.example.nikola.assignmentprojectverison;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.VideoView;


public class CustomVideoView extends VideoView {

    interface EventListener {
        void onStartEvent();

        void onPauseEvent();

    }

    private EventListener listener;


    public CustomVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    public void setListener(EventListener listener) {
        this.listener = listener;
    }

    @Override
    public void start() {
        super.start();
        if (listener != null)
            listener.onStartEvent();
    }

    @Override
    public void pause() {
        super.pause();
        if (listener != null)
            listener.onPauseEvent();
    }



}
