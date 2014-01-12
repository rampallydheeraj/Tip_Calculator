package com.example.tipcalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TipCalculator extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tip_calculator);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tip_calculator, menu);
		return true;
	}

	public void onClickTen(View v) {
		double ten = 10;
		final EditText edit = (EditText) findViewById(R.id.tipNumber);
		String entered_text = edit.getText().toString();
		final TextView result = (TextView) findViewById(R.id.result);

		boolean isNum = isNumeric(entered_text);

		if (isNum == false) {
			Toast.makeText(getBaseContext(), "Please Enter only numbers",
					Toast.LENGTH_SHORT).show();
			edit.setText("");
		} else {
			printTip(entered_text, ten, result, edit);

		}
	}

	public void onClickFifteen(View v) {
		double fifteen = 15;
		final EditText edit = (EditText) findViewById(R.id.tipNumber);
		String entered_text = edit.getText().toString();
		final TextView result = (TextView) findViewById(R.id.result);

		boolean isNum = isNumeric(entered_text);
		if (isNum == false) {
			Toast.makeText(getBaseContext(), "Please Enter only numbers",
					Toast.LENGTH_SHORT).show();
			edit.setText("");
		} else {
			printTip(entered_text, fifteen, result, edit);
		}
	}

	public void onClickTwenty(View v) {
		double twenty = 20;
		final EditText edit = (EditText) findViewById(R.id.tipNumber);
		String entered_text = edit.getText().toString();
		final TextView result = (TextView) findViewById(R.id.result);

		boolean isNum = isNumeric(entered_text);
		if (isNum == false) {
			Toast.makeText(getBaseContext(), "Please Enter only numbers",
					Toast.LENGTH_SHORT).show();
			edit.setText("");
		} else {
			printTip(entered_text, twenty, result, edit);
		}
	}

	public boolean isNumeric(String str) {
		try {
			double d = Double.parseDouble(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}

	private void printTip(String entered_text, double number, TextView result,
			EditText edit) {
		// TODO Auto-generated method stub
		double tip = calculateTip(entered_text, number);
		edit.setText("");
		result.setVisibility(View.VISIBLE);
		result.setText("Tip is : $" + String.valueOf(tip));
	}

	public double calculateTip(String entered_text, double number) {
		double d = Double.parseDouble(entered_text);
		double tip = (number / 100) * d;
		return tip;

	}
}
