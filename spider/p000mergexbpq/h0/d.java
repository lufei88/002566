package com.github.catvod.spider.p000mergexbpq.h0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.e0.C0124g;
import com.github.catvod.spider.p000mergexbpq.x.b;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f350short = {2099, 2085, 2082, 2082, 2101, 2110, 2084, 2160, 2099, 2111, 2110, 2084, 2101, 2088, 2084, 2160, 2105, 2083, 2160, 2109, 2111, 2082, 2101, 2160, 2084, 2104, 2097, 2110, 2160, 2111, 2110, 2101, 2160, 2101, 2108, 2172, 2084, 2111, 2084, 2097, 2108, 2160, 2157, 2160};
    private C0124g a;
    private boolean b = false;
    private d c;

    private d(l lVar) {
        C0124g c0124g = new C0124g();
        this.a = c0124g;
        C0018.m3918(c0124g, lVar);
    }

    private d(C0124g c0124g) {
        C0124g c0124g2 = new C0124g();
        this.a = c0124g2;
        C0002.m1243(c0124g2, c0124g);
    }

    public static d b(l lVar) {
        return new d(lVar);
    }

    public static d c(C0124g c0124g) {
        return new d(c0124g);
    }

    public static d d(d dVar) {
        d dVar2 = new d(m2944(dVar));
        dVar2.c = dVar;
        return dVar2;
    }

    /* renamed from: ۣۣ۟ۧۡ, reason: not valid java name and contains not printable characters */
    public static d m2942(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((d) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۧۥۨۨ, reason: not valid java name and contains not printable characters */
    public static boolean m2943(Object obj) {
        if (C0008.m1975() >= 0) {
            return ((d) obj).b;
        }
        return false;
    }

    /* renamed from: ۢ۟ۢۡ, reason: not valid java name and contains not printable characters */
    public static C0124g m2944(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((d) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۧۦۥ, reason: not valid java name and contains not printable characters */
    public static short[] m2945() {
        if (C0049.m8038() < 0) {
            return f350short;
        }
        return null;
    }

    public final C0124g a() {
        return m2944(this);
    }

    public final d e() {
        return m2942(this);
    }

    public final boolean f() {
        return m2943(this);
    }

    public final void g() {
        this.b = false;
    }

    final void h() {
        this.b = true;
    }

    public final void i(C0124g c0124g) {
        this.a = c0124g;
    }

    public final d j(d dVar) {
        this.c = dVar;
        return this;
    }

    public final l k() {
        if (C0009.m2095(m2944(this)) != 1) {
            StringBuilder sbM7166 = C0042.m7166(C0054.m8574(m2945(), 0, 44, 2128));
            C0036.m6177(sbM7166, C0009.m2095(m2944(this)));
            throw new b(C0047.m7763(sbM7166));
        }
        C0124g c0124gM2944 = m2944(this);
        if (C0019.m4116(c0124gM2944)) {
            return null;
        }
        return (l) C0028.m5161(c0124gM2944, 0);
    }
}