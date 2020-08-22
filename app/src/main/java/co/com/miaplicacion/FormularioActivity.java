package co.com.miaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    private TextView textViewNombre;
    private TextView textViewApellido;
    private TextView textViewTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
        textViewNombre = findViewById(R.id.editTextNombre);
        textViewApellido = findViewById(R.id.editTextApellido);
        textViewTelefono = findViewById(R.id.editTextNumber);
     }

    public void enviar(View view){
        String nombre = textViewNombre.getText().toString();
        String apellido = textViewApellido.getText().toString();
        String telefono = textViewTelefono.getText().toString();

        if (nombre.length() == 0) {
            Toast.makeText(this, "Debe ingresar un nombre", Toast.LENGTH_LONG).show();
        }if (apellido.length()== 0){
            Toast.makeText(this, "Debe ingresar un apellido", Toast.LENGTH_LONG).show();
        }if (telefono.length() == 0){
            Toast.makeText(this, "Debe ingresar un teléfono", Toast.LENGTH_LONG).show();
        }if (nombre.length() != 0 && apellido.length() != 0 && telefono.length() != 0){
            Toast.makeText(this, "Formulario enviado", Toast.LENGTH_LONG).show();
        }
    }
}