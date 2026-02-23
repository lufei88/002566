package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class w extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f682short = {805, 805};

    public w(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۣ۟ۤۤۤ, reason: not valid java name and contains not printable characters */
    public static short[] m6069() {
        if (C0024.m4693() < 0) {
            return f682short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        com.github.catvod.spider.merge.Y0.b bVar = null;
        for (int i = 0; i < C0039.m6500(this); i++) {
            com.github.catvod.spider.merge.I0.b bVarM5972 = C0034.m5972(this, i);
            if (bVarM5972 instanceof x) {
                bVar = (com.github.catvod.spider.merge.Y0.b) C0028.m5177(cVar, bVarM5972);
                Object objM6834 = C0041.m6834(bVar);
                if (objM6834 instanceof com.github.catvod.spider.merge.V0.d) {
                    C0031.m5619(cVar, (com.github.catvod.spider.merge.V0.d) objM6834);
                }
            } else if (C0007.m1815(C0014.m3332(m6069(), 0, 2, 778), C0030.m5428(bVarM5972))) {
                C0055.m8764(cVar).b = true;
            } else {
                C0055.m8764(cVar).b = false;
            }
        }
        return bVar;
    }
}