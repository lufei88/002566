package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class y extends com.github.catvod.spider.merge.E0.p {
    public com.github.catvod.spider.merge.E0.d e;

    public y(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        com.github.catvod.spider.merge.Y0.b bVar = (com.github.catvod.spider.merge.Y0.b) C0031.m5641((z) C0013.m3164(this, z.class), cVar);
        return C0000.m1107(this) == null ? bVar : new com.github.catvod.spider.merge.Y0.b(C0013.m3079(-C0032.m5676(C0038.m6470(bVar))));
    }
}