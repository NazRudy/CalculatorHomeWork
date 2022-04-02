package com.naz.calculatorhomework;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Калькулятор
 * Нацветов Р.И.
 */
public class CalculatorActivity extends AppCompatActivity {

    public static final String DISPLAY = "display";
    public static final String KEY_CALCULATION = "keyCalculation";
    public Calculation calculation;
    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = findViewById(R.id.display);               // дисплей для вывода информации

        calculation = new Calculation();                    // класс для расчетов

        if (savedInstanceState!=null){
            display.setText(savedInstanceState.getString(DISPLAY));
            calculation=savedInstanceState.getParcelable(KEY_CALCULATION);
        }
        // Слушатель нажатия кнопок
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button1:
                        calculation.setNumOne("1");
                        setText();
                        break;
                    case R.id.button2:
                        calculation.setNumOne("2");
                        setText();
                        break;
                    case R.id.button3:
                        calculation.setNumOne("3");
                        setText();
                        break;
                    case R.id.button4:
                        calculation.setNumOne("4");
                        setText();
                        break;
                    case R.id.button5:
                        calculation.setNumOne("5");
                        setText();
                        break;
                    case R.id.button6:
                        calculation.setNumOne("6");
                        setText();
                        break;
                    case R.id.button7:
                        calculation.setNumOne("7");
                        setText();
                        break;
                    case R.id.button8:
                        calculation.setNumOne("8");
                        setText();
                        break;
                    case R.id.button9:
                        calculation.setNumOne("9");
                        setText();
                        break;
                    case R.id.button0:
                        calculation.setNumOne("0");
                        setText();
                        break;
                    case R.id.buttonDot:
                        calculation.setNumOne(".");
                        setText();
                        break;
                    case R.id.buttonAdd:
                        calculation.setAddbool(true);
                        display.setText("+");
                        break;
                    case R.id.buttonSub:
                        calculation.setSubbool(true);
                        display.setText("-");
                        break;
                    case R.id.buttonMul:
                        calculation.setMulbool(true);
                        display.setText("*");
                        break;
                    case R.id.buttonDiv:
                        calculation.setDivbool(true);
                        display.setText("/");
                        break;
                    case R.id.buttonEquals:
                        calculation.finished();
                        display.setText(calculation.getFinished());
                        break;
                    case R.id.buttonC:
                        calculation.reset();
                        display.setText("0");
                }
            }
        };
        findViewById(R.id.button1).setOnClickListener(onClickListener);
        findViewById(R.id.button2).setOnClickListener(onClickListener);
        findViewById(R.id.button3).setOnClickListener(onClickListener);
        findViewById(R.id.button4).setOnClickListener(onClickListener);
        findViewById(R.id.button5).setOnClickListener(onClickListener);
        findViewById(R.id.button6).setOnClickListener(onClickListener);
        findViewById(R.id.button7).setOnClickListener(onClickListener);
        findViewById(R.id.button8).setOnClickListener(onClickListener);
        findViewById(R.id.button9).setOnClickListener(onClickListener);
        findViewById(R.id.button0).setOnClickListener(onClickListener);
        findViewById(R.id.buttonAdd).setOnClickListener(onClickListener);
        findViewById(R.id.buttonSub).setOnClickListener(onClickListener);
        findViewById(R.id.buttonMul).setOnClickListener(onClickListener);
        findViewById(R.id.buttonDiv).setOnClickListener(onClickListener);
        findViewById(R.id.buttonDot).setOnClickListener(onClickListener);
        findViewById(R.id.buttonEquals).setOnClickListener(onClickListener);
        findViewById(R.id.buttonC).setOnClickListener(onClickListener);

    }

    // Вывод информации на дисплей
    public void setText() {
        display.setText(calculation.getResult());
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(DISPLAY, (String) display.getText());
        outState.putParcelable(KEY_CALCULATION, calculation);


    }
}
