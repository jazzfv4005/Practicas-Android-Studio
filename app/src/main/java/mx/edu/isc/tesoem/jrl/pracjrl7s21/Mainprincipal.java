package mx.edu.isc.tesoem.jrl.pracjrl7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Mainprincipal extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainprincipal);

        tv1 = (TextView)findViewById(R.id.tv1);

        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola " +dato);
    }
    public void boton1(View view){
        Toast.makeText(this,"Hola profe de la O lo saluda jazz",Toast.LENGTH_SHORT).show();
    }

    public void calculadora(View view){
        Intent pasarcalculadora = new Intent(this,CalculadoraActivity.class);
        startActivity(pasarcalculadora);
    }

    public void nombre(View view){
        Intent pasarnombre = new Intent(this,nombreActivity.class);
        startActivity(pasarnombre);
    }

}