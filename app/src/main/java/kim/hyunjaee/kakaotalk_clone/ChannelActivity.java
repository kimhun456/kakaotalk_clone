package kim.hyunjaee.kakaotalk_clone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ChannelActivity extends AppCompatActivity {

    private final String TAG = "ChannelActivity";

    private RecyclerView mChannelDetailRecycler;
    private Button mSendButton;
    private EditText mSendEditText;

    View.OnClickListener mSendButtonOnClickListenr = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Log.d(TAG, "onClick Send button");

            String body = mSendEditText.getText().toString();
            mSendEditText.setText("");

            Log.d(TAG, "Message Body : " + body);


        }
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_channel);
        mChannelDetailRecycler = findViewById(R.id.channel_recyclerview);
        mSendButton = findViewById(R.id.send_button);
        mSendEditText = findViewById(R.id.send_edit_text);
    }

}

