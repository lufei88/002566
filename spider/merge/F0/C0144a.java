package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* renamed from: com.github.catvod.spider.merge.F0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0144a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f424short = {298, 269, 277, 258, 271, 266, 263, 323, 272, 279, 258, 279, 262, 323, 269, 278, 270, 257, 262, 273, 333};
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public V[] c;
    public W[] d;
    public final int e;
    public final int f;
    public int[] g;
    public InterfaceC0167y[] h;
    public final ArrayList i;

    public C0144a(int i, int i2) {
        new LinkedHashMap();
        this.i = new ArrayList();
        this.e = i;
        this.f = i2;
    }

    /* renamed from: ۢۦۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m3861() {
        if (C0052.m8320() >= 0) {
            return f424short;
        }
        return null;
    }

    public final r a(int i) {
        ArrayList arrayListM8026 = C0049.m8026(this);
        if (C0007.m1817(arrayListM8026)) {
            return null;
        }
        return (r) C0028.m5167(arrayListM8026, i);
    }

    public final com.github.catvod.spider.merge.H0.f b(int i, com.github.catvod.spider.merge.E0.p pVar) {
        if (i >= 0) {
            ArrayList arrayListM6516 = C0039.m6516(this);
            if (i < C0009.m2139(arrayListM6516)) {
                com.github.catvod.spider.merge.H0.f fVarM3584 = C0016.m3584(this, (AbstractC0152i) C0028.m5167(arrayListM6516, i));
                if (!C0029.m5281(fVarM3584, -2)) {
                    return fVarM3584;
                }
                com.github.catvod.spider.merge.H0.f fVar = new com.github.catvod.spider.merge.H0.f(new int[0]);
                C0032.m5775(fVar, fVarM3584);
                C0054.m8588(fVar);
                for (com.github.catvod.spider.merge.E0.p pVarM8880 = pVar; pVarM8880 != null; pVarM8880 = C0056.m8880(pVarM8880)) {
                    int iM8010 = C0049.m8010(pVarM8880);
                    if (iM8010 < 0 || !C0029.m5281(fVarM3584, -2)) {
                        break;
                    }
                    fVarM3584 = C0016.m3584(this, C0036.m6203((X) C0019.m4126((AbstractC0152i) C0028.m5167(arrayListM6516, iM8010), 0)));
                    C0032.m5775(fVar, fVarM3584);
                    C0054.m8588(fVar);
                }
                if (C0029.m5281(fVarM3584, -2)) {
                    C0065.m9745(fVar, -1);
                }
                return fVar;
            }
        }
        throw new IllegalArgumentException(C0057.m8978(m3861(), 0, 21, 355));
    }

    public final com.github.catvod.spider.merge.H0.f c(AbstractC0152i abstractC0152i) {
        com.github.catvod.spider.merge.H0.f fVarM7900 = C0048.m7900(abstractC0152i);
        if (fVarM7900 != null) {
            return fVarM7900;
        }
        com.github.catvod.spider.merge.H0.f fVarM9576 = C0063.m9576(this, abstractC0152i, null);
        abstractC0152i.f = fVarM9576;
        fVarM9576.b = true;
        return fVarM9576;
    }

    public final com.github.catvod.spider.merge.H0.f d(AbstractC0152i abstractC0152i, com.github.catvod.spider.merge.E0.p pVar) {
        C0163u c0163u = new C0163u(this);
        com.github.catvod.spider.merge.H0.f fVar = new com.github.catvod.spider.merge.H0.f(new int[0]);
        C0038.m6421(c0163u, abstractC0152i, pVar != null ? C0023.m4609(C0027.m5018(abstractC0152i), pVar) : null, fVar, new HashSet(), new BitSet());
        return fVar;
    }
}