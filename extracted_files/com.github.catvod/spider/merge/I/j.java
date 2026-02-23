package com.github.catvod.spider.merge.I;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.google.gson.annotations.SerializedName;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public class j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f458short = {2107, 2121, 2008, 2011, 2012, 3176, 2669, 1356, 1309, 1333, 1304, 1283, 1294, 1367};
    public final int[] a = {46, 47, 18, 2, 53, 8, 23, 32, 15, 50, 10, 31, 58, 3, 45, 35, 27, 43, 5, 49, 33, 9, 42, 19, 29, 28, 14, 39, 12, 38, 41, 13, 37, 48, 7, 16, 24, 55, 40, 61, 26, 17, 0, 1, 60, 51, 30, 4, 22, 25, 54, 21, 56, 59, 6, 63, 57, 62, 11, 36, 20, 34, 44, 52};

    @SerializedName("img_url")
    private String b;

    @SerializedName("sub_url")
    private String c;

    /* renamed from: ۟ۧ۟ۦۥ, reason: not valid java name and contains not printable characters */
    public static String m4192(Object obj) {
        if (C0018.m3956() > 0) {
            return ((j) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۨۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4193(Object obj) {
        if (C0040.m6582() >= 0) {
            return ((j) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m4194() {
        if (C0057.m9017() >= 0) {
            return f458short;
        }
        return null;
    }

    public final String a(LinkedHashMap linkedHashMap) {
        boolean zM7327 = C0043.m7327(m4193(this));
        String strM1840 = C0007.m1840();
        String strM2746 = C0011.m2746(C0022.m4422(zM7327 ? strM1840 : m4193(this)));
        String strM2805 = C0011.m2805(m4194(), 0, 2, 2151);
        String str = C0024.m4752(strM2746, strM2805)[0];
        if (!C0043.m7327(m4192(this))) {
            strM1840 = m4192(this);
        }
        String strM9804 = C0065.m9804(str, C0024.m4752(C0011.m2746(C0022.m4422(strM1840)), strM2805)[0]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 32; i++) {
            C0062.m9399(sb, C0007.m1823(strM9804, C0039.m6572(this)[i]));
        }
        String strM7763 = C0047.m7763(sb);
        StringBuilder sb2 = new StringBuilder();
        C0037.m6362(linkedHashMap, C0000.m1077(m4194(), 2, 3, 1967), C0004.m1568(C0009.m2099() / 1000));
        Iterator itM5199 = C0029.m5199(C0014.m3352(linkedHashMap));
        while (C0012.m2962(itM5199)) {
            String str2 = (String) C0048.m7949(itM5199);
            C0018.m3933(sb2, str2);
            C0018.m3933(sb2, C0055.m8814(m4194(), 5, 1, 3157));
            C0018.m3933(sb2, C0056.m8909(C0037.m6312(C0038.m6401(linkedHashMap, str2))));
            C0018.m3933(sb2, C0042.m7151(m4194(), 6, 1, 2635));
        }
        String strM5862 = C0033.m5862(C0047.m7763(sb2));
        StringBuilder sb3 = new StringBuilder();
        C0018.m3933(sb3, strM5862);
        C0018.m3933(sb3, strM7763);
        return C0028.m5172(strM5862, C0062.m9389(m4194(), 7, 7, 1386), C0055.m8717(C0047.m7763(sb3)));
    }
}