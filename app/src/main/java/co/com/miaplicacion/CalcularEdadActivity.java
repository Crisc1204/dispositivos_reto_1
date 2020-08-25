package co.com.miaplicacion;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;
import java.util.Date;

public class CalcularEdadActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText text_fecha_nacimiento;
    public EditText text_fecha_actual;
    private Button btn_calcular_edad;
    int year = 0;
    int month = 0;
    int day = 0;
    int anio = 0, mes =0, dia =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_edad);
        text_fecha_actual = findViewById(R.id.text_fecha_actual);
        text_fecha_nacimiento = findViewById(R.id.text_fecha_nacimiento);
        btn_calcular_edad = findViewById(R.id.btn_calcular_edad);
        EditText text_fecha_nacimiento = findViewById(R.id.text_fecha_nacimiento);
        text_fecha_nacimiento.setOnClickListener(this);
        btn_calcular_edad.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.text_fecha_nacimiento){
            Calendar calendar = Calendar.getInstance();
            anio = calendar.get(Calendar.YEAR);
            mes = calendar.get(Calendar.MONTH);
            dia = calendar.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog fecha = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int año, int mes2, int dia2) {
                    final int mesActual = mes2+ 1;
                    String diaFormateado = (dia2 <10)? "0"+ dia2 : String.valueOf(dia2);
                    String mesFormateado = (mesActual <10)? "0"+ mesActual : String.valueOf(mesActual);
                    text_fecha_nacimiento.setText("Fecha nacimiento: "+diaFormateado+"/"+mesFormateado+"/"+año);
                    text_fecha_actual.setText("Fecha actual: "+dia+"/"+(mes+1)+"/"+anio);
                    year = año;
                    month = Integer.parseInt(mesFormateado);
                    day = Integer.parseInt(diaFormateado);
                }
            }, anio, mes, dia);
            fecha.show();
        }
        if (view.getId()== R.id.btn_calcular_edad){
            Toast.makeText(this, "Edad: "+calcular(anio, mes+1,year,month), Toast.LENGTH_LONG).show();
        }
    }
    public String calcular(int anioNacmimiento, int mesNacimiento, int anioActual, int mesActual){
        int años = 0;
        int meses = 0;
        if (mesActual <= mesNacimiento){
            años = anioNacmimiento - anioActual;
            meses = mesNacimiento - mesActual;
        }else {
            años = anioNacmimiento - anioActual-1;
            meses = 12- (mesActual - mesNacimiento);
        }if (anioNacmimiento <= anioActual && mesNacimiento <= mesActual){
            return " La edad no es válida";
        }
        return años+" años "+meses+" meses ";
    }
}