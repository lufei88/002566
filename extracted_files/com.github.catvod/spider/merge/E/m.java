package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class m {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f392short = {2471, 2478, 2477, 2469, 2468, 2483, 1077, 1082, 1087, 1078};

    @SerializedName("type_name")
    private String a;

    @SerializedName("vod_id")
    private String b;

    @SerializedName("vod_name")
    private String c;

    @SerializedName("vod_pic")
    private String d;

    @SerializedName("vod_remarks")
    private String e;

    @SerializedName("vod_year")
    private String f;

    @SerializedName("vod_area")
    private String g;

    @SerializedName("vod_actor")
    private String h;

    @SerializedName("vod_director")
    private String i;

    @SerializedName("vod_content")
    private String j;

    @SerializedName("vod_play_from")
    private String k;

    @SerializedName("vod_play_url")
    private String l;

    @SerializedName("vod_tag")
    private String m;

    @SerializedName("action")
    private String n;

    @SerializedName("style")
    private i o;

    public m() {
    }

    public m(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public m(String str, String str2, String str3, i iVar, String str4) {
        this.b = C0007.m1840();
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.o = iVar;
        this.n = str4;
    }

    public m(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public m(String str, String str2, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.n = str5;
    }

    public m(String str, String str2, String str3, String str4, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.m = z ? C0002.m1305(m3775(), 0, 6, 2497) : C0060.m9352(m3775(), 6, 4, 1107);
    }

    /* renamed from: ۟۟ۡۤۦ, reason: not valid java name and contains not printable characters */
    public static String m3774(Object obj) {
        if (C0007.m1886() > 0) {
            return ((m) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۢۦۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3775() {
        if (C0020.m4210() < 0) {
            return f392short;
        }
        return null;
    }

    /* renamed from: ۟ۡۦۢۥ, reason: not valid java name and contains not printable characters */
    public static String m3776(Object obj) {
        if (C0019.m4065() < 0) {
            return ((m) obj).k;
        }
        return null;
    }

    /* renamed from: ۧۢۢۨ, reason: not valid java name and contains not printable characters */
    public static String m3777(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((m) obj).l;
        }
        return null;
    }

    public final String a() {
        return m3774(this);
    }

    public final String b() {
        return m3776(this);
    }

    public final String c() {
        return m3777(this);
    }

    public final void d(String str) {
        this.a = str;
    }

    public final void e(String str) {
        this.h = str;
    }

    public final void f(String str) {
        this.g = str;
    }

    public final void g(String str) {
        this.j = str;
    }

    public final void h(String str) {
        this.i = str;
    }

    public final void i(String str) {
        this.b = str;
    }

    public final void j(String str) {
        this.c = str;
    }

    public final void k(String str) {
        this.d = str;
    }

    public final void l(String str) {
        this.k = str;
    }

    public final void m(String str) {
        this.l = str;
    }

    public final void n(String str) {
        this.e = str;
    }

    public final void o(String str) {
        this.m = str;
    }

    public final void p(String str) {
        this.f = str;
    }
}