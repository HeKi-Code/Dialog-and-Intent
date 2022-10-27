
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class zodiac extends AppCompatActivity {
    EditText name, gender, bplace, byear;
    Button btnconfirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac);

        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        bplace = findViewById(R.id.bplace);
        byear = findViewById(R.id.byear);
        btnconfirm = findViewById(R.id.btnconfirm);

        btnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(zodiac.this, zodiac2.class);
                intent.putExtra("Username", name.getText().toString());
                intent.putExtra("Gender", gender.getText().toString());
                intent.putExtra("Birthplace", bplace.getText().toString());
                intent.putExtra("Birthyear",byear.getText().toString());
                startActivity(intent);
            }
        });
    }
}
