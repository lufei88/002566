package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.F0.AbstractC0151h;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o extends s {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f401short = {3272, 3273, 3264, 3273, 3275, 3277, 3288, 3273, 3295};
    public h d = new h();
    public final f e;
    public final com.github.catvod.spider.merge.H0.d f;
    public p g;
    public final boolean h;
    public final ArrayList i;
    public boolean j;

    static {
        new WeakHashMap();
    }

    public o(f fVar) {
        com.github.catvod.spider.merge.H0.d dVar = new com.github.catvod.spider.merge.H0.d();
        this.f = dVar;
        C0050.m8083(dVar, 0);
        this.h = true;
        this.e = null;
        C0045.m7588(C0040.m6686(this));
        this.g = null;
        this.j = false;
        ArrayList arrayListM7689 = C0046.m7689(this);
        if (arrayListM7689 != null && C0040.m6616(arrayListM7689, null) && C0007.m1817(C0046.m7689(this))) {
            this.i = null;
        }
        C0015.m3485(C0009.m2085(dVar), 0, C0063.m9566(dVar), 0);
        dVar.b = 0;
        C0050.m8083(dVar, 0);
        AbstractC0151h abstractC0151hM6519 = C0039.m6519(this);
        if (abstractC0151hM6519 != null) {
            C0016.m3568(abstractC0151hM6519);
        }
        this.e = fVar;
    }

    /* renamed from: ۥ۟ۦۣ, reason: contains not printable characters */
    public static short[] m3786() {
        if (C0018.m3956() > 0) {
            return f401short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.s
    public final boolean b(int i) {
        com.github.catvod.spider.merge.H0.d dVarM2140 = C0009.m2140(this);
        int iM9566 = C0063.m9566(dVarM2140);
        int i2 = iM9566 - 1;
        if (i2 < 0 || i2 >= iM9566) {
            throw new IndexOutOfBoundsException();
        }
        return i >= C0009.m2085(dVarM2140)[i2];
    }

    public final void c() {
        d dVarM6657 = C0040.m6657(this);
        if (C0022.m4461(dVarM6657) != -1) {
            C0003.m1364(C0021.m4328(this));
        }
        ArrayList arrayListM7689 = C0046.m7689(this);
        boolean z = (arrayListM7689 == null || C0007.m1817(arrayListM7689)) ? false : true;
        if (C0011.m2777(this) || z) {
            if (C0064.m9671(C0040.m6686(this))) {
                p pVarM3162 = C0013.m3162(this);
                com.github.catvod.spider.merge.I0.a aVar = new com.github.catvod.spider.merge.I0.a(dVarM6657);
                C0047.m7777(pVarM3162);
                C0045.m7647(pVarM3162, aVar);
                ArrayList arrayListM76892 = C0046.m7689(this);
                if (arrayListM76892 != null) {
                    Iterator itM7816 = C0047.m7816(arrayListM76892);
                    while (C0012.m2962(itM7816)) {
                        C0047.m7777((n) C0048.m7949(itM7816));
                    }
                    return;
                }
                return;
            }
            p pVarM31622 = C0013.m3162(this);
            com.github.catvod.spider.merge.I0.c cVar = new com.github.catvod.spider.merge.I0.c(dVarM6657);
            C0047.m7777(pVarM31622);
            C0045.m7647(pVarM31622, cVar);
            ArrayList arrayListM76893 = C0046.m7689(this);
            if (arrayListM76893 != null) {
                Iterator itM78162 = C0047.m7816(arrayListM76893);
                if (C0012.m2962(itM78162)) {
                    C0047.m7777((n) C0048.m7949(itM78162));
                    d dVarM8126 = C0050.m8126(cVar);
                    if (dVarM8126 != null) {
                        C0037.m6312(dVarM8126);
                    }
                    throw null;
                }
            }
        }
    }

    public final void d(p pVar) {
        p pVarM3162;
        p pVarM8880;
        if (C0011.m2777(this) && (pVarM3162 = C0013.m3162(this)) != pVar && (pVarM8880 = C0056.m8880(pVarM3162)) != null) {
            ArrayList arrayListM4914 = C0026.m4914(pVarM8880);
            if (arrayListM4914 != null) {
                C0045.m7536(arrayListM4914, C0009.m2139(arrayListM4914) - 1);
            }
            C0045.m7647(pVarM8880, pVar);
        }
        this.g = pVar;
    }

    public final void e(int i, p pVar) {
        p pVarM3162;
        p pVarM8880;
        this.c = i;
        this.g = pVar;
        C0014.m3361(C0021.m4328(this), 1);
        if (C0011.m2777(this) && (pVarM8880 = C0056.m8880((pVarM3162 = C0013.m3162(this)))) != null) {
            C0045.m7647(pVarM8880, pVarM3162);
        }
        ArrayList arrayListM7689 = C0046.m7689(this);
        if (arrayListM7689 != null) {
            Iterator itM7816 = C0047.m7816(arrayListM7689);
            if (C0012.m2962(itM7816)) {
                throw null;
            }
        }
    }

    public final void f() {
        p pVarM3162;
        int iM2139;
        if (C0007.m1848(this)) {
            pVarM3162 = C0013.m3162(this);
            C0014.m3361(C0021.m4328(this), 1);
        } else {
            pVarM3162 = C0013.m3162(this);
            C0014.m3361(C0021.m4328(this), -1);
        }
        C0047.m7777(pVarM3162);
        ArrayList arrayListM7689 = C0046.m7689(this);
        if (arrayListM7689 != null && (iM2139 = C0009.m2139(arrayListM7689) - 1) >= 0) {
            C0047.m7777(C0013.m3162(this));
            throw null;
        }
        p pVarM31622 = C0013.m3162(this);
        this.c = C0049.m8010(pVarM31622);
        this.g = C0056.m8880(pVarM31622);
    }

    public final d g() {
        return C0014.m3361(C0021.m4328(this), 1);
    }

    public final com.github.catvod.spider.merge.H0.f h() {
        return C0055.m8808(C0012.m2989(), C0007.m1861(this), C0013.m3162(this));
    }

    public final d i(int i) {
        d dVarM6657 = C0040.m6657(this);
        if (C0022.m4461(dVarM6657) == i) {
            if (i == -1) {
                this.j = true;
            }
            C0045.m7588(C0040.m6686(this));
            C0022.m4484(this);
        } else {
            dVarM6657 = C0039.m6575(C0040.m6686(this), this);
            if (C0011.m2777(this) && C0031.m5657(dVarM6657) == -1) {
                p pVarM3162 = C0013.m3162(this);
                com.github.catvod.spider.merge.I0.a aVar = new com.github.catvod.spider.merge.I0.a(dVarM6657);
                C0047.m7777(pVarM3162);
                C0045.m7647(pVarM3162, aVar);
            }
        }
        return dVarM6657;
    }

    public final void j(d dVar, String str, q qVar) {
        int iM3286 = C0014.m3286(dVar);
        int iM5666 = C0031.m5666(dVar);
        r rVarM8279 = C0051.m8279(this);
        if (rVarM8279 == null) {
            throw new NullPointerException(C0044.m7509(m3786(), 0, 9, 3244));
        }
        Iterator itM1943 = C0008.m1943(rVarM8279);
        while (C0012.m2962(itM1943)) {
            C0055.m8800((g) C0048.m7949(itM1943), this, dVar, iM3286, iM5666, str, qVar);
        }
    }
}