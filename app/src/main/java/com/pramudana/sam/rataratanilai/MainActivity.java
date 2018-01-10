package com.pramudana.sam.rataratanilai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etIndo, etMath, etEnglish, etComp;
    Button btnCount;
    TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etIndo = (EditText)findViewById(R.id.etIndo);
        etMath = (EditText)findViewById(R.id.etMath);
        etEnglish = (EditText) findViewById(R.id.etEnglish);
        etComp = (EditText)findViewById(R.id.etComp);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nIndo = etIndo.getText().toString();
                String nMath = etMath.getText().toString();
                String nEnglish = etEnglish.getText().toString();
                String nComp = etComp.getText().toString();

                int aIndo = Integer.parseInt(nIndo);
                int aMath = Integer.parseInt(nMath);
                int aEnglish = Integer.parseInt(nEnglish);
                int aComp = Integer.parseInt(nComp);

                int rRata = (aIndo + aMath + aEnglish + aComp) /4;

                txtResult.setText("Rata - Rata = " + rRata);
            }
        });
    }
}
