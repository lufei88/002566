package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Stack;

/* loaded from: classes.dex */
public final class c extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f669short = {1656, 1656};
    public com.github.catvod.spider.merge.E0.d e;

    public c(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۨۧۨۥ, reason: not valid java name and contains not printable characters */
    public static short[] m6056() {
        if (C0034.m6048() < 0) {
            return f669short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        Stack stackM1317 = C0002.m1317(cVar);
        com.github.catvod.spider.merge.Y0.a aVar = new com.github.catvod.spider.merge.Y0.a(C0000.m1092(C0026.m4912(cVar)));
        aVar.c = C0055.m8764(cVar);
        C0005.m1657(stackM1317, aVar);
        String strM4730 = C0024.m4730(C0040.m6666(this));
        String strM9775 = C0065.m9775(m6056(), 0, 2, 1623);
        if (strM4730 == strM9775 || (strM4730 != null && C0058.m9103(strM4730, strM9775))) {
            C0055.m8764(cVar).b = true;
        }
        com.github.catvod.spider.merge.Y0.b bVar = (com.github.catvod.spider.merge.Y0.b) C0063.m9582((w) C0013.m3164(this, w.class), cVar);
        C0047.m7745(stackM1317);
        return bVar;
    }
}