package com.pro.sachin.firebasedesign.friendzone.functionalities.userchat;

import android.content.Context;

import com.pro.sachin.firebasedesign.friendzone.ChatGettersSetters.Chat;

public class ChatAccess implements ChatInterfaces.Presenter, ChatInterfaces.OnSendMessageListener,
        ChatInterfaces.OnGetMessagesListener {
    private ChatInterfaces.View mView;
    private ChatInteractor mChatInteractor;

    public ChatAccess(ChatInterfaces.View view) {
        this.mView = view;
        mChatInteractor = new ChatInteractor(this, this);
    }

    @Override
    public void sendMessage(Context context, Chat chat, String receiverFirebaseToken) {
        mChatInteractor.sendMessageToFirebaseUser(context, chat, receiverFirebaseToken);
    }

    @Override
    public void getMessage(String senderUid, String receiverUid) {
        mChatInteractor.getMessageFromFirebaseUser(senderUid, receiverUid);
    }

    @Override
    public void onSendMessageSuccess() {
        mView.onSendMessageSuccess();
    }

    @Override
    public void onSendMessageFailure(String message) {
        mView.onSendMessageFailure(message);
    }

    @Override
    public void onGetMessagesSuccess(Chat chat) {
        mView.onGetMessagesSuccess(chat);
    }

    @Override
    public void onGetMessagesFailure(String message) {
        mView.onGetMessagesFailure(message);
    }
}
