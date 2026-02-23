package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.c;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i1 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f269short = {2768, 2775, 2761, 2764, 2765};
    protected E a;
    C0067a b;
    Q c;
    protected h d;
    protected ArrayList<l> e;
    protected String f;
    protected O g;
    protected D h;
    private M i = new M();
    private L j = new L();

    i1() {
    }

    /* renamed from: ۟ۡۢۡۢ, reason: not valid java name and contains not printable characters */
    public static N m2628(Object obj) {
        if (C0038.m6471() > 0) {
            return ((M) obj).v();
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡۤ, reason: not valid java name and contains not printable characters */
    public static O m2629(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((i1) obj).g;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2630() {
        if (C0042.m7147() <= 0) {
            return f269short;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۨۤ, reason: not valid java name and contains not printable characters */
    public static M m2631(Object obj) {
        if (C0025.m4797() > 0) {
            return ((i1) obj).i;
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۟ۦ, reason: not valid java name and contains not printable characters */
    public static N m2632(Object obj, Object obj2) {
        if (C0055.m8740() > 0) {
            return ((N) obj).s((String) obj2);
        }
        return null;
    }

    /* renamed from: ۠ۧۥ۠, reason: not valid java name and contains not printable characters */
    public static ArrayList m2633(Object obj) {
        if (C0039.m6529() < 0) {
            return ((i1) obj).e;
        }
        return null;
    }

    /* renamed from: ۣۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static L m2634(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((i1) obj).j;
        }
        return null;
    }

    /* renamed from: ۣۡۦۤ, reason: not valid java name and contains not printable characters */
    public static boolean m2635(Object obj, Object obj2) {
        if (C0006.m1726() <= 0) {
            return ((i1) obj).c((O) obj2);
        }
        return false;
    }

    /* renamed from: ۧۧ۟ۡ, reason: not valid java name and contains not printable characters */
    public static N m2636(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((N) obj).v();
        }
        return null;
    }

    protected final l a() {
        int iM2139 = C0009.m2139(m2633(this));
        if (iM2139 > 0) {
            return (l) C0028.m5167(m2633(this), iM2139 - 1);
        }
        return null;
    }

    protected abstract boolean b(String str);

    protected abstract boolean c(O o);

    protected final boolean d(String str) {
        O oM2629 = m2629(this);
        L lM2634 = m2634(this);
        if (oM2629 == lM2634) {
            L l = new L();
            m2632(l, str);
            return m2635(this, l);
        }
        m2636(lM2634);
        m2632(lM2634, str);
        return m2635(this, lM2634);
    }

    public boolean e(c cVar) {
        M mM2631 = m2631(this);
        O oM2629 = m2629(this);
        String strM5362 = C0030.m5362(m2630(), 0, 5, 2745);
        if (oM2629 == mM2631) {
            mM2631 = new M();
        } else {
            m2628(mM2631);
        }
        mM2631.b = strM5362;
        mM2631.j = cVar;
        mM2631.c = C0055.m8795(strM5362);
        return m2635(this, mM2631);
    }

    protected final boolean f(String str) {
        M mM2631 = m2631(this);
        if (m2629(this) == mM2631) {
            mM2631 = new M();
        } else {
            m2628(mM2631);
        }
        m2632(mM2631, str);
        return m2635(this, mM2631);
    }
}