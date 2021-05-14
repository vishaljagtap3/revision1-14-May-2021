package in.bitcode.revision1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private ImageView imgIndia, imgCanada;
    private TextView txtLabelEnterName, txtName;
    private EditText edtName;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgIndia = findViewById(R.id.imgIndia);
        imgCanada = findViewById(R.id.imgCanada);
        txtLabelEnterName = findViewById(R.id.txtLabelEnterName);
        txtName = findViewById(R.id.txtName);
        btnSubmit = findViewById(R.id.btnSubmit);
        edtName = findViewById(R.id.edtName);

        imgIndia.setPadding(20, 20, 20, 20);

        btnSubmit.setOnClickListener( new BtnSubmitClickListener() );
    }

    private class BtnSubmitClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtName.setText( edtName.getText().toString());
        }
    }

}
