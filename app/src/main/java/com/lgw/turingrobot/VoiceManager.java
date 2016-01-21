package com.lgw.turingrobot;

import android.content.Context;

import com.turing.androidsdk.voice.VoiceRecognizeListener;

/**
 * Created by Administrator on 2016-01-21.
 */
public class VoiceManager implements VoiceRecognizeListener {
    private Context context;

    public VoiceManager(Context context) {
        this.context = context;
    }

    @Override
    public void onStartRecognize() {

    }

    @Override
    public void onRecordStart() {

    }

    @Override
    public void onRecordEnd() {

    }

    @Override
    public void onRecognizeResult(String s) {

    }

    @Override
    public void onRecognizeError(String s) {

    }

    @Override
    public void onVolumeChange(int i) {

    }
}
