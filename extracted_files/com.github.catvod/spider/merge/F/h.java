package com.github.catvod.spider.merge.F;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public class h implements Comparable<h> {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f407short = {2967, 2871, 1473, 1753, 1436, 1097, 1442, 1446, 1444, 1469, 1468, 1460, 1468, 1520, 1467, 1470, 1468, 1520, 1470, 1469, 1466, 1468, 1520, 1464, 1511, 1520, 1464, 1479, 1445, 1442, 1446, 560, 582, 565, 606, 579, 599, 563, 581, 583, 2342, 2366, 2385, 2151, 2143, 2064};

    @SerializedName("items")
    private List<h> a;

    @SerializedName("next_marker")
    private String b;

    @SerializedName("file_id")
    private String c;

    @SerializedName("share_id")
    private String d;

    @SerializedName("name")
    private String e;

    @SerializedName("type")
    private String f;

    @SerializedName("file_extension")
    private String g;

    @SerializedName("category")
    private String h;

    @SerializedName("size")
    private double i;

    @SerializedName("parent")
    private String j;

    public h(String str) {
        this.c = str;
    }

    /* renamed from: ۟۠ۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static String m3814(Object obj) {
        if (C0014.m3353() <= 0) {
            return ((h) obj).e;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۥۥ, reason: not valid java name and contains not printable characters */
    public static String m3815(Object obj) {
        if (C0054.m8557() <= 0) {
            return ((h) obj).f;
        }
        return null;
    }

    /* renamed from: ۣ۟ۧۤۢ, reason: not valid java name and contains not printable characters */
    public static String m3816(Object obj) {
        if (C0027.m5017() > 0) {
            return ((h) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠۠ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m3817() {
        if (C0006.m1726() < 0) {
            return f407short;
        }
        return null;
    }

    /* renamed from: ۠ۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m3818(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((h) obj).b;
        }
        return null;
    }

    /* renamed from: ۠ۥۨۧ, reason: not valid java name and contains not printable characters */
    public static String m3819(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((h) obj).g;
        }
        return null;
    }

    /* renamed from: ۡۢ۠ۢ, reason: not valid java name and contains not printable characters */
    public static double m3820(Object obj) {
        if (C0055.m8740() >= 0) {
            return ((h) obj).i;
        }
        return 0.0d;
    }

    /* renamed from: ۢۧۦۤ, reason: not valid java name and contains not printable characters */
    public static String m3821(Object obj) {
        if (C0048.m7971() >= 0) {
            return ((h) obj).h;
        }
        return null;
    }

    /* renamed from: ۣۡۥۧ, reason: not valid java name and contains not printable characters */
    public static List m3822(Object obj) {
        if (C0000.m1116() < 0) {
            return ((h) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۥ۠۟, reason: not valid java name and contains not printable characters */
    public static String m3823(Object obj) {
        if (C0063.m9589() <= 0) {
            return ((h) obj).j;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m3821(this)) ? C0007.m1840() : m3821(this);
    }

    public final String b() {
        String strM7763;
        String strM2754 = C0011.m2754(this);
        String strM6463 = C0038.m6463(this);
        if (m3820(this) == 0.0d) {
            strM7763 = C0007.m1840();
        } else {
            StringBuilder sb = new StringBuilder(C0019.m4107(m3817(), 0, 1, 3020));
            C0018.m3933(sb, C0051.m8193(m3820(this)));
            C0018.m3933(sb, C0052.m8337(m3817(), 1, 1, 2922));
            strM7763 = C0047.m7763(sb);
        }
        return C0064.m9640(C0036.m6194(C0009.m2037(m3817(), 2, 1, 1505), C0001.m1203(new String[]{strM2754, strM6463, strM7763})));
    }

    public final String c() {
        return C0043.m7327(m3819(this)) ? C0007.m1840() : m3819(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(h hVar) {
        return C0050.m8124(C0025.m4809(this), C0025.m4809(hVar));
    }

    public final String d() {
        return C0043.m7327(m3816(this)) ? C0007.m1840() : m3816(this);
    }

    public final List e() {
        List listM3822 = m3822(this);
        return listM3822 == null ? C0008.m1961() : listM3822;
    }

    public final String f() {
        return C0043.m7327(m3814(this)) ? C0007.m1840() : m3814(this);
    }

    public final String g() {
        return C0043.m7327(m3818(this)) ? C0007.m1840() : m3818(this);
    }

    public final String h() {
        return C0043.m7327(m3823(this)) ? C0007.m1840() : C0028.m5188(new StringBuilder(C0044.m7509(m3817(), 3, 1, 1666)), m3823(this), C0029.m5256(m3817(), 4, 1, 1473));
    }

    public final String i() {
        String strM7763;
        String strM7718 = C0046.m7718(m3817(), 5, 1, 1129);
        String strM2754 = C0011.m2754(this);
        String strM6463 = C0038.m6463(this);
        C0062.m9425();
        String strM1840 = C0007.m1840();
        try {
            Matcher matcherM6026 = C0034.m6026(C0005.m1602(C0005.m1645(m3817(), 6, 25, 1420)), strM6463);
            if (C0003.m1405(matcherM6026)) {
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, C0021.m4306(matcherM6026, 1));
                C0018.m3933(sb, strM7718);
                C0018.m3933(sb, strM6463);
                strM7763 = C0047.m7763(sb);
            } else {
                strM7763 = strM6463;
            }
            Matcher matcherM60262 = C0034.m6026(C0005.m1602(C0052.m8337(m3817(), 31, 9, 622)), strM6463);
            if (C0003.m1405(matcherM60262)) {
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0021.m4306(matcherM60262, 1));
                C0018.m3933(sb2, strM7718);
                C0018.m3933(sb2, strM7763);
                strM7763 = C0047.m7763(sb2);
            }
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0025.m4800(strM7763, C0006.m1774(m3817(), 40, 3, 2426), strM1840));
            C0018.m3933(sb3, strM7718);
            C0018.m3933(sb3, C0025.m4800(strM7763, C0040.m6584(m3817(), 43, 3, 2107), strM1840));
            strM1840 = C0047.m7763(sb3);
        } catch (Exception unused) {
        }
        return C0064.m9640(C0036.m6194(strM7718, C0001.m1203(new String[]{strM2754, strM1840})));
    }

    public final String j() {
        return C0043.m7327(m3815(this)) ? C0007.m1840() : m3815(this);
    }

    public final void k(String str) {
        this.j = str;
    }
}