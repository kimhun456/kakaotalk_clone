package kim.hyunjaee.kakaotalk_clone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class FriendListActivity extends AppCompatActivity {

    private static final String TAG = FriendListActivity.class.getSimpleName();

    private RecyclerView mFriendRecycler;
    private AppCompatButton mSendButton;
    private AppCompatEditText mSendEditText;

    View.OnClickListener mSendButtonOnClickListner = new View.OnClickListener() {
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
        setContentView(R.layout.activity_friend_list);
        findView();
        initView();
        init();
    }


    private void findView() {
        mFriendRecycler = findViewById(R.id.friend_list_recycler);
        mSendButton = findViewById(R.id.send_button);
        mSendEditText = findViewById(R.id.send_edit_text);
    }

    private void initView() {
        mSendButton.setOnClickListener(mSendButtonOnClickListner);
    }

    private void init() {

    }
}

