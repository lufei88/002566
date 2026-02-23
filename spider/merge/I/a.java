package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f454short = {1300, 3051};

    @SerializedName("duration")
    private String a;

    @SerializedName("minBufferTime")
    private String b;

    @SerializedName("video")
    private List<c> c;

    @SerializedName("audio")
    private List<c> d;

    /* renamed from: ۟ۤ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static List m4141(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((a) obj).d;
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۤۥ, reason: not valid java name and contains not printable characters */
    public static String m4142(Object obj) {
        if (C0050.m8121() < 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* renamed from: ۢۧۦۨ, reason: not valid java name and contains not printable characters */
    public static short[] m4143() {
        if (C0039.m6529() < 0) {
            return f454short;
        }
        return null;
    }

    /* renamed from: ۥۤۡ, reason: contains not printable characters */
    public static List m4144(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((a) obj).c;
        }
        return null;
    }

    /* renamed from: ۧۥۢۥ, reason: not valid java name and contains not printable characters */
    public static String m4145(Object obj) {
        if (C0033.m5872() >= 0) {
            return ((a) obj).b;
        }
        return null;
    }

    public final List a() {
        List listM4141 = m4141(this);
        return listM4141 == null ? C0008.m1961() : listM4141;
    }

    public final String b() {
        String strM4142 = m4142(this);
        return strM4142 == null ? C0031.m5565(m4143(), 0, 1, 1316) : strM4142;
    }

    public final String c() {
        String strM4145 = m4145(this);
        return strM4145 == null ? C0056.m8911(m4143(), 1, 1, 3035) : strM4145;
    }

    public final List d() {
        List listM4144 = m4144(this);
        return listM4144 == null ? C0008.m1961() : listM4144;
    }
}