package jorge.cecyt9.mx.ipn.bdjorgedavod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textito = (TextView) findViewById(R.id.Datito);

        Bundle bundlito = new Bundle();
        bundlito = this.getIntent().getExtras();

        String nombre = bundlito.getString("nombre");

        textito.setText("Nombre" + nombre);
    }
}
