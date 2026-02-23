package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class o extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f675short = {832};

    public o(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۟ۦۥۣۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6062() {
        if (C0029.m5282() > 0) {
            return f675short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        Object objM5133;
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        String strM3331 = C0014.m3331(this);
        String strM8477 = C0053.m8477(m6062(), 0, 1, 874);
        if (C0007.m1815(strM8477, strM3331)) {
            com.github.catvod.spider.merge.Y0.b bVar = new com.github.catvod.spider.merge.Y0.b(strM8477);
            C0009.m2107(bVar);
            return bVar;
        }
        if (((u) C0013.m3164(this, u.class)) != null && !C0050.m8105((u) C0013.m3164(this, u.class))) {
            objM5133 = C0033.m5859((u) C0013.m3164(this, u.class), cVar);
        } else {
            if (((n) C0013.m3164(this, n.class)) == null || C0050.m8105((n) C0013.m3164(this, n.class))) {
                return null;
            }
            objM5133 = C0028.m5133((n) C0013.m3164(this, n.class), cVar);
        }
        return (com.github.catvod.spider.merge.Y0.b) objM5133;
    }
}