package com.pro.sachin.firebasedesign.friendzone.functionalities.userchat;

import android.content.Context;

import com.pro.sachin.firebasedesign.friendzone.ChatGettersSetters.Chat;


public interface ChatInterfaces {
    interface View {
        void onSendMessageSuccess();

        void onSendMessageFailure(String message);

        void onGetMessagesSuccess(Chat chat);

        void onGetMessagesFailure(String message);
    }

    interface Presenter {
        void sendMessage(Context context, Chat chat, String receiverFirebaseToken);

        void getMessage(String senderUid, String receiverUid);
    }

    interface Interactor {
        void sendMessageToFirebaseUser(Context context, Chat chat, String receiverFirebaseToken);

        void getMessageFromFirebaseUser(String senderUid, String receiverUid);
    }

    interface OnSendMessageListener {
        void onSendMessageSuccess();

        void onSendMessageFailure(String message);
    }

    interface OnGetMessagesListener {
        void onGetMessagesSuccess(Chat chat);

        void onGetMessagesFailure(String message);
    }
}
