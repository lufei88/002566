package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.S.C0005;

/* renamed from: com.github.catvod.spider.merge.U0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0215v extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f616short = {3107, 3076, 3106, 3087, 3083, 3086, 3108, 3077, 3097, 3081, 3096, 3075, 3098, 3102, 1881, 1861, 1884, 1885, 2579, 2578, 2574, 2590, 2575, 2580, 2573, 2569, 2900, 2884};

    public C0215v() {
        super(C0005.m1645(f616short, 0, 14, 3178), 4);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (n.b()) {
            c0176b.h(this);
        } else {
            if (n.e() && ((L) n).c.equals(C0047.m7833(f616short, 14, 4, 1841))) {
                C0219x c0219x = B.g;
                c0176b.g = n;
                return c0219x.c(n, c0176b);
            }
            boolean zD = n.d();
            C0213u c0213u = B.d;
            if (!zD || !((K) n).c.equals(C0060.m9352(f616short, 18, 8, 2685))) {
                if (B.a(n) || n.a() || (n.e() && com.github.catvod.spider.merge.S0.b.c(((L) n).c, A.f))) {
                    c0176b.g = n;
                    return c0213u.c(n, c0176b);
                }
                if (n.d() && ((K) n).c.equals(C0050.m8131(f616short, 26, 2, 2870))) {
                    c0176b.h(this);
                    G g = new G();
                    g.b = n.toString();
                    c0176b.s(g);
                    return true;
                }
                if ((n.e() && com.github.catvod.spider.merge.S0.b.c(((L) n).c, A.I)) || n.d()) {
                    c0176b.h(this);
                    return false;
                }
                c0176b.h(this);
                G g2 = new G();
                g2.b = n.toString();
                c0176b.s(g2);
                return true;
            }
            c0176b.A();
            c0176b.l = c0213u;
        }
        return true;
    }
}