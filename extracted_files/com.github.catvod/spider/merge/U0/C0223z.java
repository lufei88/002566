package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.util.ArrayList;

/* renamed from: com.github.catvod.spider.merge.U0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0223z extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f624short = {2242, 2277, 2271, 2282, 2281, 2279, 2286, 849, 832, 840, 853, 841, 836, 849, 832, 2611, 2598, 2597, 2603, 2594, 498, 496, 481, 485, 504, 510, 511, 417, 429, 430, 421, 432, 429, 439, 434, 548, 552, 555, 2691, 2709, 2712, 2707, 2702, 2712, 2719, 2689, 2692, 2693, 1943, 1946, 1939, 1926, 2291, 2290, 2303, 2303, 2302, 2293, 2061, 2052, 2073, 2054, 2998, 2986, 2995, 2994};

    public C0223z() {
        super(C0022.m4403(f624short, 0, 7, 2187), 8);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        B b;
        if (n.a == 5 && com.github.catvod.spider.merge.S0.b.c(c0176b.f().d.b, A.A)) {
            c0176b.s = new ArrayList();
            c0176b.m = c0176b.l;
            c0176b.l = B.j;
            return c0176b.D(n);
        }
        if (n.a()) {
            c0176b.t((H) n);
            return true;
        }
        if (n.b()) {
            c0176b.h(this);
            return false;
        }
        boolean zE = n.e();
        B b2 = B.d;
        String strM1305 = C0002.m1305(f624short, 7, 8, 805);
        String strM3917 = C0018.m3917(f624short, 15, 5, 2631);
        if (!zE) {
            if (!n.d()) {
                if (!n.c()) {
                    d(n, c0176b);
                    return true;
                }
                if (c0176b.g(C0053.m8477(f624short, 62, 4, 3038))) {
                    c0176b.h(this);
                }
                return true;
            }
            String str = ((K) n).c;
            if (str.equals(strM3917)) {
                if (!c0176b.q(str)) {
                    c0176b.h(this);
                    return false;
                }
                c0176b.B(strM3917);
                c0176b.M();
            } else {
                if (com.github.catvod.spider.merge.S0.b.c(str, A.z)) {
                    c0176b.h(this);
                    return false;
                }
                if (!str.equals(strM1305)) {
                    d(n, c0176b);
                    return true;
                }
                c0176b.E(n, b2);
            }
            return true;
        }
        L l = (L) n;
        String str2 = l.c;
        if (str2.equals(C0002.m1305(f624short, 20, 7, 401))) {
            c0176b.e();
            c0176b.q.add(null);
            c0176b.r(l);
            b = B.k;
        } else {
            String strM6551 = C0039.m6551(f624short, 27, 8, 450);
            if (!str2.equals(strM6551)) {
                if (str2.equals(C0020.m4199(f624short, 35, 3, 583))) {
                    c0176b.e();
                    c0176b.G(strM6551);
                } else if (com.github.catvod.spider.merge.S0.b.c(str2, A.s)) {
                    c0176b.e();
                    c0176b.r(l);
                    b = B.m;
                } else {
                    if (!com.github.catvod.spider.merge.S0.b.c(str2, A.t)) {
                        if (str2.equals(strM3917)) {
                            c0176b.h(this);
                            if (!c0176b.q(str2)) {
                                return false;
                            }
                            c0176b.B(str2);
                            if (c0176b.M()) {
                                return c0176b.D(n);
                            }
                            c0176b.r(l);
                            return true;
                        }
                        if (com.github.catvod.spider.merge.S0.b.c(str2, A.u)) {
                            c0176b.g = n;
                            return b2.c(n, c0176b);
                        }
                        if (str2.equals(C0004.m1549(f624short, 43, 5, 2801))) {
                            if (!l.l() || !l.l.d(C0047.m7833(f624short, 48, 4, 2019)).equalsIgnoreCase(C0011.m2805(f624short, 52, 6, 2203))) {
                                d(n, c0176b);
                                return true;
                            }
                            c0176b.u(l);
                        } else {
                            if (!str2.equals(C0003.m1398(f624short, 58, 4, 2155))) {
                                d(n, c0176b);
                                return true;
                            }
                            c0176b.h(this);
                            if (c0176b.p != null || c0176b.y(strM1305)) {
                                return false;
                            }
                            c0176b.v(l, false, false);
                        }
                        return true;
                    }
                    c0176b.e();
                    c0176b.G(C0060.m9352(f624short, 38, 5, 2807));
                }
                return c0176b.D(n);
            }
            c0176b.e();
            c0176b.r(l);
            b = B.l;
        }
        c0176b.l = b;
        return true;
    }

    public final void d(N n, C0176b c0176b) {
        c0176b.h(this);
        c0176b.v = true;
        c0176b.E(n, B.g);
        c0176b.v = false;
    }
}