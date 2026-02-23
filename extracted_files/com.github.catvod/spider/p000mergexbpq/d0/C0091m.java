package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.c0.i;

/* renamed from: com.github.catvod.spider.merge-xbpq.d0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
enum C0091m extends A {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f276short = {1339, 1308, 1307, 1286, 1307, 1299, 1310};

    C0091m() {
        super(C0057.m8978(f276short, 0, 7, 1394), 0, null);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.A
    final boolean d(O o, C0069b c0069b) {
        r rVar = A.d;
        if (A.a(o)) {
            return true;
        }
        if (o.b()) {
            c0069b.F((I) o);
        } else {
            if (!o.c()) {
                c0069b.j0(rVar);
                return c0069b.c(o);
            }
            J j = (J) o;
            i iVar = new i(c0069b.h.c(j.b.toString()), j.d.toString(), j.e.toString());
            iVar.L(j.c);
            c0069b.d.L(iVar);
            if (j.f) {
                c0069b.d.v0();
            }
            c0069b.j0(rVar);
        }
        return true;
    }
}