package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public final class e extends p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f182short = {639, 575, 563, 561, 561, 569, 562, 552, 3145, 3156, 3160, 3160, 617, 617, 634};

    public e(String str) {
        this.f = str;
    }

    /* renamed from: ۟ۥ۟۟ۥ, reason: not valid java name and contains not printable characters */
    public static short[] m2174() {
        if (C0030.m5375() > 0) {
            return f182short;
        }
        return null;
    }

    /* renamed from: ۠ۡ۠ۥ, reason: not valid java name and contains not printable characters */
    public static int m2175(Object obj) {
        if (C0038.m6471() >= 0) {
            return ((r) obj).d;
        }
        return 0;
    }

    /* renamed from: ۣ۠ۡۦ, reason: not valid java name and contains not printable characters */
    public static r m2176(Object obj) {
        if (C0006.m1726() <= 0) {
            return ((r) obj).c;
        }
        return null;
    }

    /* renamed from: ۦ۟ۨۤ, reason: contains not printable characters */
    public static void m2177(Object obj, Object obj2, int i, Object obj3) {
        if (C0052.m8320() >= 0) {
            ((r) obj).r((Appendable) obj2, i, (g) obj3);
        }
    }

    /* renamed from: ۧۡۥۧ, reason: not valid java name and contains not printable characters */
    public static String m2178(Object obj) {
        if (C0064.m9659() < 0) {
            return ((p) obj).I();
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final Object clone() {
        return (e) super.j();
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.p, com.github.catvod.spider.p000mergexbpq.c0.r
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final r j() {
        return (e) super.j();
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.p, com.github.catvod.spider.p000mergexbpq.c0.r
    public final r m() {
        return this;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final String t() {
        return C0041.m6779(m2174(), 0, 8, 604);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final String toString() {
        return C0025.m4814(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    final void w(Appendable appendable, int i, g gVar) {
        if (C0039.m6534(gVar) && m2175(this) == 0) {
            r rVarM2176 = m2176(this);
            if ((rVarM2176 instanceof l) && C0014.m3334(C0046.m7729((l) rVarM2176))) {
                m2177(this, appendable, i, gVar);
            }
        }
        C0024.m4699(C0024.m4699(C0024.m4699(appendable, C0035.m6131(m2174(), 8, 4, 3189)), m2178(this)), C0007.m1842(m2174(), 12, 3, 580));
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    final void x(Appendable appendable, int i, g gVar) {
    }
}