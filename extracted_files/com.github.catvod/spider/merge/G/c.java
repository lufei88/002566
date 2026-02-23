package com.github.catvod.spider.merge.G;

import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f444short = {788, 788, 788, 788, 832, 800, 800, 832, 777, 777, 842, 825, 842, 805, 805, 855, 768, 768, 855, 798, 798, 835, 830, 830, 830, 823, 2280, 2280, 2722, 2750, 2750, 2746, 2800, 2201, 2913, 2875, 2876, 1219, 1152, 1181, 1162, 2795, 2737, 2742, 2519, 2452, 2441, 2462};

    @SerializedName("name")
    private String a;

    @SerializedName(alternate = {"parent"}, value = "path")
    private String b;

    @SerializedName("type")
    private int c;

    @SerializedName("size")
    private long d;

    @SerializedName(alternate = {"thumbnail"}, value = "thumb")
    private String e;

    @SerializedName(alternate = {"raw_url"}, value = "url")
    private String f;

    @SerializedName(alternate = {"updated_at"}, value = "modified")
    private String g;

    public static List a(String str) {
        return (List) m4012(new Gson(), str, m4008(new b()));
    }

    /* renamed from: ۟۟۟ۨۢ, reason: not valid java name and contains not printable characters */
    public static String m4004(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((c) obj).e;
        }
        return null;
    }

    /* renamed from: ۟۠ۨۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4005(Object obj) {
        if (C0021.m4379() > 0) {
            return ((c) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۦۧۤ, reason: not valid java name and contains not printable characters */
    public static String m4006(Object obj) {
        if (C0001.m1164() < 0) {
            return ((c) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۤۢۦ۟, reason: not valid java name and contains not printable characters */
    public static long m4007(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((c) obj).d;
        }
        return 0L;
    }

    /* renamed from: ۟ۥۨۢۧ, reason: not valid java name and contains not printable characters */
    public static Type m4008(Object obj) {
        if (C0020.m4210() < 0) {
            return ((TypeToken) obj).getType();
        }
        return null;
    }

    /* renamed from: ۡۧۦۧ, reason: not valid java name and contains not printable characters */
    public static String m4009(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((c) obj).g;
        }
        return null;
    }

    /* renamed from: ۢۤ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m4010(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((c) obj).c;
        }
        return 0;
    }

    /* renamed from: ۥۡۦ, reason: contains not printable characters */
    public static short[] m4011() {
        if (C0063.m9589() <= 0) {
            return f444short;
        }
        return null;
    }

    /* renamed from: ۦۡۧۨ, reason: contains not printable characters */
    public static Object m4012(Object obj, Object obj2, Object obj3) {
        if (C0062.m9429() > 0) {
            return ((Gson) obj).fromJson((String) obj2, (Type) obj3);
        }
        return null;
    }

    /* renamed from: ۦۣ, reason: contains not printable characters */
    public static String m4013(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((c) obj).f;
        }
        return null;
    }

    public final Date b() {
        try {
            return C0007.m1875(new SimpleDateFormat(C0051.m8259(m4011(), 0, 26, 877), C0045.m7549()), m4009(this));
        } catch (Exception unused) {
            return new Date();
        }
    }

    public final String c() {
        return C0043.m7327(m4006(this)) ? C0007.m1840() : m4006(this);
    }

    public final long d() {
        return m4007(this);
    }

    public final String e() {
        if (C0043.m7327(m4013(this))) {
            return C0007.m1840();
        }
        if (!C0043.m7277(m4013(this), C0060.m9352(m4011(), 26, 2, 2247))) {
            return m4013(this);
        }
        StringBuilder sb = new StringBuilder(C0046.m7718(m4011(), 28, 5, 2762));
        C0018.m3933(sb, m4013(this));
        return C0047.m7763(sb);
    }

    public final m f(a aVar, String str) {
        String strM4004 = str;
        String strM1967 = C0008.m1967(this, C0018.m3899(aVar));
        String strM6619 = C0040.m6619(this);
        boolean zM7327 = C0043.m7327(m4004(this));
        String strM1840 = C0007.m1840();
        if (!C0057.m8953(zM7327 ? strM1840 : m4004(this)) || !C0008.m2007(this)) {
            strM4004 = C0043.m7327(m4004(this)) ? strM1840 : m4004(this);
        }
        return new m(strM1967, strM6619, strM4004, C0018.m3899(aVar), C0008.m2007(this));
    }

    public final m g(String str, String str2) {
        String strM4004 = str2;
        String strM1967 = C0008.m1967(this, str);
        String strM6619 = C0040.m6619(this);
        boolean zM7327 = C0043.m7327(m4004(this));
        String strM1840 = C0007.m1840();
        if (!C0057.m8953(zM7327 ? strM1840 : m4004(this)) || !C0008.m2007(this)) {
            strM4004 = C0043.m7327(m4004(this)) ? strM1840 : m4004(this);
        }
        return new m(strM1967, strM6619, strM4004, C0051.m8193(m4007(this)), C0008.m2007(this));
    }

    public final String h(String str) {
        StringBuilder sbM5621 = C0031.m5621(str);
        C0018.m3933(sbM5621, C0043.m7327(m4005(this)) ? C0007.m1840() : m4005(this));
        C0018.m3933(sbM5621, C0055.m8814(m4011(), 33, 1, 2230));
        C0018.m3933(sbM5621, C0040.m6619(this));
        return C0047.m7763(sbM5621);
    }

    public final boolean i(boolean z) {
        if (C0060.m9349(C0040.m6619(this), C0043.m7290(m4011(), 34, 3, 2895)) || C0060.m9349(C0040.m6619(this), C0034.m6001(m4011(), 37, 4, 1261))) {
            return false;
        }
        if (z) {
            int iM4010 = m4010(this);
            return iM4010 == 0 || iM4010 == 4;
        }
        int iM40102 = m4010(this);
        return iM40102 == 0 || iM40102 == 2 || iM40102 == 5;
    }

    public final boolean j() {
        return m4010(this) == 1;
    }

    public final boolean k(boolean z) {
        if (C0060.m9349(C0040.m6619(this), C0045.m7657(m4011(), 41, 3, 2757)) || C0060.m9349(C0040.m6619(this), C0060.m9352(m4011(), 44, 4, 2553))) {
            return true;
        }
        if (z) {
            int iM4010 = m4010(this);
            return iM4010 == 2 || iM4010 == 3;
        }
        int iM40102 = m4010(this);
        return iM40102 == 3 || iM40102 == 4;
    }

    public final void l(String str) {
        this.a = str;
    }

    public final void m(String str) {
        this.b = str;
    }

    public final void n(String str) {
        this.e = str;
    }

    public final void o(int i) {
        this.c = i;
    }
}