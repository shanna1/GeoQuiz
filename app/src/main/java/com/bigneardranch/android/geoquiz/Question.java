package com.bigneardranch.android.geoquiz;

/**
 * Created by Spencer on 2/10/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int mtextResId, boolean manswerTrue) {
        mTextResId = mtextResId;
        mAnswerTrue = manswerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
