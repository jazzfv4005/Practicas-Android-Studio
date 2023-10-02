package mx.edu.isc.tesoem.jrl.pracjrl7s21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class nombreActivity extends AppCompatActivity {

    private EditText editTextText1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombre);

        editTextText1 = (EditText) findViewById(R.id.editTextText1);
    }

    public void enviar(View view){
        Intent i= new Intent(this,Mainprincipal.class);
        i.putExtra("dato",editTextText1.getText().toString());
        startActivity(i);
    }
}