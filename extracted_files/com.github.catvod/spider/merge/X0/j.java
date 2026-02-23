package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/* loaded from: classes.dex */
public final class j extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f673short = {2890, 2891, 2896, 2820, 2903, 2897, 2900, 2900, 2891, 2902, 2896, 2820, 2882, 2897, 2890, 2887, 2896, 2893, 2891, 2890, 2846, 2820};

    public j(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۟ۢ۠ۨ۠, reason: not valid java name and contains not printable characters */
    public static short[] m6060() {
        if (C0052.m8320() > 0) {
            return f673short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        LinkedList linkedList = new LinkedList();
        com.github.catvod.spider.merge.Y0.b bVar = (com.github.catvod.spider.merge.Y0.b) C0043.m7344((k) C0013.m3164(this, k.class), cVar);
        Iterator itM3109 = C0013.m3109(C0042.m7111(this, h.class));
        while (C0012.m2962(itM3109)) {
            h hVar = (h) C0048.m7949(itM3109);
            Stack stackM1317 = C0002.m1317(cVar);
            com.github.catvod.spider.merge.Y0.a aVarM8764 = C0055.m8764(cVar);
            com.github.catvod.spider.merge.Y0.a aVar = new com.github.catvod.spider.merge.Y0.a(C0000.m1092(aVarM8764));
            aVar.c = aVarM8764;
            C0005.m1657(stackM1317, aVar);
            C0031.m5644(linkedList, C0031.m5596(hVar, cVar));
            C0047.m7745(stackM1317);
        }
        String strM7744 = C0047.m7744(bVar);
        C0022.m4478(C0065.m9715(C0028.m5192(), strM7744));
        throw new com.github.catvod.spider.merge.Q0.a(C0026.m4915(C0043.m7290(m6060(), 0, 22, 2852), strM7744));
    }
}