package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* renamed from: com.github.catvod.spider.merge.U0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0184f extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f582short = {1551, 1576, 1554, 1575, 1572, 1578, 1571, 1540, 1577, 1570, 1599, 2589, 2575, 2566, 2566, 2589, 1769, 1791, 1778, 1785, 1764, 2384, 2369, 2377, 2388, 2376, 2373, 2384, 2369, 2025, 2037, 2040, 2044, 2041, 1351, 1362, 1361, 1375, 1366, 1746, 1748, 2402, 2420, 2425, 2418, 2415, 1586, 1568, 1577, 1577, 1586, 3286, 3274, 3271, 3267, 3270, 2135, 2118, 2126, 2131, 2127, 2114, 2135, 2118};

    public C0184f() {
        super(C0061.m9361(f582short, 0, 11, 1606), 12);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        int iB = com.github.catvod.spider.merge.l0.f.b(n.a);
        C0223z c0223z = B.i;
        String strM9775 = C0065.m9775(f582short, 11, 5, 2665);
        String strM3484 = C0015.m3484(f582short, 16, 5, 1693);
        String strM9585 = C0063.m9585(f582short, 21, 8, 2340);
        String strM4199 = C0020.m4199(f582short, 29, 5, 1949);
        if (iB == 1) {
            L l = (L) n;
            String str = l.c;
            String strM3646 = C0017.m3646(f582short, 39, 2, 1702);
            if (!str.equals(strM3646)) {
                if (com.github.catvod.spider.merge.S0.b.c(str, A.v)) {
                    c0176b.h(this);
                    c0176b.G(strM3646);
                    return c0176b.D(l);
                }
                if (com.github.catvod.spider.merge.S0.b.c(str, A.B)) {
                    return d(n, c0176b);
                }
                c0176b.g = n;
                return c0223z.c(n, c0176b);
            }
            c0176b.d(strM3484, strM9775, strM4199, strM9585);
            c0176b.r(l);
            c0176b.l = B.n;
        } else {
            if (iB != 2) {
                c0176b.g = n;
                return c0223z.c(n, c0176b);
            }
            String str2 = ((K) n).c;
            if (!com.github.catvod.spider.merge.S0.b.c(str2, A.H)) {
                if (str2.equals(C0012.m2973(f582short, 34, 5, 1331))) {
                    return d(n, c0176b);
                }
                if (com.github.catvod.spider.merge.S0.b.c(str2, A.C)) {
                    c0176b.h(this);
                    return false;
                }
                c0176b.g = n;
                return c0223z.c(n, c0176b);
            }
            if (!c0176b.q(str2)) {
                c0176b.h(this);
                return false;
            }
            c0176b.d(strM3484, strM9775, strM4199, strM9585);
            c0176b.A();
            c0176b.l = c0223z;
        }
        return true;
    }

    public final boolean d(N n, C0176b c0176b) {
        String strM5708 = C0032.m5708(f582short, 41, 5, 2326);
        boolean zQ = c0176b.q(strM5708);
        String strM9106 = C0058.m9106(f582short, 46, 5, 1606);
        String strM1189 = C0001.m1189(f582short, 51, 5, 3234);
        if (!zQ && !c0176b.q(strM1189) && !c0176b.n(strM9106)) {
            c0176b.h(this);
            return false;
        }
        c0176b.d(strM5708, strM9106, strM1189, C0030.m5362(f582short, 56, 8, 2083));
        c0176b.F(c0176b.f().d.b);
        return c0176b.D(n);
    }
}