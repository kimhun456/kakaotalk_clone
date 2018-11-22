package kim.hyunjaee.kakaotalk_clone.message;

import kim.hyunjaee.kakaotalk_clone.user.User;

public class TextMessage extends Message {

    private static final String TAG = TextMessage.class.getSimpleName();

    private String mContent;

    TextMessage() {
        mContent = "";
    }

    TextMessage(String textBody, User sender) {
        mContent = textBody;
        setSendUser(sender);
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

}
