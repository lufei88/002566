package com.github.catvod.spider.p000mergexbpq.R;

import com.github.catvod.spider.merge-xbpq.P.I;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.Q.f;
import com.github.catvod.spider.p000mergexbpq.Q.p0;
import com.github.catvod.spider.p000mergexbpq.Q.v;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f156short = {2144, 2113, 2115, 2134, 2063, 2143, 2141, 2122, 2124, 2122, 2123, 2122, 2113, 2124, 2122, 2063, 2155, 2153, 2158, 2140, 2063, 2114, 2126, 2134, 2063, 2124, 2112, 2113, 2139, 2126, 2118, 2113, 2063, 2126, 2063, 2143, 2141, 2122, 2124, 2122, 2123, 2122, 2113, 2124, 2122, 2063, 2140, 2139, 2126, 2141, 2139, 2063, 2140, 2139, 2126, 2139, 2122, 2049, 2779, 2810, 2808, 2797, 2740, 2788, 2790, 2801, 2807, 2801, 2800, 2801, 2810, 2807, 2801, 2740, 2768, 2770, 2773, 2791, 2740, 2809, 2805, 2797, 2740, 2807, 2811, 2810, 2784, 2805, 2813, 2810, 2740, 2805, 2740, 2788, 2790, 2801, 2807, 2801, 2800, 2801, 2810, 2807, 2801, 2740, 2791, 2784, 2805, 2790, 2784, 2740, 2791, 2784, 2805, 2784, 2801, 2746};
    public final Map<e, e> a = new HashMap();
    public volatile e b;
    public final int c;
    public final v d;
    private final boolean e;

    public b(v vVar, int i) {
        this.d = vVar;
        this.c = i;
        boolean z = true;
        if ((vVar instanceof p0) && C0033.m5801((p0) vVar)) {
            e eVar = new e(new f(true));
            eVar.c = new e[0];
            eVar.d = false;
            eVar.g = false;
            this.b = eVar;
        } else {
            z = false;
        }
        this.e = z;
    }

    /* renamed from: ۟ۥ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static short[] m1348() {
        if (C0008.m1975() >= 0) {
            return f156short;
        }
        return null;
    }

    /* renamed from: ۣۣۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m1349(Object obj) {
        if (C0018.m3956() > 0) {
            return ((b) obj).e;
        }
        return false;
    }

    /* renamed from: ۦۧۦ۟, reason: contains not printable characters */
    public static I m1350() {
        if (C0032.m5686() <= 0) {
            return I.e;
        }
        return null;
    }

    /* renamed from: ۧۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static String m1351(Object obj) {
        if (C0038.m6471() > 0) {
            return ((c) obj).toString();
        }
        return null;
    }

    public final e a(int i) {
        if (!m1349(this)) {
            throw new IllegalStateException(C0036.m6188(m1348(), 0, 58, 2095));
        }
        if (i < 0 || i >= C0060.m9302(C0065.m9727(this)).length) {
            return null;
        }
        return C0060.m9302(C0065.m9727(this))[i];
    }

    public final boolean b() {
        return m1349(this);
    }

    public final void c(int i, e eVar) {
        if (!m1349(this)) {
            throw new IllegalStateException(C0002.m1305(m1348(), 58, 58, 2708));
        }
        if (i < 0) {
            return;
        }
        synchronized (C0065.m9727(this)) {
            if (i >= C0060.m9302(C0065.m9727(this)).length) {
                C0065.m9727(this).c = (e[]) C0003.m1439(C0060.m9302(C0065.m9727(this)), i + 1);
            }
            C0060.m9302(C0065.m9727(this))[i] = eVar;
        }
    }

    public final String toString() {
        return C0065.m9727(this) == null ? C0007.m1840() : m1351(new c(this, m1350()));
    }
}