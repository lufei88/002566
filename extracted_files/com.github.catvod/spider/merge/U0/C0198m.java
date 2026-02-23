package com.github.catvod.spider.merge.U0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.d1.C0050;

/* renamed from: com.github.catvod.spider.merge.U0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum C0198m extends B {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f598short = {1399, 1360, 1367, 1354, 1367, 1375, 1362, 708, 705, 726, 743, 717, 711, 767, 721, 717};

    public C0198m() {
        super(C0050.m8131(f598short, 0, 7, 1342), 0);
    }

    @Override // com.github.catvod.spider.merge.U0.B
    public final boolean c(N n, C0176b c0176b) {
        if (B.a(n)) {
            return true;
        }
        if (n.a()) {
            c0176b.t((H) n);
        } else {
            boolean zB = n.b();
            C0209s c0209s = B.b;
            if (!zB) {
                c0176b.l = c0209s;
                return c0176b.D(n);
            }
            I i = (I) n;
            D d = c0176b.h;
            String string = i.b.toString();
            d.getClass();
            String strTrim = string.trim();
            if (!d.a) {
                strTrim = com.github.catvod.spider.merge.Z0.h.a(strTrim);
            }
            com.github.catvod.spider.merge.T0.i iVar = new com.github.catvod.spider.merge.T0.i(strTrim, i.d.toString(), i.e.toString());
            String str = i.c;
            if (str != null) {
                iVar.x(C0023.m4536(f598short, 7, 9, 692), str);
            }
            c0176b.d.x(iVar);
            if (i.f) {
                c0176b.d.l = 2;
            }
            c0176b.l = c0209s;
        }
        return true;
    }
}