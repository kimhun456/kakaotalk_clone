package kim.hyunjaee.kakaotalk_clone.message;

import java.util.Calendar;

import kim.hyunjaee.kakaotalk_clone.user.User;

public abstract class Message {

    public Message() {
        mSendTime = Calendar.getInstance().getTimeInMillis();
    }

    private long mSendTime;
    private User mSendUser;

    public long getSendTime() {
        return mSendTime;
    }

    public void setSendTime(long sendTime) {
        mSendTime = sendTime;
    }

    public User getSendUser() {
        return mSendUser;
    }

    public void setSendUser(User sendUser) {
        mSendUser = sendUser;
    }
}
