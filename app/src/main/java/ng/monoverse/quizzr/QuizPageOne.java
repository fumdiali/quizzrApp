package ng.monoverse.quizzr;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizPageOne extends AppCompatActivity {

    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page_one);

        nextOne();
    }

    public void nextOne() {
        final Context context = this;

        nextBtn = (Button) findViewById(R.id.next1);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, QuizPageTwo.class);
                startActivity(intent);
            }
        });
    }

    //Declare timer
    //CountDownTimer cTimer = null;

    //start timer function
    /*void startTimer() {
        cTimer = new CountDownTimer(30000, 1000) {
            public void onTick(long millisUntilFinished) {
            }
            public void onFinish() {
            }
        };
        cTimer.start();
    }


    //cancel timer
    void cancelTimer() {
        if(cTimer!=null)
            cTimer.cancel();
    }*/
}
