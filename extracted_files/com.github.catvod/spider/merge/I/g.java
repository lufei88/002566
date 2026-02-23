package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public class g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f457short = {1187, 2442, 2442, 931, 959, 959, 955, 952, 1009, 403, 22102, -28600, 29557};

    @SerializedName("bvid")
    private String a;

    @SerializedName("aid")
    private String b;

    @SerializedName("title")
    private String c;

    @SerializedName("pic")
    private String d;

    @SerializedName("duration")
    private String e;

    @SerializedName("length")
    private String f;

    public static List a(JsonElement jsonElement) {
        return (List) m4183(new Gson(), jsonElement, m4187(new f()));
    }

    /* renamed from: ۟۠ۡۧۡ, reason: not valid java name and contains not printable characters */
    public static String m4180(Object obj) {
        if (C0062.m9429() > 0) {
            return ((g) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m4181() {
        if (C0033.m5872() >= 0) {
            return f457short;
        }
        return null;
    }

    /* renamed from: ۟ۧۢۡ۟, reason: not valid java name and contains not printable characters */
    public static String m4182(Object obj) {
        if (C0008.m1975() > 0) {
            return ((g) obj).d;
        }
        return null;
    }

    /* renamed from: ۟ۧۦۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m4183(Object obj, Object obj2, Object obj3) {
        if (C0036.m6252() > 0) {
            return ((Gson) obj).fromJson((JsonElement) obj2, (Type) obj3);
        }
        return null;
    }

    /* renamed from: ۠ۢۧۦ, reason: not valid java name and contains not printable characters */
    public static String m4184(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((g) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۠۟, reason: not valid java name and contains not printable characters */
    public static String m4185(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((g) obj).b;
        }
        return null;
    }

    /* renamed from: ۢۡۨۦ, reason: not valid java name and contains not printable characters */
    public static String m4186(Object obj) {
        if (C0039.m6529() < 0) {
            return ((g) obj).f;
        }
        return null;
    }

    /* renamed from: ۦۦۥۢ, reason: contains not printable characters */
    public static Type m4187(Object obj) {
        if (C0031.m5628() > 0) {
            return ((TypeToken) obj).getType();
        }
        return null;
    }

    /* renamed from: ۧ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static String m4188(Object obj) {
        if (C0041.m6823() < 0) {
            return ((g) obj).c;
        }
        return null;
    }

    public final m b() {
        String strM4182;
        StringBuilder sb;
        String strM4184;
        m mVar = new m();
        StringBuilder sb2 = new StringBuilder();
        boolean zM7327 = C0043.m7327(m4180(this));
        String strM1840 = C0007.m1840();
        C0018.m3933(sb2, zM7327 ? strM1840 : m4180(this));
        C0018.m3933(sb2, C0017.m3646(m4181(), 0, 1, 1251));
        C0018.m3933(sb2, C0043.m7327(m4185(this)) ? strM1840 : m4185(this));
        C0011.m2828(mVar, C0047.m7763(sb2));
        C0005.m1628(mVar, C0064.m9669(C0016.m3577(C0043.m7327(m4188(this)) ? strM1840 : m4188(this))));
        if (C0043.m7277(C0043.m7327(m4182(this)) ? strM1840 : m4182(this), C0014.m3332(m4181(), 1, 2, 2469))) {
            StringBuilder sb3 = new StringBuilder(C0017.m3646(m4181(), 3, 6, 971));
            C0018.m3933(sb3, C0043.m7327(m4182(this)) ? strM1840 : m4182(this));
            strM4182 = C0047.m7763(sb3);
        } else {
            strM4182 = C0043.m7327(m4182(this)) ? strM1840 : m4182(this);
        }
        C0026.m4947(mVar, strM4182);
        if (!C0043.m7327(m4184(this))) {
            String strM41842 = m4184(this);
            String strM8259 = C0051.m8259(m4181(), 9, 1, 425);
            boolean zM9127 = C0058.m9127(strM41842, strM8259);
            String strM6307 = C0037.m6307(m4181(), 10, 2, 1104);
            if (zM9127) {
                sb = new StringBuilder();
                strM4184 = C0024.m4752(m4184(this), strM8259)[0];
            } else if (C0038.m6456(m4184(this)) < 60) {
                sb = new StringBuilder();
                strM4184 = m4184(this);
                strM6307 = C0055.m8814(m4181(), 12, 1, 2727);
            } else {
                StringBuilder sb4 = new StringBuilder();
                C0036.m6177(sb4, C0038.m6456(m4184(this)) / 60);
                C0018.m3933(sb4, strM6307);
                strM1840 = C0047.m7763(sb4);
            }
            strM1840 = C0028.m5188(sb, strM4184, strM6307);
        } else if (!C0043.m7327(m4186(this))) {
            strM1840 = m4186(this);
        }
        C0019.m4073(mVar, strM1840);
        return mVar;
    }
}