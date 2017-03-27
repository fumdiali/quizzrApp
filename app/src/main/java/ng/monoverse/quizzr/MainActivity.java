package ng.monoverse.quizzr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {

    private Button beginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startQuiz();

        AnalogClock analogClock = (AnalogClock) findViewById(R.id.analogClock1);
        //DigitalClock digitalClock = (DigitalClock) findViewById(R.id.digitalClock1);
    }

    public void startQuiz() {

        final Context context = this;

        beginBtn = (Button) findViewById(R.id.startBtn);

        beginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, QuizPageOne.class);
                startActivity(intent);
            }
        });
    }
}
