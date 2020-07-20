package com.geekbrains.mvp.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.geekbrains.mvp.R;
import com.geekbrains.mvp.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    private TextView tv1;
    private Button btnCounter1;
    private TextView tv2;
    private Button btnCounter2;
    private TextView tv3;
    private Button btnCounter3;

    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        btnCounter1 = findViewById(R.id.btnCounter1);
        tv2 = findViewById(R.id.tv2);
        btnCounter2 = findViewById(R.id.btnCounter2);
        tv3 = findViewById(R.id.tv3);
        btnCounter3 = findViewById(R.id.btnCounter3);

        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);

        mPresenter = new Presenter(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCounter1:
                mPresenter.buttonClick(Presenter.ButtonIndex.ONE);
                break;
            case R.id.btnCounter2:
                mPresenter.buttonClick(Presenter.ButtonIndex.TWO);
                break;
            case R.id.btnCounter3:
                mPresenter.buttonClick(Presenter.ButtonIndex.THREE);
                break;
        }

    }

    @Override
    public void setButtonText(Presenter.ButtonIndex btnIndex, int value) {
        switch (btnIndex) {
            case ONE:
                btnCounter1.setText("Количество = " + value);
                break;
            case TWO:
                btnCounter2.setText("Количество = " + value);
                break;
            case THREE:
                btnCounter3.setText("Количество = " + value);
                break;
        }
    }
}
