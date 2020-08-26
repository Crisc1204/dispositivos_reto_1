package co.com.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PresentarEquipoActivity extends AppCompatActivity {
    private TextView Integrante_1;
    private TextView Integrante_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentar_equipo);
        Integrante_1= findViewById(R.id.editTextTextPersonName4);
        Integrante_2= findViewById(R.id.editTextTextPersonName5);
    }
}