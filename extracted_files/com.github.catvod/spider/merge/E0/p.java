package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class p implements com.github.catvod.spider.merge.I0.b {
    public final p a;
    public final int b;
    public ArrayList c;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f402short = {3269, 2421, 634};
    public static final p d = new p();

    public p() {
        this.b = -1;
    }

    public p(int i, p pVar) {
        this.a = pVar;
        this.b = i;
    }

    /* renamed from: ۟ۦۨۧۢ, reason: not valid java name and contains not printable characters */
    public static short[] m3787() {
        if (C0049.m8038() < 0) {
            return f402short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.I0.b
    public Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        return C0016.m3595(cVar, this);
    }

    public final void b(com.github.catvod.spider.merge.I0.b bVar) {
        if (C0026.m4914(this) == null) {
            this.c = new ArrayList();
        }
        C0004.m1532(C0026.m4914(this), bVar);
    }

    public final com.github.catvod.spider.merge.I0.b c(int i) {
        ArrayList arrayListM4914 = C0026.m4914(this);
        if (arrayListM4914 == null || i < 0 || i >= C0009.m2139(arrayListM4914)) {
            return null;
        }
        return (com.github.catvod.spider.merge.I0.b) C0028.m5167(C0026.m4914(this), i);
    }

    public final int d() {
        ArrayList arrayListM4914 = C0026.m4914(this);
        if (arrayListM4914 != null) {
            return C0009.m2139(arrayListM4914);
        }
        return 0;
    }

    public final p e(Class cls) {
        ArrayList arrayListM4914 = C0026.m4914(this);
        com.github.catvod.spider.merge.I0.b bVar = null;
        if (arrayListM4914 != null && C0009.m2139(arrayListM4914) > 0) {
            Iterator itM7816 = C0047.m7816(C0026.m4914(this));
            while (true) {
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                com.github.catvod.spider.merge.I0.b bVar2 = (com.github.catvod.spider.merge.I0.b) C0048.m7949(itM7816);
                if (C0012.m2993(cls, bVar2)) {
                    bVar = (com.github.catvod.spider.merge.I0.b) C0063.m9548(cls, bVar2);
                    break;
                }
            }
        }
        return (p) bVar;
    }

    public final List f(Class cls) {
        ArrayList arrayListM4914 = C0026.m4914(this);
        if (arrayListM4914 == null) {
            return C0008.m1961();
        }
        Iterator itM7816 = C0047.m7816(arrayListM4914);
        ArrayList arrayList = null;
        while (C0012.m2962(itM7816)) {
            com.github.catvod.spider.merge.I0.b bVar = (com.github.catvod.spider.merge.I0.b) C0048.m7949(itM7816);
            if (C0012.m2993(cls, bVar)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                C0063.m9550(arrayList, C0063.m9548(cls, bVar));
            }
        }
        return arrayList == null ? C0008.m1961() : arrayList;
    }

    public final com.github.catvod.spider.merge.I0.c g(int i) {
        ArrayList arrayListM4914 = C0026.m4914(this);
        if (arrayListM4914 != null && C0009.m2139(arrayListM4914) > 0) {
            Iterator itM7816 = C0047.m7816(C0026.m4914(this));
            while (C0012.m2962(itM7816)) {
                com.github.catvod.spider.merge.I0.b bVar = (com.github.catvod.spider.merge.I0.b) C0048.m7949(itM7816);
                if (bVar instanceof com.github.catvod.spider.merge.I0.c) {
                    com.github.catvod.spider.merge.I0.c cVar = (com.github.catvod.spider.merge.I0.c) bVar;
                    if (C0022.m4461(C0050.m8126(cVar)) == i) {
                        return cVar;
                    }
                }
            }
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.I0.b
    public final String getText() {
        if (C0039.m6500(this) == 0) {
            return C0007.m1840();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < C0039.m6500(this); i++) {
            C0018.m3933(sb, C0030.m5428(C0034.m5972(this, i)));
        }
        return C0047.m7763(sb);
    }

    public final boolean h() {
        return C0049.m8010(this) == -1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0007.m1842(m3787(), 0, 1, 3230));
        p pVarM8880 = this;
        while (pVarM8880 != null) {
            if (!C0050.m8105(pVarM8880)) {
                C0036.m6177(sb, C0049.m8010(pVarM8880));
            }
            pVarM8880 = C0056.m8880(pVarM8880);
            if (pVarM8880 != null && !C0050.m8105(pVarM8880)) {
                C0018.m3933(sb, C0061.m9361(m3787(), 1, 1, 2389));
            }
        }
        C0018.m3933(sb, C0062.m9389(m3787(), 2, 1, 551));
        return C0047.m7763(sb);
    }
}