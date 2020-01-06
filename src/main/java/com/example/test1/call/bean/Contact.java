package com.example.test1.call.bean;

import android.telecom.Call;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    //姓名
    public String mName;
    //号码
    public String mNumber;
    //通话记录
    public List<Calllog> mCalllogs = new ArrayList<>();
    //打入次数
    public int mIncomingNum = 0;
    //打出次数
    public int mOutGoingNum = 0;
    //未接次数
    public int mMissNum = 0;
    //头像id
    private int mImageId;
}
