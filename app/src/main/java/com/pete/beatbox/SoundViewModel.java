package com.pete.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by Pete on 11/28/2017.
 */

public class SoundViewModel extends BaseObservable{
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatbox){
        mBeatBox = beatbox;
    }
    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public Sound getSound(){
        return mSound;
    }

    public void setSound(Sound sound){
        mSound = sound;
        notifyChange();
    }

    public void onButtonClicked(){
        mBeatBox.play(mSound);
    }
}
