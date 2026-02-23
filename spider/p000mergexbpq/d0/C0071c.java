package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.b0.b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0071c extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f249short = {2159, 2120, 2162, 2119, 2116, 2122, 2115, 2162, 2115, 2142, 2130};

    C0071c() {
        super(C0057.m8978(f249short, 0, 11, 2086), 9, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        A a = A.i;
        if (o.a == 5) {
            H h = (H) o;
            if (h.j().equals(A.z)) {
                c0069b.n(this);
                return false;
            }
            ((ArrayList) c0069b.v()).add(h.j());
            return true;
        }
        if (((ArrayList) c0069b.v()).size() > 0) {
            Iterator it = ((ArrayList) c0069b.v()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (b.c(str)) {
                    H h2 = new H();
                    h2.i(str);
                    c0069b.E(h2);
                } else {
                    c0069b.n(this);
                    if (b.b(c0069b.a().d0(), C0116z.C)) {
                        c0069b.g0(true);
                        H h3 = new H();
                        h3.i(str);
                        c0069b.X(h3, a);
                        c0069b.g0(false);
                    } else {
                        H h4 = new H();
                        h4.i(str);
                        c0069b.X(h4, a);
                    }
                }
            }
            c0069b.R();
        }
        c0069b.j0(c0069b.T());
        return c0069b.c(o);
    }
}