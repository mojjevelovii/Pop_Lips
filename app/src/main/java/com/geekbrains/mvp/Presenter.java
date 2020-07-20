package com.geekbrains.mvp;

public class Presenter {

    private final Model mModel;
    private final MainView mView;

    public Presenter(MainView mainView) {
        mModel = new Model();
        mView = mainView;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(int id) {
        int newModelValue;
        switch (id) {
            case R.id.btnCounter1:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                mView.setButtonText(1, newModelValue);
                break;

            case R.id.btnCounter2:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                mView.setButtonText(2, newModelValue);
                break;

            case R.id.btnCounter3:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                mView.setButtonText(3, newModelValue);
                break;
        }
    }
}
