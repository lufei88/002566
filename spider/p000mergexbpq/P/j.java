package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
public abstract class j implements InterfaceC0066d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f144short = {1203, 1170, 1161, 1245, 1167, 1176, 1180, 1182, 1173, 1176, 1177, 3134, 3132, 3123, 3123, 3122, 3113, 3197, 3134, 3122, 3123, 3118, 3112, 3120, 3128, 3197, 3096, 3090, 3099};
    protected final int a;
    protected int b = 0;

    j(int i) {
        this.a = i;
    }

    public static j k(f fVar) {
        int iM6078 = C0035.m6078(m812(fVar));
        if (iM6078 == 0) {
            int iM7405 = C0044.m7405(fVar);
            int iM8721 = C0055.m8721(fVar);
            byte[] bArrM815 = m815(fVar);
            m814(fVar);
            return new i(iM7405, iM8721, bArrM815);
        }
        if (iM6078 == 1) {
            int iM74052 = C0044.m7405(fVar);
            int iM87212 = C0055.m8721(fVar);
            char[] cArrM811 = m811(fVar);
            m814(fVar);
            return new g(iM74052, iM87212, cArrM811);
        }
        if (iM6078 != 2) {
            throw new UnsupportedOperationException(C0015.m3484(m810(), 0, 11, 1277));
        }
        int iM74053 = C0044.m7405(fVar);
        int iM87213 = C0055.m8721(fVar);
        int[] iArrM813 = m813(fVar);
        m814(fVar);
        return new h(iM74053, iM87213, iArrM813);
    }

    /* renamed from: ۟۠ۦ۟ۥ, reason: not valid java name and contains not printable characters */
    public static int m808(Object obj) {
        if (C0055.m8740() > 0) {
            return ((j) obj).b;
        }
        return 0;
    }

    /* renamed from: ۟ۧ۠ۢۡ, reason: not valid java name and contains not printable characters */
    public static int m809(Object obj) {
        if (C0028.m5152() < 0) {
            return ((j) obj).a;
        }
        return 0;
    }

    /* renamed from: ۟ۧۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m810() {
        if (C0003.m1463() <= 0) {
            return f144short;
        }
        return null;
    }

    /* renamed from: ۡۡ۟ۨ, reason: not valid java name and contains not printable characters */
    public static char[] m811(Object obj) {
        if (C0004.m1557() < 0) {
            return ((f) obj).d();
        }
        return null;
    }

    /* renamed from: ۥۤۤۥ, reason: contains not printable characters */
    public static int m812(Object obj) {
        if (C0002.m1242() > 0) {
            return ((f) obj).e();
        }
        return 0;
    }

    /* renamed from: ۧۢ۟, reason: not valid java name and contains not printable characters */
    public static int[] m813(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((f) obj).f();
        }
        return null;
    }

    /* renamed from: ۧۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static int m814(Object obj) {
        if (C0021.m4379() > 0) {
            return ((f) obj).a();
        }
        return 0;
    }

    /* renamed from: ۨ۠ۥ۟, reason: not valid java name and contains not printable characters */
    public static byte[] m815(Object obj) {
        if (C0052.m8320() > 0) {
            return ((f) obj).c();
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.P.r
    public final void a() {
    }

    @Override // com.github.catvod.spider.p000mergexbpq.P.r
    public final void d(int i) {
        this.b = i;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.P.r
    public final int g() {
        return -1;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.P.r
    public final int i() {
        return m808(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.P.r
    public final void j() {
        int iM809 = m809(this);
        int iM808 = m808(this);
        if (iM809 - iM808 == 0) {
            throw new IllegalStateException(C0026.m4951(m810(), 11, 18, 3165));
        }
        this.b = iM808 + 1;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.P.r
    public final int size() {
        return m809(this);
    }

    public final String toString() {
        return C0019.m4045(this, C0032.m5752(0, m809(this) - 1));
    }
}