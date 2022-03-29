package com.example.chat_application.Firebase;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class Message extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NonNull String token)
    {
        super.onNewToken(token);
        Log.d("FCM", "Token: " + token);
    }

    @Override

    public void onMessageReceived(@NonNull RemoteMessage remoteMessage)
    {
        super.onMessageReceived(remoteMessage);
        Log.d("FCM", "Token: " + remoteMessage.getNotification().getBody());
    }

}
