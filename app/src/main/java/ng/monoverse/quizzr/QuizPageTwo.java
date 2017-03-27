package ng.monoverse.quizzr;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuizPageTwo extends AppCompatActivity {

    private Button nextBtn;

    // source@ 'http://androidbite.blogspot.com.ng/2012/11/android-count-down-timer-example.html'
    private CountDownTimer countDownTimer;
    private boolean timerHasStarted = false;
    public TextView text;
    private final long startTime = 30 * 1000;
    private final long interval = 1 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page_two);

        text = (TextView) this.findViewById(R.id.timer);
        countDownTimer = new MyCountDownTimer(startTime, interval);
        text.setText(text.getText() + String.valueOf(startTime / 1000));

        if(!timerHasStarted){
            countDownTimer.start();
            timerHasStarted = true;
        }else{
            countDownTimer.cancel();
            timerHasStarted = false;
        }

        nextOne();
    }//endof OnCreate method

    public class MyCountDownTimer extends CountDownTimer{
        public MyCountDownTimer(long startTime, long interval){
            super(startTime, interval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            text.setText("" + millisUntilFinished / 1000);
        }

        @Override
        public void onFinish() {
            text.setText("Out of Time!");
        }
    }





    public void nextOne() {
        final Context context = this;

        nextBtn = (Button) findViewById(R.id.next2);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, QuizPageThree.class);
                startActivity(intent);
            }
        });
    }
}
