package kim.hyunjaee.kakaotalk_clone.data;

import java.util.Calendar;

public abstract class Message {

    public Message(){
        mSendTime = Calendar.getInstance().getTimeInMillis();
    }

    private String mBody;
    private Long mSendTime;

}
