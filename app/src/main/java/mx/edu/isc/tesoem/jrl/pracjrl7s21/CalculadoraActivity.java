package mx.edu.isc.tesoem.jrl.pracjrl7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculadoraActivity extends AppCompatActivity implements View.OnClickListener {
    EditText et1, et2;
    TextView tv1;
    Button btnsumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        et1 = (EditText)findViewById(R.id.editTextText5);
        et2 = (EditText)findViewById(R.id.editTextText7);
        tv1 = (TextView)findViewById(R.id.textView6);
        btnsumar = (Button)findViewById(R.id.button);
        btnsumar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float n1, n2, res;
        n1 = Float.parseFloat(et1.getText().toString());
        n2 = Float.parseFloat(et2.getText().toString());
        res = n1 + n2;
        tv1.setText("El resultado es" + res);
        Toast.makeText(getApplicationContext(),"El resultado es" + res, Toast.LENGTH_LONG).show();
    }

    public  void regresar(View view){
        Intent anterior = new Intent(this,Mainprincipal.class);
        startActivity(anterior);
    }
}