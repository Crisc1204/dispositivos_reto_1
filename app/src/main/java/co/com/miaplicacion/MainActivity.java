package co.com.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textoBienvenida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoBienvenida = findViewById(R.id.textoBienvenida);
        textoBienvenida.setText(R.string.texto_bienvenida);
       }

    public void goToFormulario (View view){
        Intent goToFormulario = new Intent(this, FormularioActivity.class);
        startActivity(goToFormulario);
    }

    public void goToPresentarEquipo(View view){
        Intent goToPresentarEquipo = new Intent(this, PresentarEquipoActivity.class);
        startActivity(goToPresentarEquipo);
    }

    public void goToCalcularEdad(View view){
        Intent goToCalcularEdad = new Intent(this, CalcularEdadActivity.class);
        startActivity(goToCalcularEdad);
    }
}