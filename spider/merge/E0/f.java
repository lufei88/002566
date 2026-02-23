package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.F0.AbstractC0151h;
import com.github.catvod.spider.merge.F0.C0166x;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.X0.C0230a;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f396short = {807, 805, 810, 810, 811, 816, 868, 807, 811, 810, 823, 817, 809, 801, 868, 769, 779, 770, 405, 414, 387, 399, 431, 404, 400, 414, 405, 475, 393, 414, 394, 398, 402, 393, 414, 392, 475, 410, 475, 405, 404, 405, 470, 405, 398, 407, 407, 475, 402, 405, 395, 398, 399, 475, 392, 399, 393, 414, 410, 406, 469};
    public final t a;
    public final ArrayList b = new ArrayList(100);
    public int c = -1;
    public boolean d;

    public f(C0230a c0230a) {
        this.a = c0230a;
    }

    /* renamed from: ۨۦۣۢ, reason: not valid java name and contains not printable characters */
    public static short[] m3781() {
        if (C0044.m7508() <= 0) {
            return f396short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.j
    public final int a(int i) {
        return C0022.m4461(C0014.m3361(this, i));
    }

    public final d b(int i) {
        if (C0037.m6339(this) == -1) {
            C0054.m8653(this, 0);
            this.c = C0022.m4443(this, 0);
        }
        if (i == 0) {
            return null;
        }
        ArrayList arrayListM7736 = C0046.m7736(this);
        if (i >= 0) {
            int iM6339 = C0037.m6339(this);
            for (int i2 = 1; i2 < i; i2++) {
                int i3 = iM6339 + 1;
                if (C0054.m8653(this, i3)) {
                    iM6339 = C0022.m4443(this, i3);
                }
            }
            return (d) C0028.m5167(arrayListM7736, iM6339);
        }
        int i4 = -i;
        if (i4 == 0) {
            return null;
        }
        int iM63392 = C0037.m6339(this);
        if (iM63392 - i4 < 0) {
            return null;
        }
        for (int i5 = 1; i5 <= i4 && iM63392 > 0; i5++) {
            iM63392--;
            C0054.m8653(this, iM63392);
            if (iM63392 >= C0009.m2139(C0046.m7736(this))) {
                iM63392 = C0009.m2139(C0046.m7736(this)) - 1;
            } else {
                while (iM63392 >= 0) {
                    d dVar = (d) C0028.m5167(arrayListM7736, iM63392);
                    if (C0022.m4461(dVar) == -1 || C0053.m8403(dVar) == 0) {
                        break;
                    }
                    iM63392--;
                }
            }
        }
        if (iM63392 < 0) {
            return null;
        }
        return (d) C0028.m5167(arrayListM7736, iM63392);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c() {
        /*
            r55 = this;
            r4 = r55
            int r0 = com.github.catvod.spider.merge.Z.C0037.m6339(r4)
            r1 = 1
            if (r0 < 0) goto L22
            boolean r2 = com.github.catvod.spider.merge.b0.C0045.m7550(r4)
            java.util.ArrayList r3 = com.github.catvod.spider.merge.c1.C0046.m7736(r4)
            if (r2 == 0) goto L1b
            int r2 = com.github.catvod.spider.p000mergexbpq.c.C0009.m2139(r3)
            int r2 = r2 - r1
            if (r0 >= r2) goto L22
            goto L29
        L1b:
            int r2 = com.github.catvod.spider.p000mergexbpq.c.C0009.m2139(r3)
            if (r0 >= r2) goto L22
            goto L29
        L22:
            int r0 = com.github.catvod.spider.p000mergexbpq.r.C0014.m3373(r4, r1)
            r2 = -1
            if (r0 == r2) goto L40
        L29:
            int r0 = com.github.catvod.spider.merge.Z.C0037.m6339(r4)
            int r0 = r0 + r1
            boolean r0 = com.github.catvod.spider.merge.h.C0054.m8653(r4, r0)
            if (r0 == 0) goto L3f
            int r0 = com.github.catvod.spider.merge.Z.C0037.m6339(r4)
            int r0 = r0 + r1
            int r0 = com.github.catvod.spider.merge.K0.C0022.m4443(r4, r0)
            r4.c = r0
        L3f:
            return
        L40:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            short[] r42 = m3781()
            r45 = 836(0x344, float:1.171E-42)
            r43 = 0
            r44 = 18
            java.lang.String r42 = com.github.catvod.spider.p000mergexbpq.Q.C0001.m1189(r42, r43, r44, r45)
            r1 = r42
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.E0.f.c():void");
    }

    public final int d(int i) {
        d dVar;
        int iM8995;
        int iM5008;
        if (C0045.m7550(this)) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            k kVar = (k) C0027.m5088(this);
            c cVarM3357 = C0014.m3357(kVar);
            if (cVarM3357 == null) {
                throw new IllegalStateException(C0057.m8978(m3781(), 18, 43, 507));
            }
            while (true) {
                boolean zM5734 = C0032.m5734(kVar);
                e eVarM6395 = C0038.m6395(kVar);
                if (zM5734) {
                    AbstractC0151h abstractC0151hM6519 = C0039.m6519(kVar);
                    int iM4431 = C0022.m4431((C0166x) abstractC0151hM6519);
                    int iM1835 = C0007.m1835((C0166x) abstractC0151hM6519);
                    int iM8228 = C0051.m8228(cVarM3357);
                    com.github.catvod.spider.merge.H0.h hVarM8384 = C0052.m8384(kVar);
                    C0047.m7777(eVarM6395);
                    dVar = new d(hVarM8384, -1, 0, iM8228, iM8228 - 1);
                    dVar.b = iM1835;
                    dVar.c = iM4431;
                    kVar.g = dVar;
                    break;
                }
                kVar.g = null;
                kVar.l = 0;
                kVar.h = C0051.m8228(cVarM3357);
                C0166x c0166x = (C0166x) C0039.m6519(kVar);
                kVar.j = C0022.m4431(c0166x);
                kVar.i = C0007.m1835(c0166x);
                do {
                    kVar.m = 0;
                    try {
                        iM8995 = C0057.m8995((C0166x) C0039.m6519(kVar), cVarM3357, C0019.m4064(kVar));
                    } catch (l e) {
                        C0027.m5041(kVar, e);
                        if (C0029.m5224(cVarM3357, 1) != -1) {
                            C0057.m9037((C0166x) C0039.m6519(kVar), cVarM3357);
                        }
                        iM8995 = -3;
                    }
                    if (C0029.m5224(cVarM3357, 1) == -1) {
                        kVar.k = true;
                    }
                    if (C0027.m5008(kVar) == 0) {
                        kVar.m = iM8995;
                    }
                    iM5008 = C0027.m5008(kVar);
                    if (iM5008 == -3) {
                        break;
                    }
                } while (iM5008 == -2);
                if (C0004.m1588(kVar) == null) {
                    int iM9097 = C0058.m9097(kVar);
                    int iM8296 = C0052.m8296(kVar);
                    int iM82282 = C0051.m8228(cVarM3357) - 1;
                    int iM9751 = C0065.m9751(kVar);
                    int iM8404 = C0053.m8404(kVar);
                    com.github.catvod.spider.merge.H0.h hVarM83842 = C0052.m8384(kVar);
                    C0047.m7777(eVarM6395);
                    d dVar2 = new d(hVarM83842, iM5008, iM9097, iM8296, iM82282);
                    dVar2.b = iM9751;
                    dVar2.c = iM8404;
                    kVar.g = dVar2;
                }
                dVar = C0004.m1588(kVar);
            }
            boolean z = dVar instanceof d;
            ArrayList arrayListM7736 = C0046.m7736(this);
            if (z) {
                dVar.g = C0009.m2139(arrayListM7736);
            }
            C0004.m1532(arrayListM7736, dVar);
            if (C0022.m4461(dVar) == -1) {
                this.d = true;
                return i2 + 1;
            }
        }
        return i;
    }

    public final int e(int i) {
        int i2 = i;
        C0054.m8653(this, i2);
        if (i2 >= C0009.m2139(C0046.m7736(this))) {
            return C0009.m2139(C0046.m7736(this)) - 1;
        }
        ArrayList arrayListM7736 = C0046.m7736(this);
        while (true) {
            d dVar = (d) C0028.m5167(arrayListM7736, i2);
            if (C0053.m8403(dVar) == 0 || C0022.m4461(dVar) == -1) {
                return i2;
            }
            i2++;
            C0054.m8653(this, i2);
        }
    }

    public final void f(int i) {
        if (C0037.m6339(this) == -1) {
            C0054.m8653(this, 0);
            this.c = C0022.m4443(this, 0);
        }
        this.c = C0022.m4443(this, i);
    }

    public final boolean g(int i) {
        int iM2139 = (i - C0009.m2139(C0046.m7736(this))) + 1;
        return iM2139 <= 0 || C0027.m5097(this, iM2139) >= iM2139;
    }
}