package jorge.cecyt9.mx.ipn.bdjorgedavod;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombrecito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombrecito = (EditText) findViewById(R.id.Name);
    }

    public void Guardar(View v){
        Intent envia = new Intent(this, Main2Activity.class);
        Bundle datitos = new Bundle();

        datitos.putString("Nombre: ", nombrecito.getText().toString());
        envia.putExtras(datitos);
        finish();
        startActivity(envia);
    }
}
