package com.github.catvod.spider.p000mergexbpq.Q;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.P.InterfaceC0066d;
import com.github.catvod.spider.p000mergexbpq.P.s;
import com.github.catvod.spider.p000mergexbpq.R.C0003;

/* loaded from: classes.dex */
public final class D {
    private final C[] a;
    private final int b;

    public D(C[] cArr) {
        this.a = cArr;
        int iM5036 = 0;
        for (C c : cArr) {
            iM5036 = C0027.m5036(iM5036, c);
        }
        this.b = C0044.m7505(iM5036, cArr.length);
    }

    public static D a(D d, C c) {
        if (d == null) {
            return new D(new C[]{c});
        }
        C[] cArrM905 = m905(d);
        C[] cArr = (C[]) C0003.m1439(cArrM905, cArrM905.length + 1);
        cArr[cArr.length - 1] = c;
        return new D(cArr);
    }

    /* renamed from: ۟ۡۡۤۢ, reason: not valid java name and contains not printable characters */
    public static int m903(Object obj) {
        if (C0042.m7147() < 0) {
            return ((H) obj).d();
        }
        return 0;
    }

    /* renamed from: ۟ۢۦۤۤ, reason: not valid java name and contains not printable characters */
    public static Object m904(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((C[]) obj).clone();
        }
        return null;
    }

    /* renamed from: ۟ۤۨ۠ۡ, reason: not valid java name and contains not printable characters */
    public static C[] m905(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((D) obj).a;
        }
        return null;
    }

    /* renamed from: ۠ۤۢۢ, reason: not valid java name and contains not printable characters */
    public static C m906(Object obj) {
        if (C0047.m7837() > 0) {
            return ((H) obj).c();
        }
        return null;
    }

    /* renamed from: ۦۧ۠, reason: contains not printable characters */
    public static int m907(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((D) obj).b;
        }
        return 0;
    }

    /* renamed from: ۨۤۥۥ, reason: not valid java name and contains not printable characters */
    public static void m908(Object obj, Object obj2) {
        if (C0062.m9429() >= 0) {
            ((C) obj).a((s) obj2);
        }
    }

    /* renamed from: ۨۥۦۢ, reason: not valid java name and contains not printable characters */
    public static boolean m909(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((C) obj).b();
        }
        return false;
    }

    public final void b(s sVar, InterfaceC0066d interfaceC0066d, int i) {
        int iM5617 = C0031.m5617(interfaceC0066d);
        boolean z = false;
        try {
            C[] cArrM905 = m905(this);
            int length = cArrM905.length;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    C cM906 = cArrM905[i2];
                    if (cM906 instanceof H) {
                        int iM903 = m903((H) cM906) + i;
                        C0019.m4053(interfaceC0066d, iM903);
                        cM906 = m906((H) cM906);
                        z2 = iM903 != iM5617;
                    } else if (m909(cM906)) {
                        C0019.m4053(interfaceC0066d, iM5617);
                    }
                    m908(cM906, sVar);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        C0019.m4053(interfaceC0066d, iM5617);
                    }
                    throw th;
                }
            }
            if (z2) {
                C0019.m4053(interfaceC0066d, iM5617);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final D c(int i) {
        C[] cArr = null;
        int i2 = 0;
        while (true) {
            C[] cArrM905 = m905(this);
            if (i2 >= cArrM905.length) {
                break;
            }
            if (m909(cArrM905[i2])) {
                C[] cArrM9052 = m905(this);
                if (!(cArrM9052[i2] instanceof H)) {
                    if (cArr == null) {
                        cArr = (C[]) m904(cArrM9052);
                    }
                    cArr[i2] = new H(i, m905(this)[i2]);
                }
            }
            i2++;
        }
        return cArr == null ? this : new D(cArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d = (D) obj;
        return m907(this) == m907(d) && C0037.m6347(m905(this), m905(d));
    }

    public final int hashCode() {
        return m907(this);
    }
}