package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* renamed from: com.github.catvod.spider.merge.U0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0213u extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f614short = {701, 666, 700, 657, 661, 656, 1222, 1227, 1231, 1226, 1313, 1328, 1336, 1317, 1337, 1332, 1313, 1328, 442, 422, 447, 446, 2651, 2648, 2634, 2652, 3182, 3188, 3171, 3168, 1811, 1819, 1802, 1823, 621, 624, 621, 629, 636, 2544, 2545, 2541, 2557, 2540, 2551, 2542, 2538, 3145, 3161, 3144, 3155, 3146, 3150};

    public C0213u() {
        super(C0043.m7290(f614short, 0, 6, 756), 3);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        B b;
        if (B.a(n)) {
            c0176b.s((G) n);
            return true;
        }
        int iB = com.github.catvod.spider.merge.l0.f.b(n.a);
        if (iB == 0) {
            c0176b.h(this);
            return false;
        }
        String strM3332 = C0014.m3332(f614short, 6, 4, 1198);
        String strM6307 = C0037.m6307(f614short, 10, 8, 1365);
        if (iB == 1) {
            L l = (L) n;
            String str = l.c;
            if (str.equals(C0046.m7718(f614short, 18, 4, 466))) {
                return B.g.c(n, c0176b);
            }
            if (com.github.catvod.spider.merge.S0.b.c(str, A.a)) {
                com.github.catvod.spider.merge.T0.m mVarU = c0176b.u(l);
                if (str.equals(C0024.m4740(f614short, 22, 4, 2617))) {
                    String strM4340 = C0021.m4340(f614short, 26, 4, 3078);
                    if (mVarU.k(strM4340) && !c0176b.n) {
                        String strA = mVarU.a(strM4340);
                        if (strA.length() != 0) {
                            c0176b.f = strA;
                            c0176b.n = true;
                            com.github.catvod.spider.merge.T0.h hVar = c0176b.d;
                            hVar.getClass();
                            hVar.D(strA);
                        }
                    }
                }
            } else if (str.equals(C0030.m5362(f614short, 30, 4, 1918))) {
                c0176b.u(l);
            } else {
                boolean zEquals = str.equals(C0051.m8259(f614short, 34, 5, 537));
                C0221y c0221y = B.h;
                if (zEquals) {
                    c0176b.c.o(g1.c);
                    c0176b.m = c0176b.l;
                    c0176b.l = c0221y;
                    c0176b.r(l);
                } else if (com.github.catvod.spider.merge.S0.b.c(str, A.b)) {
                    B.b(l, c0176b);
                } else if (str.equals(C0024.m4740(f614short, 39, 8, 2462))) {
                    c0176b.r(l);
                    b = B.e;
                    c0176b.l = b;
                } else if (str.equals(C0048.m7902(f614short, 47, 6, 3130))) {
                    c0176b.c.o(g1.f);
                    c0176b.m = c0176b.l;
                    c0176b.l = c0221y;
                    c0176b.r(l);
                } else {
                    if (str.equals(strM3332)) {
                        c0176b.h(this);
                        return false;
                    }
                    if (!str.equals(strM6307)) {
                        c0176b.F(strM3332);
                        return c0176b.D(n);
                    }
                    c0176b.r(l);
                    c0176b.q.add(null);
                    c0176b.u = false;
                    C0194k c0194k = B.r;
                    c0176b.l = c0194k;
                    c0176b.H(c0194k);
                }
            }
        } else if (iB == 2) {
            String str2 = ((K) n).c;
            if (str2.equals(strM3332)) {
                c0176b.A();
                b = B.f;
                c0176b.l = b;
            } else {
                if (com.github.catvod.spider.merge.S0.b.c(str2, A.c)) {
                    c0176b.F(strM3332);
                    return c0176b.D(n);
                }
                if (!str2.equals(strM6307)) {
                    c0176b.h(this);
                    return false;
                }
                if (c0176b.y(str2)) {
                    c0176b.j(true);
                    if (!str2.equals(c0176b.f().d.b)) {
                        c0176b.h(this);
                    }
                    c0176b.B(str2);
                    c0176b.c();
                    c0176b.C();
                    c0176b.M();
                } else {
                    c0176b.h(this);
                }
            }
        } else {
            if (iB != 3) {
                c0176b.F(strM3332);
                return c0176b.D(n);
            }
            c0176b.t((H) n);
        }
        return true;
    }
}