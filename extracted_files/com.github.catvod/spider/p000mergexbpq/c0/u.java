package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public class u extends p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f194short = {2865, 2918, 2935, 2922, 2918};

    public u(String str) {
        this.f = str;
    }

    static boolean M(StringBuilder sb) {
        return C0006.m1693(sb) != 0 && C0057.m8984(sb, C0006.m1693(sb) - 1) == ' ';
    }

    /* renamed from: ۣ۟ۥۧۦ, reason: not valid java name and contains not printable characters */
    public static r m2271(Object obj) {
        if (C0023.m4566() <= 0) {
            return ((r) obj).c;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static void m2272(Object obj, Object obj2, int i, Object obj3) {
        if (C0031.m5628() >= 0) {
            ((r) obj).r((Appendable) obj2, i, (g) obj3);
        }
    }

    /* renamed from: ۟ۥۣ۠۟, reason: not valid java name and contains not printable characters */
    public static void m2273(Object obj, Object obj2, Object obj3, boolean z, boolean z2, boolean z3) {
        if (C0004.m1557() <= 0) {
            n.d((Appendable) obj, (String) obj2, (g) obj3, z, z2, z3);
        }
    }

    /* renamed from: ۣ۠۠ۡ, reason: not valid java name and contains not printable characters */
    public static String m2274(Object obj) {
        if (C0047.m7837() > 0) {
            return ((p) obj).I();
        }
        return null;
    }

    /* renamed from: ۡۦ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2275() {
        if (C0045.m7538() <= 0) {
            return f194short;
        }
        return null;
    }

    /* renamed from: ۥ۟ۡ۟, reason: contains not printable characters */
    public static boolean m2276(Object obj) {
        if (C0026.m4977() <= 0) {
            return l.h0((r) obj);
        }
        return false;
    }

    /* renamed from: ۦۦۢۦ, reason: contains not printable characters */
    public static int m2277(Object obj) {
        if (C0013.m3167() > 0) {
            return ((r) obj).d;
        }
        return 0;
    }

    public u K() {
        return (u) super.j();
    }

    public final String L() {
        return m2274(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public /* bridge */ /* synthetic */ Object clone() {
        return C0032.m5707(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.p, com.github.catvod.spider.p000mergexbpq.c0.r
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public /* bridge */ /* synthetic */ r j() {
        return C0032.m5707(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.p, com.github.catvod.spider.p000mergexbpq.c0.r
    public final r m() {
        return this;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public String t() {
        return C0061.m9361(m2275(), 0, 5, 2834);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final String toString() {
        return C0025.m4814(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    void w(Appendable appendable, int i, g gVar) {
        boolean zM6534 = C0039.m6534(gVar);
        if (zM6534 && m2277(this) == 0) {
            r rVarM2271 = m2271(this);
            if ((rVarM2271 instanceof l) && C0014.m3334(C0046.m7729((l) rVarM2271)) && !C0027.m5014(m2274(this))) {
                m2272(this, appendable, i, gVar);
            }
        }
        m2273(appendable, m2274(this), gVar, false, zM6534 && !m2276(m2271(this)), zM6534 && (m2271(this) instanceof h));
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    void x(Appendable appendable, int i, g gVar) {
    }
}