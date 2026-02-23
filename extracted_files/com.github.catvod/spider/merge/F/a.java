package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.x0.C0063;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    @SerializedName("pds_login_result")
    private a a;

    @SerializedName("role")
    private String b;

    @SerializedName("isFirstLogin")
    private Boolean c;

    @SerializedName("needLink")
    private Boolean d;

    @SerializedName("loginType")
    private String e;

    @SerializedName("nickName")
    private String f;

    @SerializedName("needRpVerify")
    private Boolean g;

    @SerializedName("avatar")
    private String h;

    @SerializedName("accessToken")
    private String i;

    @SerializedName("userName")
    private String j;

    @SerializedName("userId")
    private String k;

    @SerializedName("defaultDriveId")
    private String l;

    @SerializedName("existLink")
    private List<?> m;

    @SerializedName("expiresIn")
    private Integer n;

    @SerializedName("expireTime")
    private String o;

    @SerializedName("requestId")
    private String p;

    @SerializedName("dataPinSetup")
    private Boolean q;

    @SerializedName("state")
    private String r;

    @SerializedName("tokenType")
    private String s;

    @SerializedName("dataPinSaved")
    private Boolean t;

    @SerializedName("refreshToken")
    private String u;

    @SerializedName("status")
    private String v;

    /* renamed from: ۥ۠۠ۦ, reason: contains not printable characters */
    public static String m3789(Object obj) {
        if (C0018.m3956() > 0) {
            return ((a) obj).u;
        }
        return null;
    }

    /* renamed from: ۦۢۦۧ, reason: contains not printable characters */
    public static a m3790(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((a) obj).a;
        }
        return null;
    }

    public final a a() {
        return m3790(this);
    }

    public final String b() {
        return m3789(this);
    }
}