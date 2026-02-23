package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public class e {

    @SerializedName("videosGroup")
    private List<d> a;

    @SerializedName("actor")
    private List<f> b;

    @SerializedName("country")
    private String c;

    @SerializedName("desc")
    private String d;

    @SerializedName("director")
    private List<f> e;

    @SerializedName("name")
    private String f;

    @SerializedName("picurl")
    private String g;

    @SerializedName("time")
    private String h;

    @SerializedName("countStr")
    private String i;

    /* renamed from: ۟۟۠ۥۨ, reason: not valid java name and contains not printable characters */
    public static String m4517(Object obj) {
        if (C0013.m3167() > 0) {
            return ((e) obj).i;
        }
        return null;
    }

    /* renamed from: ۟۠ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static String m4518(Object obj) {
        if (C0037.m6350() <= 0) {
            return ((e) obj).d;
        }
        return null;
    }

    /* renamed from: ۟۠ۤۥۥ, reason: not valid java name and contains not printable characters */
    public static String m4519(Object obj) {
        if (C0030.m5375() > 0) {
            return ((e) obj).c;
        }
        return null;
    }

    /* renamed from: ۠۠ۧۧ, reason: not valid java name and contains not printable characters */
    public static List m4520(Object obj) {
        if (C0055.m8740() > 0) {
            return ((e) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۡۧۦ, reason: not valid java name and contains not printable characters */
    public static String m4521(Object obj) {
        if (C0059.m9257() < 0) {
            return ((e) obj).g;
        }
        return null;
    }

    /* renamed from: ۡۧ۠, reason: not valid java name and contains not printable characters */
    public static String m4522(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((e) obj).f;
        }
        return null;
    }

    /* renamed from: ۣ۟۟, reason: not valid java name and contains not printable characters */
    public static String m4523(Object obj) {
        if (C0054.m8557() < 0) {
            return ((e) obj).h;
        }
        return null;
    }

    /* renamed from: ۣۦۨۧ, reason: not valid java name and contains not printable characters */
    public static List m4524(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((e) obj).e;
        }
        return null;
    }

    /* renamed from: ۤۧۡۡ, reason: not valid java name and contains not printable characters */
    public static List m4525(Object obj) {
        if (C0029.m5282() > 0) {
            return ((e) obj).b;
        }
        return null;
    }

    public final List a() {
        List listM4525 = m4525(this);
        return listM4525 == null ? C0008.m1961() : listM4525;
    }

    public final String b() {
        return C0043.m7327(m4517(this)) ? C0007.m1840() : m4517(this);
    }

    public final String c() {
        return C0043.m7327(m4519(this)) ? C0007.m1840() : m4519(this);
    }

    public final String d() {
        return C0043.m7327(m4518(this)) ? C0007.m1840() : m4518(this);
    }

    public final List e() {
        List listM4524 = m4524(this);
        return listM4524 == null ? C0008.m1961() : listM4524;
    }

    public final String f() {
        return C0043.m7327(m4522(this)) ? C0007.m1840() : m4522(this);
    }

    public final String g() {
        return C0043.m7327(m4521(this)) ? C0007.m1840() : m4521(this);
    }

    public final String h() {
        return C0043.m7327(m4523(this)) ? C0007.m1840() : m4523(this);
    }

    public final List i() {
        List listM4520 = m4520(this);
        return listM4520 == null ? C0008.m1961() : listM4520;
    }
}