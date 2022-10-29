
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;




public class NearestValue extends AppCompatActivity {
    EditText first, second, third;
    Button display;
    String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_value);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);
        display = findViewById(R.id.display);

        display.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String fint =  first.getText().toString();
                String sint =  second.getText().toString();
                String tint =  third.getText().toString();

                int f = Integer.parseInt(fint);
                int s = Integer.parseInt(sint);
                int t = Integer.parseInt(tint);

                if((f <= 20 && f >= s && f >= t) || (f >= 20 && f <= s && f <= t)) {
                    result = "" + f;
                }else if((s <= 20 && s >= f && s >= t) || (s >= 20 && s <= f && s <= t)) {
                    result = "" + s;
                }else if((t <= 20 && t >= s && t >= f) || (t >= 20 && t <= s && t <= f)) {
                    result = "" + t;
                }else {
                    result ="NULL";
                }
                AlertDialog.Builder alert = new AlertDialog.Builder(NearestValue.this);
                alert.setTitle("Nearest Value");
                alert.setMessage("Nearest Value to 20 is: " + result);
                alert.setPositiveButton("Again", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        first.setText("");
                        second.setText("");
                        third.setText("");
                        Toast.makeText(NearestValue.this, "Process Done", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.setNegativeButton("Go Back", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(NearestValue.this, "Modify Your Input", Toast.LENGTH_SHORT).show();
                    }
                });
                alert.show();
            }
        });
    }
}
