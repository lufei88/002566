package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.U0.E;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class m extends r {
    public static final String i;
    public final E d;
    public WeakReference e;
    public List f;
    public c g;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f508short = {2360, 2327, 2383, 1183, 2978, 2977, 2995, 2981, 2965, 2994, 2985, 1668, 2871, 2855, 709, 1043, 1027, 799, 2536, 2535, 2550, 1889, 1906};
    public static final List h = C0008.m1961();

    static {
        C0005.m1602(C0054.m8574(m5324(), 0, 3, 2404));
        i = C0050.m8125(C0049.m8007(m5324(), 3, 1, 1200), C0043.m7290(m5324(), 4, 7, 3008));
    }

    public m() {
        this(C0058.m9111(C0022.m4403(m5324(), 11, 1, 1746), C0039.m6544()), C0007.m1840(), null);
    }

    public m(E e, String str, c cVar) {
        C0065.m9779(e);
        this.f = C0020.m4227();
        this.g = cVar;
        this.d = e;
        if (str != null) {
            C0003.m1419(this, str);
        }
    }

    public static int I(m mVar, List list) {
        int iM9636 = C0064.m9636(list);
        for (int i2 = 0; i2 < iM9636; i2++) {
            if (C0048.m7915(list, i2) == mVar) {
                return i2;
            }
        }
        return 0;
    }

    public static boolean K(r rVar) {
        if (rVar instanceof m) {
            m mVar = (m) rVar;
            int i2 = 0;
            while (!C0017.m3683(C0039.m6507(mVar))) {
                mVar = (m) C0044.m7395(mVar);
                i2++;
                if (i2 >= 6 || mVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    public static void y(r rVar, StringBuilder sb) {
        if (rVar instanceof t) {
            C0018.m3933(sb, C0032.m5729((t) rVar));
        } else if ((rVar instanceof m) && C0007.m1815(C0025.m4804(C0039.m6507((m) rVar)), C0041.m6779(m5324(), 12, 2, 2901))) {
            C0018.m3933(sb, C0000.m1077(m5324(), 14, 1, 719));
        }
    }

    /* renamed from: ۤۢۦۦ, reason: not valid java name and contains not printable characters */
    public static short[] m5324() {
        if (C0013.m3167() > 0) {
            return f508short;
        }
        return null;
    }

    public final com.github.catvod.spider.merge.V0.d A() {
        return new com.github.catvod.spider.merge.V0.d(C0027.m5031(this));
    }

    public m B() {
        return (m) super.g();
    }

    public final String C() {
        String strM5729;
        StringBuilder sbM8572 = C0054.m8572();
        Iterator itM3109 = C0013.m3109(C0058.m9057(this));
        while (C0012.m2962(itM3109)) {
            r rVar = (r) C0048.m7949(itM3109);
            if (rVar instanceof f) {
                strM5729 = C0032.m5729((f) rVar);
            } else if (rVar instanceof e) {
                strM5729 = C0032.m5729((e) rVar);
            } else if (rVar instanceof m) {
                strM5729 = C0062.m9381((m) rVar);
            } else if (rVar instanceof d) {
                strM5729 = C0032.m5729((d) rVar);
            }
            C0018.m3933(sbM8572, strM5729);
        }
        return C0004.m1543(sbM8572);
    }

    public final void D(String str) {
        C0051.m8185(C0039.m6535(this), C0059.m9182(), str);
    }

    public final int E() {
        r rVarM7395 = C0044.m7395(this);
        if (((m) rVarM7395) == null) {
            return 0;
        }
        return C0046.m7702(this, C0027.m5031((m) rVarM7395));
    }

    public final m F(String str) {
        C0008.m2009(str);
        com.github.catvod.spider.merge.V0.f fVar = new com.github.catvod.spider.merge.V0.f(str, 8, false);
        com.github.catvod.spider.merge.V0.d dVar = new com.github.catvod.spider.merge.V0.d();
        C0006.m1738(new com.github.catvod.spider.merge.U.p(this, dVar, fVar), this);
        if (C0009.m2095(dVar) > 0) {
            return (m) C0028.m5161(dVar, 0);
        }
        return null;
    }

    public final boolean G() {
        Iterator itM3109 = C0013.m3109(C0058.m9057(this));
        while (C0012.m2962(itM3109)) {
            r rVar = (r) C0048.m7949(itM3109);
            if (rVar instanceof t) {
                if (!C0028.m5134(C0032.m5729((t) rVar))) {
                    return true;
                }
            } else if ((rVar instanceof m) && C0014.m3303((m) rVar)) {
                return true;
            }
        }
        return false;
    }

    public final String H() {
        String strM1840;
        h hVar;
        StringBuilder sbM8572 = C0054.m8572();
        int iM9636 = C0064.m9636(C0058.m9057(this));
        int i2 = 0;
        while (true) {
            strM1840 = C0007.m1840();
            if (i2 >= iM9636) {
                break;
            }
            r rVar = (r) C0048.m7915(C0058.m9057(this), i2);
            r rVarM3163 = C0013.m3163(rVar);
            hVar = rVarM3163 instanceof h ? (h) rVarM3163 : null;
            if (hVar == null) {
                hVar = new h(strM1840);
            }
            C0006.m1738(new com.github.catvod.spider.merge.E.l(sbM8572, C0050.m8160(hVar)), rVar);
            i2++;
        }
        String strM1543 = C0004.m1543(sbM8572);
        r rVarM1872 = C0007.m1872(this);
        hVar = rVarM1872 instanceof h ? (h) rVarM1872 : null;
        return C0043.m7337(hVar != null ? C0050.m8160(hVar) : C0050.m8160(new h(strM1840))) ? C0064.m9640(strM1543) : strM1543;
    }

    public final String J() {
        StringBuilder sbM8572 = C0054.m8572();
        for (int i2 = 0; i2 < C0064.m9636(C0058.m9057(this)); i2++) {
            r rVar = (r) C0048.m7915(C0058.m9057(this), i2);
            if (rVar instanceof t) {
                t tVar = (t) rVar;
                String strM5729 = C0032.m5729(tVar);
                if (C0003.m1357(C0044.m7395(tVar)) || (tVar instanceof d)) {
                    C0018.m3933(sbM8572, strM5729);
                } else {
                    C0020.m4248(sbM8572, strM5729, C0031.m5646(sbM8572));
                }
            } else if ((rVar instanceof m) && C0007.m1815(C0025.m4804(C0039.m6507((m) rVar)), C0011.m2805(m5324(), 15, 2, 1137)) && !C0031.m5646(sbM8572)) {
                C0018.m3933(sbM8572, C0048.m7902(m5324(), 17, 1, 831));
            }
        }
        return C0064.m9640(C0004.m1543(sbM8572));
    }

    public final m L() {
        List listM5031;
        int iM7702;
        r rVarM7395 = C0044.m7395(this);
        if (rVarM7395 != null && (iM7702 = C0046.m7702(this, (listM5031 = C0027.m5031((m) rVarM7395)))) > 0) {
            return (m) C0048.m7915(listM5031, iM7702 - 1);
        }
        return null;
    }

    public final com.github.catvod.spider.merge.V0.d M(String str) {
        C0008.m2009(str);
        com.github.catvod.spider.merge.V0.n nVarM4973 = C0026.m4973(str);
        C0065.m9779(nVarM4973);
        com.github.catvod.spider.merge.V0.d dVar = new com.github.catvod.spider.merge.V0.d();
        C0006.m1738(new com.github.catvod.spider.merge.U.p(this, dVar, nVarM4973), this);
        return dVar;
    }

    public final m N(String str) {
        C0008.m2009(str);
        return C0003.m1447(new com.github.catvod.spider.merge.U.p(C0026.m4973(str)), this, this);
    }

    public final boolean O(g gVar) {
        m mVar;
        if (C0043.m7337(gVar)) {
            if (C0035.m6164(C0039.m6507(this)) || ((mVar = (m) C0044.m7395(this)) != null && C0035.m6164(C0039.m6507(mVar)))) {
                if (!(!C0058.m9163(r4))) {
                    return true;
                }
                r rVarM7395 = C0044.m7395(this);
                m mVar2 = (m) rVarM7395;
                if (mVar2 != null && !C0058.m9163(C0039.m6507(mVar2))) {
                    return true;
                }
                r rVar = null;
                if (rVarM7395 != null && C0035.m6143(this) > 0) {
                    rVar = (r) C0048.m7915(C0059.m9225(rVarM7395), C0035.m6143(this) - 1);
                }
                if (rVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String P() {
        StringBuilder sbM8572 = C0054.m8572();
        C0006.m1738(new k(sbM8572), this);
        return C0064.m9640(C0004.m1543(sbM8572));
    }

    public final String Q() {
        StringBuilder sbM8572 = C0054.m8572();
        int iM9636 = C0064.m9636(C0058.m9057(this));
        for (int i2 = 0; i2 < iM9636; i2++) {
            C0023.m4614((r) C0048.m7915(C0058.m9057(this), i2), sbM8572);
        }
        return C0004.m1543(sbM8572);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public /* bridge */ /* synthetic */ Object clone() {
        return C0026.m4922(this);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final c d() {
        if (C0018.m3929(this) == null) {
            this.g = new c();
        }
        return C0018.m3929(this);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final String e() {
        for (m mVar = this; mVar != null; mVar = (m) C0044.m7395(mVar)) {
            c cVarM3929 = C0018.m3929(mVar);
            if (cVarM3929 != null) {
                String strM9182 = C0059.m9182();
                if (C0034.m5991(cVarM3929, strM9182) != -1) {
                    return C0028.m5175(C0018.m3929(mVar), strM9182);
                }
            }
        }
        return C0007.m1840();
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final int f() {
        return C0064.m9636(C0058.m9057(this));
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public /* bridge */ /* synthetic */ r g() {
        return C0026.m4922(this);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final r h(r rVar) {
        m mVar = (m) super.h(rVar);
        c cVarM3929 = C0018.m3929(this);
        mVar.g = cVarM3929 != null ? C0007.m1863(cVarM3929) : null;
        l lVar = new l(mVar, C0064.m9636(C0058.m9057(this)));
        mVar.f = lVar;
        C0064.m9673(lVar, C0058.m9057(this));
        return mVar;
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final r i() {
        C0022.m4479(C0058.m9057(this));
        return this;
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final List j() {
        if (C0058.m9057(this) == C0020.m4227()) {
            this.f = new l(this, 4);
        }
        return C0058.m9057(this);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final boolean l() {
        return C0018.m3929(this) != null;
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public String o() {
        return C0021.m4326(C0039.m6507(this));
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public void q(Appendable appendable, int i2, g gVar) {
        if (C0052.m8374(this, gVar) && (!(appendable instanceof StringBuilder) || C0006.m1693((StringBuilder) appendable) > 0)) {
            C0063.m9541(appendable, i2, gVar);
        }
        Appendable appendableM7565 = C0045.m7565(appendable, '<');
        E eM6507 = C0039.m6507(this);
        C0024.m4699(appendableM7565, C0021.m4326(eM6507));
        c cVarM3929 = C0018.m3929(this);
        if (cVarM3929 != null) {
            C0038.m6426(cVarM3929, appendable, gVar);
        }
        if (C0035.m6132(C0058.m9057(this))) {
            boolean zM7109 = C0042.m7109(eM6507);
            if ((zM7109 || C0004.m1562(eM6507)) && (C0013.m3081(gVar) != 1 || !zM7109)) {
                C0024.m4699(appendable, C0040.m6584(m5324(), 18, 3, 2504));
                return;
            }
        }
        C0045.m7565(appendable, '>');
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public void r(Appendable appendable, int i2, g gVar) {
        boolean zM6132 = C0035.m6132(C0058.m9057(this));
        E eM6507 = C0039.m6507(this);
        if (zM6132 && (C0042.m7109(eM6507) || C0004.m1562(eM6507))) {
            return;
        }
        if (C0043.m7337(gVar) && !C0035.m6132(C0058.m9057(this)) && C0035.m6164(eM6507)) {
            C0063.m9541(appendable, i2, gVar);
        }
        C0045.m7565(C0024.m4699(C0024.m4699(appendable, C0030.m5362(m5324(), 21, 2, 1885)), C0021.m4326(eM6507)), '>');
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final r s() {
        return (m) C0044.m7395(this);
    }

    @Override // com.github.catvod.spider.merge.T0.r
    public final r w() {
        Cloneable cloneable = this;
        while (true) {
            Cloneable cloneableM7395 = C0044.m7395(cloneable);
            if (cloneableM7395 == null) {
                return (m) cloneable;
            }
            cloneable = cloneableM7395;
        }
    }

    public final void x(r rVar) {
        r rVarM7395 = C0044.m7395(rVar);
        if (rVarM7395 != null) {
            C0024.m4715(rVarM7395, rVar);
        }
        rVar.a = this;
        C0002.m1286(this);
        C0063.m9550(C0058.m9057(this), rVar);
        rVar.b = C0064.m9636(C0058.m9057(this)) - 1;
    }

    public final List z() {
        List list;
        if (C0064.m9636(C0058.m9057(this)) == 0) {
            return C0044.m7414();
        }
        WeakReference weakReferenceM9123 = C0058.m9123(this);
        if (weakReferenceM9123 != null && (list = (List) C0010.m2351(weakReferenceM9123)) != null) {
            return list;
        }
        int iM9636 = C0064.m9636(C0058.m9057(this));
        ArrayList arrayList = new ArrayList(iM9636);
        for (int i2 = 0; i2 < iM9636; i2++) {
            r rVar = (r) C0048.m7915(C0058.m9057(this), i2);
            if (rVar instanceof m) {
                C0004.m1532(arrayList, (m) rVar);
            }
        }
        this.e = new WeakReference(arrayList);
        return arrayList;
    }
}