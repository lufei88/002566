package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes.dex */
public final class u extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f680short = {1719};

    public u(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۢۡۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6067() {
        if (C0039.m6529() <= 0) {
            return f680short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        List listM7111 = C0042.m7111(this, n.class);
        if (listM7111 == null) {
            return null;
        }
        if (C0064.m9636(listM7111) <= 1) {
            return (com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, (com.github.catvod.spider.merge.I0.b) C0048.m7915(listM7111, 0));
        }
        LinkedList linkedList = new LinkedList();
        Iterator itM3109 = C0013.m3109(listM7111);
        while (C0012.m2962(itM3109)) {
            com.github.catvod.spider.merge.Y0.b bVar = (com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, (n) C0048.m7949(itM3109));
            if (bVar != null) {
                C0031.m5644(linkedList, C0047.m7744(bVar));
            }
        }
        return new com.github.catvod.spider.merge.Y0.b(C0032.m5761(linkedList, C0055.m8814(m6067(), 0, 1, 1677)));
    }
}