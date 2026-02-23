package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public class o {

    @SerializedName("share_id")
    private String a;

    @SerializedName("share_token")
    private String b;

    @SerializedName("expire_time")
    private String c;

    @SerializedName("expires_in")
    private int d;

    @SerializedName("creator_id")
    private String e;

    @SerializedName("creator_name")
    private String f;

    @SerializedName("creator_phone")
    private String g;

    @SerializedName("expiration")
    private String h;

    @SerializedName("updated_at")
    private String i;

    @SerializedName("vip")
    private String j;

    @SerializedName("avatar")
    private String k;

    @SerializedName("share_name")
    private String l;

    @SerializedName("display_name")
    private String m;

    @SerializedName("share_title")
    private String n;

    @SerializedName("has_pwd")
    private boolean o;

    @SerializedName("file_infos")
    private List<h> p;
    public long q;

    /* renamed from: ۣۣ۟ۥۦ, reason: not valid java name and contains not printable characters */
    public static String m3838(Object obj) {
        if (C0002.m1242() > 0) {
            return ((o) obj).l;
        }
        return null;
    }

    /* renamed from: ۟ۧۤۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3839(Object obj) {
        if (C0044.m7508() < 0) {
            return ((o) obj).k;
        }
        return null;
    }

    /* renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static String m3840(Object obj) {
        if (C0002.m1242() > 0) {
            return ((o) obj).a;
        }
        return null;
    }

    /* renamed from: ۥ۠ۡۥ, reason: contains not printable characters */
    public static String m3841(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((o) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۣۢۧ, reason: contains not printable characters */
    public static List m3842(Object obj) {
        if (C0050.m8121() < 0) {
            return ((o) obj).p;
        }
        return null;
    }

    public final boolean a(String str) {
        return C0007.m1815(C0043.m7327(m3840(this)) ? C0007.m1840() : m3840(this), str) && C0009.m2099() <= C0024.m4663(this);
    }

    public final String b() {
        return C0043.m7327(m3839(this)) ? C0007.m1840() : m3839(this);
    }

    public final List c() {
        List listM3842 = m3842(this);
        return listM3842 == null ? C0008.m1961() : listM3842;
    }

    public final String d() {
        return C0043.m7327(m3838(this)) ? C0007.m1840() : m3838(this);
    }

    public final String e() {
        return C0043.m7327(m3841(this)) ? C0007.m1840() : m3841(this);
    }

    public final void f(String str) {
        this.a = str;
    }
}