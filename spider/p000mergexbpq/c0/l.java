package com.github.catvod.spider.p000mergexbpq.c0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.d0.E;
import com.github.catvod.spider.p000mergexbpq.d0.F;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.e0.C0124g;
import com.github.catvod.spider.p000mergexbpq.e0.C0125h;
import com.github.catvod.spider.p000mergexbpq.e0.N;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class l extends r {
    private static final String k;
    private F f;
    private WeakReference<List<l>> g;
    List<r> h;
    private c i;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f188short = {1191, 1160, 1232, 3225, 3284, 3287, 3269, 3283, 3299, 3268, 3295, 418, 499, 494, 494, 501, 3301, 3306, 3303, 3317, 3317, 1033, 1028, 1986, 2002, 2486, 2140, 2131, 2114, 2007, 1988};
    private static final List<l> j = C0008.m1961();

    static {
        C0005.m1602(C0002.m1305(m2226(), 0, 3, 1275));
        k = C0019.m4107(m2226(), 3, 8, 3254);
    }

    public l(F f, String str, c cVar) {
        C0023.m4613(f);
        this.h = m2227();
        this.i = cVar;
        this.f = f;
        if (str != null) {
            m2220(this, str);
        }
    }

    public l(String str) {
        this(C0051.m8211(str, C0010.m2281()), C0007.m1840(), null);
    }

    private static void K(l lVar, C0124g c0124g) {
        l lVar2 = (l) m2203(lVar);
        if (lVar2 == null || C0007.m1815(C0001.m1214(lVar2), C0019.m4107(m2226(), 11, 5, 385))) {
            return;
        }
        C0018.m3918(c0124g, lVar2);
        m2213(lVar2, c0124g);
    }

    private static void N(StringBuilder sb, u uVar) {
        String strM2205 = m2205(uVar);
        if (m2207(m2203(uVar)) || (uVar instanceof d)) {
            C0018.m3933(sb, strM2205);
            return;
        }
        boolean zM2208 = m2208(sb);
        C0017.m3648();
        int iM1584 = C0004.m1584(strM2205);
        int iM1896 = 0;
        boolean z = false;
        boolean z2 = false;
        while (iM1896 < iM1584) {
            int iM1058 = C0000.m1058(strM2205, iM1896);
            if (!(iM1058 == 32 || iM1058 == 9 || iM1058 == 10 || iM1058 == 12 || iM1058 == 13 || iM1058 == 160)) {
                if (!(iM1058 == 8203 || iM1058 == 173)) {
                    C0035.m6149(sb, iM1058);
                    z = true;
                    z2 = false;
                }
            } else if ((!zM2208 || z) && !z2) {
                C0062.m9399(sb, ' ');
                z2 = true;
            }
            iM1896 += C0007.m1896(iM1058);
        }
    }

    private static <E extends l> int Z(l lVar, List<E> list) {
        int iM9636 = C0064.m9636(list);
        for (int i = 0; i < iM9636; i++) {
            if (C0048.m7915(list, i) == lVar) {
                return i;
            }
        }
        return 0;
    }

    static boolean h0(r rVar) {
        if (rVar instanceof l) {
            l lVar = (l) rVar;
            int i = 0;
            while (!C0004.m1566(m2216(lVar))) {
                lVar = (l) m2203(lVar);
                i++;
                if (i >= 6 || lVar == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: ۣ۟۟ۧۨ, reason: not valid java name and contains not printable characters */
    public static r m2203(Object obj) {
        if (C0033.m5872() > 0) {
            return ((r) obj).c;
        }
        return null;
    }

    /* renamed from: ۟۠ۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static void m2204(Object obj, Object obj2, Object obj3) {
        if (C0046.m7701() >= 0) {
            ((c) obj).n((Appendable) obj2, (g) obj3);
        }
    }

    /* renamed from: ۟ۡ۟۟۟, reason: not valid java name and contains not printable characters */
    public static String m2205(Object obj) {
        if (C0001.m1164() < 0) {
            return ((p) obj).I();
        }
        return null;
    }

    /* renamed from: ۟ۢۧۤۨ, reason: not valid java name and contains not printable characters */
    public static int m2206(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            return ((c) obj).o((String) obj2);
        }
        return 0;
    }

    /* renamed from: ۟ۢۨ۠ۦ, reason: not valid java name and contains not printable characters */
    public static boolean m2207(Object obj) {
        if (C0039.m6529() <= 0) {
            return h0((r) obj);
        }
        return false;
    }

    /* renamed from: ۟ۤۢۤۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2208(Object obj) {
        if (C0018.m3956() >= 0) {
            return u.M((StringBuilder) obj);
        }
        return false;
    }

    /* renamed from: ۟ۤۨۡ, reason: not valid java name and contains not printable characters */
    public static List m2209(Object obj) {
        if (C0058.m9131() <= 0) {
            return ((l) obj).n();
        }
        return null;
    }

    /* renamed from: ۟ۦۥۤ, reason: not valid java name and contains not printable characters */
    public static void m2210(Object obj, Object obj2) {
        if (C0025.m4797() > 0) {
            N((StringBuilder) obj, (u) obj2);
        }
    }

    /* renamed from: ۟ۧۡۤ۟, reason: not valid java name and contains not printable characters */
    public static void m2211(Object obj, Object obj2) {
        if (C0049.m8038() < 0) {
            ((r) obj).D((r) obj2);
        }
    }

    /* renamed from: ۟ۧۡۤۢ, reason: not valid java name and contains not printable characters */
    public static WeakReference m2212(Object obj) {
        if (C0006.m1726() < 0) {
            return ((l) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۨ۠۟, reason: not valid java name and contains not printable characters */
    public static void m2213(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            K((l) obj, (C0124g) obj2);
        }
    }

    /* renamed from: ۟ۨۥۨ, reason: not valid java name and contains not printable characters */
    public static c m2214(Object obj) {
        if (C0001.m1164() < 0) {
            return ((l) obj).i;
        }
        return null;
    }

    /* renamed from: ۣ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static E m2215(Object obj) {
        if (C0044.m7508() < 0) {
            return s.a((r) obj);
        }
        return null;
    }

    /* renamed from: ۠ۥۥۣ, reason: not valid java name and contains not printable characters */
    public static F m2216(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((l) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۡۢۦ, reason: not valid java name and contains not printable characters */
    public static String m2217() {
        if (C0064.m9659() < 0) {
            return k;
        }
        return null;
    }

    /* renamed from: ۣۡۢۧ, reason: not valid java name and contains not printable characters */
    public static List m2218(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((l) obj).h;
        }
        return null;
    }

    /* renamed from: ۡۦ۟۠, reason: not valid java name and contains not printable characters */
    public static int m2219(Object obj) {
        if (C0010.m2320() <= 0) {
            return ((r) obj).d;
        }
        return 0;
    }

    /* renamed from: ۡۦ۟ۧ, reason: not valid java name and contains not printable characters */
    public static void m2220(Object obj, Object obj2) {
        if (C0005.m1599() < 0) {
            ((l) obj).l((String) obj2);
        }
    }

    /* renamed from: ۢۢۢ, reason: not valid java name and contains not printable characters */
    public static List m2221(Object obj) {
        if (C0011.m2755() > 0) {
            return ((r) obj).n();
        }
        return null;
    }

    /* renamed from: ۣۢۦۤ, reason: not valid java name and contains not printable characters */
    public static void m2222(Object obj, Object obj2) {
        if (C0038.m6471() >= 0) {
            ((r) obj).v((Appendable) obj2);
        }
    }

    /* renamed from: ۣۨۢۤ, reason: not valid java name and contains not printable characters */
    public static List m2223(Object obj) {
        if (C0001.m1164() < 0) {
            return ((l) obj).Q();
        }
        return null;
    }

    /* renamed from: ۥۧۦۡ, reason: contains not printable characters */
    public static void m2224(Object obj, Object obj2, int i, Object obj3) {
        if (C0020.m4210() <= 0) {
            ((r) obj).r((Appendable) obj2, i, (g) obj3);
        }
    }

    /* renamed from: ۧۡۧۥ, reason: not valid java name and contains not printable characters */
    public static List m2225() {
        if (C0025.m4797() > 0) {
            return j;
        }
        return null;
    }

    /* renamed from: ۧۤۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2226() {
        if (C0015.m3433() > 0) {
            return f188short;
        }
        return null;
    }

    /* renamed from: ۧۦۦۣ, reason: not valid java name and contains not printable characters */
    public static List m2227() {
        if (C0010.m2320() <= 0) {
            return r.e;
        }
        return null;
    }

    /* renamed from: ۨۡۦۥ, reason: not valid java name and contains not printable characters */
    public static int m2228(Object obj, Object obj2) {
        if (C0018.m3956() > 0) {
            return Z((l) obj, (List) obj2);
        }
        return 0;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final r F() {
        Cloneable cloneable = this;
        while (true) {
            Cloneable cloneableM2203 = m2203(cloneable);
            if (cloneableM2203 == null) {
                return (l) cloneable;
            }
            cloneable = cloneableM2203;
        }
    }

    public final l L(r rVar) {
        C0023.m4613(rVar);
        r rVarM2203 = m2203(rVar);
        if (rVarM2203 != null) {
            m2211(rVarM2203, rVar);
        }
        rVar.c = this;
        m2209(this);
        C0063.m9550(m2218(this), rVar);
        rVar.d = C0064.m9636(m2218(this)) - 1;
        return this;
    }

    public final l M(String str) {
        C0047.m7777(m2215(this));
        l lVar = new l(C0051.m8211(str, C0029.m5248()), C0033.m5831(this), null);
        C0004.m1547(this, lVar);
        return lVar;
    }

    public final l O(String str) {
        C0023.m4613(str);
        C0004.m1547(this, new u(str));
        return this;
    }

    public final l P() {
        return (l) C0048.m7915(m2223(this), 0);
    }

    final List<l> Q() {
        List<l> list;
        if (C0003.m1355(this) == 0) {
            return m2225();
        }
        WeakReference weakReferenceM2212 = m2212(this);
        if (weakReferenceM2212 != null && (list = (List) C0010.m2351(weakReferenceM2212)) != null) {
            return list;
        }
        int iM9636 = C0064.m9636(m2218(this));
        ArrayList arrayList = new ArrayList(iM9636);
        for (int i = 0; i < iM9636; i++) {
            r rVar = (r) C0048.m7915(m2218(this), i);
            if (rVar instanceof l) {
                C0004.m1532(arrayList, (l) rVar);
            }
        }
        this.g = new WeakReference<>(arrayList);
        return arrayList;
    }

    public final C0124g R() {
        return new C0124g((List<l>) m2223(this));
    }

    public l S() {
        return (l) super.j();
    }

    public final String T() {
        String strM2205;
        StringBuilder sbM9299 = C0060.m9299();
        Iterator itM3109 = C0013.m3109(m2218(this));
        while (C0012.m2962(itM3109)) {
            r rVar = (r) C0048.m7949(itM3109);
            if (rVar instanceof f) {
                strM2205 = m2205((f) rVar);
            } else if (rVar instanceof e) {
                strM2205 = m2205((e) rVar);
            } else if (rVar instanceof l) {
                strM2205 = C0025.m4799((l) rVar);
            } else if (rVar instanceof d) {
                strM2205 = m2205((d) rVar);
            }
            C0018.m3933(sbM9299, strM2205);
        }
        return C0026.m4919(sbM9299);
    }

    public final int U() {
        r rVarM2203 = m2203(this);
        if (((l) rVarM2203) == null) {
            return 0;
        }
        return m2228(this, m2223((l) rVarM2203));
    }

    public final C0124g V() {
        return C0032.m5756(new C0125h(), this);
    }

    public final boolean W(String str) {
        c cVarM2214 = m2214(this);
        if (cVarM2214 == null) {
            return false;
        }
        String strM4720 = C0024.m4720(cVarM2214, C0007.m1842(m2226(), 16, 5, 3206));
        int iM1584 = C0004.m1584(strM4720);
        int iM15842 = C0004.m1584(str);
        if (iM1584 != 0 && iM1584 >= iM15842) {
            if (iM1584 == iM15842) {
                return C0000.m1057(str, strM4720);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < iM1584; i2++) {
                if (C0005.m1617(C0007.m1823(strM4720, i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == iM15842 && C0062.m9433(strM4720, true, i, str, 0, iM15842)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && iM1584 - i == iM15842) {
                return C0062.m9433(strM4720, true, i, str, 0, iM15842);
            }
        }
        return false;
    }

    public final String X() {
        StringBuilder sbM9299 = C0060.m9299();
        int iM9636 = C0064.m9636(m2218(this));
        for (int i = 0; i < iM9636; i++) {
            m2222((r) C0048.m7915(m2218(this), i), sbM9299);
        }
        String strM4919 = C0026.m4919(sbM9299);
        h hVarM8475 = C0053.m8475(this);
        if (hVarM8475 == null) {
            hVarM8475 = new h();
        }
        return C0039.m6534(C0045.m7613(hVarM8475)) ? C0064.m9640(strM4919) : strM4919;
    }

    public final String Y() {
        c cVarM2214 = m2214(this);
        return cVarM2214 != null ? C0024.m4720(cVarM2214, C0013.m3106(m2226(), 21, 2, 1120)) : C0007.m1840();
    }

    public final boolean a0() {
        return C0033.m5878(m2216(this));
    }

    public final l b0() {
        r rVarM2203 = m2203(this);
        if (rVarM2203 == null) {
            return null;
        }
        List listM2223 = m2223((l) rVarM2203);
        int iM2228 = m2228(this, listM2223) + 1;
        if (C0064.m9636(listM2223) > iM2228) {
            return (l) C0048.m7915(listM2223, iM2228);
        }
        return null;
    }

    final void c0() {
        this.g = null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public /* bridge */ /* synthetic */ Object clone() {
        return C0033.m5790(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final c d() {
        if (m2214(this) == null) {
            this.i = new c();
        }
        return m2214(this);
    }

    public final String d0() {
        return C0022.m4434(m2216(this));
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final String e() {
        String strM2217 = m2217();
        for (l lVar = this; lVar != null; lVar = (l) m2203(lVar)) {
            c cVarM2214 = m2214(lVar);
            if (cVarM2214 != null) {
                if (m2206(cVarM2214, strM2217) != -1) {
                    return C0009.m2067(m2214(lVar), strM2217);
                }
            }
        }
        return C0007.m1840();
    }

    public final String e0() {
        StringBuilder sbM9299 = C0060.m9299();
        Iterator itM3109 = C0013.m3109(m2218(this));
        while (C0012.m2962(itM3109)) {
            r rVar = (r) C0048.m7949(itM3109);
            if (rVar instanceof u) {
                m2210(sbM9299, (u) rVar);
            } else if ((rVar instanceof l) && C0007.m1815(C0017.m3670(m2216((l) rVar)), C0038.m6452(m2226(), 23, 2, 1952)) && !m2208(sbM9299)) {
                C0018.m3933(sbM9299, C0023.m4536(m2226(), 25, 1, 2454));
            }
        }
        return C0064.m9640(C0026.m4919(sbM9299));
    }

    public final l f0() {
        return (l) m2203(this);
    }

    public final C0124g g0() {
        C0124g c0124g = new C0124g();
        m2213(this, c0124g);
        return c0124g;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final int h() {
        return C0064.m9636(m2218(this));
    }

    public final l i0() {
        List listM2223;
        int iM2228;
        r rVarM2203 = m2203(this);
        if (rVarM2203 != null && (iM2228 = m2228(this, (listM2223 = m2223((l) rVarM2203)))) > 0) {
            return (l) C0048.m7915(listM2223, iM2228 - 1);
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public /* bridge */ /* synthetic */ r j() {
        return C0033.m5790(this);
    }

    public final C0124g j0(String str) {
        C0006.m1786(str);
        N nM3700 = C0017.m3700(str);
        C0023.m4613(nM3700);
        return C0032.m5756(nM3700, this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    protected final r k(r rVar) {
        l lVar = (l) super.k(rVar);
        c cVarM2214 = m2214(this);
        lVar.i = cVarM2214 != null ? C0018.m3888(cVarM2214) : null;
        k kVar = new k(lVar, C0064.m9636(m2218(this)));
        lVar.h = kVar;
        C0006.m1737(kVar, m2218(this));
        return lVar;
    }

    public final l k0(String str) {
        C0006.m1786(str);
        return C0025.m4821(C0017.m3700(str), this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    protected final void l(String str) {
        C0038.m6446(C0056.m8893(this), m2217(), str);
    }

    public final C0124g l0() {
        r rVarM2203 = m2203(this);
        if (rVarM2203 == null) {
            return new C0124g(0);
        }
        List listM2223 = m2223((l) rVarM2203);
        C0124g c0124g = new C0124g(C0064.m9636(listM2223) - 1);
        Iterator itM3109 = C0013.m3109(listM2223);
        while (C0012.m2962(itM3109)) {
            l lVar = (l) C0048.m7949(itM3109);
            if (lVar != this) {
                C0018.m3918(c0124g, lVar);
            }
        }
        return c0124g;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final r m() {
        C0022.m4479(m2218(this));
        return this;
    }

    public final F m0() {
        return m2216(this);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    protected final List<r> n() {
        if (m2218(this) == m2227()) {
            this.h = new k(this, 4);
        }
        return m2218(this);
    }

    public final String n0() {
        return C0017.m3670(m2216(this));
    }

    public l o0(String str) {
        C0023.m4613(str);
        C0022.m4479(m2218(this));
        h hVarM8475 = C0053.m8475(this);
        C0004.m1547(this, (hVarM8475 == null || !C0003.m1471(C0022.m4457(hVarM8475), C0049.m8027(this))) ? new u(str) : new f(str));
        return this;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    protected final boolean p() {
        return m2214(this) != null;
    }

    public final String p0() {
        StringBuilder sbM9299 = C0060.m9299();
        C0007.m1871(new j(sbM9299), this);
        return C0064.m9640(C0026.m4919(sbM9299));
    }

    public final List<u> q0() {
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(m2218(this));
        while (C0012.m2962(itM3109)) {
            r rVar = (r) C0048.m7949(itM3109);
            if (rVar instanceof u) {
                C0004.m1532(arrayList, (u) rVar);
            }
        }
        return C0029.m5209(arrayList);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public String t() {
        return C0017.m3670(m2216(this));
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    void w(Appendable appendable, int i, g gVar) {
        l lVar;
        l lVar2;
        if (C0039.m6534(gVar)) {
            boolean z = false;
            if (C0014.m3334(m2216(this)) || ((lVar2 = (l) m2203(this)) != null && C0014.m3334(m2216(lVar2)))) {
                if (C0029.m5297(m2216(this)) && !C0035.m6120(m2216(this)) && ((lVar = (l) m2203(this)) == null || C0000.m1078(lVar))) {
                    r rVarM2203 = m2203(this);
                    r rVar = null;
                    if (rVarM2203 != null && m2219(this) > 0) {
                        rVar = (r) C0048.m7915(m2221(rVarM2203), m2219(this) - 1);
                    }
                    if (rVar != null) {
                        z = true;
                    }
                }
                if (!z && (!(appendable instanceof StringBuilder) || C0006.m1693((StringBuilder) appendable) > 0)) {
                    m2224(this, appendable, i, gVar);
                }
            }
        }
        C0024.m4699(C0045.m7565(appendable, '<'), C0001.m1214(this));
        c cVarM2214 = m2214(this);
        if (cVarM2214 != null) {
            m2204(cVarM2214, appendable, gVar);
        }
        if (C0035.m6132(m2218(this)) && C0005.m1600(m2216(this)) && (C0037.m6388(gVar) != 1 || !C0035.m6120(m2216(this)))) {
            C0024.m4699(appendable, C0022.m4403(m2226(), 26, 3, 2172));
        } else {
            C0045.m7565(appendable, '>');
        }
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    void x(Appendable appendable, int i, g gVar) {
        if (C0035.m6132(m2218(this)) && C0005.m1600(m2216(this))) {
            return;
        }
        if (C0039.m6534(gVar) && !C0035.m6132(m2218(this)) && C0014.m3334(m2216(this))) {
            m2224(this, appendable, i, gVar);
        }
        C0045.m7565(C0024.m4699(C0024.m4699(appendable, C0045.m7657(m2226(), 29, 2, 2027)), C0001.m1214(this)), '>');
    }

    @Override // com.github.catvod.spider.p000mergexbpq.c0.r
    public final r z() {
        return (l) m2203(this);
    }
}