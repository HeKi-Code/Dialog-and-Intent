
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnzodiac, btnvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnzodiac = findViewById(R.id.btnzodiac);
        btnvalue = findViewById(R.id.btnvalue);

    btnzodiac.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,zodiac.class);
                startActivity(intent);
        }
    });

        btnvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Intent intent= new Intent(MainActivity.this,NearestValue.class);
                    startActivity(intent);
            }
        });
    }


}
