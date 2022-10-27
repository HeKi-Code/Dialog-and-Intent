
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class zodiac2 extends AppCompatActivity {
    TextView name, gender, bplace, byear, age, sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac2);

        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        bplace = findViewById(R.id.bplace);
        byear = findViewById(R.id.byear);
        age = findViewById(R.id.age);
        sign = findViewById(R.id.sign);

        Intent intent = getIntent();
        String Nname = intent.getStringExtra("Username");
        name.setText(Nname);
        String Ngender = intent.getStringExtra("Gender");
        gender.setText(Ngender);
        String Nbplace = intent.getStringExtra("Birthplace");
        bplace.setText(Nbplace);
        String Nbyear = intent.getStringExtra("Birthyear");
        byear.setText(Nbyear);

        int PersonAge = 2024 -Integer.parseInt(byear.getText().toString());
        age.setText(String.valueOf(PersonAge));

        int birthyear = Integer.parseInt(byear.getText().toString());

        switch (birthyear % 12){
            case 0:
              sign.setText("Monkey");
                break;
            case 1:
                sign.setText("Rooster");
                break;
            case 2:
                sign.setText("Dog");
                break;
            case 3:
                sign.setText("Pig");
                break;
            case 4:
                sign.setText("Rat");
                break;
            case 5:
                sign.setText("Ox");
                break;
            case 6:
                sign.setText("Tiger");
                break;
            case 7:
                sign.setText("Rabbit");
                break;
            case 8:
                sign.setText("Dragon");
                break;
            case 9:
                sign.setText("Snake");
                break;
            case 10:
                sign.setText("Horse");
                break;
            case 11:
                sign.setText("Goat");
                break;
        }
    }
}
