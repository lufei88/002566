package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f668short = {1999, 1999};

    public b(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۤۦ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6055() {
        if (C0004.m1557() <= 0) {
            return f668short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        if (!C0007.m1815(C0027.m5062(m6055(), 0, 2, 2017), C0014.m3331(this))) {
            return new com.github.catvod.spider.merge.Y0.b(C0000.m1092(C0055.m8764(cVar)));
        }
        HashSet hashSet = new HashSet();
        com.github.catvod.spider.merge.V0.d dVar = new com.github.catvod.spider.merge.V0.d();
        Iterator itM7807 = C0047.m7807(C0000.m1092(C0055.m8764(cVar)));
        while (C0012.m2962(itM7807)) {
            C0051.m8266(hashSet, (com.github.catvod.spider.merge.T0.m) C0044.m7395((com.github.catvod.spider.merge.T0.m) C0048.m7949(itM7807)));
        }
        C0002.m1243(dVar, hashSet);
        return new com.github.catvod.spider.merge.Y0.b(dVar);
    }
}