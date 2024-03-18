package com.example.getpersonbio_mvp.ui;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.getpersonbio_mvp.R;





// Alaa Ahmed Mohamed Alshemi - G1


public class MainActivity extends AppCompatActivity implements View.OnClickListener, PersonView {
    TextView personbiotv;
    Button getbiobutton;
    PersonPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        personbiotv = findViewById(R.id.textView);
        getbiobutton = findViewById(R.id.button2);
        getbiobutton.setOnClickListener(this);
        presenter = new PersonPresenter(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button2) {
            presenter.getPersonBio();
        }
    }

    @Override
    public void onGetPersonBio(String personBio) {
        personbiotv.setText(personBio);
    }
}
