package com.flipkart.chatheads.demo;

import android.content.Context;
import android.graphics.Point;

import com.flipkart.chatheads.reboundextensions.ChatHeadUtils;
import com.flipkart.chatheads.ui.ChatHeadDefaultConfig;

/**
 * Created by kiran.kumar on 06/05/15.
 */
public class CustomChatHeadConfig extends ChatHeadDefaultConfig {
    public CustomChatHeadConfig(Context context, int xPosition, int yPosition) {
        super(context);
        setHeadHorizontalSpacing(ChatHeadUtils.dpToPx(context, -2));
        setHeadVerticalSpacing(ChatHeadUtils.dpToPx(context, 2));
        setHeadWidth(ChatHeadUtils.dpToPx(context, 40));
        setHeadHeight(ChatHeadUtils.dpToPx(context, 40));
        setInitialPosition(new Point(xPosition,yPosition));
        setCloseButtonHeight(ChatHeadUtils.dpToPx(context,50));
        setCloseButtonWidth(ChatHeadUtils.dpToPx(context,50));
        setCloseButtonBottomMargin(ChatHeadUtils.dpToPx(context,100));
        setMaxChatHeads(4);
    }
}