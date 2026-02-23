package com.github.catvod.spider.merge.T0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c implements Iterable, Cloneable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f500short = {2607, 2583, 2577, 2582, 2626, 2560, 2567, 2626, 2564, 2563, 2574, 2577, 2567};
    public int a = 0;
    public String[] b = new String[3];
    public Object[] c = new Object[3];

    public static boolean i(String str) {
        return str != null && C0004.m1584(str) > 1 && C0007.m1823(str, 0) == '/';
    }

    /* renamed from: ۠۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m5314() {
        if (C0046.m7701() >= 0) {
            return f500short;
        }
        return null;
    }

    public final void a(Object obj, String str) {
        C0043.m7300(this, C0029.m5233(this) + 1);
        String[] strArrM4450 = C0022.m4450(this);
        int iM5233 = C0029.m5233(this);
        strArrM4450[iM5233] = str;
        C0052.m8318(this)[iM5233] = obj;
        this.a = iM5233 + 1;
    }

    public final void b(int i) {
        int i2 = i;
        C0042.m7163(i2 >= C0029.m5233(this));
        String[] strArrM4450 = C0022.m4450(this);
        int length = strArrM4450.length;
        if (length >= i2) {
            return;
        }
        int iM5233 = length >= 3 ? C0029.m5233(this) * 2 : 3;
        if (i2 <= iM5233) {
            i2 = iM5233;
        }
        this.b = (String[]) C0003.m1439(strArrM4450, i2);
        this.c = C0003.m1439(C0052.m8318(this), i2);
    }

    public final c c() {
        try {
            c cVar = (c) super.clone();
            cVar.a = C0029.m5233(this);
            cVar.b = (String[]) C0003.m1439(C0022.m4450(this), C0029.m5233(this));
            cVar.c = C0003.m1439(C0052.m8318(this), C0029.m5233(this));
            return cVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return C0007.m1863(this);
    }

    public final String d(String str) {
        Object obj;
        int iM5991 = C0034.m5991(this, str);
        String strM1840 = C0007.m1840();
        return (iM5991 == -1 || (obj = C0052.m8318(this)[iM5991]) == null) ? strM1840 : (String) obj;
    }

    public final String e(String str) {
        Object obj;
        int iM8745 = C0055.m8745(this, str);
        String strM1840 = C0007.m1840();
        return (iM8745 == -1 || (obj = C0052.m8318(this)[iM8745]) == null) ? strM1840 : (String) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != C0047.m7777(obj)) {
            return false;
        }
        c cVar = (c) obj;
        if (C0029.m5233(this) != C0029.m5233(cVar)) {
            return false;
        }
        for (int i = 0; i < C0029.m5233(this); i++) {
            int iM5991 = C0034.m5991(cVar, C0022.m4450(this)[i]);
            if (iM5991 == -1) {
                return false;
            }
            Object obj2 = C0052.m8318(this)[i];
            Object obj3 = C0052.m8318(cVar)[iM5991];
            if (obj2 == null) {
                if (obj3 != null) {
                    return false;
                }
            } else if (!C0058.m9103(obj2, obj3)) {
                return false;
            }
        }
        return true;
    }

    public final void f(Appendable appendable, g gVar) {
        int iM5233 = C0029.m5233(this);
        for (int i = 0; i < iM5233; i++) {
            if (!C0025.m4774(C0022.m4450(this)[i])) {
                String strM8335 = C0052.m8335(C0013.m3081(gVar), C0022.m4450(this)[i]);
                if (strM8335 != null) {
                    C0054.m8616(strM8335, (String) C0052.m8318(this)[i], C0045.m7565(appendable, ' '), gVar);
                }
            }
        }
    }

    public final int g(String str) {
        C0065.m9779(str);
        for (int i = 0; i < C0029.m5233(this); i++) {
            if (C0007.m1815(str, C0022.m4450(this)[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int h(String str) {
        C0065.m9779(str);
        for (int i = 0; i < C0029.m5233(this); i++) {
            if (C0000.m1057(str, C0022.m4450(this)[i])) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        return C0012.m2968(C0052.m8318(this)) + (((C0029.m5233(this) * 31) + C0012.m2968(C0022.m4450(this))) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new b(this);
    }

    public final void j(a aVar) {
        String strM3647 = C0017.m3647(aVar);
        if (strM3647 == null) {
            strM3647 = C0007.m1840();
        }
        C0051.m8185(this, C0062.m9420(aVar), strM3647);
        aVar.c = this;
    }

    public final void k(String str, String str2) {
        C0065.m9779(str);
        int iM5991 = C0034.m5991(this, str);
        if (iM5991 != -1) {
            C0052.m8318(this)[iM5991] = str2;
        } else {
            C0040.m6676(this, str2, str);
        }
    }

    public final void l(int i) {
        int iM5233 = C0029.m5233(this);
        if (i >= iM5233) {
            throw new com.github.catvod.spider.merge.R0.b(C0007.m1842(m5314(), 0, 13, 2658));
        }
        int i2 = (iM5233 - i) - 1;
        if (i2 > 0) {
            String[] strArrM4450 = C0022.m4450(this);
            int i3 = i + 1;
            C0062.m9384(strArrM4450, i3, strArrM4450, i, i2);
            Object[] objArrM8318 = C0052.m8318(this);
            C0062.m9384(objArrM8318, i3, objArrM8318, i, i2);
        }
        int iM52332 = C0029.m5233(this) - 1;
        this.a = iM52332;
        C0022.m4450(this)[iM52332] = null;
        C0052.m8318(this)[iM52332] = null;
    }

    public final String toString() {
        StringBuilder sbM8572 = C0054.m8572();
        try {
            C0038.m6426(this, sbM8572, C0050.m8160(new h(C0007.m1840())));
            return C0004.m1543(sbM8572);
        } catch (IOException e) {
            throw new com.github.catvod.spider.merge.Q0.a(e);
        }
    }
}