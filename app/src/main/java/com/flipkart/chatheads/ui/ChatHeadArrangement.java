package com.flipkart.chatheads.ui;

import android.os.Bundle;

import com.facebook.rebound.Spring;
import com.flipkart.chatheads.reboundextensions.ChatHeadSpringsHolder;

/**
 * Created by kirankumar on 13/02/15.
 */
public abstract class ChatHeadArrangement {
    public abstract void setContainer(ChatHeadContainer container);

    public abstract void onActivate(ChatHeadContainer container, Bundle extras, ChatHeadSpringsHolder springsHolder, int maxWidth, int maxHeight);

    public abstract void onDeactivate(int maxWidth, int maxHeight, Spring activeHorizontalSpring, Spring activeVerticalSpring);

    public abstract void onSpringUpdate(ChatHead activeChatHead, boolean isDragging, int maxWidth, int maxHeight, Spring spring, Spring activeHorizontalSpring, Spring activeVerticalSpring, int totalVelocity);

    public abstract boolean handleTouchUp(ChatHead activeChatHead, int xVelocity, int yVelocity, Spring activeHorizontalSpring, Spring activeVerticalSpring, boolean wasDragging);

    public abstract void onChatHeadAdded(ChatHead chatHead, ChatHeadSpringsHolder springsHolder);

    public abstract void onChatHeadRemoved(ChatHead removed, ChatHeadSpringsHolder springsHolder);

    public abstract void onCapture(ChatHeadContainer container, ChatHead activeChatHead);

    public abstract void selectChatHead(ChatHead chatHead);
}