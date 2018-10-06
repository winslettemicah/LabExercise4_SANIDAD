package iics.sanidad.winslettemicah.labexercise4_sanidad;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toast = findViewById(R.id.toast);
        final Button snackbar1 = findViewById(R.id.snackBar);
        Button snackbar2 = findViewById(R.id.snackBarBar);


        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String msg = "Toast!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(),msg,duration).show();
            }
        });

        snackbar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = "Snackbar!!!";
                int duration = Snackbar.LENGTH_SHORT;

                Snackbar snackbar = Snackbar.make(snackbar1, msg, duration);
                snackbar.show();
            }
        });

        snackbar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar
                        .make(snackbar1, "Successfully removed", Snackbar.LENGTH_LONG)
                        .setAction("UNDO", new View.OnClickListener(){
                            @Override
                            public void onClick(View view){
                                Snackbar snackbar3 = Snackbar.make(snackbar1, "Successfully Restored!",Snackbar.LENGTH_SHORT);
                                snackbar3.show();
                            }
                        });
                snackbar.show();

            }
        });
    }
}