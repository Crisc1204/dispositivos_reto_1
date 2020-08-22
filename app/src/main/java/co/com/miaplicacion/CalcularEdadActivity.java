package co.com.miaplicacion;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import co.com.miaplicacion.dialog.DatePickerFragment;

public class CalcularEdadActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText text_fecha_nacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_edad);
        EditText text_fecha_nacimiento = findViewById(R.id.text_fecha_nacimiento);
        text_fecha_nacimiento.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.text_fecha_nacimiento:
                showDatePickerDialog();
                break;
        }
    }

    private void showDatePickerDialog(){
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "date picker");
    }
}