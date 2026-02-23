package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f455short = {1139, 1063, 1068, 1083, 1057, 1033, 1075, 1135, 1073, 1056, 1128, 1065, 1136, 1083, 1078, 1136, 1128, 1136, 2466, 2476, 2466, 2542, 2529, 2541, 2533, 2466, 2490, 2466, 2321, 2382, 2332, 2414, 790, 866, 812, 784};

    @SerializedName("mid")
    private String a;

    @SerializedName("name")
    private String b;

    /* renamed from: ۟ۦۥۧۦ, reason: not valid java name and contains not printable characters */
    public static String m4174(Object obj) {
        if (C0038.m6471() > 0) {
            return ((d) obj).b;
        }
        return null;
    }

    /* renamed from: ۤۥۨ۟, reason: not valid java name and contains not printable characters */
    public static String m4175(Object obj) {
        if (C0026.m4977() < 0) {
            return ((d) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۣۥ۟, reason: contains not printable characters */
    public static short[] m4176() {
        if (C0010.m2320() <= 0) {
            return f455short;
        }
        return null;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        boolean zM7327 = C0043.m7327(m4175(this));
        String strM1840 = C0007.m1840();
        String strM5188 = C0028.m5188(sb, zM7327 ? strM1840 : m4175(this), C0006.m1774(m4176(), 0, 5, 1116));
        String strM4174 = C0043.m7327(m4174(this)) ? strM1840 : m4174(this);
        if (!C0043.m7327(m4174(this))) {
            strM1840 = m4174(this);
        }
        return C0028.m5188(C0052.m8368(C0019.m4107(m4176(), 5, 13, 1106), strM5188, C0058.m9106(m4176(), 18, 10, 2432), strM4174, C0006.m1774(m4176(), 28, 4, 2355)), strM1840, C0006.m1774(m4176(), 32, 4, 845));
    }
}