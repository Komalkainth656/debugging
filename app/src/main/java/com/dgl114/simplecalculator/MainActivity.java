package com.dgl114.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String TAG = "CalculatorActivity";

    private Calculator mCalculator;

    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;

    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the calculator class and all the views
        mCalculator = new Calculator();
        mResultTextView = (TextView) findViewById(R.id.operation_result_text_view);
        mOperandOneEditText = (EditText) findViewById(R.id.operand_one_edit_text);
        mOperandTwoEditText = (EditText) findViewById(R.id.operand_two_edit_text);
    }

    public void onAdd(View view) {
        compute(Calculator.Operator.ADD);
    }

    public void onSub(View view) {
        compute(Calculator.Operator.SUB);
    }

    public void onDiv(View view) { compute(Calculator.Operator.DIV); }

    public void onMul(View view) {
        compute(Calculator.Operator.MUL);
    }


    private void compute(Calculator.Operator operator) {
        int operandOne;
        int operandTwo;

        operandOne = getOperand(mOperandTwoEditText);
        operandTwo = getOperand(mOperandOneEditText);

        String result;
        switch (operator) {
            case ADD:
                result = String.valueOf(mCalculator.add(operandOne, operandTwo));
                break;
            case SUB:
                result = String.valueOf(mCalculator.sub(operandOne, operandTwo));
                break;
            case DIV:
                result = String.valueOf(mCalculator.div(operandOne, operandTwo));
                break;
            case MUL:
                result = String.valueOf(mCalculator.mul(operandOne, operandTwo));
                break;
            default:
                result = getString(R.string.computationError);
                break;
        }
        mResultTextView.setText(result);
    }

    private static Integer getOperand(EditText operandEditText) {
        String operandText = getOperandText(operandEditText);
        return Integer.valueOf(operandText);
    }

    private static String getOperandText(EditText operandEditText) {
        return operandEditText.getText().toString();
    }
}