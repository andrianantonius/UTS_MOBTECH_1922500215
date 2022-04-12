package ac.id.atmaluhur.mhs.andrian.antonius;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText absen;
    EditText tugas;
    EditText uts;
    EditText uas;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        absen = (EditText) findViewById(R.id.absen);
        tugas = (EditText) findViewById(R.id.tugas);
        uts = (EditText) findViewById(R.id.uts);
        uas = (EditText) findViewById(R.id.uas);
        hasil = (TextView) findViewById(R.id.hasil);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void hitung (View View){
        Integer a = Integer.parseInt(absen.getText().toString());
        Integer e = a * 10/100;
        Integer b = Integer.parseInt(tugas.getText().toString());
        Integer f = b * 20/100;
        Integer c = Integer.parseInt(uts.getText().toString());
        Integer g = c * 30/100;
        Integer d = Integer.parseInt(uas.getText().toString());
        Integer h = d * 40/100;
        Integer i = e + f + g + h;
        hasil.setText("HASIL NILAI AKHIR = " +i);
    }
}