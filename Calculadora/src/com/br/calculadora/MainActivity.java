package com.br.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText editTextNumero1 = (EditText)this.findViewById(R.id.editTextNumero1);
		final EditText editTextNumero2 = (EditText)this.findViewById(R.id.editTextNumero2);
		final EditText editTextResultador = (EditText)this.findViewById(R.id.editTextResultado);
		final Button buttonSoma = (Button)this.findViewById(R.id.buttonSoma);
		final Button buttonSubtracao = (Button)this.findViewById(R.id.buttonSubtracao);
		final Button buttonDivisao = (Button)this.findViewById(R.id.buttonDivisao);
	    final Button buttonMultiplicacao = (Button)this.findViewById(R.id.buttonMultiplicacao);
		
		buttonSoma.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				if(editTextNumero1.getText().toString().length() == 0 || editTextNumero2.getText().toString().length() == 0) {
					editTextResultador.setText("Impossível calcular");
				}
				else {
					double numero1 = Double.parseDouble(editTextNumero1.getEditableText().toString());
					double numero2 = Double.parseDouble(editTextNumero2.getEditableText().toString());
					double Resultado = numero1 + numero2;
				    editTextResultador.setText(Double.toString(Resultado));
				}
			}
		});
		
		buttonSubtracao.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				 
				if(editTextNumero1.getText().toString().length() == 0 || editTextNumero2.getText().toString().length() == 0) {
					editTextResultador.setText("Impossível calcular");
				}
				else {
					double numero1 = Double.parseDouble(editTextNumero1.getEditableText().toString());
					double numero2 = Double.parseDouble(editTextNumero2.getEditableText().toString());
					double Resultado = numero1 - numero2;
				    editTextResultador.setText(Double.toString(Resultado));
				}
			}
		});
		
		buttonDivisao.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				
				if(editTextNumero1.getEditableText().length() == 0 || editTextNumero2.getEditableText().length() == 0) {
					editTextResultador.setText("Impossível calcular");
				}
				else {
					double numero1 = Double.parseDouble(editTextNumero1.getEditableText().toString());
					double numero2 = Double.parseDouble(editTextNumero2.getEditableText().toString());
					double Resultado = numero1 / numero2;
				    editTextResultador.setText(Double.toString(Resultado));
				}
			}
		});
		
		buttonMultiplicacao.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v) {
				if(editTextNumero1.getText().toString().length() == 0 || editTextNumero2.getText().toString().length() == 0) {
					editTextResultador.setText("Impossível calcular");
				}
				else {
					double numero1 = Double.parseDouble(editTextNumero1.getEditableText().toString());
					double numero2 = Double.parseDouble(editTextNumero2.getEditableText().toString());
					double Resultado = numero1 * numero2;
				    editTextResultador.setText(Double.toString(Resultado));
				}
			}
		});
		
	}
	
}
